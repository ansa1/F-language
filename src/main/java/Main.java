import org.antlr.v4.runtime.tree.ParseTree;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        // Try to find a tree, which can describe input
        try {
            CSyntaxAnalyzer cSyntaxAnalyzer = new CSyntaxAnalyzer();
            ParseTree AST = cSyntaxAnalyzer.analyze("./in.txt");

//            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
//
//            int compilationResult = compiler.run(null, null, null, "CompiledMain");
//
//            if (compilationResult == 0) {
//
//                System.out.println("Compilation is successful");
//
//            } else {
//                System.out.println("Compilation Failed");
//            }
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
