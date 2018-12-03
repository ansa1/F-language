import antlr.CLexer;
import antlr.CParser;
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

    public void analyze() {
        CLexer lexer = new CLexer(CharStreams.fromString(this.input));
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CParser parser = new CParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        this.AST = parser.translationunit();
    }

    // start program and read `in.txt` file, then save AST
    public void analyze(String inputPath) {
        initInput(inputPath);
        CLexer lexer = new CLexer(CharStreams.fromString(this.input));
        // addition1: to handle errors
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CParser parser = new CParser(tokens);
        // addition2: to handle errors
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        // Entry point
        this.AST = parser.translationunit();
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
