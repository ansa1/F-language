// Generated from C:/Users/ansat/Documents/F-language/src/main/java/antlr\F.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FParser}.
 */
public interface FListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationunit(FParser.TranslationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationunit(FParser.TranslationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(FParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(FParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(FParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(FParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(FParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(FParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#secondary}.
	 * @param ctx the parse tree
	 */
	void enterSecondary(FParser.SecondaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#secondary}.
	 * @param ctx the parse tree
	 */
	void exitSecondary(FParser.SecondaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(FParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(FParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(FParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(FParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#elementary}.
	 * @param ctx the parse tree
	 */
	void enterElementary(FParser.ElementaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#elementary}.
	 * @param ctx the parse tree
	 */
	void exitElementary(FParser.ElementaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#func_begin}.
	 * @param ctx the parse tree
	 */
	void enterFunc_begin(FParser.Func_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#func_begin}.
	 * @param ctx the parse tree
	 */
	void exitFunc_begin(FParser.Func_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaration(FParser.Fun_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaration(FParser.Fun_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(FParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(FParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#body_start}.
	 * @param ctx the parse tree
	 */
	void enterBody_start(FParser.Body_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#body_start}.
	 * @param ctx the parse tree
	 */
	void exitBody_start(FParser.Body_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#body_end}.
	 * @param ctx the parse tree
	 */
	void enterBody_end(FParser.Body_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#body_end}.
	 * @param ctx the parse tree
	 */
	void exitBody_end(FParser.Body_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(FParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(FParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#tuple_element}.
	 * @param ctx the parse tree
	 */
	void enterTuple_element(FParser.Tuple_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#tuple_element}.
	 * @param ctx the parse tree
	 */
	void exitTuple_element(FParser.Tuple_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(FParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(FParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#map_element}.
	 * @param ctx the parse tree
	 */
	void enterMap_element(FParser.Map_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#map_element}.
	 * @param ctx the parse tree
	 */
	void exitMap_element(FParser.Map_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(FParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(FParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(FParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(FParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#assignment_or_call}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_or_call(FParser.Assignment_or_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#assignment_or_call}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_or_call(FParser.Assignment_or_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(FParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(FParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#then_statement}.
	 * @param ctx the parse tree
	 */
	void enterThen_statement(FParser.Then_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#then_statement}.
	 * @param ctx the parse tree
	 */
	void exitThen_statement(FParser.Then_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(FParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(FParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(FParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(FParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(FParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(FParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(FParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(FParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void enterLoop_body(FParser.Loop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#loop_body}.
	 * @param ctx the parse tree
	 */
	void exitLoop_body(FParser.Loop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(FParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(FParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(FParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(FParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#real_literal}.
	 * @param ctx the parse tree
	 */
	void enterReal_literal(FParser.Real_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#real_literal}.
	 * @param ctx the parse tree
	 */
	void exitReal_literal(FParser.Real_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(FParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(FParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#complex_literal}.
	 * @param ctx the parse tree
	 */
	void enterComplex_literal(FParser.Complex_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#complex_literal}.
	 * @param ctx the parse tree
	 */
	void exitComplex_literal(FParser.Complex_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#rational_literal}.
	 * @param ctx the parse tree
	 */
	void enterRational_literal(FParser.Rational_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#rational_literal}.
	 * @param ctx the parse tree
	 */
	void exitRational_literal(FParser.Rational_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FParser.IdentifierContext ctx);
}