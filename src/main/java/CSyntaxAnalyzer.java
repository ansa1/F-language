import antlr.FLexer;
import antlr.FParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSyntaxAnalyzer {
    private String input;
    private ParseTree AST;

    // Scan file
    private String readInput(String inputPath) {
        byte[] encoded = new byte[0];
        try {
            encoded = Files.readAllBytes(Paths.get(inputPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(encoded);
    }

    private void initInput(String inputPath) {
        this.input = readInput(inputPath);
    }

    public CSyntaxAnalyzer() {
    }

    public CSyntaxAnalyzer(String inputPath) {
        initInput(inputPath);
    }

    public String result = "";

    // start program and read `in.txt` file, then save AST
    public ParseTree analyze(String inputPath) {
        initInput(inputPath);
        FLexer lexer = new FLexer(CharStreams.fromString(this.input));
        // addition1: to handle errors
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FParser parser = new FParser(tokens);
        // addition2: to handle errors
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        FTreeListener listener = new FTreeListener();
        parser.addParseListener(listener);
        // Entry point
        this.AST = parser.translationunit();
        this.result = listener.getResult();
        return AST;
    }

    // write AST tree as JSON to output
    public void serializeTree(String outputPath) {
        String jsonAST = TreeTraverser.toJson(this.AST);
        try (PrintWriter out = new PrintWriter(outputPath)) {
            out.println(jsonAST);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
