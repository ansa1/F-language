import antlr.FParser;
import antlr.FVisitor;
import org.antlr.v4.runtime.tree.*;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;


public class FTreeCodeGeneratorVisitor extends AbstractParseTreeVisitor<Value> implements FVisitor<Value> {

    public static final double SMALL_VALUE = 0.00000000001;

    Stack<HashMap<String, Value>> stack = new Stack<>();
    Stack<ArrayList<Value>> params = new Stack<>();
    Stack<HashMap<String, FParser.ExpressionContext>> stackFun = new Stack<>();

    private void initStack() {
        if (stack.isEmpty()) {
            stack.push(new HashMap<>());
        }
    }

    private void initStackFun() {
        if (stackFun.isEmpty()) {
            stackFun.push(new HashMap<>());
        }
    }

    private void initStackParams() {
        if (params.isEmpty()) {
            params.push(new ArrayList<>());
        }
    }

    @Override
    public Value visitTranslationunit(FParser.TranslationunitContext ctx) {
        initStack();
        initStackFun();
        return visitChildren(ctx);
    }

    @Override
    public Value visitProgram(FParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitDeclaration(FParser.DeclarationContext ctx) {
        if (ctx.expression().getText().contains("func")) {
            if (ctx.identifier().getText().equals("main")) {
                return visitChildren(ctx);
            }
            stackFun.peek().put(ctx.identifier().getText(), ctx.expression());
        } else {
            stack.peek().put(ctx.identifier().getText(), this.visit(ctx.expression()));
        }
        return null;
    }

    @Override
    public Value visitExpressions(FParser.ExpressionsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitExpression(FParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitRelation(FParser.RelationContext ctx) {
        if (ctx.op != null) {
            Value left = this.visit(ctx.left);
            Value right = this.visit(ctx.right);
            switch (ctx.op.getText()) {
                case "<":
                    if (left.isDouble() && right.isDouble()) {
                        return new Value(left.asDouble() < right.asDouble());
                    } else if (left.isInteger() && right.isInteger()) {
                        return new Value(left.asInteger() < right.asInteger());
                    } else if (left.isInteger() && right.isDouble()) {
                        return new Value(Double.valueOf(left.asInteger()) < right.asDouble());
                    } else if (left.isDouble() && right.isInteger()) {
                        return new Value(left.asDouble() < Double.valueOf(right.asInteger()));
                    } else if (left.isRational() && right.isRational()) {
                        return new Value((left.asRational().getNumerator() * right.asRational().getDenominator()) < (right.asRational().getNumerator() * left.asRational().getDenominator()));
                    } else if (left.isInteger() && right.isRational()) {
                        return new Value((left.asInteger() * right.asRational().getDenominator()) < right.asRational().getNumerator());
                    } else if (left.isRational() && right.isInteger()) {
                        return new Value(left.asRational().getNumerator() < (right.asInteger() * left.asRational().getDenominator()));
                    } else {
                        throw new RuntimeException("bad types of: " + ctx.left.getText() + " and " + ctx.right.getText());
                    }
                case "<=":
                    if (left.isDouble() && right.isDouble()) {
                        return new Value(left.asDouble() <= right.asDouble());
                    } else if (left.isInteger() && right.isInteger()) {
                        return new Value(left.asInteger() <= right.asInteger());
                    } else if (left.isInteger() && right.isDouble()) {
                        return new Value(Double.valueOf(left.asInteger()) <= right.asDouble());
                    } else if (left.isDouble() && right.isInteger()) {
                        return new Value(left.asDouble() <= Double.valueOf(right.asInteger()));
                    } else if (left.isRational() && right.isRational()) {
                        return new Value((left.asRational().getNumerator() * right.asRational().getDenominator()) <= (right.asRational().getNumerator() * left.asRational().getDenominator()));
                    } else if (left.isInteger() && right.isRational()) {
                        return new Value((left.asInteger() * right.asRational().getDenominator()) <= right.asRational().getNumerator());
                    } else if (left.isRational() && right.isInteger()) {
                        return new Value(left.asRational().getNumerator() <= (right.asInteger() * left.asRational().getDenominator()));
                    } else {
                        throw new RuntimeException("bad types of: " + ctx.left.getText() + " and " + ctx.right.getText());
                    }
                case ">":
                    if (left.isDouble() && right.isDouble()) {
                        return new Value(left.asDouble() > right.asDouble());
                    } else if (left.isInteger() && right.isInteger()) {
                        return new Value(left.asInteger() > right.asInteger());
                    } else if (left.isInteger() && right.isDouble()) {
                        return new Value(Double.valueOf(left.asInteger()) > right.asDouble());
                    } else if (left.isDouble() && right.isInteger()) {
                        return new Value(left.asDouble() > Double.valueOf(right.asInteger()));
                    } else if (left.isRational() && right.isRational()) {
                        return new Value((left.asRational().getNumerator() * right.asRational().getDenominator()) > (right.asRational().getNumerator() * left.asRational().getDenominator()));
                    } else if (left.isInteger() && right.isRational()) {
                        return new Value((left.asInteger() * right.asRational().getDenominator()) > right.asRational().getNumerator());
                    } else if (left.isRational() && right.isInteger()) {
                        return new Value(left.asRational().getNumerator() > (right.asInteger() * left.asRational().getDenominator()));
                    } else {
                        throw new RuntimeException("bad types of: " + ctx.left.getText() + " and " + ctx.right.getText());
                    }
                case ">=":
                    if (left.isDouble() && right.isDouble()) {
                        return new Value(left.asDouble() >= right.asDouble());
                    } else if (left.isInteger() && right.isInteger()) {
                        return new Value(left.asInteger() >= right.asInteger());
                    } else if (left.isInteger() && right.isDouble()) {
                        return new Value(Double.valueOf(left.asInteger()) >= right.asDouble());
                    } else if (left.isDouble() && right.isInteger()) {
                        return new Value(left.asDouble() >= Double.valueOf(right.asInteger()));
                    } else if (left.isRational() && right.isRational()) {
                        return new Value((left.asRational().getNumerator() * right.asRational().getDenominator()) >= (right.asRational().getNumerator() * left.asRational().getDenominator()));
                    } else if (left.isInteger() && right.isRational()) {
                        return new Value((left.asInteger() * right.asRational().getDenominator()) >= right.asRational().getNumerator());
                    } else if (left.isRational() && right.isInteger()) {
                        return new Value(left.asRational().getNumerator() >= (right.asInteger() * left.asRational().getDenominator()));
                    } else {
                        throw new RuntimeException("bad types of: " + ctx.left.getText() + " and " + ctx.right.getText());
                    }
                case "=":
                    if (left.isDouble() && right.isDouble()) {
                        return new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE);
                    } else if (left.isInteger() && right.isInteger()) {
                        return new Value(left.asInteger().equals(right.asInteger()));
                    } else if (left.isInteger() && right.isDouble()) {
                        return new Value(Math.abs(Double.valueOf(left.asInteger()) - right.asDouble()) < SMALL_VALUE);
                    } else if (left.isDouble() && right.isInteger()) {
                        return new Value(Math.abs(left.asDouble() - Double.valueOf(right.asInteger())) < SMALL_VALUE);
                    } else if (left.isRational() && right.isRational()) {
                        return new Value((left.asRational().getNumerator() * right.asRational().getDenominator()) == (right.asRational().getNumerator() * left.asRational().getDenominator()));
                    } else if (left.isInteger() && right.isRational()) {
                        return new Value((left.asInteger() * right.asRational().getDenominator()) == right.asRational().getNumerator());
                    } else if (left.isRational() && right.isInteger()) {
                        return new Value(left.asRational().getNumerator() == (right.asInteger() * left.asRational().getDenominator()));
                    } else {
                        throw new RuntimeException("bad types of: " + ctx.left.getText() + " and " + ctx.right.getText());
                    }
                case "/=":
                    if (left.isDouble() && right.isDouble()) {
                        return new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE);
                    } else if (left.isInteger() && right.isInteger()) {
                        return new Value(!left.asInteger().equals(right.asInteger()));
                    } else if (left.isInteger() && right.isDouble()) {
                        return new Value(Math.abs(Double.valueOf(left.asInteger()) - right.asDouble()) >= SMALL_VALUE);
                    } else if (left.isDouble() && right.isInteger()) {
                        return new Value(Math.abs(left.asDouble() - Double.valueOf(right.asInteger())) >= SMALL_VALUE);
                    } else if (left.isRational() && right.isRational()) {
                        return new Value((left.asRational().getNumerator() * right.asRational().getDenominator()) != (right.asRational().getNumerator() * left.asRational().getDenominator()));
                    } else if (left.isInteger() && right.isRational()) {
                        return new Value((left.asInteger() * right.asRational().getDenominator()) != right.asRational().getNumerator());
                    } else if (left.isRational() && right.isInteger()) {
                        return new Value(left.asRational().getNumerator() != (right.asInteger() * left.asRational().getDenominator()));
                    } else {
                        throw new RuntimeException("bad types of: " + ctx.left.getText() + " and " + ctx.right.getText());
                    }
                default:
                    throw new RuntimeException("unknown operator: " + ctx.op.getText());
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Value visitFactor(FParser.FactorContext ctx) {
        if (ctx.op != null) {
            Value left = this.visit(ctx.left);
            Value right = this.visit(ctx.right);
            switch (ctx.op.getText()) {
                case "+":
                    if (left.isDouble() && right.isDouble()) {
                        return new Value(left.asDouble() + right.asDouble());
                    } else if (left.isDouble() && right.isInteger()) {
                        return new Value(left.asDouble() + right.asInteger());
                    } else if (left.isInteger() && right.isDouble()) {
                        return new Value(left.asInteger() + right.asDouble());
                    } else if (left.isInteger() && right.isInteger()) {
                        return new Value(left.asInteger() + right.asInteger());
                    } else if (left.isRational() && right.isRational()) {
                        return new Value(Utils.rational_sum(left.asRational(), right.asRational()));
                    } else if (left.isInteger() && right.isRational()) {
                        return new Value(Utils.rational_sum(left.asInteger(), right.asRational()));
                    } else if (left.isRational() && right.isInteger()) {
                        return new Value(Utils.rational_sum(left.asRational(), right.asInteger()));
                    } else if (left.isComplex() && right.isComplex()) {
                        return new Value(Utils.complex_sum(left.asComplex(), right.asComplex()));
                    } else if (left.isInteger() && right.isComplex()) {
                        return new Value(Utils.complex_sum(left.asInteger(), right.asComplex()));
                    } else if (left.isComplex() && right.isInteger()) {
                        return new Value(Utils.complex_sum(left.asComplex(), right.asInteger()));
                    } else if (left.isDouble() && right.isComplex()) {
                        return new Value(Utils.complex_sum(left.asDouble(), right.asComplex()));
                    } else if (left.isComplex() && right.isDouble()) {
                        return new Value(Utils.complex_sum(left.asComplex(), right.asDouble()));
                    } else {
                        throw new RuntimeException("bad types of: " + ctx.left.getText() + " and " + ctx.right.getText());
                    }
                case "-":
                    if (left.isDouble() && right.isDouble()) {
                        return new Value(left.asDouble() - right.asDouble()); //.0000000003
                    } else if (left.isDouble() && right.isInteger()) {
                        return new Value(left.asDouble() - right.asInteger());
                    } else if (left.isInteger() && right.isDouble()) {
                        return new Value(left.asInteger() - right.asDouble());
                    } else if (left.isInteger() && right.isInteger()) {
                        return new Value(left.asInteger() - right.asInteger());
                    } else if (left.isRational() && right.isRational()) {
                        return new Value(Utils.rational_sub(left.asRational(), right.asRational()));
                    } else if (left.isInteger() && right.isRational()) {
                        return new Value(Utils.rational_sub(left.asInteger(), right.asRational()));
                    } else if (left.isRational() && right.isInteger()) {
                        return new Value(Utils.rational_sub(left.asRational(), right.asInteger()));
                    } else if (left.isComplex() && right.isComplex()) {
                        return new Value(Utils.complex_sub(left.asComplex(), right.asComplex()));
                    } else if (left.isInteger() && right.isComplex()) {
                        return new Value(Utils.complex_sub(left.asInteger(), right.asComplex()));
                    } else if (left.isComplex() && right.isInteger()) {
                        return new Value(Utils.complex_sub(left.asComplex(), right.asInteger()));
                    } else if (left.isDouble() && right.isComplex()) {
                        return new Value(Utils.complex_sub(left.asDouble(), right.asComplex())); //.0000000003
                    } else if (left.isComplex() && right.isDouble()) {
                        return new Value(Utils.complex_sub(left.asComplex(), right.asDouble()));
                    } else {
                        throw new RuntimeException("bad types of: " + ctx.left.getText() + " and " + ctx.right.getText());
                    }
                default:
                    throw new RuntimeException("unknown operator: " + ctx.op.getText());
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Value visitTerm(FParser.TermContext ctx) {
        if (ctx.op != null) {
            Value left = this.visit(ctx.left);
            Value right = this.visit(ctx.right);
            switch (ctx.op.getText()) {
                case "*":
                    if (left.isDouble() && right.isDouble()) {
                        return new Value(left.asDouble() * right.asDouble());
                    } else if (left.isDouble() && right.isInteger()) {
                        return new Value(left.asDouble() * right.asInteger());
                    } else if (left.isInteger() && right.isDouble()) {
                        return new Value(left.asInteger() * right.asDouble());
                    } else if (left.isInteger() && right.isInteger()) {
                        return new Value(left.asInteger() * right.asInteger());
                    } else if (left.isRational() && right.isRational()) {
                        return new Value(Utils.rational_mult(left.asRational(), right.asRational()));
                    } else if (left.isInteger() && right.isRational()) {
                        return new Value(Utils.rational_mult(left.asInteger(), right.asRational()));
                    } else if (left.isRational() && right.isInteger()) {
                        return new Value(Utils.rational_mult(left.asRational(), right.asInteger()));
                    } else if (left.isComplex() && right.isComplex()) {
                        return new Value(Utils.complex_mult(left.asComplex(), right.asComplex()));
                    } else if (left.isInteger() && right.isComplex()) {
                        return new Value(Utils.complex_mult(left.asInteger(), right.asComplex()));
                    } else if (left.isComplex() && right.isInteger()) {
                        return new Value(Utils.complex_mult(left.asComplex(), right.asInteger()));
                    } else if (left.isDouble() && right.isComplex()) {
                        return new Value(Utils.complex_mult(left.asDouble(), right.asComplex()));
                    } else if (left.isComplex() && right.isDouble()) {
                        return new Value(Utils.complex_mult(left.asComplex(), right.asDouble()));
                    } else {
                        throw new RuntimeException("bad types of: " + ctx.left.getText() + " and " + ctx.right.getText());
                    }
                case "/":
                    if (left.isDouble() && right.isDouble()) {
                        return new Value(left.asDouble() / right.asDouble());
                    } else if (left.isInteger() && right.isInteger()) {
                        return new Value(Double.valueOf(left.asInteger()) / Double.valueOf(right.asInteger()));
                    } else if (left.isInteger() && right.isDouble()) {
                        return new Value(Double.valueOf(left.asInteger()) / right.asDouble());
                    } else if (left.isDouble() && right.isInteger()) {
                        return new Value(left.asDouble() / Double.valueOf(right.asInteger()));
                    } else if (left.isRational() && right.isRational()) {
                        return new Value(Utils.rational_div(left.asRational(), right.asRational()));
                    } else if (left.isInteger() && right.isRational()) {
                        return new Value(Utils.rational_div(left.asInteger(), right.asRational()));
                    } else if (left.isRational() && right.isInteger()) {
                        return new Value(Utils.rational_div(left.asRational(), right.asInteger()));
                    } else if (left.isComplex() && right.isComplex()) {
                        return new Value(Utils.complex_div(left.asComplex(), right.asComplex()));
                    } else if (left.isComplex() && right.isInteger()) {
                        return new Value(Utils.complex_div(left.asComplex(), right.asInteger()));
                    } else if (left.isComplex() && right.isDouble()) {
                        return new Value(Utils.complex_div(left.asComplex(), right.asDouble()));
                    } else {
                        throw new RuntimeException("bad types of: " + ctx.left.getText() + " and " + ctx.right.getText());
                    }
                default:
                    throw new RuntimeException("unknown operator: " + ctx.op.getText());
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Value visitUnary(FParser.UnaryContext ctx) {
        if (ctx.sign != null) {
            Value value = this.visit(ctx.exp);
            switch (ctx.sign.getText()) {
                case "+":
                    if (value.isDouble()) {
                        return new Value(value.asDouble());
                    }
                    if (value.isInteger()) {
                        return new Value(value.asInteger());
                    }
                    if (value.isRational()) {
                        return new Value(Utils.uplus(value.asRational()));
                    }
                    if (value.isComplex()) {
                        return new Value(Utils.uplus(value.asComplex()));
                    }
                case "-":
                    if (value.isDouble()) {
                        return new Value(-value.asDouble());
                    }
                    if (value.isInteger()) {
                        return new Value(-value.asInteger());
                    }
                    if (value.isRational()) {
                        return new Value(Utils.uminus(value.asRational()));
                    }
                    if (value.isComplex()) {
                        return new Value(Utils.uminus(value.asComplex()));
                    }
                default:
                    throw new RuntimeException("unknown operator: " + ctx.sign.getText());
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Value visitSecondary(FParser.SecondaryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitPrimary(FParser.PrimaryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitTail(FParser.TailContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitElementary(FParser.ElementaryContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitFunction(FParser.FunctionContext ctx) {
//        System.out.println(2);
        Value result = visitChildren(ctx);
        return result;
    }

    @Override
    public Value visitParameters(FParser.ParametersContext ctx) {
//        System.out.println("-----------------");
        for (int i = 0; i < ctx.fun_declaration().size(); i++) {
            String fun_param = ctx.fun_declaration(i).identifier().getText();
            if (!params.isEmpty()) {
                System.out.println("PARAMS " + params.peek().get(i));
                stack.peek().put(fun_param, params.peek().get(i));
                stack.peek().replace(fun_param, params.peek().get(i));
            }
        }
        return null;
    }

    private void addLayer() {
        stack.push(new HashMap<>());
    }

    @Override
    public Value visitFunc_begin(FParser.Func_beginContext ctx) {
//        System.out.println(3);
        addLayer();
        return null;
    }

    public Value visitFunc_begin(FParser.Func_beginContext ctx, ArrayList<String> paramsKeys, ArrayList<Value> paramValues) {
//        System.out.println(3);
        addLayer();
        for (int i = 0; i < paramsKeys.size(); i++) {
            stack.peek().put(paramsKeys.get(i), paramValues.get(i));
        }
        return null;
    }

    @Override
    public Value visitFun_declaration(FParser.Fun_declarationContext ctx) {
        return null;
    }

    @Override
    public Value visitBody(FParser.BodyContext ctx) {
//        System.out.println(4);
        Value result = this.visit(ctx.statements());
        return result;
    }

    @Override
    public Value visitBody_start(FParser.Body_startContext ctx) {
        return null;
    }

    @Override
    public Value visitBody_end(FParser.Body_endContext ctx) {
        stack.pop();
        params.pop();
        return null;
    }

    @Override
    public Value visitTuple(FParser.TupleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitTuple_element(FParser.Tuple_elementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitMap(FParser.MapContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitMap_element(FParser.Map_elementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitList(FParser.ListContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitType(FParser.TypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitStatements(FParser.StatementsContext ctx) {
        Value result = new Value(0);
        Value returnResult = null;
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i).getText().matches("^return.*$")) {
                System.out.println("ALERT " + ctx.statement(i).getText());
                returnResult = visit(ctx.statement(i));
                return returnResult;
            } else
                result = visit(ctx.statement(i));
        }
        return null;
    }

    @Override
    public Value visitStatement(FParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitReturn_statement(FParser.Return_statementContext ctx) {
//        System.out.println(5);
        Value val = new Value(visit(ctx.expression()));
//        System.out.println("return " + val);
        return val;
    }

    @Override
    public Value visitPrint(FParser.PrintContext ctx) {
        for (int i = 0; i < ctx.expression().size(); i++) {
            System.out.print(this.visit(ctx.expression(i)).value.toString() + " ");
        }
        System.out.println();
        return null;
    }

    @Override
    public Value visitAssignment(FParser.AssignmentContext ctx) {
        Value newV = visit(ctx.assign_right_part());
        for (int i = 0; i < stack.size(); i++) {
            HashMap<String, Value> tmp = stack.get(i);
            if (tmp.containsKey(ctx.identifier().getText())) {
                Value old = tmp.get(ctx.identifier().getText());
                if ((old.isBoolean() && !newV.isBoolean()) || (old.isComplex() && !newV.isComplex()) || (old.isDouble() && !newV.isDouble()) || (old.isInteger() && !newV.isInteger()) || (old.isRational() && !newV.isRational()))
                    throw new RuntimeException("types mismatch in " + ctx.getText());
                tmp.replace(ctx.identifier().getText(), newV);
            }
        }
        return null;
    }

    @Override
    public Value visitAssign_right_part(FParser.Assign_right_partContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitFunction_call(FParser.Function_callContext ctx) {
//        System.out.println("call func " + ctx.getText());
        for (int i = 0; i < stackFun.size(); i++) {
            HashMap<String, FParser.ExpressionContext> tmp = stackFun.get(i);
            if (tmp.containsKey(ctx.identifier().getText())) {

                ArrayList<Value> params_keys = new ArrayList<>();
                ArrayList<Value> params_values = new ArrayList<>();

                for (int j = 0; j < ctx.expression().size(); j++) {
                    params_values.add(visit(ctx.expression(i)));
                    params_keys.add(new Value("k"));
                }

//                initStackParams();
                if (!params.empty()) {
                    System.out.println("etfawgawg");
//                    params.pop();
                }
                params.push(params_values);
                System.out.println(params.peek());
                Value val = visit(tmp.get(ctx.identifier().getText()));
                return val;
            }
        }
        return null;
    }

    @Override
    public Value visitConditional(FParser.ConditionalContext ctx) {
        Boolean condition = this.visit(ctx.expression()).asBoolean();
        if (condition) {
            return this.visit(ctx.then_statement());
        } else {
            if (ctx.else_statement() != null)
                return this.visit(ctx.else_statement());
        }
        return null;
    }

    @Override
    public Value visitThen_statement(FParser.Then_statementContext ctx) {
        stack.push(new HashMap<>());
        return visitChildren(ctx);
    }

    @Override
    public Value visitElse_statement(FParser.Else_statementContext ctx) {
//        stack.pop();
//        stack.push(new HashMap<>());
        return visitChildren(ctx);
    }

    @Override
    public Value visitLoop(FParser.LoopContext ctx) {
        stack.push(new HashMap<>());
        return visitChildren(ctx);
    }

    @Override
    public Value visitFor_loop(FParser.For_loopContext ctx) {
        Value start;
        Value end;
        if (ctx.expression(1) != null) {
            start = this.visit(ctx.expression(0));
            end = this.visit(ctx.expression(1));
        } else {
            start = new Value(0);
            end = this.visit(ctx.expression(0));
        }
        for (int i = start.asInteger(); i < end.asInteger(); i++) {
            visitChildren(ctx);
        }
        return null;
    }

    @Override
    public Value visitWhile_loop(FParser.While_loopContext ctx) {
        Boolean condition = this.visit(ctx.expression()).asBoolean();
        while (condition) {
            visitChildren(ctx);
            condition = this.visit(ctx.expression()).asBoolean();
        }
        return null;
    }

    @Override
    public Value visitLoop_body(FParser.Loop_bodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitBool_literal(FParser.Bool_literalContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitInteger_literal(FParser.Integer_literalContext ctx) {
        return new Value(Integer.valueOf(ctx.getText()));
    }

    @Override
    public Value visitReal_literal(FParser.Real_literalContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitString_literal(FParser.String_literalContext ctx) {
        String str = ctx.getText();
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"").replace("\'\'", "\'");
        return new Value(str);
    }

    @Override
    public Value visitComplex_literal(FParser.Complex_literalContext ctx) {
        return new Value(new Complex(ctx.getText()));
    }

    @Override
    public Value visitRational_literal(FParser.Rational_literalContext ctx) {
        return new Value(new Rational(ctx.numerator.getText(), ctx.denominator.getText()));
    }

    @Override
    public Value visitIdentifier(FParser.IdentifierContext ctx) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            HashMap<String, Value> tmp = stack.get(i);
            if (tmp.containsKey(ctx.getText())) {
                return tmp.get(ctx.getText());
            }
        }
        return visitChildren(ctx);
    }
}
