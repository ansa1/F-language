import antlr.FParser;
import antlr.FVisitor;
import org.antlr.v4.runtime.tree.*;

import java.util.HashMap;
import java.util.Stack;


public class FTreeVisitor<T> extends AbstractParseTreeVisitor<T> implements FVisitor<T> {

    Stack<HashMap<String, String>> stack = new Stack<>();

    private void initStack() {
        if (stack.isEmpty()) {
            stack.push(new HashMap<>());
        }
    }

    @Override
    public T visitTranslationunit(FParser.TranslationunitContext ctx) {
        initStack();
        return visitChildren(ctx);
    }

    @Override
    public T visitProgram(FParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitDeclaration(FParser.DeclarationContext ctx) {
        String identName = ctx.Identifier().getText();
        String identType = "";
//        if (ctx.type().getText() == null) identType = ctx.type().getText();
        System.out.println(identName);
        System.out.println(identType);
        stack.peek().put(identName, identType);
        return visitChildren(ctx);
    }

    @Override
    public T visitExpressions(FParser.ExpressionsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitExpression(FParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitRelation(FParser.RelationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFactor(FParser.FactorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitTerm(FParser.TermContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitUnary(FParser.UnaryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitSecondary(FParser.SecondaryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitPrimary(FParser.PrimaryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitTail(FParser.TailContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitElementary(FParser.ElementaryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFunction(FParser.FunctionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFun_declaration(FParser.Fun_declarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitParameters(FParser.ParametersContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitBody(FParser.BodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitBody_start(FParser.Body_startContext ctx) {
        HashMap clone = (HashMap) stack.peek().clone();
        stack.push(clone);
        return visitChildren(ctx);
    }

    @Override
    public T visitBody_end(FParser.Body_endContext ctx) {
        stack.pop();
        return visitChildren(ctx);
    }

    @Override
    public T visitTuple(FParser.TupleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitTuple_element(FParser.Tuple_elementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitMap(FParser.MapContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitMap_element(FParser.Map_elementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitList(FParser.ListContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitType(FParser.TypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitStatements(FParser.StatementsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitStatement(FParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitAssignment_or_call(FParser.Assignment_or_callContext ctx) {
//        while (visitChildren(ctx))
        if (!stack.peek().containsKey(ctx.secondary().getText())) {
            System.out.println(ctx.secondary().getText());
            System.out.println("failed");
        }
        return visitChildren(ctx);
    }

    @Override
    public T visitConditional(FParser.ConditionalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitThen_statement(FParser.Then_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitElse_statement(FParser.Else_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitLoop(FParser.LoopContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitLoop_body(FParser.Loop_bodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitLoop_body_start(FParser.Loop_body_startContext ctx) {
        HashMap clone = (HashMap) stack.peek().clone();
        stack.push(clone);
        return visitChildren(ctx);
    }

    @Override
    public T visitLoop_body_end(FParser.Loop_body_endContext ctx) {
        stack.pop();
        return visitChildren(ctx);
    }

    @Override
    public T visitBool_literal(FParser.Bool_literalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitInteger_literal(FParser.Integer_literalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitReal_literal(FParser.Real_literalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitString_literal(FParser.String_literalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitComplex_literal(FParser.Complex_literalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitRational_literal(FParser.Rational_literalContext ctx) {
        return visitChildren(ctx);
    }
}
