import org.antlr.v4.runtime.tree.ParseTree;

public class Compilation {
    public static void main(String[] args) {
        System.out.println("Compiled file execution");
        CSyntaxAnalyzer cSyntaxAnalyzer = new CSyntaxAnalyzer();
        ParseTree AST = cSyntaxAnalyzer.analyze("./in.txt");
        FTreeCodeGeneratorVisitor visitor = new FTreeCodeGeneratorVisitor();
        visitor.visit(AST);
    }
}
