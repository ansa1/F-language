import antlr.FParser;
import antlr.FVisitor;
import org.antlr.v4.runtime.tree.*;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Stack;


public class FTreeCodeGeneratorVisitor extends AbstractParseTreeVisitor<Value> implements FVisitor<Value> {

    public static final double SMALL_VALUE = 0.00000000001;

    @Override
    public Value visitTranslationunit(FParser.TranslationunitContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitProgram(FParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitDeclaration(FParser.DeclarationContext ctx) {
        return visitChildren(ctx);
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
                    return new Value(left.asDouble() < right.asDouble());
                case "<=":
                    return new Value(left.asDouble() <= right.asDouble());
                case ">":
                    return new Value(left.asDouble() > right.asDouble());
                case ">=":
                    return new Value(left.asDouble() >= right.asDouble());
                case "=":
                    return left.isDouble() && right.isDouble() ?
                            new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                            new Value(left.equals(right));
                case "/=":
                    return left.isDouble() && right.isDouble() ?
                            new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                            new Value(!left.equals(right));
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
                    }
                case "/":
                    return new Value(left.asDouble() / right.asDouble());
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
                    return new Value(value.asDouble());
                case "-":
                    return new Value(-value.asDouble());
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
        return visitChildren(ctx);
    }

    @Override
    public Value visitFun_declaration(FParser.Fun_declarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitParameters(FParser.ParametersContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitBody(FParser.BodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitBody_start(FParser.Body_startContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitBody_end(FParser.Body_endContext ctx) {
        return visitChildren(ctx);
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
        return visitChildren(ctx);
    }

    @Override
    public Value visitStatement(FParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitAssignment_or_call(FParser.Assignment_or_callContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitConditional(FParser.ConditionalContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitThen_statement(FParser.Then_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitElse_statement(FParser.Else_statementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitLoop(FParser.LoopContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitLoop_body(FParser.Loop_bodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitLoop_body_start(FParser.Loop_body_startContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Value visitLoop_body_end(FParser.Loop_body_endContext ctx) {
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
        return visitChildren(ctx);
    }
}
