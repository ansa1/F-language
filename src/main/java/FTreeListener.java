import antlr.FListener;
import antlr.FParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Stack;

public class FTreeListener implements FListener {

    public FTreeListener() {
        result = new StringBuilder();
    }

    Stack<HashMap<String, String>> stack = new Stack<>();
    StringBuilder result;

    private void initStack() {
        if (stack.isEmpty()) {
            stack.push(new HashMap<>());
        }
    }

    public String getResult() {
        return result.toString();
    }

    @Override
    public void enterTranslationunit(FParser.TranslationunitContext ctx) {
        initStack();
    }

    @Override
    public void exitTranslationunit(FParser.TranslationunitContext ctx) {

    }

    @Override
    public void enterProgram(FParser.ProgramContext ctx) {
    }

    @Override
    public void exitProgram(FParser.ProgramContext ctx) {

    }

    @Override
    public void enterDeclaration(FParser.DeclarationContext ctx) {

    }

    @Override
    public void exitDeclaration(FParser.DeclarationContext ctx) {

    }

    @Override
    public void enterExpressions(FParser.ExpressionsContext ctx) {

    }

    @Override
    public void exitExpressions(FParser.ExpressionsContext ctx) {
    }

    @Override
    public void enterExpression(FParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression(FParser.ExpressionContext ctx) {

    }

    @Override
    public void enterRelation(FParser.RelationContext ctx) {

    }

    @Override
    public void exitRelation(FParser.RelationContext ctx) {

    }

    @Override
    public void enterFactor(FParser.FactorContext ctx) {

    }

    @Override
    public void exitFactor(FParser.FactorContext ctx) {

    }

    @Override
    public void enterTerm(FParser.TermContext ctx) {

    }

    @Override
    public void exitTerm(FParser.TermContext ctx) {

    }

    @Override
    public void enterUnary(FParser.UnaryContext ctx) {

    }

    @Override
    public void exitUnary(FParser.UnaryContext ctx) {

    }

    @Override
    public void enterSecondary(FParser.SecondaryContext ctx) {

    }

    @Override
    public void exitSecondary(FParser.SecondaryContext ctx) {

    }

    @Override
    public void enterPrimary(FParser.PrimaryContext ctx) {

    }

    @Override
    public void exitPrimary(FParser.PrimaryContext ctx) {

    }

    @Override
    public void enterTail(FParser.TailContext ctx) {

    }

    @Override
    public void exitTail(FParser.TailContext ctx) {

    }

    @Override
    public void enterElementary(FParser.ElementaryContext ctx) {

    }

    @Override
    public void exitElementary(FParser.ElementaryContext ctx) {

    }

    @Override
    public void enterFunction(FParser.FunctionContext ctx) {
        HashMap clone = (HashMap) stack.peek().clone();
        stack.push(clone);
    }

    @Override
    public void exitFunction(FParser.FunctionContext ctx) {
        stack.pop();
    }

    @Override
    public void enterParameters(FParser.ParametersContext ctx) {

    }

    @Override
    public void exitParameters(FParser.ParametersContext ctx) {

    }

    @Override
    public void enterFunc_begin(FParser.Func_beginContext ctx) {

    }

    @Override
    public void exitFunc_begin(FParser.Func_beginContext ctx) {

    }

    @Override
    public void enterFun_declaration(FParser.Fun_declarationContext ctx) {

    }

    @Override
    public void exitFun_declaration(FParser.Fun_declarationContext ctx) {
        stack.peek().put(ctx.identifier().getText(), ctx.type().getText());
    }

    @Override
    public void enterBody(FParser.BodyContext ctx) {

    }

    @Override
    public void exitBody(FParser.BodyContext ctx) {

    }

    @Override
    public void enterBody_start(FParser.Body_startContext ctx) {

    }

    @Override
    public void exitBody_start(FParser.Body_startContext ctx) {

    }

    @Override
    public void enterBody_end(FParser.Body_endContext ctx) {

    }

    @Override
    public void exitBody_end(FParser.Body_endContext ctx) {

    }

    @Override
    public void enterTuple(FParser.TupleContext ctx) {

    }

    @Override
    public void exitTuple(FParser.TupleContext ctx) {

    }

    @Override
    public void enterTuple_element(FParser.Tuple_elementContext ctx) {

    }

    @Override
    public void exitTuple_element(FParser.Tuple_elementContext ctx) {

    }

    @Override
    public void enterMap(FParser.MapContext ctx) {

    }

    @Override
    public void exitMap(FParser.MapContext ctx) {

    }

    @Override
    public void enterMap_element(FParser.Map_elementContext ctx) {

    }

    @Override
    public void exitMap_element(FParser.Map_elementContext ctx) {

    }

    @Override
    public void enterList(FParser.ListContext ctx) {

    }

    @Override
    public void exitList(FParser.ListContext ctx) {

    }

    @Override
    public void enterType(FParser.TypeContext ctx) {

    }

    @Override
    public void exitType(FParser.TypeContext ctx) {

    }

    @Override
    public void enterStatements(FParser.StatementsContext ctx) {

    }

    @Override
    public void exitStatements(FParser.StatementsContext ctx) {

    }

    @Override
    public void enterStatement(FParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(FParser.StatementContext ctx) {

    }

    @Override
    public void enterReturn_statement(FParser.Return_statementContext ctx) {

    }

    @Override
    public void exitReturn_statement(FParser.Return_statementContext ctx) {

    }

    @Override
    public void enterPrint(FParser.PrintContext ctx) {

    }

    @Override
    public void exitPrint(FParser.PrintContext ctx) {

    }

    @Override
    public void enterAssignment(FParser.AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(FParser.AssignmentContext ctx) {

    }

    @Override
    public void enterAssign_right_part(FParser.Assign_right_partContext ctx) {

    }

    @Override
    public void exitAssign_right_part(FParser.Assign_right_partContext ctx) {

    }

    @Override
    public void enterFunction_call(FParser.Function_callContext ctx) {

    }

    @Override
    public void exitFunction_call(FParser.Function_callContext ctx) {

    }

    @Override
    public void enterConditional(FParser.ConditionalContext ctx) {

    }

    @Override
    public void exitConditional(FParser.ConditionalContext ctx) {

    }

    @Override
    public void enterThen_statement(FParser.Then_statementContext ctx) {
        HashMap clone = (HashMap) stack.peek().clone();
        stack.push(clone);
    }

    @Override
    public void exitThen_statement(FParser.Then_statementContext ctx) {
        stack.pop();
    }

    @Override
    public void enterElse_statement(FParser.Else_statementContext ctx) {
        HashMap clone = (HashMap) stack.peek().clone();
        stack.push(clone);
    }

    @Override
    public void exitElse_statement(FParser.Else_statementContext ctx) {
        stack.pop();
    }

    @Override
    public void enterLoop(FParser.LoopContext ctx) {
        HashMap clone = (HashMap) stack.peek().clone();
        stack.push(clone);
    }

    @Override
    public void exitLoop(FParser.LoopContext ctx) {
        stack.pop();
    }

    @Override
    public void enterFor_loop(FParser.For_loopContext ctx) {

    }

    @Override
    public void exitFor_loop(FParser.For_loopContext ctx) {

    }

    @Override
    public void enterWhile_loop(FParser.While_loopContext ctx) {

    }

    @Override
    public void exitWhile_loop(FParser.While_loopContext ctx) {

    }

    @Override
    public void enterLoop_body(FParser.Loop_bodyContext ctx) {

    }

    @Override
    public void exitLoop_body(FParser.Loop_bodyContext ctx) {

    }

    @Override
    public void enterBool_literal(FParser.Bool_literalContext ctx) {

    }

    @Override
    public void exitBool_literal(FParser.Bool_literalContext ctx) {

    }

    @Override
    public void enterInteger_literal(FParser.Integer_literalContext ctx) {

    }

    @Override
    public void exitInteger_literal(FParser.Integer_literalContext ctx) {

    }

    @Override
    public void enterReal_literal(FParser.Real_literalContext ctx) {

    }

    @Override
    public void exitReal_literal(FParser.Real_literalContext ctx) {

    }

    @Override
    public void enterString_literal(FParser.String_literalContext ctx) {

    }

    @Override
    public void exitString_literal(FParser.String_literalContext ctx) {

    }

    @Override
    public void enterComplex_literal(FParser.Complex_literalContext ctx) {

    }

    @Override
    public void exitComplex_literal(FParser.Complex_literalContext ctx) {

    }

    @Override
    public void enterRational_literal(FParser.Rational_literalContext ctx) {

    }

    @Override
    public void exitRational_literal(FParser.Rational_literalContext ctx) {

    }

    @Override
    public void enterIdentifier(FParser.IdentifierContext ctx) {

    }

    @Override
    public void exitIdentifier(FParser.IdentifierContext ctx) {
        if (ctx.getParent().getClass().getName().matches("(^.*Declaration.*$)|(^.*declaration.*$)")) {
            stack.peek().put(ctx.IdentifierName().getText(), "");
        }
        if (ctx.getParent().getClass().getName().matches("^.*For_loop.*$")) {
            stack.peek().put(ctx.IdentifierName().getText(), "");
        }
        if (ctx.getParent().getClass().getName().matches("^.*Tuple_element.*$")) {
            stack.peek().put(ctx.IdentifierName().getText(), "");
        }
        if (!stack.peek().containsKey(ctx.IdentifierName().getText())) {
            result.append("Variable wasn't declared earlier: " + ctx.IdentifierName().getText() + "\n");
        }
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
