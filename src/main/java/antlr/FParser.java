// Generated from C:/Users/Petr/Documents/c_syntax_analyzer/src/main/java/antlr\F.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		INTEGER=53, COMPLEX=54, REAL=55, IdentifierName=56, Whitespace=57, Newline=58, 
		MultiLineMacro=59;
	public static final int
		RULE_translationunit = 0, RULE_program = 1, RULE_declaration = 2, RULE_expressions = 3, 
		RULE_expression = 4, RULE_relation = 5, RULE_factor = 6, RULE_term = 7, 
		RULE_unary = 8, RULE_secondary = 9, RULE_primary = 10, RULE_tail = 11, 
		RULE_elementary = 12, RULE_function = 13, RULE_parameters = 14, RULE_func_begin = 15, 
		RULE_fun_declaration = 16, RULE_body = 17, RULE_body_start = 18, RULE_body_end = 19, 
		RULE_tuple = 20, RULE_tuple_element = 21, RULE_map = 22, RULE_map_element = 23, 
		RULE_list = 24, RULE_type = 25, RULE_statements = 26, RULE_statement = 27, 
		RULE_return_statement = 28, RULE_print = 29, RULE_assignment = 30, RULE_assign_right_part = 31, 
		RULE_function_call = 32, RULE_conditional = 33, RULE_then_statement = 34, 
		RULE_else_statement = 35, RULE_loop = 36, RULE_for_loop = 37, RULE_while_loop = 38, 
		RULE_loop_body = 39, RULE_bool_literal = 40, RULE_integer_literal = 41, 
		RULE_real_literal = 42, RULE_string_literal = 43, RULE_complex_literal = 44, 
		RULE_rational_literal = 45, RULE_identifier = 46;
	public static final String[] ruleNames = {
		"translationunit", "program", "declaration", "expressions", "expression", 
		"relation", "factor", "term", "unary", "secondary", "primary", "tail", 
		"elementary", "function", "parameters", "func_begin", "fun_declaration", 
		"body", "body_start", "body_end", "tuple", "tuple_element", "map", "map_element", 
		"list", "type", "statements", "statement", "return_statement", "print", 
		"assignment", "assign_right_part", "function_call", "conditional", "then_statement", 
		"else_statement", "loop", "for_loop", "while_loop", "loop_body", "bool_literal", 
		"integer_literal", "real_literal", "string_literal", "complex_literal", 
		"rational_literal", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "'is'", "','", "'and'", "'or'", "'xor'", "'<'", "'<='", 
		"'>'", "'>='", "'='", "'/='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
		"'['", "']'", "'.'", "'func'", "'=>'", "'do'", "'end'", "'{'", "'}'", 
		"'bool'", "'integer'", "'real'", "'rational'", "'complex'", "'string'", 
		"'{}'", "'break'", "'return'", "'print'", "':='", "'if'", "'then'", "'else'", 
		"'for'", "'in'", "'..'", "'while'", "'loop'", "'true'", "'false'", "'''", 
		"'\"'", "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "INTEGER", "COMPLEX", "REAL", "IdentifierName", 
		"Whitespace", "Newline", "MultiLineMacro"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "F.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationunitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitTranslationunit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitTranslationunit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IdentifierName) {
				{
				setState(94);
				program();
				}
			}

			setState(97);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			declaration();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(100);
				match(T__0);
				setState(101);
				declaration();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(107);
			identifier();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(108);
				match(T__1);
				setState(109);
				type();
				}
			}

			setState(112);
			match(T__2);
			setState(113);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			expression();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(116);
				match(T__3);
				setState(117);
				expression();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			relation();
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(124);
				((ExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
					((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				relation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((RelationContext)_localctx).left = factor();
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(129);
				((RelationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
					((RelationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(130);
				((RelationContext)_localctx).right = factor();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TermContext left;
		public Token op;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((FactorContext)_localctx).left = term();
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					((FactorContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__13 || _la==T__14) ) {
						((FactorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(135);
					((FactorContext)_localctx).right = term();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public UnaryContext left;
		public Token op;
		public UnaryContext right;
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((TermContext)_localctx).left = unary();
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(142);
					((TermContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==T__16) ) {
						((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(143);
					((TermContext)_localctx).right = unary();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public Token sign;
		public SecondaryContext exp;
		public SecondaryContext secondary() {
			return getRuleContext(SecondaryContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(149);
				((UnaryContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
					((UnaryContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(152);
			((UnaryContext)_localctx).exp = secondary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecondaryContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public SecondaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterSecondary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitSecondary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitSecondary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondaryContext secondary() throws RecognitionException {
		SecondaryContext _localctx = new SecondaryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_secondary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			primary();
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(155);
				tail();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ElementaryContext elementary() {
			return getRuleContext(ElementaryContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primary);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				elementary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				tuple();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				map();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(T__17);
				setState(164);
				expression();
				setState(165);
				match(T__18);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TailContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tail);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__19);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__26) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << INTEGER) | (1L << COMPLEX) | (1L << REAL) | (1L << IdentifierName))) != 0)) {
					{
					setState(170);
					expression();
					}
				}

				setState(173);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__21);
				setState(175);
				identifier();
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(176);
					tail();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementaryContext extends ParserRuleContext {
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Complex_literalContext complex_literal() {
			return getRuleContext(Complex_literalContext.class,0);
		}
		public Real_literalContext real_literal() {
			return getRuleContext(Real_literalContext.class,0);
		}
		public Rational_literalContext rational_literal() {
			return getRuleContext(Rational_literalContext.class,0);
		}
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterElementary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitElementary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitElementary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryContext elementary() throws RecognitionException {
		ElementaryContext _localctx = new ElementaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementary);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				bool_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				complex_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				real_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				rational_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				integer_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				string_literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Func_beginContext func_begin() {
			return getRuleContext(Func_beginContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			func_begin();
			setState(191);
			match(T__17);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IdentifierName) {
				{
				setState(192);
				parameters();
				}
			}

			setState(195);
			match(T__18);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(196);
				match(T__1);
				setState(197);
				type();
				}
			}

			setState(200);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<Fun_declarationContext> fun_declaration() {
			return getRuleContexts(Fun_declarationContext.class);
		}
		public Fun_declarationContext fun_declaration(int i) {
			return getRuleContext(Fun_declarationContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			fun_declaration();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(203);
				match(T__3);
				setState(204);
				fun_declaration();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_beginContext extends ParserRuleContext {
		public Func_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterFunc_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitFunc_begin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitFunc_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_beginContext func_begin() throws RecognitionException {
		Func_beginContext _localctx = new Func_beginContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Fun_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterFun_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitFun_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitFun_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_declarationContext fun_declaration() throws RecognitionException {
		Fun_declarationContext _localctx = new Fun_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fun_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			identifier();
			setState(213);
			match(T__1);
			setState(214);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public Body_startContext body_start() {
			return getRuleContext(Body_startContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Body_endContext body_end() {
			return getRuleContext(Body_endContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_body);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(216);
				body_start();
				setState(217);
				statements();
				setState(218);
				body_end();
				}
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(220);
				match(T__23);
				setState(221);
				statement();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Body_startContext extends ParserRuleContext {
		public Body_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterBody_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitBody_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitBody_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_startContext body_start() throws RecognitionException {
		Body_startContext _localctx = new Body_startContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_body_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Body_endContext extends ParserRuleContext {
		public Body_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterBody_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitBody_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitBody_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_endContext body_end() throws RecognitionException {
		Body_endContext _localctx = new Body_endContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_body_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleContext extends ParserRuleContext {
		public List<Tuple_elementContext> tuple_element() {
			return getRuleContexts(Tuple_elementContext.class);
		}
		public Tuple_elementContext tuple_element(int i) {
			return getRuleContext(Tuple_elementContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__17);
			setState(229);
			tuple_element();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(230);
				match(T__3);
				setState(231);
				tuple_element();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_elementContext extends ParserRuleContext {
		public ElementaryContext elementary() {
			return getRuleContext(ElementaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Tuple_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterTuple_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitTuple_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitTuple_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_elementContext tuple_element() throws RecognitionException {
		Tuple_elementContext _localctx = new Tuple_elementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tuple_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(239);
				identifier();
				setState(240);
				match(T__2);
				}
				break;
			}
			setState(244);
			elementary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public List<Map_elementContext> map_element() {
			return getRuleContexts(Map_elementContext.class);
		}
		public Map_elementContext map_element(int i) {
			return getRuleContext(Map_elementContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__26);
			setState(247);
			map_element();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(248);
				match(T__3);
				setState(249);
				map_element();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Map_elementContext extends ParserRuleContext {
		public List<ElementaryContext> elementary() {
			return getRuleContexts(ElementaryContext.class);
		}
		public ElementaryContext elementary(int i) {
			return getRuleContext(ElementaryContext.class,i);
		}
		public Map_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterMap_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitMap_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitMap_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_elementContext map_element() throws RecognitionException {
		Map_elementContext _localctx = new Map_elementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_map_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			elementary();
			setState(258);
			match(T__1);
			setState(259);
			elementary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__19);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__26) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << INTEGER) | (1L << COMPLEX) | (1L << REAL) | (1L << IdentifierName))) != 0)) {
				{
				setState(262);
				expression();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(263);
					match(T__3);
					setState(264);
					expression();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(272);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				match(T__33);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				match(T__22);
				setState(281);
				match(T__17);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
					{
					setState(282);
					type();
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(283);
						match(T__3);
						setState(284);
						type();
						}
						}
						setState(289);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(292);
				match(T__18);
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(293);
					match(T__1);
					setState(294);
					type();
					}
					break;
				}
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				match(T__34);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 9);
				{
				setState(298);
				match(T__19);
				setState(299);
				type();
				setState(300);
				match(T__1);
				setState(301);
				type();
				setState(302);
				match(T__20);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(304);
				match(T__17);
				setState(305);
				type();
				setState(306);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			statement();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(311);
				match(T__0);
				setState(312);
				statement();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				return_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				match(T__35);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(324);
				declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(325);
				print();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__36);
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(329);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_print);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__37);
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(333);
				expression();
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(334);
						match(T__3);
						setState(335);
						expression();
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Assign_right_partContext assign_right_part() {
			return getRuleContext(Assign_right_partContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			identifier();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19 || _la==T__21) {
				{
				setState(344);
				tail();
				}
			}

			setState(347);
			match(T__38);
			setState(348);
			assign_right_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_right_partContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Assign_right_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_right_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterAssign_right_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitAssign_right_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitAssign_right_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_right_partContext assign_right_part() throws RecognitionException {
		Assign_right_partContext _localctx = new Assign_right_partContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assign_right_part);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				function_call();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			identifier();
			setState(355);
			match(T__17);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__26) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << INTEGER) | (1L << COMPLEX) | (1L << REAL) | (1L << IdentifierName))) != 0)) {
				{
				setState(356);
				expression();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(357);
					match(T__3);
					setState(358);
					expression();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(366);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Then_statementContext then_statement() {
			return getRuleContext(Then_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__39);
			setState(369);
			expression();
			setState(370);
			then_statement();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(371);
				else_statement();
				}
			}

			setState(374);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Then_statementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Then_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterThen_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitThen_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitThen_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Then_statementContext then_statement() throws RecognitionException {
		Then_statementContext _localctx = new Then_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_then_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(T__40);
			setState(377);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_statementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__41);
			setState(380);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_loop);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				for_loop();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				while_loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__42);
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(387);
				identifier();
				setState(388);
				match(T__43);
				}
				break;
			}
			setState(392);
			expression();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(393);
				match(T__44);
				setState(394);
				expression();
				}
			}

			setState(397);
			loop_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Loop_bodyContext loop_body() {
			return getRuleContext(Loop_bodyContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__45);
			setState(400);
			expression();
			setState(401);
			loop_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_bodyContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Loop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterLoop_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitLoop_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitLoop_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_bodyContext loop_body() throws RecognitionException {
		Loop_bodyContext _localctx = new Loop_bodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_loop_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T__46);
			setState(404);
			statements();
			setState(405);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(FParser.INTEGER, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_integer_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Real_literalContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(FParser.REAL, 0); }
		public Real_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterReal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitReal_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitReal_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_literalContext real_literal() throws RecognitionException {
		Real_literalContext _localctx = new Real_literalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_real_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_string_literal);
		try {
			int _alt;
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(T__49);
				setState(415); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(414);
						matchWildcard();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(417); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(419);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(T__50);
				setState(422); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(421);
						matchWildcard();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(424); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(426);
				match(T__50);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_literalContext extends ParserRuleContext {
		public TerminalNode COMPLEX() { return getToken(FParser.COMPLEX, 0); }
		public Complex_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterComplex_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitComplex_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitComplex_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_literalContext complex_literal() throws RecognitionException {
		Complex_literalContext _localctx = new Complex_literalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_complex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(COMPLEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rational_literalContext extends ParserRuleContext {
		public Token numerator;
		public Token denominator;
		public List<TerminalNode> INTEGER() { return getTokens(FParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(FParser.INTEGER, i);
		}
		public Rational_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rational_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterRational_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitRational_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitRational_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rational_literalContext rational_literal() throws RecognitionException {
		Rational_literalContext _localctx = new Rational_literalContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_rational_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			((Rational_literalContext)_localctx).numerator = match(INTEGER);
			setState(432);
			match(T__51);
			setState(433);
			((Rational_literalContext)_localctx).denominator = match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IdentifierName() { return getToken(FParser.IdentifierName, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FListener ) ((FListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FVisitor ) return ((FVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(IdentifierName);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\5\2b\n\2\3\2\3\2\3\3\3\3\3\3\7\3"+
		"i\n\3\f\3\16\3l\13\3\3\4\3\4\3\4\5\4q\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5"+
		"y\n\5\f\5\16\5|\13\5\3\6\3\6\3\6\5\6\u0081\n\6\3\7\3\7\3\7\5\7\u0086\n"+
		"\7\3\b\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\t\3\t\3\t\7\t\u0093"+
		"\n\t\f\t\16\t\u0096\13\t\3\n\5\n\u0099\n\n\3\n\3\n\3\13\3\13\5\13\u009f"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00aa\n\f\3\r\3\r\5\r\u00ae"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u00b4\n\r\5\r\u00b6\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00bf\n\16\3\17\3\17\3\17\5\17\u00c4\n\17\3\17\3\17"+
		"\3\17\5\17\u00c9\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u00d0\n\20\f\20\16"+
		"\20\u00d3\13\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00e1\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00eb"+
		"\n\26\f\26\16\26\u00ee\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u00f5\n\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00fd\n\30\f\30\16\30\u0100\13\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u010c\n\32\f\32"+
		"\16\32\u010f\13\32\5\32\u0111\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0120\n\33\f\33\16\33\u0123\13\33"+
		"\5\33\u0125\n\33\3\33\3\33\3\33\5\33\u012a\n\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0137\n\33\3\34\3\34\3\34\7\34"+
		"\u013c\n\34\f\34\16\34\u013f\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0149\n\35\3\36\3\36\5\36\u014d\n\36\3\37\3\37\3\37\3\37\7"+
		"\37\u0153\n\37\f\37\16\37\u0156\13\37\5\37\u0158\n\37\3 \3 \5 \u015c\n"+
		" \3 \3 \3 \3!\3!\5!\u0163\n!\3\"\3\"\3\"\3\"\3\"\7\"\u016a\n\"\f\"\16"+
		"\"\u016d\13\"\5\"\u016f\n\"\3\"\3\"\3#\3#\3#\3#\5#\u0177\n#\3#\3#\3$\3"+
		"$\3$\3%\3%\3%\3&\3&\5&\u0183\n&\3\'\3\'\3\'\3\'\5\'\u0189\n\'\3\'\3\'"+
		"\3\'\5\'\u018e\n\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\6-\u01a2\n-\r-\16-\u01a3\3-\3-\3-\6-\u01a9\n-\r-\16-\u01aa\3-\5-"+
		"\u01ae\n-\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\4\u01a3\u01aa\2\61\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^\2\7\3\2\7\t\3\2\n\17\3\2\20\21\3\2\22\23\3\2\62\63\2\u01cb\2a\3\2"+
		"\2\2\4e\3\2\2\2\6m\3\2\2\2\bu\3\2\2\2\n}\3\2\2\2\f\u0082\3\2\2\2\16\u0087"+
		"\3\2\2\2\20\u008f\3\2\2\2\22\u0098\3\2\2\2\24\u009c\3\2\2\2\26\u00a9\3"+
		"\2\2\2\30\u00b5\3\2\2\2\32\u00be\3\2\2\2\34\u00c0\3\2\2\2\36\u00cc\3\2"+
		"\2\2 \u00d4\3\2\2\2\"\u00d6\3\2\2\2$\u00e0\3\2\2\2&\u00e2\3\2\2\2(\u00e4"+
		"\3\2\2\2*\u00e6\3\2\2\2,\u00f4\3\2\2\2.\u00f8\3\2\2\2\60\u0103\3\2\2\2"+
		"\62\u0107\3\2\2\2\64\u0136\3\2\2\2\66\u0138\3\2\2\28\u0148\3\2\2\2:\u014a"+
		"\3\2\2\2<\u014e\3\2\2\2>\u0159\3\2\2\2@\u0162\3\2\2\2B\u0164\3\2\2\2D"+
		"\u0172\3\2\2\2F\u017a\3\2\2\2H\u017d\3\2\2\2J\u0182\3\2\2\2L\u0184\3\2"+
		"\2\2N\u0191\3\2\2\2P\u0195\3\2\2\2R\u0199\3\2\2\2T\u019b\3\2\2\2V\u019d"+
		"\3\2\2\2X\u01ad\3\2\2\2Z\u01af\3\2\2\2\\\u01b1\3\2\2\2^\u01b5\3\2\2\2"+
		"`b\5\4\3\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\2\2\3d\3\3\2\2\2ej\5\6\4"+
		"\2fg\7\3\2\2gi\5\6\4\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\5\3\2"+
		"\2\2lj\3\2\2\2mp\5^\60\2no\7\4\2\2oq\5\64\33\2pn\3\2\2\2pq\3\2\2\2qr\3"+
		"\2\2\2rs\7\5\2\2st\5\n\6\2t\7\3\2\2\2uz\5\n\6\2vw\7\6\2\2wy\5\n\6\2xv"+
		"\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\t\3\2\2\2|z\3\2\2\2}\u0080\5\f"+
		"\7\2~\177\t\2\2\2\177\u0081\5\f\7\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\13\3\2\2\2\u0082\u0085\5\16\b\2\u0083\u0084\t\3\2\2\u0084\u0086"+
		"\5\16\b\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\r\3\2\2\2\u0087"+
		"\u008c\5\20\t\2\u0088\u0089\t\4\2\2\u0089\u008b\5\20\t\2\u008a\u0088\3"+
		"\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\17\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0094\5\22\n\2\u0090\u0091\t\5\2"+
		"\2\u0091\u0093\5\22\n\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\21\3\2\2\2\u0096\u0094\3\2\2"+
		"\2\u0097\u0099\t\4\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\5\24\13\2\u009b\23\3\2\2\2\u009c\u009e\5\26\f\2\u009d"+
		"\u009f\5\30\r\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\25\3\2\2"+
		"\2\u00a0\u00aa\5\32\16\2\u00a1\u00aa\5\34\17\2\u00a2\u00aa\5*\26\2\u00a3"+
		"\u00aa\5.\30\2\u00a4\u00aa\5\62\32\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7"+
		"\5\n\6\2\u00a7\u00a8\7\25\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a0\3\2\2\2"+
		"\u00a9\u00a1\3\2\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a4"+
		"\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\27\3\2\2\2\u00ab\u00ad\7\26\2\2\u00ac"+
		"\u00ae\5\n\6\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b6\7\27\2\2\u00b0\u00b1\7\30\2\2\u00b1\u00b3\5^\60\2\u00b2"+
		"\u00b4\5\30\r\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3"+
		"\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\31\3\2\2\2\u00b7"+
		"\u00bf\5R*\2\u00b8\u00bf\5Z.\2\u00b9\u00bf\5V,\2\u00ba\u00bf\5\\/\2\u00bb"+
		"\u00bf\5T+\2\u00bc\u00bf\5X-\2\u00bd\u00bf\5^\60\2\u00be\u00b7\3\2\2\2"+
		"\u00be\u00b8\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bb"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\33\3\2\2\2\u00c0"+
		"\u00c1\5 \21\2\u00c1\u00c3\7\24\2\2\u00c2\u00c4\5\36\20\2\u00c3\u00c2"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\7\25\2\2"+
		"\u00c6\u00c7\7\4\2\2\u00c7\u00c9\5\64\33\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\5$\23\2\u00cb\35\3\2\2\2\u00cc"+
		"\u00d1\5\"\22\2\u00cd\u00ce\7\6\2\2\u00ce\u00d0\5\"\22\2\u00cf\u00cd\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\37\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\31\2\2\u00d5!\3\2\2\2\u00d6"+
		"\u00d7\5^\60\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\5\64\33\2\u00d9#\3\2\2"+
		"\2\u00da\u00db\5&\24\2\u00db\u00dc\5\66\34\2\u00dc\u00dd\5(\25\2\u00dd"+
		"\u00e1\3\2\2\2\u00de\u00df\7\32\2\2\u00df\u00e1\58\35\2\u00e0\u00da\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e1%\3\2\2\2\u00e2\u00e3\7\33\2\2\u00e3\'"+
		"\3\2\2\2\u00e4\u00e5\7\34\2\2\u00e5)\3\2\2\2\u00e6\u00e7\7\24\2\2\u00e7"+
		"\u00ec\5,\27\2\u00e8\u00e9\7\6\2\2\u00e9\u00eb\5,\27\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\25\2\2\u00f0+\3\2\2\2"+
		"\u00f1\u00f2\5^\60\2\u00f2\u00f3\7\5\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f1"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5\32\16\2"+
		"\u00f7-\3\2\2\2\u00f8\u00f9\7\35\2\2\u00f9\u00fe\5\60\31\2\u00fa\u00fb"+
		"\7\6\2\2\u00fb\u00fd\5\60\31\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0101\u0102\7\36\2\2\u0102/\3\2\2\2\u0103\u0104\5\32\16\2\u0104"+
		"\u0105\7\4\2\2\u0105\u0106\5\32\16\2\u0106\61\3\2\2\2\u0107\u0110\7\26"+
		"\2\2\u0108\u010d\5\n\6\2\u0109\u010a\7\6\2\2\u010a\u010c\5\n\6\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0108\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\27\2\2\u0113\63\3\2\2"+
		"\2\u0114\u0137\7\37\2\2\u0115\u0137\7 \2\2\u0116\u0137\7!\2\2\u0117\u0137"+
		"\7\"\2\2\u0118\u0137\7#\2\2\u0119\u0137\7$\2\2\u011a\u011b\7\31\2\2\u011b"+
		"\u0124\7\24\2\2\u011c\u0121\5\64\33\2\u011d\u011e\7\6\2\2\u011e\u0120"+
		"\5\64\33\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2"+
		"\u0121\u0122\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u011c"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129\7\25\2\2"+
		"\u0127\u0128\7\4\2\2\u0128\u012a\5\64\33\2\u0129\u0127\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u0137\3\2\2\2\u012b\u0137\7%\2\2\u012c\u012d\7\26\2\2\u012d"+
		"\u012e\5\64\33\2\u012e\u012f\7\4\2\2\u012f\u0130\5\64\33\2\u0130\u0131"+
		"\7\27\2\2\u0131\u0137\3\2\2\2\u0132\u0133\7\24\2\2\u0133\u0134\5\64\33"+
		"\2\u0134\u0135\7\25\2\2\u0135\u0137\3\2\2\2\u0136\u0114\3\2\2\2\u0136"+
		"\u0115\3\2\2\2\u0136\u0116\3\2\2\2\u0136\u0117\3\2\2\2\u0136\u0118\3\2"+
		"\2\2\u0136\u0119\3\2\2\2\u0136\u011a\3\2\2\2\u0136\u012b\3\2\2\2\u0136"+
		"\u012c\3\2\2\2\u0136\u0132\3\2\2\2\u0137\65\3\2\2\2\u0138\u013d\58\35"+
		"\2\u0139\u013a\7\3\2\2\u013a\u013c\58\35\2\u013b\u0139\3\2\2\2\u013c\u013f"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\67\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0149\5B\"\2\u0141\u0149\5> \2\u0142\u0149\5D#\2"+
		"\u0143\u0149\5J&\2\u0144\u0149\5:\36\2\u0145\u0149\7&\2\2\u0146\u0149"+
		"\5\6\4\2\u0147\u0149\5<\37\2\u0148\u0140\3\2\2\2\u0148\u0141\3\2\2\2\u0148"+
		"\u0142\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u01499\3\2\2\2\u014a\u014c"+
		"\7\'\2\2\u014b\u014d\5\n\6\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		";\3\2\2\2\u014e\u0157\7(\2\2\u014f\u0154\5\n\6\2\u0150\u0151\7\6\2\2\u0151"+
		"\u0153\5\n\6\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u014f\3\2\2\2\u0157\u0158\3\2\2\2\u0158=\3\2\2\2\u0159\u015b\5^\60\2"+
		"\u015a\u015c\5\30\r\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015e\7)\2\2\u015e\u015f\5@!\2\u015f?\3\2\2\2\u0160\u0163"+
		"\5\n\6\2\u0161\u0163\5B\"\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"A\3\2\2\2\u0164\u0165\5^\60\2\u0165\u016e\7\24\2\2\u0166\u016b\5\n\6\2"+
		"\u0167\u0168\7\6\2\2\u0168\u016a\5\n\6\2\u0169\u0167\3\2\2\2\u016a\u016d"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016f\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0166\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0171\7\25\2\2\u0171C\3\2\2\2\u0172\u0173\7*\2\2\u0173\u0174"+
		"\5\n\6\2\u0174\u0176\5F$\2\u0175\u0177\5H%\2\u0176\u0175\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7\34\2\2\u0179E\3\2\2\2"+
		"\u017a\u017b\7+\2\2\u017b\u017c\5\66\34\2\u017cG\3\2\2\2\u017d\u017e\7"+
		",\2\2\u017e\u017f\5\66\34\2\u017fI\3\2\2\2\u0180\u0183\5L\'\2\u0181\u0183"+
		"\5N(\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183K\3\2\2\2\u0184\u0188"+
		"\7-\2\2\u0185\u0186\5^\60\2\u0186\u0187\7.\2\2\u0187\u0189\3\2\2\2\u0188"+
		"\u0185\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\5\n"+
		"\6\2\u018b\u018c\7/\2\2\u018c\u018e\5\n\6\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\5P)\2\u0190M\3\2\2\2\u0191"+
		"\u0192\7\60\2\2\u0192\u0193\5\n\6\2\u0193\u0194\5P)\2\u0194O\3\2\2\2\u0195"+
		"\u0196\7\61\2\2\u0196\u0197\5\66\34\2\u0197\u0198\7\34\2\2\u0198Q\3\2"+
		"\2\2\u0199\u019a\t\6\2\2\u019aS\3\2\2\2\u019b\u019c\7\67\2\2\u019cU\3"+
		"\2\2\2\u019d\u019e\79\2\2\u019eW\3\2\2\2\u019f\u01a1\7\64\2\2\u01a0\u01a2"+
		"\13\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2"+
		"\u01a3\u01a1\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01ae\7\64\2\2\u01a6\u01a8"+
		"\7\65\2\2\u01a7\u01a9\13\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2"+
		"\u01aa\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae"+
		"\7\65\2\2\u01ad\u019f\3\2\2\2\u01ad\u01a6\3\2\2\2\u01aeY\3\2\2\2\u01af"+
		"\u01b0\78\2\2\u01b0[\3\2\2\2\u01b1\u01b2\7\67\2\2\u01b2\u01b3\7\66\2\2"+
		"\u01b3\u01b4\7\67\2\2\u01b4]\3\2\2\2\u01b5\u01b6\7:\2\2\u01b6_\3\2\2\2"+
		".ajpz\u0080\u0085\u008c\u0094\u0098\u009e\u00a9\u00ad\u00b3\u00b5\u00be"+
		"\u00c3\u00c8\u00d1\u00e0\u00ec\u00f4\u00fe\u010d\u0110\u0121\u0124\u0129"+
		"\u0136\u013d\u0148\u014c\u0154\u0157\u015b\u0162\u016b\u016e\u0176\u0182"+
		"\u0188\u018d\u01a3\u01aa\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}