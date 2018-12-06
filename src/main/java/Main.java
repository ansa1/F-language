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
            String result = cSyntaxAnalyzer.result;
            FTreeCodeGeneratorVisitor visitor = new FTreeCodeGeneratorVisitor();
            visitor.visit(AST);
//            if (result.equals("")) {
//                cSyntaxAnalyzer.serializeTree("./out.txt");
//                JarCreator.run();
//            } else {
//                System.out.println(result);
//            }
        } catch (Exception err) {
            // Else there are errors, which program writes to console
            System.out.println("An error occured while syntax analysis:");
            System.out.println(err);
            try (PrintWriter out = new PrintWriter("log.txt")) {
                out.println(err);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}
