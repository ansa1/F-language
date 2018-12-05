import antlr.FParser;
import antlr.FVisitor;
import org.antlr.v4.runtime.tree.*;


public class FTreeTrimVisitor<T> extends AbstractParseTreeVisitor<T> implements FVisitor<T> {

    @Override
    public T visitTranslationunit(FParser.TranslationunitContext ctx) {
        ParseTree newCtx = ctx;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i).getText().equals(ctx.getText())) {
                newCtx = ctx.getChild(i);
                break;
            }
        }
        System.out.println(ctx.getText());
        System.out.println(ctx.program().getText());
        return visitChildren((RuleNode) newCtx);
    }

    @Override
    public T visitProgram(FParser.ProgramContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            System.out.println("1" + ctx.getChild(i).getText());
            System.out.println("2" + ctx.getText());
            if (ctx.getChild(i).getText().equals(ctx.getText())) {
                System.out.println("here");
                ctx = (FParser.ProgramContext) ctx.getChild(i);
                break;
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public T visitDeclaration(FParser.DeclarationContext ctx) {
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
        return visitChildren(ctx);
    }

    @Override
    public T visitBody_end(FParser.Body_endContext ctx) {
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
        return visitChildren(ctx);
    }

    @Override
    public T visitLoop_body_end(FParser.Loop_body_endContext ctx) {
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

    @Override
    public T visitIdentifier(FParser.IdentifierContext ctx) {
        return visitChildren(ctx);
    }
}
