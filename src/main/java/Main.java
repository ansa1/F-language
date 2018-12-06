import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        // Try to find a tree, which can describe input
        try {
            CSyntaxAnalyzer cSyntaxAnalyzer = new CSyntaxAnalyzer();
            ParseTree AST = cSyntaxAnalyzer.analyze("./in.txt");
            FTreeCodeGeneratorVisitor visitor = new FTreeCodeGeneratorVisitor();
            FTreeListener listener = new FTreeListener();
            visitor.visit(AST);
            cSyntaxAnalyzer.serializeTree("./out.txt");
        } catch (Exception err) {
            // Else there are errors, which program writes to console
            System.out.println("An error occured while performing syntax analysis. Please see log.txt");
            try (PrintWriter out = new PrintWriter("log.txt")) {
                out.println(err);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}
