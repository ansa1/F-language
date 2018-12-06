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
		RULE_elementary = 12, RULE_function = 13, RULE_func_begin = 14, RULE_fun_declaration = 15, 
		RULE_body = 16, RULE_body_start = 17, RULE_body_end = 18, RULE_tuple = 19, 
		RULE_tuple_element = 20, RULE_map = 21, RULE_map_element = 22, RULE_list = 23, 
		RULE_type = 24, RULE_statements = 25, RULE_statement = 26, RULE_return_statement = 27, 
		RULE_print = 28, RULE_assignment = 29, RULE_assign_right_part = 30, RULE_function_call = 31, 
		RULE_conditional = 32, RULE_then_statement = 33, RULE_else_statement = 34, 
		RULE_loop = 35, RULE_for_loop = 36, RULE_while_loop = 37, RULE_loop_body = 38, 
		RULE_bool_literal = 39, RULE_integer_literal = 40, RULE_real_literal = 41, 
		RULE_string_literal = 42, RULE_complex_literal = 43, RULE_rational_literal = 44, 
		RULE_identifier = 45;
	public static final String[] ruleNames = {
		"translationunit", "program", "declaration", "expressions", "expression", 
		"relation", "factor", "term", "unary", "secondary", "primary", "tail", 
		"elementary", "function", "func_begin", "fun_declaration", "body", "body_start", 
		"body_end", "tuple", "tuple_element", "map", "map_element", "list", "type", 
		"statements", "statement", "return_statement", "print", "assignment", 
		"assign_right_part", "function_call", "conditional", "then_statement", 
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
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IdentifierName) {
				{
				setState(92);
				program();
				}
			}

			setState(95);
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
			setState(97);
			declaration();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(98);
				match(T__0);
				setState(99);
				declaration();
				}
				}
				setState(104);
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
			setState(105);
			identifier();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(106);
				match(T__1);
				setState(107);
				type();
				}
			}

			setState(110);
			match(T__2);
			setState(111);
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
			setState(113);
			expression();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(114);
				match(T__3);
				setState(115);
				expression();
				}
				}
				setState(120);
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
			setState(121);
			relation();
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(122);
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
				setState(123);
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
			setState(126);
			((RelationContext)_localctx).left = factor();
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(127);
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
				setState(128);
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
			setState(131);
			((FactorContext)_localctx).left = term();
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
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
					setState(133);
					((FactorContext)_localctx).right = term();
					}
					} 
				}
				setState(138);
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
			setState(139);
			((TermContext)_localctx).left = unary();
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
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
					setState(141);
					((TermContext)_localctx).right = unary();
					}
					} 
				}
				setState(146);
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
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__14) {
				{
				setState(147);
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

			setState(150);
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
			setState(152);
			primary();
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(153);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				elementary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				tuple();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				map();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(T__17);
				setState(162);
				expression();
				setState(163);
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
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__19);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__26) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << INTEGER) | (1L << COMPLEX) | (1L << REAL) | (1L << IdentifierName))) != 0)) {
					{
					setState(168);
					expression();
					}
				}

				setState(171);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__21);
				setState(173);
				identifier();
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(174);
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				bool_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				complex_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				real_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				rational_literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				integer_literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				string_literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
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
		public List<Fun_declarationContext> fun_declaration() {
			return getRuleContexts(Fun_declarationContext.class);
		}
		public Fun_declarationContext fun_declaration(int i) {
			return getRuleContext(Fun_declarationContext.class,i);
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
			setState(188);
			func_begin();
			setState(189);
			match(T__17);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IdentifierName) {
				{
				{
				setState(190);
				fun_declaration();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(T__18);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(197);
				match(T__1);
				setState(198);
				type();
				}
			}

			setState(201);
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
		enterRule(_localctx, 28, RULE_func_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 30, RULE_fun_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			identifier();
			setState(206);
			match(T__1);
			setState(207);
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
		enterRule(_localctx, 32, RULE_body);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(209);
				body_start();
				setState(210);
				statements();
				setState(211);
				body_end();
				}
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(213);
				match(T__23);
				setState(214);
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
		enterRule(_localctx, 34, RULE_body_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		enterRule(_localctx, 36, RULE_body_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
		enterRule(_localctx, 38, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__17);
			setState(222);
			tuple_element();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(223);
				match(T__3);
				setState(224);
				tuple_element();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
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
		enterRule(_localctx, 40, RULE_tuple_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(232);
				identifier();
				setState(233);
				match(T__2);
				}
				break;
			}
			setState(237);
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
		enterRule(_localctx, 42, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__26);
			setState(240);
			map_element();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(241);
				match(T__3);
				setState(242);
				map_element();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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
		enterRule(_localctx, 44, RULE_map_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			elementary();
			setState(251);
			match(T__1);
			setState(252);
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
		enterRule(_localctx, 46, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__19);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__26) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << INTEGER) | (1L << COMPLEX) | (1L << REAL) | (1L << IdentifierName))) != 0)) {
				{
				setState(255);
				expression();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(256);
					match(T__3);
					setState(257);
					expression();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(265);
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
		enterRule(_localctx, 48, RULE_type);
		int _la;
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				match(T__33);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 7);
				{
				setState(273);
				match(T__22);
				setState(274);
				match(T__17);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
					{
					setState(275);
					type();
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(276);
						match(T__3);
						setState(277);
						type();
						}
						}
						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(285);
				match(T__18);
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(286);
					match(T__1);
					setState(287);
					type();
					}
					break;
				}
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				match(T__34);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 9);
				{
				setState(291);
				match(T__19);
				setState(292);
				type();
				setState(293);
				match(T__1);
				setState(294);
				type();
				setState(295);
				match(T__20);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 10);
				{
				setState(297);
				match(T__17);
				setState(298);
				type();
				setState(299);
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
		enterRule(_localctx, 50, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			statement();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(304);
				match(T__0);
				setState(305);
				statement();
				}
				}
				setState(310);
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
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				return_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				match(T__35);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(317);
				declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(318);
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
		enterRule(_localctx, 54, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__36);
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(322);
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
		enterRule(_localctx, 56, RULE_print);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__37);
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(326);
				expression();
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(327);
						match(T__3);
						setState(328);
						expression();
						}
						} 
					}
					setState(333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 58, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			identifier();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19 || _la==T__21) {
				{
				setState(337);
				tail();
				}
			}

			setState(340);
			match(T__38);
			setState(341);
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
		enterRule(_localctx, 60, RULE_assign_right_part);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
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
		enterRule(_localctx, 62, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			identifier();
			setState(348);
			match(T__17);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__22) | (1L << T__26) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << INTEGER) | (1L << COMPLEX) | (1L << REAL) | (1L << IdentifierName))) != 0)) {
				{
				setState(349);
				expression();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(350);
					match(T__3);
					setState(351);
					expression();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(359);
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
		enterRule(_localctx, 64, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__39);
			setState(362);
			expression();
			setState(363);
			then_statement();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(364);
				else_statement();
				}
			}

			setState(367);
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
		enterRule(_localctx, 66, RULE_then_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__40);
			setState(370);
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
		enterRule(_localctx, 68, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__41);
			setState(373);
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
		enterRule(_localctx, 70, RULE_loop);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				for_loop();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
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
		enterRule(_localctx, 72, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__42);
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(380);
				identifier();
				setState(381);
				match(T__43);
				}
				break;
			}
			setState(385);
			expression();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(386);
				match(T__44);
				setState(387);
				expression();
				}
			}

			setState(390);
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
		enterRule(_localctx, 74, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__45);
			setState(393);
			expression();
			setState(394);
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
		enterRule(_localctx, 76, RULE_loop_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__46);
			setState(397);
			statements();
			setState(398);
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
		enterRule(_localctx, 78, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		enterRule(_localctx, 80, RULE_integer_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
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
		enterRule(_localctx, 82, RULE_real_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
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
		enterRule(_localctx, 84, RULE_string_literal);
		try {
			int _alt;
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(T__49);
				setState(408); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(407);
						matchWildcard();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(410); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(412);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(T__50);
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
		enterRule(_localctx, 86, RULE_complex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		enterRule(_localctx, 88, RULE_rational_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			((Rational_literalContext)_localctx).numerator = match(INTEGER);
			setState(425);
			match(T__51);
			setState(426);
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
		enterRule(_localctx, 90, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\5\2`\n\2\3\2\3\2\3\3\3\3\3\3\7\3g\n\3\f\3\16"+
		"\3j\13\3\3\4\3\4\3\4\5\4o\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5w\n\5\f\5\16"+
		"\5z\13\5\3\6\3\6\3\6\5\6\177\n\6\3\7\3\7\3\7\5\7\u0084\n\7\3\b\3\b\3\b"+
		"\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\t\3\t\3\t\7\t\u0091\n\t\f\t\16\t"+
		"\u0094\13\t\3\n\5\n\u0097\n\n\3\n\3\n\3\13\3\13\5\13\u009d\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r\5\r\u00ac\n\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00b2\n\r\5\r\u00b4\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00bd\n\16\3\17\3\17\3\17\7\17\u00c2\n\17\f\17\16\17\u00c5"+
		"\13\17\3\17\3\17\3\17\5\17\u00ca\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00da\n\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\7\25\u00e4\n\25\f\25\16\25\u00e7\13\25\3\25"+
		"\3\25\3\26\3\26\3\26\5\26\u00ee\n\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
		"\u00f6\n\27\f\27\16\27\u00f9\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\7\31\u0105\n\31\f\31\16\31\u0108\13\31\5\31\u010a\n\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u0119\n\32\f\32\16\32\u011c\13\32\5\32\u011e\n\32\3\32\3\32\3\32\5\32"+
		"\u0123\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0130\n\32\3\33\3\33\3\33\7\33\u0135\n\33\f\33\16\33\u0138\13\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0142\n\34\3\35\3\35\5\35\u0146"+
		"\n\35\3\36\3\36\3\36\3\36\7\36\u014c\n\36\f\36\16\36\u014f\13\36\5\36"+
		"\u0151\n\36\3\37\3\37\5\37\u0155\n\37\3\37\3\37\3\37\3 \3 \5 \u015c\n"+
		" \3!\3!\3!\3!\3!\7!\u0163\n!\f!\16!\u0166\13!\5!\u0168\n!\3!\3!\3\"\3"+
		"\"\3\"\3\"\5\"\u0170\n\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\5%\u017c\n%\3"+
		"&\3&\3&\3&\5&\u0182\n&\3&\3&\3&\5&\u0187\n&\3&\3&\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\6,\u019b\n,\r,\16,\u019c\3,\3,\3,\6,\u01a2"+
		"\n,\r,\16,\u01a3\3,\5,\u01a7\n,\3-\3-\3.\3.\3.\3.\3/\3/\3/\4\u019c\u01a3"+
		"\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\\2\7\3\2\7\t\3\2\n\17\3\2\20\21\3\2\22\23\3\2\62\63\2"+
		"\u01c4\2_\3\2\2\2\4c\3\2\2\2\6k\3\2\2\2\bs\3\2\2\2\n{\3\2\2\2\f\u0080"+
		"\3\2\2\2\16\u0085\3\2\2\2\20\u008d\3\2\2\2\22\u0096\3\2\2\2\24\u009a\3"+
		"\2\2\2\26\u00a7\3\2\2\2\30\u00b3\3\2\2\2\32\u00bc\3\2\2\2\34\u00be\3\2"+
		"\2\2\36\u00cd\3\2\2\2 \u00cf\3\2\2\2\"\u00d9\3\2\2\2$\u00db\3\2\2\2&\u00dd"+
		"\3\2\2\2(\u00df\3\2\2\2*\u00ed\3\2\2\2,\u00f1\3\2\2\2.\u00fc\3\2\2\2\60"+
		"\u0100\3\2\2\2\62\u012f\3\2\2\2\64\u0131\3\2\2\2\66\u0141\3\2\2\28\u0143"+
		"\3\2\2\2:\u0147\3\2\2\2<\u0152\3\2\2\2>\u015b\3\2\2\2@\u015d\3\2\2\2B"+
		"\u016b\3\2\2\2D\u0173\3\2\2\2F\u0176\3\2\2\2H\u017b\3\2\2\2J\u017d\3\2"+
		"\2\2L\u018a\3\2\2\2N\u018e\3\2\2\2P\u0192\3\2\2\2R\u0194\3\2\2\2T\u0196"+
		"\3\2\2\2V\u01a6\3\2\2\2X\u01a8\3\2\2\2Z\u01aa\3\2\2\2\\\u01ae\3\2\2\2"+
		"^`\5\4\3\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\2\2\3b\3\3\2\2\2ch\5\6\4"+
		"\2de\7\3\2\2eg\5\6\4\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\5\3\2"+
		"\2\2jh\3\2\2\2kn\5\\/\2lm\7\4\2\2mo\5\62\32\2nl\3\2\2\2no\3\2\2\2op\3"+
		"\2\2\2pq\7\5\2\2qr\5\n\6\2r\7\3\2\2\2sx\5\n\6\2tu\7\6\2\2uw\5\n\6\2vt"+
		"\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\t\3\2\2\2zx\3\2\2\2{~\5\f\7\2"+
		"|}\t\2\2\2}\177\5\f\7\2~|\3\2\2\2~\177\3\2\2\2\177\13\3\2\2\2\u0080\u0083"+
		"\5\16\b\2\u0081\u0082\t\3\2\2\u0082\u0084\5\16\b\2\u0083\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\r\3\2\2\2\u0085\u008a\5\20\t\2\u0086\u0087"+
		"\t\4\2\2\u0087\u0089\5\20\t\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\17\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\u0092\5\22\n\2\u008e\u008f\t\5\2\2\u008f\u0091\5\22\n\2"+
		"\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\21\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\t\4\2\2\u0096"+
		"\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\5\24"+
		"\13\2\u0099\23\3\2\2\2\u009a\u009c\5\26\f\2\u009b\u009d\5\30\r\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\25\3\2\2\2\u009e\u00a8\5\32\16"+
		"\2\u009f\u00a8\5\34\17\2\u00a0\u00a8\5(\25\2\u00a1\u00a8\5,\27\2\u00a2"+
		"\u00a8\5\60\31\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6"+
		"\7\25\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u009f\3\2\2\2"+
		"\u00a7\u00a0\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3"+
		"\3\2\2\2\u00a8\27\3\2\2\2\u00a9\u00ab\7\26\2\2\u00aa\u00ac\5\n\6\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4\7\27"+
		"\2\2\u00ae\u00af\7\30\2\2\u00af\u00b1\5\\/\2\u00b0\u00b2\5\30\r\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a9\3\2"+
		"\2\2\u00b3\u00ae\3\2\2\2\u00b4\31\3\2\2\2\u00b5\u00bd\5P)\2\u00b6\u00bd"+
		"\5X-\2\u00b7\u00bd\5T+\2\u00b8\u00bd\5Z.\2\u00b9\u00bd\5R*\2\u00ba\u00bd"+
		"\5V,\2\u00bb\u00bd\5\\/\2\u00bc\u00b5\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc"+
		"\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd\33\3\2\2\2\u00be\u00bf\5\36\20\2\u00bf"+
		"\u00c3\7\24\2\2\u00c0\u00c2\5 \21\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c9\7\25\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00ca\5"+
		"\62\32\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\5\"\22\2\u00cc\35\3\2\2\2\u00cd\u00ce\7\31\2\2\u00ce\37\3\2\2\2"+
		"\u00cf\u00d0\5\\/\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\5\62\32\2\u00d2!\3"+
		"\2\2\2\u00d3\u00d4\5$\23\2\u00d4\u00d5\5\64\33\2\u00d5\u00d6\5&\24\2\u00d6"+
		"\u00da\3\2\2\2\u00d7\u00d8\7\32\2\2\u00d8\u00da\5\66\34\2\u00d9\u00d3"+
		"\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da#\3\2\2\2\u00db\u00dc\7\33\2\2\u00dc"+
		"%\3\2\2\2\u00dd\u00de\7\34\2\2\u00de\'\3\2\2\2\u00df\u00e0\7\24\2\2\u00e0"+
		"\u00e5\5*\26\2\u00e1\u00e2\7\6\2\2\u00e2\u00e4\5*\26\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\25\2\2\u00e9)\3\2\2\2"+
		"\u00ea\u00eb\5\\/\2\u00eb\u00ec\7\5\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00ea"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\5\32\16\2"+
		"\u00f0+\3\2\2\2\u00f1\u00f2\7\35\2\2\u00f2\u00f7\5.\30\2\u00f3\u00f4\7"+
		"\6\2\2\u00f4\u00f6\5.\30\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fb\7\36\2\2\u00fb-\3\2\2\2\u00fc\u00fd\5\32\16\2\u00fd\u00fe"+
		"\7\4\2\2\u00fe\u00ff\5\32\16\2\u00ff/\3\2\2\2\u0100\u0109\7\26\2\2\u0101"+
		"\u0106\5\n\6\2\u0102\u0103\7\6\2\2\u0103\u0105\5\n\6\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0101\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7\27\2\2\u010c\61\3\2\2\2\u010d\u0130"+
		"\7\37\2\2\u010e\u0130\7 \2\2\u010f\u0130\7!\2\2\u0110\u0130\7\"\2\2\u0111"+
		"\u0130\7#\2\2\u0112\u0130\7$\2\2\u0113\u0114\7\31\2\2\u0114\u011d\7\24"+
		"\2\2\u0115\u011a\5\62\32\2\u0116\u0117\7\6\2\2\u0117\u0119\5\62\32\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0115\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122\7\25\2\2\u0120\u0121\7"+
		"\4\2\2\u0121\u0123\5\62\32\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0130\3\2\2\2\u0124\u0130\7%\2\2\u0125\u0126\7\26\2\2\u0126\u0127\5\62"+
		"\32\2\u0127\u0128\7\4\2\2\u0128\u0129\5\62\32\2\u0129\u012a\7\27\2\2\u012a"+
		"\u0130\3\2\2\2\u012b\u012c\7\24\2\2\u012c\u012d\5\62\32\2\u012d\u012e"+
		"\7\25\2\2\u012e\u0130\3\2\2\2\u012f\u010d\3\2\2\2\u012f\u010e\3\2\2\2"+
		"\u012f\u010f\3\2\2\2\u012f\u0110\3\2\2\2\u012f\u0111\3\2\2\2\u012f\u0112"+
		"\3\2\2\2\u012f\u0113\3\2\2\2\u012f\u0124\3\2\2\2\u012f\u0125\3\2\2\2\u012f"+
		"\u012b\3\2\2\2\u0130\63\3\2\2\2\u0131\u0136\5\66\34\2\u0132\u0133\7\3"+
		"\2\2\u0133\u0135\5\66\34\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\65\3\2\2\2\u0138\u0136\3\2\2"+
		"\2\u0139\u0142\5@!\2\u013a\u0142\5<\37\2\u013b\u0142\5B\"\2\u013c\u0142"+
		"\5H%\2\u013d\u0142\58\35\2\u013e\u0142\7&\2\2\u013f\u0142\5\6\4\2\u0140"+
		"\u0142\5:\36\2\u0141\u0139\3\2\2\2\u0141\u013a\3\2\2\2\u0141\u013b\3\2"+
		"\2\2\u0141\u013c\3\2\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\67\3\2\2\2\u0143\u0145\7\'\2"+
		"\2\u0144\u0146\5\n\6\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u01469"+
		"\3\2\2\2\u0147\u0150\7(\2\2\u0148\u014d\5\n\6\2\u0149\u014a\7\6\2\2\u014a"+
		"\u014c\5\n\6\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0148\3\2\2\2\u0150\u0151\3\2\2\2\u0151;\3\2\2\2\u0152\u0154\5\\/\2\u0153"+
		"\u0155\5\30\r\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3"+
		"\2\2\2\u0156\u0157\7)\2\2\u0157\u0158\5> \2\u0158=\3\2\2\2\u0159\u015c"+
		"\5\n\6\2\u015a\u015c\5@!\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"?\3\2\2\2\u015d\u015e\5\\/\2\u015e\u0167\7\24\2\2\u015f\u0164\5\n\6\2"+
		"\u0160\u0161\7\6\2\2\u0161\u0163\5\n\6\2\u0162\u0160\3\2\2\2\u0163\u0166"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u015f\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\7\25\2\2\u016aA\3\2\2\2\u016b\u016c\7*\2\2\u016c\u016d"+
		"\5\n\6\2\u016d\u016f\5D#\2\u016e\u0170\5F$\2\u016f\u016e\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7\34\2\2\u0172C\3\2\2\2"+
		"\u0173\u0174\7+\2\2\u0174\u0175\5\64\33\2\u0175E\3\2\2\2\u0176\u0177\7"+
		",\2\2\u0177\u0178\5\64\33\2\u0178G\3\2\2\2\u0179\u017c\5J&\2\u017a\u017c"+
		"\5L\'\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017cI\3\2\2\2\u017d\u0181"+
		"\7-\2\2\u017e\u017f\5\\/\2\u017f\u0180\7.\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017e\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\5\n"+
		"\6\2\u0184\u0185\7/\2\2\u0185\u0187\5\n\6\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\5N(\2\u0189K\3\2\2\2\u018a"+
		"\u018b\7\60\2\2\u018b\u018c\5\n\6\2\u018c\u018d\5N(\2\u018dM\3\2\2\2\u018e"+
		"\u018f\7\61\2\2\u018f\u0190\5\64\33\2\u0190\u0191\7\34\2\2\u0191O\3\2"+
		"\2\2\u0192\u0193\t\6\2\2\u0193Q\3\2\2\2\u0194\u0195\7\67\2\2\u0195S\3"+
		"\2\2\2\u0196\u0197\79\2\2\u0197U\3\2\2\2\u0198\u019a\7\64\2\2\u0199\u019b"+
		"\13\2\2\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2"+
		"\u019c\u019a\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a7\7\64\2\2\u019f\u01a1"+
		"\7\65\2\2\u01a0\u01a2\13\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2"+
		"\u01a3\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7"+
		"\7\65\2\2\u01a6\u0198\3\2\2\2\u01a6\u019f\3\2\2\2\u01a7W\3\2\2\2\u01a8"+
		"\u01a9\78\2\2\u01a9Y\3\2\2\2\u01aa\u01ab\7\67\2\2\u01ab\u01ac\7\66\2\2"+
		"\u01ac\u01ad\7\67\2\2\u01ad[\3\2\2\2\u01ae\u01af\7:\2\2\u01af]\3\2\2\2"+
		"-_hnx~\u0083\u008a\u0092\u0096\u009c\u00a7\u00ab\u00b1\u00b3\u00bc\u00c3"+
		"\u00c9\u00d9\u00e5\u00ed\u00f7\u0106\u0109\u011a\u011d\u0122\u012f\u0136"+
		"\u0141\u0145\u014d\u0150\u0154\u015b\u0164\u0167\u016f\u017b\u0181\u0186"+
		"\u019c\u01a3\u01a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}