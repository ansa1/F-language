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
        functionArgs = new HashMap<>();
    }

    Stack<HashMap<String, String>> stack = new Stack<>();
    StringBuilder result;

    private static HashMap<String, Integer> functionArgs;

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

    private int calculateParams(String expression) {
        int amount = 0;
        if (expression.length() > 6 && expression.substring(0, 4).equals("func")) {
            if (expression.substring(4, 6).equals("()"))
                return amount;
            else {
                int i = 4;
                while (expression.charAt(i) != ')') {
                    if (expression.charAt(i) == ':')
                        amount++;
                    i++;
                }
                return amount;
            }
        }
        return -1;
    }

    @Override
    public void exitDeclaration(FParser.DeclarationContext ctx) {
//        int k = calculateParams(ctx.expression().getText());
//        if (k != -1) {
//            System.out.println(ctx.identifier().getText());
//            functionArgs.put(ctx.identifier().getText(), k);
//        }
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
    public void enterParameters(FParser.ParametersContext ctx) {

    }

    @Override
    public void exitParameters(FParser.ParametersContext ctx) {

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
    public void enterAssignment_or_call(FParser.Assignment_or_callContext ctx) {

    }

    @Override
    public void exitAssignment_or_call(FParser.Assignment_or_callContext ctx) {
//        String full = ctx.getText();
//        if (full != null) {
//            String identName = ctx.identifier().getText();
//            int i = identName.length();
//            String expression = ctx.tail().getText();
//            int amount = 0;
//            if (expression.charAt(0) == '(' && expression.charAt(expression.length()-1) == ')') {
//                amount = expression.split(",").length;
//            }
//            if (expression.matches("\\(\\s*\\)")) amount = 0;
//            if (amount != functionArgs.get(identName)) {
//                result.append(String.format("Illegal function call, function : {} requires {} param ",
//                        identName, amount));
//            }
//        }
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
