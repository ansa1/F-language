// Generated from C:/Users/Petr/Documents/c_syntax_analyzer/src/main/java/antlr\F.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FParser#translationunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationunit(FParser.TranslationunitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(FParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(FParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(FParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(FParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(FParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(FParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#secondary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondary(FParser.SecondaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(FParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(FParser.TailContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#elementary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementary(FParser.ElementaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#func_begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_begin(FParser.Func_beginContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#fun_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_declaration(FParser.Fun_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#body_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_start(FParser.Body_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#body_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_end(FParser.Body_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(FParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#tuple_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_element(FParser.Tuple_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(FParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#map_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_element(FParser.Map_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(FParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(FParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(FParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#assign_right_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_right_part(FParser.Assign_right_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(FParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(FParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#then_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_statement(FParser.Then_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(FParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(FParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(FParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(FParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_body(FParser.Loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(FParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(FParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#real_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_literal(FParser.Real_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(FParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#complex_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_literal(FParser.Complex_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#rational_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRational_literal(FParser.Rational_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link FParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(FParser.IdentifierContext ctx);
}