import org.antlr.v4.runtime.tree.ParseTree;

public class Compilation {
    public static void main(String[] args) {
        System.out.println("hey");
        CSyntaxAnalyzer cSyntaxAnalyzer = new CSyntaxAnalyzer();
        ParseTree AST = cSyntaxAnalyzer.analyze("./in.txt");
        FTreeCodeGeneratorVisitor visitor = new FTreeCodeGeneratorVisitor();
        visitor.visit(AST);
    }
}
