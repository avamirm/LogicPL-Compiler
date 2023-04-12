// Generated from D:/Term6/Complier/Cas/ca1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LogicPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL_VALUE=1, VAR_TYPE=2, FUNCTION=3, MAIN=4, INT=5, FLOAT=6, BOOL=7, 
		TRUE=8, FALSE=9, PRINT=10, FOR=11, RETURN=12, PRED_NAME=13, FLOAT_VALUE=14, 
		INT_VALUE=15, LINE_COMMENT=16, ID=17, WHITE_SPACE=18, LPAR=19, RPAR=20, 
		LBRACE=21, RBRACE=22, MINUS=23, PLUS=24, NOT=25, MULT=26, DIV=27, MODE=28, 
		LT_EQ=29, LT=30, GT_EQ=31, GT=32, EQUAL=33, NOT_EQUAL=34, AND=35, OR=36, 
		ASSIGN=37, SEMICOLON=38, COMMA=39, COLON=40, LBRACK=41, RBRACK=42, NEW_LINE=43;
	public static final int
		RULE_logicPL = 0, RULE_varDec = 1, RULE_predicate = 2, RULE_functionCall = 3, 
		RULE_argList = 4, RULE_func = 5, RULE_funcDec = 6, RULE_argDec = 7, RULE_arg = 8, 
		RULE_expression = 9, RULE_orExpression = 10, RULE_andExpression = 11, 
		RULE_isNotExpression = 12, RULE_ltgtExpression = 13, RULE_addSubExpression = 14, 
		RULE_mulDivExpression = 15, RULE_tildaNegOperator = 16, RULE_factor_ = 17, 
		RULE_listType = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicPL", "varDec", "predicate", "functionCall", "argList", "func", 
			"funcDec", "argDec", "arg", "expression", "orExpression", "andExpression", 
			"isNotExpression", "ltgtExpression", "addSubExpression", "mulDivExpression", 
			"tildaNegOperator", "factor_", "listType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'function'", "'main'", "'int'", "'float'", "'boolean'", 
			"'true'", "'false'", "'print'", "'for'", "'return'", null, null, null, 
			null, null, null, "'('", "')'", "'['", "']'", "'-'", "'+'", "'!'", "'*'", 
			"'/'", "'%'", "'<='", "'<'", "'>='", "'>'", "'=='", "'!='", "'&&'", "'||'", 
			"'='", "';'", "','", "':'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL_VALUE", "VAR_TYPE", "FUNCTION", "MAIN", "INT", "FLOAT", "BOOL", 
			"TRUE", "FALSE", "PRINT", "FOR", "RETURN", "PRED_NAME", "FLOAT_VALUE", 
			"INT_VALUE", "LINE_COMMENT", "ID", "WHITE_SPACE", "LPAR", "RPAR", "LBRACE", 
			"RBRACE", "MINUS", "PLUS", "NOT", "MULT", "DIV", "MODE", "LT_EQ", "LT", 
			"GT_EQ", "GT", "EQUAL", "NOT_EQUAL", "AND", "OR", "ASSIGN", "SEMICOLON", 
			"COMMA", "COLON", "LBRACK", "RBRACK", "NEW_LINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "LogicPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogicPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicPLContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LogicPLParser.EOF, 0); }
		public List<TerminalNode> RPAR() { return getTokens(LogicPLParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(LogicPLParser.RPAR, i);
		}
		public LogicPLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicPL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLogicPL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLogicPL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLogicPL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicPLContext logicPL() throws RecognitionException {
		LogicPLContext _localctx = new LogicPLContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_logicPL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPAR) {
				{
				{
				setState(38);
				match(RPAR);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDecContext extends ParserRuleContext {
		public TerminalNode VAR_TYPE() { return getToken(LogicPLParser.VAR_TYPE, 0); }
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public TerminalNode FLOAT_VALUE() { return getToken(LogicPLParser.FLOAT_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(LogicPLParser.INT_VALUE, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(LogicPLParser.BOOL_VALUE, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(VAR_TYPE);
			setState(47);
			match(ID);
			setState(48);
			match(ASSIGN);
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 49154L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode PRED_NAME() { return getToken(LogicPLParser.PRED_NAME, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PRED_NAME);
			setState(52);
			match(LPAR);
			setState(53);
			match(ID);
			setState(54);
			match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public List<ArgListContext> argList() {
			return getRuleContexts(ArgListContext.class);
		}
		public ArgListContext argList(int i) {
			return getRuleContext(ArgListContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
			setState(58); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(57);
					argList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argList);
		try {
			int _alt;
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(LPAR);
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(63);
						expression(0);
						setState(64);
						match(COMMA);
						}
						} 
					}
					setState(70);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(71);
				expression(0);
				setState(72);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(LPAR);
				setState(75);
				match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public FuncDecContext funcDec() {
			return getRuleContext(FuncDecContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(LogicPLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(LogicPLParser.COLON, i);
		}
		public TerminalNode VAR_TYPE() { return getToken(LogicPLParser.VAR_TYPE, 0); }
		public TerminalNode LBRACK() { return getToken(LogicPLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LogicPLParser.RBRACK, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			funcDec();
			setState(79);
			match(COLON);
			setState(80);
			match(VAR_TYPE);
			setState(81);
			match(LBRACK);
			setState(82);
			match(COLON);
			setState(83);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDecContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode FUNCTION() { return getToken(LogicPLParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public ArgDecContext argDec() {
			return getRuleContext(ArgDecContext.class,0);
		}
		public FuncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFuncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFuncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFuncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDecContext funcDec() throws RecognitionException {
		FuncDecContext _localctx = new FuncDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(FUNCTION);
			setState(86);
			((FuncDecContext)_localctx).ID = match(ID);
			 System.out.println("FunctionDec : " + ((FuncDecContext)_localctx).ID.getText()); 
			setState(88);
			argDec();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgDecContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public List<TerminalNode> VAR_TYPE() { return getTokens(LogicPLParser.VAR_TYPE); }
		public TerminalNode VAR_TYPE(int i) {
			return getToken(LogicPLParser.VAR_TYPE, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public ArgDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArgDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArgDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArgDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDecContext argDec() throws RecognitionException {
		ArgDecContext _localctx = new ArgDecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argDec);
		try {
			int _alt;
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(LPAR);
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(91);
						match(VAR_TYPE);
						setState(92);
						arg();
						setState(93);
						match(COMMA);
						}
						} 
					}
					setState(99);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				{
				setState(100);
				match(VAR_TYPE);
				setState(101);
				arg();
				}
				setState(103);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(LPAR);
				setState(106);
				match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((ArgContext)_localctx).ID = match(ID);
			 System.out.println("ArgumentDec : " + ((ArgContext)_localctx).ID.getText()); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(LogicPLParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			orExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(115);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(116);
					match(OR);
					setState(117);
					orExpression(0);
					 System.out.println("Operator : or"); 
					}
					} 
				}
				setState(124);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(LogicPLParser.AND, 0); }
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		return orExpression(0);
	}

	private OrExpressionContext orExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, _parentState);
		OrExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(128);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(129);
					match(AND);
					setState(130);
					andExpression(0);
					 System.out.println("Operator : and"); 
					}
					} 
				}
				setState(137);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public IsNotExpressionContext isNotExpression() {
			return getRuleContext(IsNotExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(LogicPLParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(LogicPLParser.NOT_EQUAL, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(139);
			isNotExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
						setState(141);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(142);
						match(EQUAL);
						setState(143);
						isNotExpression(0);
						 System.out.println("Operator : is"); 
						}
						break;
					case 2:
						{
						_localctx = new AndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						match(NOT_EQUAL);
						setState(148);
						isNotExpression(0);
						 System.out.println("Operator : not"); 
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsNotExpressionContext extends ParserRuleContext {
		public LtgtExpressionContext ltgtExpression() {
			return getRuleContext(LtgtExpressionContext.class,0);
		}
		public IsNotExpressionContext isNotExpression() {
			return getRuleContext(IsNotExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(LogicPLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(LogicPLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(LogicPLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(LogicPLParser.GT_EQ, 0); }
		public IsNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterIsNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitIsNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitIsNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsNotExpressionContext isNotExpression() throws RecognitionException {
		return isNotExpression(0);
	}

	private IsNotExpressionContext isNotExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IsNotExpressionContext _localctx = new IsNotExpressionContext(_ctx, _parentState);
		IsNotExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_isNotExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(157);
			ltgtExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new IsNotExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_isNotExpression);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						match(LT);
						setState(161);
						ltgtExpression(0);
						 System.out.println("Operator : <"); 
						}
						break;
					case 2:
						{
						_localctx = new IsNotExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_isNotExpression);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(165);
						match(LT_EQ);
						setState(166);
						ltgtExpression(0);
						 System.out.println("Operator : <="); 
						}
						break;
					case 3:
						{
						_localctx = new IsNotExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_isNotExpression);
						setState(169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(170);
						match(GT);
						setState(171);
						ltgtExpression(0);
						 System.out.println("Operator : >"); 
						}
						break;
					case 4:
						{
						_localctx = new IsNotExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_isNotExpression);
						setState(174);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(175);
						match(GT_EQ);
						setState(176);
						ltgtExpression(0);
						 System.out.println("Operator : >="); 
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LtgtExpressionContext extends ParserRuleContext {
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public LtgtExpressionContext ltgtExpression() {
			return getRuleContext(LtgtExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public LtgtExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltgtExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLtgtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLtgtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLtgtExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtgtExpressionContext ltgtExpression() throws RecognitionException {
		return ltgtExpression(0);
	}

	private LtgtExpressionContext ltgtExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LtgtExpressionContext _localctx = new LtgtExpressionContext(_ctx, _parentState);
		LtgtExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_ltgtExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(185);
			addSubExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new LtgtExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ltgtExpression);
						setState(187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(188);
						match(PLUS);
						setState(189);
						addSubExpression(0);
						 System.out.println("Operator : +"); 
						}
						break;
					case 2:
						{
						_localctx = new LtgtExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ltgtExpression);
						setState(192);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(193);
						match(MINUS);
						setState(194);
						addSubExpression(0);
						 System.out.println("Operator : -"); 
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExpressionContext extends ParserRuleContext {
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LogicPLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LogicPLParser.DIV, 0); }
		public TerminalNode MODE() { return getToken(LogicPLParser.MODE, 0); }
		public AddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExpressionContext addSubExpression() throws RecognitionException {
		return addSubExpression(0);
	}

	private AddSubExpressionContext addSubExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddSubExpressionContext _localctx = new AddSubExpressionContext(_ctx, _parentState);
		AddSubExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_addSubExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(203);
			mulDivExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new AddSubExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubExpression);
						setState(205);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(206);
						match(MULT);
						setState(207);
						mulDivExpression();
						 System.out.println("Operator : *"); 
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubExpression);
						setState(210);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(211);
						match(DIV);
						setState(212);
						mulDivExpression();
						 System.out.println("Operator : /"); 
						}
						break;
					case 3:
						{
						_localctx = new AddSubExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubExpression);
						setState(215);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(216);
						match(MODE);
						setState(217);
						mulDivExpression();
						 System.out.println("Operator : /"); 
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExpressionContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LogicPLParser.PLUS, 0); }
		public TildaNegOperatorContext tildaNegOperator() {
			return getRuleContext(TildaNegOperatorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LogicPLParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(LogicPLParser.NOT, 0); }
		public MulDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMulDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivExpressionContext mulDivExpression() throws RecognitionException {
		MulDivExpressionContext _localctx = new MulDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mulDivExpression);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(PLUS);
				setState(226);
				tildaNegOperator(0);
				 System.out.println("Operator : +"); 
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(MINUS);
				setState(230);
				tildaNegOperator(0);
				 System.out.println("Operator : -"); 
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(NOT);
				setState(234);
				tildaNegOperator(0);
				 System.out.println("Operator : !"); 
				}
				break;
			case BOOL_VALUE:
			case FLOAT_VALUE:
			case INT_VALUE:
			case ID:
			case LPAR:
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				tildaNegOperator(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TildaNegOperatorContext extends ParserRuleContext {
		public Factor_Context factor_() {
			return getRuleContext(Factor_Context.class,0);
		}
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public TildaNegOperatorContext tildaNegOperator() {
			return getRuleContext(TildaNegOperatorContext.class,0);
		}
		public TildaNegOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tildaNegOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterTildaNegOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitTildaNegOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitTildaNegOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TildaNegOperatorContext tildaNegOperator() throws RecognitionException {
		return tildaNegOperator(0);
	}

	private TildaNegOperatorContext tildaNegOperator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TildaNegOperatorContext _localctx = new TildaNegOperatorContext(_ctx, _parentState);
		TildaNegOperatorContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_tildaNegOperator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(241);
				factor_();
				setState(242);
				match(LBRACE);
				setState(243);
				expression(0);
				setState(244);
				match(RBRACE);
				}
				break;
			case 2:
				{
				setState(246);
				factor_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TildaNegOperatorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tildaNegOperator);
					setState(249);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(250);
					match(LBRACE);
					setState(251);
					expression(0);
					setState(252);
					match(RBRACE);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_Context extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(LogicPLParser.INT_VALUE, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(LogicPLParser.BOOL_VALUE, 0); }
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public TerminalNode FLOAT_VALUE() { return getToken(LogicPLParser.FLOAT_VALUE, 0); }
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public Factor_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFactor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFactor_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFactor_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_Context factor_() throws RecognitionException {
		Factor_Context _localctx = new Factor_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor_);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(LPAR);
				setState(260);
				expression(0);
				setState(261);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(INT_VALUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(BOOL_VALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				match(FLOAT_VALUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				listType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogicPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogicPLParser.COMMA, i);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listType);
		try {
			int _alt;
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(LBRACE);
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						{
						setState(272);
						expression(0);
						}
						setState(273);
						match(COMMA);
						}
						} 
					}
					setState(279);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				{
				setState(280);
				expression(0);
				}
				setState(281);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(LBRACE);
				setState(284);
				match(RBRACE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 10:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 11:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 12:
			return isNotExpression_sempred((IsNotExpressionContext)_localctx, predIndex);
		case 13:
			return ltgtExpression_sempred((LtgtExpressionContext)_localctx, predIndex);
		case 14:
			return addSubExpression_sempred((AddSubExpressionContext)_localctx, predIndex);
		case 16:
			return tildaNegOperator_sempred((TildaNegOperatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean isNotExpression_sempred(IsNotExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean ltgtExpression_sempred(LtgtExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addSubExpression_sempred(AddSubExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean tildaNegOperator_sempred(TildaNegOperatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0120\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u0003;\b\u0003\u000b\u0003\f\u0003<\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004C\b\u0004\n\u0004\f\u0004F\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004M\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007`\b\u0007\n\u0007\f\u0007c\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007l\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\ty\b\t\n\t\f\t|\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0086\b\n\n"+
		"\n\f\n\u0089\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0098\b\u000b\n\u000b\f\u000b"+
		"\u009b\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b4"+
		"\b\f\n\f\f\f\u00b7\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00c6"+
		"\b\r\n\r\f\r\u00c9\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00dd\b\u000e\n\u000e\f\u000e\u00e0"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00ef\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00f8"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00ff\b\u0010\n\u0010\f\u0010\u0102\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u010e\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0114\b\u0012\n\u0012\f\u0012\u0117"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u011e\b\u0012\u0001\u0012\u0000\u0007\u0012\u0014\u0016\u0018\u001a"+
		"\u001c \u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$\u0000\u0001\u0002\u0000\u0001\u0001\u000e"+
		"\u000f\u012c\u0000)\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000"+
		"\u00043\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\bL\u0001"+
		"\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000"+
		"\u000ek\u0001\u0000\u0000\u0000\u0010m\u0001\u0000\u0000\u0000\u0012p"+
		"\u0001\u0000\u0000\u0000\u0014}\u0001\u0000\u0000\u0000\u0016\u008a\u0001"+
		"\u0000\u0000\u0000\u0018\u009c\u0001\u0000\u0000\u0000\u001a\u00b8\u0001"+
		"\u0000\u0000\u0000\u001c\u00ca\u0001\u0000\u0000\u0000\u001e\u00ee\u0001"+
		"\u0000\u0000\u0000 \u00f7\u0001\u0000\u0000\u0000\"\u010d\u0001\u0000"+
		"\u0000\u0000$\u011d\u0001\u0000\u0000\u0000&(\u0005\u0014\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000\u0000\u0000"+
		"./\u0005\u0002\u0000\u0000/0\u0005\u0011\u0000\u000001\u0005%\u0000\u0000"+
		"12\u0007\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0005\r\u0000"+
		"\u000045\u0005\u0013\u0000\u000056\u0005\u0011\u0000\u000067\u0005\u0014"+
		"\u0000\u00007\u0005\u0001\u0000\u0000\u00008:\u0005\u0011\u0000\u0000"+
		"9;\u0003\b\u0004\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0007\u0001\u0000"+
		"\u0000\u0000>D\u0005\u0013\u0000\u0000?@\u0003\u0012\t\u0000@A\u0005\'"+
		"\u0000\u0000AC\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0003\u0012\t\u0000"+
		"HI\u0005\u0014\u0000\u0000IM\u0001\u0000\u0000\u0000JK\u0005\u0013\u0000"+
		"\u0000KM\u0005\u0014\u0000\u0000L>\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000M\t\u0001\u0000\u0000\u0000NO\u0003\f\u0006\u0000OP\u0005"+
		"(\u0000\u0000PQ\u0005\u0002\u0000\u0000QR\u0005)\u0000\u0000RS\u0005("+
		"\u0000\u0000ST\u0005*\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005"+
		"\u0003\u0000\u0000VW\u0005\u0011\u0000\u0000WX\u0006\u0006\uffff\uffff"+
		"\u0000XY\u0003\u000e\u0007\u0000Y\r\u0001\u0000\u0000\u0000Za\u0005\u0013"+
		"\u0000\u0000[\\\u0005\u0002\u0000\u0000\\]\u0003\u0010\b\u0000]^\u0005"+
		"\'\u0000\u0000^`\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u0002\u0000"+
		"\u0000ef\u0003\u0010\b\u0000fg\u0001\u0000\u0000\u0000gh\u0005\u0014\u0000"+
		"\u0000hl\u0001\u0000\u0000\u0000ij\u0005\u0013\u0000\u0000jl\u0005\u0014"+
		"\u0000\u0000kZ\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000l\u000f"+
		"\u0001\u0000\u0000\u0000mn\u0005\u0011\u0000\u0000no\u0006\b\uffff\uffff"+
		"\u0000o\u0011\u0001\u0000\u0000\u0000pq\u0006\t\uffff\uffff\u0000qr\u0003"+
		"\u0014\n\u0000rz\u0001\u0000\u0000\u0000st\n\u0002\u0000\u0000tu\u0005"+
		"$\u0000\u0000uv\u0003\u0014\n\u0000vw\u0006\t\uffff\uffff\u0000wy\u0001"+
		"\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0013\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0006\n\uffff\uffff\u0000~\u007f"+
		"\u0003\u0016\u000b\u0000\u007f\u0087\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\n\u0002\u0000\u0000\u0081\u0082\u0005#\u0000\u0000\u0082\u0083\u0003"+
		"\u0016\u000b\u0000\u0083\u0084\u0006\n\uffff\uffff\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0086\u0089\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001"+
		"\u0000\u0000\u0000\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0006\u000b\uffff\uffff\u0000\u008b\u008c"+
		"\u0003\u0018\f\u0000\u008c\u0099\u0001\u0000\u0000\u0000\u008d\u008e\n"+
		"\u0003\u0000\u0000\u008e\u008f\u0005!\u0000\u0000\u008f\u0090\u0003\u0018"+
		"\f\u0000\u0090\u0091\u0006\u000b\uffff\uffff\u0000\u0091\u0098\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\n\u0002\u0000\u0000\u0093\u0094\u0005\"\u0000"+
		"\u0000\u0094\u0095\u0003\u0018\f\u0000\u0095\u0096\u0006\u000b\uffff\uffff"+
		"\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u008d\u0001\u0000\u0000"+
		"\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u0017\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0006\f\uffff\uffff\u0000\u009d\u009e\u0003\u001a\r"+
		"\u0000\u009e\u00b5\u0001\u0000\u0000\u0000\u009f\u00a0\n\u0005\u0000\u0000"+
		"\u00a0\u00a1\u0005\u001e\u0000\u0000\u00a1\u00a2\u0003\u001a\r\u0000\u00a2"+
		"\u00a3\u0006\f\uffff\uffff\u0000\u00a3\u00b4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\n\u0004\u0000\u0000\u00a5\u00a6\u0005\u001d\u0000\u0000\u00a6\u00a7"+
		"\u0003\u001a\r\u0000\u00a7\u00a8\u0006\f\uffff\uffff\u0000\u00a8\u00b4"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\n\u0003\u0000\u0000\u00aa\u00ab\u0005"+
		" \u0000\u0000\u00ab\u00ac\u0003\u001a\r\u0000\u00ac\u00ad\u0006\f\uffff"+
		"\uffff\u0000\u00ad\u00b4\u0001\u0000\u0000\u0000\u00ae\u00af\n\u0002\u0000"+
		"\u0000\u00af\u00b0\u0005\u001f\u0000\u0000\u00b0\u00b1\u0003\u001a\r\u0000"+
		"\u00b1\u00b2\u0006\f\uffff\uffff\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b3\u009f\u0001\u0000\u0000\u0000\u00b3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00b3\u00a9\u0001\u0000\u0000\u0000\u00b3\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u0019\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0006\r\uffff\uffff\u0000"+
		"\u00b9\u00ba\u0003\u001c\u000e\u0000\u00ba\u00c7\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\n\u0003\u0000\u0000\u00bc\u00bd\u0005\u0018\u0000\u0000\u00bd"+
		"\u00be\u0003\u001c\u000e\u0000\u00be\u00bf\u0006\r\uffff\uffff\u0000\u00bf"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c0\u00c1\n\u0002\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0017\u0000\u0000\u00c2\u00c3\u0003\u001c\u000e\u0000\u00c3\u00c4"+
		"\u0006\r\uffff\uffff\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u001b\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0006\u000e\uffff\uffff\u0000\u00cb"+
		"\u00cc\u0003\u001e\u000f\u0000\u00cc\u00de\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\n\u0004\u0000\u0000\u00ce\u00cf\u0005\u001a\u0000\u0000\u00cf\u00d0"+
		"\u0003\u001e\u000f\u0000\u00d0\u00d1\u0006\u000e\uffff\uffff\u0000\u00d1"+
		"\u00dd\u0001\u0000\u0000\u0000\u00d2\u00d3\n\u0003\u0000\u0000\u00d3\u00d4"+
		"\u0005\u001b\u0000\u0000\u00d4\u00d5\u0003\u001e\u000f\u0000\u00d5\u00d6"+
		"\u0006\u000e\uffff\uffff\u0000\u00d6\u00dd\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\n\u0002\u0000\u0000\u00d8\u00d9\u0005\u001c\u0000\u0000\u00d9\u00da"+
		"\u0003\u001e\u000f\u0000\u00da\u00db\u0006\u000e\uffff\uffff\u0000\u00db"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dc\u00cd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d2\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\u001d\u0001\u0000\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0018\u0000\u0000\u00e2"+
		"\u00e3\u0003 \u0010\u0000\u00e3\u00e4\u0006\u000f\uffff\uffff\u0000\u00e4"+
		"\u00ef\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0017\u0000\u0000\u00e6"+
		"\u00e7\u0003 \u0010\u0000\u00e7\u00e8\u0006\u000f\uffff\uffff\u0000\u00e8"+
		"\u00ef\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0019\u0000\u0000\u00ea"+
		"\u00eb\u0003 \u0010\u0000\u00eb\u00ec\u0006\u000f\uffff\uffff\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00ef\u0003 \u0010\u0000\u00ee\u00e1"+
		"\u0001\u0000\u0000\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000\u00ee\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u001f"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0006\u0010\uffff\uffff\u0000\u00f1"+
		"\u00f2\u0003\"\u0011\u0000\u00f2\u00f3\u0005\u0015\u0000\u0000\u00f3\u00f4"+
		"\u0003\u0012\t\u0000\u00f4\u00f5\u0005\u0016\u0000\u0000\u00f5\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f8\u0003\"\u0011\u0000\u00f7\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u0100\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\n\u0003\u0000\u0000\u00fa\u00fb\u0005\u0015\u0000"+
		"\u0000\u00fb\u00fc\u0003\u0012\t\u0000\u00fc\u00fd\u0005\u0016\u0000\u0000"+
		"\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00f9\u0001\u0000\u0000\u0000"+
		"\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101!\u0001\u0000\u0000\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0013\u0000\u0000\u0104"+
		"\u0105\u0003\u0012\t\u0000\u0105\u0106\u0005\u0014\u0000\u0000\u0106\u010e"+
		"\u0001\u0000\u0000\u0000\u0107\u010e\u0003\u0006\u0003\u0000\u0108\u010e"+
		"\u0005\u000f\u0000\u0000\u0109\u010e\u0005\u0001\u0000\u0000\u010a\u010e"+
		"\u0005\u0011\u0000\u0000\u010b\u010e\u0005\u000e\u0000\u0000\u010c\u010e"+
		"\u0003$\u0012\u0000\u010d\u0103\u0001\u0000\u0000\u0000\u010d\u0107\u0001"+
		"\u0000\u0000\u0000\u010d\u0108\u0001\u0000\u0000\u0000\u010d\u0109\u0001"+
		"\u0000\u0000\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e#\u0001\u0000"+
		"\u0000\u0000\u010f\u0115\u0005\u0015\u0000\u0000\u0110\u0111\u0003\u0012"+
		"\t\u0000\u0111\u0112\u0005\'\u0000\u0000\u0112\u0114\u0001\u0000\u0000"+
		"\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0003\u0012\t\u0000\u0119\u011a\u0005\u0016\u0000\u0000"+
		"\u011a\u011e\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u0015\u0000\u0000"+
		"\u011c\u011e\u0005\u0016\u0000\u0000\u011d\u010f\u0001\u0000\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011e%\u0001\u0000\u0000\u0000\u0016"+
		")<DLakz\u0087\u0097\u0099\u00b3\u00b5\u00c5\u00c7\u00dc\u00de\u00ee\u00f7"+
		"\u0100\u010d\u0115\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}