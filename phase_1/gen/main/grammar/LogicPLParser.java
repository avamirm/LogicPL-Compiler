// Generated from D:/Compiler/CA/LogicPL-Compiler/phase_1/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0
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
		T__0=1, BOOL_VALUE=2, VAR_TYPE=3, FUNCTION=4, MAIN=5, INT=6, FLOAT=7, 
		BOOL=8, TRUE=9, FALSE=10, PRINT=11, FOR=12, RETURN=13, PRED_NAME=14, INT_VALUE=15, 
		FLOAT_VALUE=16, LINE_COMMENT=17, ID=18, WHITE_SPACE=19, LPAR=20, RPAR=21, 
		LBRACE=22, RBRACE=23, MINUS=24, PLUS=25, NOT=26, MULT=27, DIV=28, MODE=29, 
		LT_EQ=30, LT=31, GT_EQ=32, GT=33, EQUAL=34, NOT_EQUAL=35, ARROW_FUNC=36, 
		AND=37, OR=38, ASSIGN=39, SEMICOLON=40, COMMA=41, COLON=42, DOT=43, LBRACK=44, 
		RBRACK=45, QUESTION_MARK=46, NEW_LINE=47;
	public static final int
		RULE_logicPL = 0, RULE_main = 1, RULE_varDec = 2, RULE_print = 3, RULE_loop = 4, 
		RULE_body = 5, RULE_implication = 6, RULE_predicate = 7, RULE_query1 = 8, 
		RULE_query2 = 9, RULE_func = 10, RULE_funcBody = 11, RULE_funcDec = 12, 
		RULE_funcCallStmt = 13, RULE_funcCall = 14, RULE_argCall = 15, RULE_argsList = 16, 
		RULE_arg = 17, RULE_rightImplicateStatement = 18, RULE_returnStatement = 19, 
		RULE_expression = 20, RULE_orExpression = 21, RULE_andExpression = 22, 
		RULE_isNotExpression = 23, RULE_ltgtExpression = 24, RULE_addSubExpression = 25, 
		RULE_mulDivExpression = 26, RULE_tildaNegOperator = 27, RULE_factor_ = 28, 
		RULE_assignment = 29, RULE_arrayType = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"logicPL", "main", "varDec", "print", "loop", "body", "implication", 
			"predicate", "query1", "query2", "func", "funcBody", "funcDec", "funcCallStmt", 
			"funcCall", "argCall", "argsList", "arg", "rightImplicateStatement", 
			"returnStatement", "expression", "orExpression", "andExpression", "isNotExpression", 
			"ltgtExpression", "addSubExpression", "mulDivExpression", "tildaNegOperator", 
			"factor_", "assignment", "arrayType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", null, null, "'function'", "'main'", "'int'", "'float'", 
			"'boolean'", "'true'", "'false'", "'print'", "'for'", "'return'", null, 
			null, null, null, null, null, "'('", "')'", "'['", "']'", "'-'", "'+'", 
			"'!'", "'*'", "'/'", "'%'", "'<='", "'<'", "'>='", "'>'", "'=='", "'!='", 
			"'=>'", "'&&'", "'||'", "'='", "';'", "','", "':'", "'.'", "'{'", "'}'", 
			"'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BOOL_VALUE", "VAR_TYPE", "FUNCTION", "MAIN", "INT", "FLOAT", 
			"BOOL", "TRUE", "FALSE", "PRINT", "FOR", "RETURN", "PRED_NAME", "INT_VALUE", 
			"FLOAT_VALUE", "LINE_COMMENT", "ID", "WHITE_SPACE", "LPAR", "RPAR", "LBRACE", 
			"RBRACE", "MINUS", "PLUS", "NOT", "MULT", "DIV", "MODE", "LT_EQ", "LT", 
			"GT_EQ", "GT", "EQUAL", "NOT_EQUAL", "ARROW_FUNC", "AND", "OR", "ASSIGN", 
			"SEMICOLON", "COMMA", "COLON", "DOT", "LBRACK", "RBRACK", "QUESTION_MARK", 
			"NEW_LINE"
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LogicPLParser.EOF, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(62);
				func();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			main();
			setState(69);
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(LogicPLParser.MAIN, 0); }
		public TerminalNode LBRACK() { return getToken(LogicPLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LogicPLParser.RBRACK, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(MAIN);
			 System.out.println("MainBody"); 
			setState(73);
			match(LBRACK);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1341448L) != 0)) {
				{
				{
				setState(74);
				body();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
	public static class VarDecContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode VAR_TYPE() { return getToken(LogicPLParser.VAR_TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(LogicPLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicPLParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode INT_VALUE() { return getToken(LogicPLParser.INT_VALUE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(LogicPLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(LogicPLParser.ASSIGN, i);
		}
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
		enterRule(_localctx, 4, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(VAR_TYPE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(83);
				match(LBRACE);
				setState(84);
				match(INT_VALUE);
				setState(85);
				match(RBRACE);
				}
			}

			setState(88);
			((VarDecContext)_localctx).ID = match(ID);
			 System.out.println("VarDec: " + ((VarDecContext)_localctx).ID.getText()); 
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(90);
				match(ASSIGN);
				setState(91);
				expression(0);
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94);
				match(COMMA);
				setState(95);
				((VarDecContext)_localctx).ID = match(ID);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(96);
					match(ASSIGN);
					setState(97);
					expression(0);
					}
				}

				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(SEMICOLON);
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LogicPLParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public Query1Context query1() {
			return getRuleContext(Query1Context.class,0);
		}
		public Query2Context query2() {
			return getRuleContext(Query2Context.class,0);
		}
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("Built-in: print");
			setState(108);
			match(PRINT);
			setState(109);
			match(LPAR);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(110);
				query1();
				}
				break;
			case 2:
				{
				setState(111);
				query2();
				}
				break;
			case 3:
				{
				setState(112);
				match(ID);
				}
				break;
			}
			setState(115);
			match(RPAR);
			setState(116);
			match(SEMICOLON);
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
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LogicPLParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(LogicPLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogicPLParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(LogicPLParser.COLON, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode LBRACK() { return getToken(LogicPLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LogicPLParser.RBRACK, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("Loop: for");
			setState(119);
			match(FOR);
			setState(120);
			match(LPAR);
			setState(121);
			match(ID);
			setState(122);
			match(COLON);
			setState(123);
			match(ID);
			setState(124);
			match(RPAR);
			setState(125);
			match(LBRACK);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1341448L) != 0)) {
				{
				{
				setState(126);
				body();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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
	public static class BodyContext extends ParserRuleContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ImplicationContext implication() {
			return getRuleContext(ImplicationContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FuncCallStmtContext funcCallStmt() {
			return getRuleContext(FuncCallStmtContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				varDec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				implication();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				predicate();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				assignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				print();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				funcCallStmt();
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
	public static class ImplicationContext extends ParserRuleContext {
		public List<TerminalNode> LPAR() { return getTokens(LogicPLParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(LogicPLParser.LPAR, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(LogicPLParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(LogicPLParser.RPAR, i);
		}
		public TerminalNode ARROW_FUNC() { return getToken(LogicPLParser.ARROW_FUNC, 0); }
		public RightImplicateStatementContext rightImplicateStatement() {
			return getRuleContext(RightImplicateStatementContext.class,0);
		}
		public ImplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterImplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitImplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitImplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationContext implication() throws RecognitionException {
		ImplicationContext _localctx = new ImplicationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_implication);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("Implication") 
			setState(145);
			match(LPAR);
			setState(146);
			expression(0);
			setState(147);
			match(RPAR);
			setState(148);
			match(ARROW_FUNC);
			setState(149);
			match(LPAR);
			setState(150);
			rightImplicateStatement();
			setState(151);
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
	public static class PredicateContext extends ParserRuleContext {
		public Token PRED_NAME;
		public TerminalNode PRED_NAME() { return getToken(LogicPLParser.PRED_NAME, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 14, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((PredicateContext)_localctx).PRED_NAME = match(PRED_NAME);
			 System.out.println("Predicate: " + ((PredicateContext)_localctx).PRED_NAME.getText()); 
			setState(155);
			match(LPAR);
			setState(156);
			match(ID);
			setState(157);
			match(RPAR);
			setState(158);
			match(SEMICOLON);
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
	public static class Query1Context extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(LogicPLParser.QUESTION_MARK, 0); }
		public TerminalNode PRED_NAME() { return getToken(LogicPLParser.PRED_NAME, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public Query1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQuery1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQuery1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQuery1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query1Context query1() throws RecognitionException {
		Query1Context _localctx = new Query1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_query1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LBRACE);
			setState(161);
			match(QUESTION_MARK);
			setState(162);
			match(PRED_NAME);
			setState(163);
			match(LPAR);
			setState(164);
			match(ID);
			setState(165);
			match(RPAR);
			setState(166);
			match(RBRACE);
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
	public static class Query2Context extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode PRED_NAME() { return getToken(LogicPLParser.PRED_NAME, 0); }
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(LogicPLParser.QUESTION_MARK, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public Query2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterQuery2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitQuery2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitQuery2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query2Context query2() throws RecognitionException {
		Query2Context _localctx = new Query2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_query2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LBRACE);
			setState(169);
			match(PRED_NAME);
			setState(170);
			match(LPAR);
			setState(171);
			match(QUESTION_MARK);
			setState(172);
			match(RPAR);
			setState(173);
			match(RBRACE);
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
		public TerminalNode COLON() { return getToken(LogicPLParser.COLON, 0); }
		public TerminalNode VAR_TYPE() { return getToken(LogicPLParser.VAR_TYPE, 0); }
		public TerminalNode LBRACK() { return getToken(LogicPLParser.LBRACK, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			funcDec();
			setState(176);
			match(COLON);
			setState(177);
			match(VAR_TYPE);
			setState(178);
			match(LBRACK);
			setState(179);
			funcBody();
			setState(180);
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
	public static class FuncBodyContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFuncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcBody);
		int _la;
		try {
			int _alt;
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(182);
						body();
						}
						} 
					}
					setState(187);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(188);
				returnStatement();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1341448L) != 0)) {
					{
					{
					setState(189);
					body();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1341448L) != 0)) {
					{
					{
					setState(195);
					body();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class FuncDecContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode FUNCTION() { return getToken(LogicPLParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
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
		enterRule(_localctx, 24, RULE_funcDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(FUNCTION);
			setState(204);
			((FuncDecContext)_localctx).ID = match(ID);
			 System.out.println("FunctionDec: " + ((FuncDecContext)_localctx).ID.getText()); 
			setState(206);
			argsList();
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
	public static class FuncCallStmtContext extends ParserRuleContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public FuncCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFuncCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFuncCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFuncCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallStmtContext funcCallStmt() throws RecognitionException {
		FuncCallStmtContext _localctx = new FuncCallStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcCallStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("FunctionCall");
			setState(209);
			funcCall();
			setState(210);
			match(SEMICOLON);
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
	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public ArgCallContext argCall() {
			return getRuleContext(ArgCallContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(213);
			argCall();
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
	public static class ArgCallContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(LogicPLParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(LogicPLParser.RPAR, 0); }
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
		public ArgCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArgCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArgCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArgCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgCallContext argCall() throws RecognitionException {
		ArgCallContext _localctx = new ArgCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argCall);
		try {
			int _alt;
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(LPAR);
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(216);
						expression(0);
						setState(217);
						match(COMMA);
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				{
				setState(224);
				expression(0);
				}
				setState(225);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(LPAR);
				setState(228);
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
	public static class ArgsListContext extends ParserRuleContext {
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
		public ArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsListContext argsList() throws RecognitionException {
		ArgsListContext _localctx = new ArgsListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argsList);
		try {
			int _alt;
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(LPAR);
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(232);
						match(VAR_TYPE);
						setState(233);
						arg();
						setState(234);
						match(COMMA);
						}
						} 
					}
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				{
				setState(241);
				match(VAR_TYPE);
				setState(242);
				arg();
				}
				setState(244);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(LPAR);
				setState(247);
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
		enterRule(_localctx, 34, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			((ArgContext)_localctx).ID = match(ID);
			 System.out.println("ArgumentDec: " + ((ArgContext)_localctx).ID.getText()); 
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
	public static class RightImplicateStatementContext extends ParserRuleContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<ReturnStatementContext> returnStatement() {
			return getRuleContexts(ReturnStatementContext.class);
		}
		public ReturnStatementContext returnStatement(int i) {
			return getRuleContext(ReturnStatementContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<FuncCallStmtContext> funcCallStmt() {
			return getRuleContexts(FuncCallStmtContext.class);
		}
		public FuncCallStmtContext funcCallStmt(int i) {
			return getRuleContext(FuncCallStmtContext.class,i);
		}
		public RightImplicateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightImplicateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterRightImplicateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitRightImplicateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitRightImplicateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightImplicateStatementContext rightImplicateStatement() throws RecognitionException {
		RightImplicateStatementContext _localctx = new RightImplicateStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rightImplicateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(253);
					predicate();
					}
					break;
				case 2:
					{
					setState(254);
					returnStatement();
					}
					break;
				case 3:
					{
					setState(255);
					assignment();
					}
					break;
				case 4:
					{
					setState(256);
					funcCallStmt();
					}
					break;
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 286720L) != 0) );
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LogicPLParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(RETURN);
			System.out.println("Return");
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 123043846L) != 0)) {
				{
				setState(263);
				expression(0);
				}
			}

			setState(266);
			match(SEMICOLON);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269);
			orExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(271);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(272);
					match(OR);
					setState(273);
					orExpression(0);
					 System.out.println("Operator: ||"); 
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(284);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(285);
					match(AND);
					setState(286);
					andExpression(0);
					 System.out.println("Operator: &&"); 
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(295);
			isNotExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
						setState(297);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(298);
						match(EQUAL);
						setState(299);
						isNotExpression(0);
						 System.out.println("Operator: =="); 
						}
						break;
					case 2:
						{
						_localctx = new AndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
						setState(302);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(303);
						match(NOT_EQUAL);
						setState(304);
						isNotExpression(0);
						 System.out.println("Operator: !="); 
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_isNotExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313);
			ltgtExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(335);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new IsNotExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_isNotExpression);
						setState(315);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(316);
						match(LT);
						setState(317);
						ltgtExpression(0);
						 System.out.println("Operator: <"); 
						}
						break;
					case 2:
						{
						_localctx = new IsNotExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_isNotExpression);
						setState(320);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(321);
						match(LT_EQ);
						setState(322);
						ltgtExpression(0);
						 System.out.println("Operator: <="); 
						}
						break;
					case 3:
						{
						_localctx = new IsNotExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_isNotExpression);
						setState(325);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(326);
						match(GT);
						setState(327);
						ltgtExpression(0);
						 System.out.println("Operator: >"); 
						}
						break;
					case 4:
						{
						_localctx = new IsNotExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_isNotExpression);
						setState(330);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(331);
						match(GT_EQ);
						setState(332);
						ltgtExpression(0);
						 System.out.println("Operator: >="); 
						}
						break;
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_ltgtExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(341);
			addSubExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new LtgtExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ltgtExpression);
						setState(343);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(344);
						match(PLUS);
						setState(345);
						addSubExpression(0);
						 System.out.println("Operator: +"); 
						}
						break;
					case 2:
						{
						_localctx = new LtgtExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ltgtExpression);
						setState(348);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(349);
						match(MINUS);
						setState(350);
						addSubExpression(0);
						 System.out.println("Operator: -"); 
						}
						break;
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_addSubExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359);
			mulDivExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new AddSubExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubExpression);
						setState(361);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(362);
						match(MULT);
						setState(363);
						mulDivExpression();
						 System.out.println("Operator: *"); 
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubExpression);
						setState(366);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(367);
						match(DIV);
						setState(368);
						mulDivExpression();
						 System.out.println("Operator: /"); 
						}
						break;
					case 3:
						{
						_localctx = new AddSubExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubExpression);
						setState(371);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(372);
						match(MODE);
						setState(373);
						mulDivExpression();
						 System.out.println("Operator: %"); 
						}
						break;
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 52, RULE_mulDivExpression);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(PLUS);
				setState(382);
				tildaNegOperator(0);
				 System.out.println("Operator: +"); 
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(MINUS);
				setState(386);
				tildaNegOperator(0);
				 System.out.println("Operator: -"); 
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(NOT);
				setState(390);
				tildaNegOperator(0);
				 System.out.println("Operator: !"); 
				}
				break;
			case T__0:
			case BOOL_VALUE:
			case INT_VALUE:
			case FLOAT_VALUE:
			case ID:
			case LPAR:
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_tildaNegOperator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(397);
				factor_();
				setState(398);
				match(LBRACE);
				setState(399);
				expression(0);
				setState(400);
				match(RBRACE);
				}
				break;
			case 2:
				{
				setState(402);
				factor_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TildaNegOperatorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tildaNegOperator);
					setState(405);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(406);
					match(LBRACE);
					setState(407);
					expression(0);
					setState(408);
					match(RBRACE);
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public TerminalNode INT_VALUE() { return getToken(LogicPLParser.INT_VALUE, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(LogicPLParser.BOOL_VALUE, 0); }
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public TerminalNode FLOAT_VALUE() { return getToken(LogicPLParser.FLOAT_VALUE, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public Query1Context query1() {
			return getRuleContext(Query1Context.class,0);
		}
		public Query2Context query2() {
			return getRuleContext(Query2Context.class,0);
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
		enterRule(_localctx, 56, RULE_factor_);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(LPAR);
				setState(416);
				expression(0);
				setState(417);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(INT_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				match(BOOL_VALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				match(ID);
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(423);
					match(LBRACE);
					setState(424);
					expression(0);
					setState(425);
					match(RBRACE);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				match(FLOAT_VALUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(430);
				arrayType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(431);
				funcCall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(432);
				query1();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(433);
				query2();
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LogicPLParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LogicPLParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(LogicPLParser.SEMICOLON, 0); }
		public TerminalNode LBRACE() { return getToken(LogicPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LogicPLParser.RBRACE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitAssignment(this);
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
			setState(436);
			match(ID);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(437);
				match(LBRACE);
				setState(438);
				expression(0);
				setState(439);
				match(RBRACE);
				}
			}

			setState(443);
			match(ASSIGN);
			setState(444);
			expression(0);
			setState(445);
			match(SEMICOLON);
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
	public static class ArrayTypeContext extends ParserRuleContext {
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
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogicPLListener ) ((LogicPLListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogicPLVisitor ) return ((LogicPLVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(LBRACE);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(448);
					expression(0);
					}
					setState(449);
					match(COMMA);
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			{
			setState(456);
			expression(0);
			}
			setState(457);
			match(RBRACE);
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
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 21:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 22:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 23:
			return isNotExpression_sempred((IsNotExpressionContext)_localctx, predIndex);
		case 24:
			return ltgtExpression_sempred((LtgtExpressionContext)_localctx, predIndex);
		case 25:
			return addSubExpression_sempred((AddSubExpressionContext)_localctx, predIndex);
		case 27:
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
		"\u0004\u0001/\u01cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001L\b\u0001\n\u0001\f\u0001O\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002W\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002]\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002c\b\u0002"+
		"\u0005\u0002e\b\u0002\n\u0002\f\u0002h\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003r\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0080\b\u0004\n\u0004\f\u0004\u0083"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008f"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0005\u000b\u00b8\b\u000b\n\u000b\f\u000b"+
		"\u00bb\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00bf\b\u000b\n\u000b"+
		"\f\u000b\u00c2\t\u000b\u0001\u000b\u0005\u000b\u00c5\b\u000b\n\u000b\f"+
		"\u000b\u00c8\t\u000b\u0003\u000b\u00ca\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00dc\b\u000f\n\u000f\f\u000f\u00df\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00e6\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ed\b\u0010\n"+
		"\u0010\f\u0010\u00f0\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00f9\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0004\u0012\u0102\b\u0012\u000b\u0012\f\u0012\u0103\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0109\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0115\b\u0014\n\u0014\f\u0014\u0118"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0122\b\u0015\n\u0015\f\u0015"+
		"\u0125\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0134\b\u0016\n\u0016\f\u0016\u0137"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0150\b\u0017\n\u0017\f\u0017\u0153\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0162\b\u0018\n\u0018\f\u0018\u0165\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0179\b\u0019\n"+
		"\u0019\f\u0019\u017c\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u018b\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0194\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u019b\b\u001b\n\u001b\f\u001b\u019e\t\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u01ac\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01b3\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u01ba\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u01c4\b\u001e\n\u001e\f\u001e\u01c7\t\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0000\u0007(*,.026\u001f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<\u0000\u0000\u01e7\u0000A\u0001\u0000\u0000\u0000\u0002G"+
		"\u0001\u0000\u0000\u0000\u0004R\u0001\u0000\u0000\u0000\u0006k\u0001\u0000"+
		"\u0000\u0000\bv\u0001\u0000\u0000\u0000\n\u008e\u0001\u0000\u0000\u0000"+
		"\f\u0090\u0001\u0000\u0000\u0000\u000e\u0099\u0001\u0000\u0000\u0000\u0010"+
		"\u00a0\u0001\u0000\u0000\u0000\u0012\u00a8\u0001\u0000\u0000\u0000\u0014"+
		"\u00af\u0001\u0000\u0000\u0000\u0016\u00c9\u0001\u0000\u0000\u0000\u0018"+
		"\u00cb\u0001\u0000\u0000\u0000\u001a\u00d0\u0001\u0000\u0000\u0000\u001c"+
		"\u00d4\u0001\u0000\u0000\u0000\u001e\u00e5\u0001\u0000\u0000\u0000 \u00f8"+
		"\u0001\u0000\u0000\u0000\"\u00fa\u0001\u0000\u0000\u0000$\u0101\u0001"+
		"\u0000\u0000\u0000&\u0105\u0001\u0000\u0000\u0000(\u010c\u0001\u0000\u0000"+
		"\u0000*\u0119\u0001\u0000\u0000\u0000,\u0126\u0001\u0000\u0000\u0000."+
		"\u0138\u0001\u0000\u0000\u00000\u0154\u0001\u0000\u0000\u00002\u0166\u0001"+
		"\u0000\u0000\u00004\u018a\u0001\u0000\u0000\u00006\u0193\u0001\u0000\u0000"+
		"\u00008\u01b2\u0001\u0000\u0000\u0000:\u01b4\u0001\u0000\u0000\u0000<"+
		"\u01bf\u0001\u0000\u0000\u0000>@\u0003\u0014\n\u0000?>\u0001\u0000\u0000"+
		"\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0003"+
		"\u0002\u0001\u0000EF\u0005\u0000\u0000\u0001F\u0001\u0001\u0000\u0000"+
		"\u0000GH\u0005\u0005\u0000\u0000HI\u0006\u0001\uffff\uffff\u0000IM\u0005"+
		",\u0000\u0000JL\u0003\n\u0005\u0000KJ\u0001\u0000\u0000\u0000LO\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005-\u0000\u0000"+
		"Q\u0003\u0001\u0000\u0000\u0000RV\u0005\u0003\u0000\u0000ST\u0005\u0016"+
		"\u0000\u0000TU\u0005\u000f\u0000\u0000UW\u0005\u0017\u0000\u0000VS\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XY\u0005\u0012\u0000\u0000Y\\\u0006\u0002\uffff\uffff\u0000Z[\u0005\'"+
		"\u0000\u0000[]\u0003(\u0014\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]f\u0001\u0000\u0000\u0000^_\u0005)\u0000\u0000_b\u0005"+
		"\u0012\u0000\u0000`a\u0005\'\u0000\u0000ac\u0003(\u0014\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000"+
		"d^\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000ij\u0005(\u0000\u0000j\u0005\u0001\u0000\u0000\u0000kl\u0006"+
		"\u0003\uffff\uffff\u0000lm\u0005\u000b\u0000\u0000mq\u0005\u0014\u0000"+
		"\u0000nr\u0003\u0010\b\u0000or\u0003\u0012\t\u0000pr\u0005\u0012\u0000"+
		"\u0000qn\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005\u0015\u0000\u0000tu\u0005"+
		"(\u0000\u0000u\u0007\u0001\u0000\u0000\u0000vw\u0006\u0004\uffff\uffff"+
		"\u0000wx\u0005\f\u0000\u0000xy\u0005\u0014\u0000\u0000yz\u0005\u0012\u0000"+
		"\u0000z{\u0005*\u0000\u0000{|\u0005\u0012\u0000\u0000|}\u0005\u0015\u0000"+
		"\u0000}\u0081\u0005,\u0000\u0000~\u0080\u0003\n\u0005\u0000\u007f~\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"-\u0000\u0000\u0085\t\u0001\u0000\u0000\u0000\u0086\u008f\u0003\u0004"+
		"\u0002\u0000\u0087\u008f\u0003\b\u0004\u0000\u0088\u008f\u0003\f\u0006"+
		"\u0000\u0089\u008f\u0003\u000e\u0007\u0000\u008a\u008f\u0003&\u0013\u0000"+
		"\u008b\u008f\u0003:\u001d\u0000\u008c\u008f\u0003\u0006\u0003\u0000\u008d"+
		"\u008f\u0003\u001a\r\u0000\u008e\u0086\u0001\u0000\u0000\u0000\u008e\u0087"+
		"\u0001\u0000\u0000\u0000\u008e\u0088\u0001\u0000\u0000\u0000\u008e\u0089"+
		"\u0001\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008e\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u000b\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0006\u0006\uffff\uffff\u0000\u0091\u0092\u0005\u0014\u0000\u0000\u0092"+
		"\u0093\u0003(\u0014\u0000\u0093\u0094\u0005\u0015\u0000\u0000\u0094\u0095"+
		"\u0005$\u0000\u0000\u0095\u0096\u0005\u0014\u0000\u0000\u0096\u0097\u0003"+
		"$\u0012\u0000\u0097\u0098\u0005\u0015\u0000\u0000\u0098\r\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005\u000e\u0000\u0000\u009a\u009b\u0006\u0007"+
		"\uffff\uffff\u0000\u009b\u009c\u0005\u0014\u0000\u0000\u009c\u009d\u0005"+
		"\u0012\u0000\u0000\u009d\u009e\u0005\u0015\u0000\u0000\u009e\u009f\u0005"+
		"(\u0000\u0000\u009f\u000f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0016"+
		"\u0000\u0000\u00a1\u00a2\u0005.\u0000\u0000\u00a2\u00a3\u0005\u000e\u0000"+
		"\u0000\u00a3\u00a4\u0005\u0014\u0000\u0000\u00a4\u00a5\u0005\u0012\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0015\u0000\u0000\u00a6\u00a7\u0005\u0017\u0000"+
		"\u0000\u00a7\u0011\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0016\u0000"+
		"\u0000\u00a9\u00aa\u0005\u000e\u0000\u0000\u00aa\u00ab\u0005\u0014\u0000"+
		"\u0000\u00ab\u00ac\u0005.\u0000\u0000\u00ac\u00ad\u0005\u0015\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0017\u0000\u0000\u00ae\u0013\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0003\u0018\f\u0000\u00b0\u00b1\u0005*\u0000\u0000\u00b1"+
		"\u00b2\u0005\u0003\u0000\u0000\u00b2\u00b3\u0005,\u0000\u0000\u00b3\u00b4"+
		"\u0003\u0016\u000b\u0000\u00b4\u00b5\u0005-\u0000\u0000\u00b5\u0015\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b8\u0003\n\u0005\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00c0\u0003&\u0013"+
		"\u0000\u00bd\u00bf\u0003\n\u0005\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003\n\u0005\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9"+
		"\u00b9\u0001\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00ca"+
		"\u0017\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0004\u0000\u0000\u00cc"+
		"\u00cd\u0005\u0012\u0000\u0000\u00cd\u00ce\u0006\f\uffff\uffff\u0000\u00ce"+
		"\u00cf\u0003 \u0010\u0000\u00cf\u0019\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0006\r\uffff\uffff\u0000\u00d1\u00d2\u0003\u001c\u000e\u0000\u00d2\u00d3"+
		"\u0005(\u0000\u0000\u00d3\u001b\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005"+
		"\u0012\u0000\u0000\u00d5\u00d6\u0003\u001e\u000f\u0000\u00d6\u001d\u0001"+
		"\u0000\u0000\u0000\u00d7\u00dd\u0005\u0014\u0000\u0000\u00d8\u00d9\u0003"+
		"(\u0014\u0000\u00d9\u00da\u0005)\u0000\u0000\u00da\u00dc\u0001\u0000\u0000"+
		"\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0003(\u0014\u0000\u00e1\u00e2\u0005\u0015\u0000\u0000"+
		"\u00e2\u00e6\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0014\u0000\u0000"+
		"\u00e4\u00e6\u0005\u0015\u0000\u0000\u00e5\u00d7\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u001f\u0001\u0000\u0000\u0000"+
		"\u00e7\u00ee\u0005\u0014\u0000\u0000\u00e8\u00e9\u0005\u0003\u0000\u0000"+
		"\u00e9\u00ea\u0003\"\u0011\u0000\u00ea\u00eb\u0005)\u0000\u0000\u00eb"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e8\u0001\u0000\u0000\u0000\u00ed"+
		"\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0003\u0000\u0000\u00f2"+
		"\u00f3\u0003\"\u0011\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0005\u0015\u0000\u0000\u00f5\u00f9\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0014\u0000\u0000\u00f7\u00f9\u0005\u0015\u0000\u0000\u00f8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9!\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005\u0012\u0000\u0000\u00fb\u00fc\u0006"+
		"\u0011\uffff\uffff\u0000\u00fc#\u0001\u0000\u0000\u0000\u00fd\u0102\u0003"+
		"\u000e\u0007\u0000\u00fe\u0102\u0003&\u0013\u0000\u00ff\u0102\u0003:\u001d"+
		"\u0000\u0100\u0102\u0003\u001a\r\u0000\u0101\u00fd\u0001\u0000\u0000\u0000"+
		"\u0101\u00fe\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104%\u0001\u0000\u0000\u0000\u0105\u0106\u0005\r\u0000\u0000\u0106"+
		"\u0108\u0006\u0013\uffff\uffff\u0000\u0107\u0109\u0003(\u0014\u0000\u0108"+
		"\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0005(\u0000\u0000\u010b\'"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0006\u0014\uffff\uffff\u0000\u010d"+
		"\u010e\u0003*\u0015\u0000\u010e\u0116\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\n\u0002\u0000\u0000\u0110\u0111\u0005&\u0000\u0000\u0111\u0112\u0003"+
		"*\u0015\u0000\u0112\u0113\u0006\u0014\uffff\uffff\u0000\u0113\u0115\u0001"+
		"\u0000\u0000\u0000\u0114\u010f\u0001\u0000\u0000\u0000\u0115\u0118\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117)\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0006\u0015\uffff\uffff\u0000\u011a\u011b\u0003"+
		",\u0016\u0000\u011b\u0123\u0001\u0000\u0000\u0000\u011c\u011d\n\u0002"+
		"\u0000\u0000\u011d\u011e\u0005%\u0000\u0000\u011e\u011f\u0003,\u0016\u0000"+
		"\u011f\u0120\u0006\u0015\uffff\uffff\u0000\u0120\u0122\u0001\u0000\u0000"+
		"\u0000\u0121\u011c\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124+\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0006\u0016\uffff\uffff\u0000\u0127\u0128\u0003.\u0017\u0000"+
		"\u0128\u0135\u0001\u0000\u0000\u0000\u0129\u012a\n\u0003\u0000\u0000\u012a"+
		"\u012b\u0005\"\u0000\u0000\u012b\u012c\u0003.\u0017\u0000\u012c\u012d"+
		"\u0006\u0016\uffff\uffff\u0000\u012d\u0134\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\n\u0002\u0000\u0000\u012f\u0130\u0005#\u0000\u0000\u0130\u0131"+
		"\u0003.\u0017\u0000\u0131\u0132\u0006\u0016\uffff\uffff\u0000\u0132\u0134"+
		"\u0001\u0000\u0000\u0000\u0133\u0129\u0001\u0000\u0000\u0000\u0133\u012e"+
		"\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136-\u0001"+
		"\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0006"+
		"\u0017\uffff\uffff\u0000\u0139\u013a\u00030\u0018\u0000\u013a\u0151\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\n\u0005\u0000\u0000\u013c\u013d\u0005\u001f"+
		"\u0000\u0000\u013d\u013e\u00030\u0018\u0000\u013e\u013f\u0006\u0017\uffff"+
		"\uffff\u0000\u013f\u0150\u0001\u0000\u0000\u0000\u0140\u0141\n\u0004\u0000"+
		"\u0000\u0141\u0142\u0005\u001e\u0000\u0000\u0142\u0143\u00030\u0018\u0000"+
		"\u0143\u0144\u0006\u0017\uffff\uffff\u0000\u0144\u0150\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\n\u0003\u0000\u0000\u0146\u0147\u0005!\u0000\u0000"+
		"\u0147\u0148\u00030\u0018\u0000\u0148\u0149\u0006\u0017\uffff\uffff\u0000"+
		"\u0149\u0150\u0001\u0000\u0000\u0000\u014a\u014b\n\u0002\u0000\u0000\u014b"+
		"\u014c\u0005 \u0000\u0000\u014c\u014d\u00030\u0018\u0000\u014d\u014e\u0006"+
		"\u0017\uffff\uffff\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u013b"+
		"\u0001\u0000\u0000\u0000\u014f\u0140\u0001\u0000\u0000\u0000\u014f\u0145"+
		"\u0001\u0000\u0000\u0000\u014f\u014a\u0001\u0000\u0000\u0000\u0150\u0153"+
		"\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152/\u0001\u0000\u0000\u0000\u0153\u0151\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0006\u0018\uffff\uffff\u0000\u0155\u0156"+
		"\u00032\u0019\u0000\u0156\u0163\u0001\u0000\u0000\u0000\u0157\u0158\n"+
		"\u0003\u0000\u0000\u0158\u0159\u0005\u0019\u0000\u0000\u0159\u015a\u0003"+
		"2\u0019\u0000\u015a\u015b\u0006\u0018\uffff\uffff\u0000\u015b\u0162\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\n\u0002\u0000\u0000\u015d\u015e\u0005\u0018"+
		"\u0000\u0000\u015e\u015f\u00032\u0019\u0000\u015f\u0160\u0006\u0018\uffff"+
		"\uffff\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u0157\u0001\u0000"+
		"\u0000\u0000\u0161\u015c\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000"+
		"\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u01641\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0006\u0019\uffff\uffff\u0000\u0167\u0168\u00034\u001a"+
		"\u0000\u0168\u017a\u0001\u0000\u0000\u0000\u0169\u016a\n\u0004\u0000\u0000"+
		"\u016a\u016b\u0005\u001b\u0000\u0000\u016b\u016c\u00034\u001a\u0000\u016c"+
		"\u016d\u0006\u0019\uffff\uffff\u0000\u016d\u0179\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\n\u0003\u0000\u0000\u016f\u0170\u0005\u001c\u0000\u0000\u0170"+
		"\u0171\u00034\u001a\u0000\u0171\u0172\u0006\u0019\uffff\uffff\u0000\u0172"+
		"\u0179\u0001\u0000\u0000\u0000\u0173\u0174\n\u0002\u0000\u0000\u0174\u0175"+
		"\u0005\u001d\u0000\u0000\u0175\u0176\u00034\u001a\u0000\u0176\u0177\u0006"+
		"\u0019\uffff\uffff\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0169"+
		"\u0001\u0000\u0000\u0000\u0178\u016e\u0001\u0000\u0000\u0000\u0178\u0173"+
		"\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b3\u0001"+
		"\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u017e\u0005"+
		"\u0019\u0000\u0000\u017e\u017f\u00036\u001b\u0000\u017f\u0180\u0006\u001a"+
		"\uffff\uffff\u0000\u0180\u018b\u0001\u0000\u0000\u0000\u0181\u0182\u0005"+
		"\u0018\u0000\u0000\u0182\u0183\u00036\u001b\u0000\u0183\u0184\u0006\u001a"+
		"\uffff\uffff\u0000\u0184\u018b\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"\u001a\u0000\u0000\u0186\u0187\u00036\u001b\u0000\u0187\u0188\u0006\u001a"+
		"\uffff\uffff\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u018b\u0003"+
		"6\u001b\u0000\u018a\u017d\u0001\u0000\u0000\u0000\u018a\u0181\u0001\u0000"+
		"\u0000\u0000\u018a\u0185\u0001\u0000\u0000\u0000\u018a\u0189\u0001\u0000"+
		"\u0000\u0000\u018b5\u0001\u0000\u0000\u0000\u018c\u018d\u0006\u001b\uffff"+
		"\uffff\u0000\u018d\u018e\u00038\u001c\u0000\u018e\u018f\u0005\u0016\u0000"+
		"\u0000\u018f\u0190\u0003(\u0014\u0000\u0190\u0191\u0005\u0017\u0000\u0000"+
		"\u0191\u0194\u0001\u0000\u0000\u0000\u0192\u0194\u00038\u001c\u0000\u0193"+
		"\u018c\u0001\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194"+
		"\u019c\u0001\u0000\u0000\u0000\u0195\u0196\n\u0003\u0000\u0000\u0196\u0197"+
		"\u0005\u0016\u0000\u0000\u0197\u0198\u0003(\u0014\u0000\u0198\u0199\u0005"+
		"\u0017\u0000\u0000\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u0195\u0001"+
		"\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d7\u0001\u0000"+
		"\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0014"+
		"\u0000\u0000\u01a0\u01a1\u0003(\u0014\u0000\u01a1\u01a2\u0005\u0015\u0000"+
		"\u0000\u01a2\u01b3\u0001\u0000\u0000\u0000\u01a3\u01b3\u0005\u000f\u0000"+
		"\u0000\u01a4\u01b3\u0005\u0001\u0000\u0000\u01a5\u01b3\u0005\u0002\u0000"+
		"\u0000\u01a6\u01ab\u0005\u0012\u0000\u0000\u01a7\u01a8\u0005\u0016\u0000"+
		"\u0000\u01a8\u01a9\u0003(\u0014\u0000\u01a9\u01aa\u0005\u0017\u0000\u0000"+
		"\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a7\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01b3\u0001\u0000\u0000\u0000"+
		"\u01ad\u01b3\u0005\u0010\u0000\u0000\u01ae\u01b3\u0003<\u001e\u0000\u01af"+
		"\u01b3\u0003\u001c\u000e\u0000\u01b0\u01b3\u0003\u0010\b\u0000\u01b1\u01b3"+
		"\u0003\u0012\t\u0000\u01b2\u019f\u0001\u0000\u0000\u0000\u01b2\u01a3\u0001"+
		"\u0000\u0000\u0000\u01b2\u01a4\u0001\u0000\u0000\u0000\u01b2\u01a5\u0001"+
		"\u0000\u0000\u0000\u01b2\u01a6\u0001\u0000\u0000\u0000\u01b2\u01ad\u0001"+
		"\u0000\u0000\u0000\u01b2\u01ae\u0001\u0000\u0000\u0000\u01b2\u01af\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b39\u0001\u0000\u0000\u0000\u01b4\u01b9\u0005\u0012"+
		"\u0000\u0000\u01b5\u01b6\u0005\u0016\u0000\u0000\u01b6\u01b7\u0003(\u0014"+
		"\u0000\u01b7\u01b8\u0005\u0017\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000"+
		"\u0000\u01b9\u01b5\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\'\u0000\u0000"+
		"\u01bc\u01bd\u0003(\u0014\u0000\u01bd\u01be\u0005(\u0000\u0000\u01be;"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c5\u0005\u0016\u0000\u0000\u01c0\u01c1"+
		"\u0003(\u0014\u0000\u01c1\u01c2\u0005)\u0000\u0000\u01c2\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c0\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0003(\u0014\u0000\u01c9\u01ca\u0005\u0017\u0000"+
		"\u0000\u01ca=\u0001\u0000\u0000\u0000%AMV\\bfq\u0081\u008e\u00b9\u00c0"+
		"\u00c6\u00c9\u00dd\u00e5\u00ee\u00f8\u0101\u0103\u0108\u0116\u0123\u0133"+
		"\u0135\u014f\u0151\u0161\u0163\u0178\u017a\u018a\u0193\u019c\u01ab\u01b2"+
		"\u01b9\u01c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}