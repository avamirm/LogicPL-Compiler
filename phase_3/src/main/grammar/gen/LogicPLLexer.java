// Generated from D:/Term6/Complier/CA/LogicPL-Compiler/phase_3/src/main/grammar\LogicPL.g4 by ANTLR 4.12.0

import ast.node.*;
import ast.node.expression.*;
import ast.node.statement.*;
import ast.node.declaration.*;
import ast.node.expression.values.*;
import ast.node.expression.operators.*;
import ast.type.primitiveType.*;
import ast.type.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LogicPLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION=1, BOOLEAN=2, INT=3, FLOAT=4, MAIN=5, PRINT=6, RETURN=7, FOR=8, 
		TRUE=9, FALSE=10, LPAR=11, RPAR=12, COLON=13, COMMA=14, LBRACE=15, RBRACE=16, 
		SEMICOLON=17, ASSIGN=18, LBRACKET=19, RBRACKET=20, QUARYMARK=21, ARROW=22, 
		OR=23, AND=24, EQ=25, GT=26, LT=27, GTE=28, LTE=29, PLUS=30, MINUS=31, 
		MULT=32, DIV=33, MOD=34, NEQ=35, NOT=36, WS=37, COMMENT=38, IDENTIFIER=39, 
		PREDICATE_IDENTIFIER=40, INT_NUMBER=41, FLOAT_NUMBER=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FUNCTION", "BOOLEAN", "INT", "FLOAT", "MAIN", "PRINT", "RETURN", "FOR", 
			"TRUE", "FALSE", "LPAR", "RPAR", "COLON", "COMMA", "LBRACE", "RBRACE", 
			"SEMICOLON", "ASSIGN", "LBRACKET", "RBRACKET", "QUARYMARK", "ARROW", 
			"OR", "AND", "EQ", "GT", "LT", "GTE", "LTE", "PLUS", "MINUS", "MULT", 
			"DIV", "MOD", "NEQ", "NOT", "WS", "COMMENT", "IDENTIFIER", "PREDICATE_IDENTIFIER", 
			"INT_NUMBER", "FLOAT_NUMBER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "'boolean'", "'int'", "'float'", "'main'", "'print'", 
			"'return'", "'for'", "'true'", "'false'", "'('", "')'", "':'", "','", 
			"'{'", "'}'", "';'", "'='", "'['", "']'", "'?'", "'=>'", "'||'", "'&&'", 
			"'=='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!='", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTION", "BOOLEAN", "INT", "FLOAT", "MAIN", "PRINT", "RETURN", 
			"FOR", "TRUE", "FALSE", "LPAR", "RPAR", "COLON", "COMMA", "LBRACE", "RBRACE", 
			"SEMICOLON", "ASSIGN", "LBRACKET", "RBRACKET", "QUARYMARK", "ARROW", 
			"OR", "AND", "EQ", "GT", "LT", "GTE", "LTE", "PLUS", "MINUS", "MULT", 
			"DIV", "MOD", "NEQ", "NOT", "WS", "COMMENT", "IDENTIFIER", "PREDICATE_IDENTIFIER", 
			"INT_NUMBER", "FLOAT_NUMBER"
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


	public LogicPLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogicPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000*\u00fd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"$\u0004$\u00ce\b$\u000b$\f$\u00cf\u0001$\u0001$\u0001%\u0001%\u0005%\u00d6"+
		"\b%\n%\f%\u00d9\t%\u0001%\u0001%\u0001&\u0001&\u0005&\u00df\b&\n&\f&\u00e2"+
		"\t&\u0001\'\u0001\'\u0005\'\u00e6\b\'\n\'\f\'\u00e9\t\'\u0001(\u0004("+
		"\u00ec\b(\u000b(\f(\u00ed\u0001)\u0005)\u00f1\b)\n)\f)\u00f4\t)\u0001"+
		")\u0003)\u00f7\b)\u0001)\u0004)\u00fa\b)\u000b)\f)\u00fb\u0000\u0000*"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'O(Q)S*\u0001\u0000\b\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0001"+
		"\u0000az\u0004\u000009AZ__az\u0001\u0000AZ\u0003\u000009AZaz\u0001\u0000"+
		"09\u0001\u0000..\u0104\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000"+
		"S\u0001\u0000\u0000\u0000\u0001U\u0001\u0000\u0000\u0000\u0003^\u0001"+
		"\u0000\u0000\u0000\u0005f\u0001\u0000\u0000\u0000\u0007j\u0001\u0000\u0000"+
		"\u0000\tp\u0001\u0000\u0000\u0000\u000bu\u0001\u0000\u0000\u0000\r{\u0001"+
		"\u0000\u0000\u0000\u000f\u0082\u0001\u0000\u0000\u0000\u0011\u0086\u0001"+
		"\u0000\u0000\u0000\u0013\u008b\u0001\u0000\u0000\u0000\u0015\u0091\u0001"+
		"\u0000\u0000\u0000\u0017\u0093\u0001\u0000\u0000\u0000\u0019\u0095\u0001"+
		"\u0000\u0000\u0000\u001b\u0097\u0001\u0000\u0000\u0000\u001d\u0099\u0001"+
		"\u0000\u0000\u0000\u001f\u009b\u0001\u0000\u0000\u0000!\u009d\u0001\u0000"+
		"\u0000\u0000#\u009f\u0001\u0000\u0000\u0000%\u00a1\u0001\u0000\u0000\u0000"+
		"\'\u00a3\u0001\u0000\u0000\u0000)\u00a5\u0001\u0000\u0000\u0000+\u00a7"+
		"\u0001\u0000\u0000\u0000-\u00aa\u0001\u0000\u0000\u0000/\u00ad\u0001\u0000"+
		"\u0000\u00001\u00b0\u0001\u0000\u0000\u00003\u00b3\u0001\u0000\u0000\u0000"+
		"5\u00b5\u0001\u0000\u0000\u00007\u00b7\u0001\u0000\u0000\u00009\u00ba"+
		"\u0001\u0000\u0000\u0000;\u00bd\u0001\u0000\u0000\u0000=\u00bf\u0001\u0000"+
		"\u0000\u0000?\u00c1\u0001\u0000\u0000\u0000A\u00c3\u0001\u0000\u0000\u0000"+
		"C\u00c5\u0001\u0000\u0000\u0000E\u00c7\u0001\u0000\u0000\u0000G\u00ca"+
		"\u0001\u0000\u0000\u0000I\u00cd\u0001\u0000\u0000\u0000K\u00d3\u0001\u0000"+
		"\u0000\u0000M\u00dc\u0001\u0000\u0000\u0000O\u00e3\u0001\u0000\u0000\u0000"+
		"Q\u00eb\u0001\u0000\u0000\u0000S\u00f6\u0001\u0000\u0000\u0000UV\u0005"+
		"f\u0000\u0000VW\u0005u\u0000\u0000WX\u0005n\u0000\u0000XY\u0005c\u0000"+
		"\u0000YZ\u0005t\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005o\u0000\u0000"+
		"\\]\u0005n\u0000\u0000]\u0002\u0001\u0000\u0000\u0000^_\u0005b\u0000\u0000"+
		"_`\u0005o\u0000\u0000`a\u0005o\u0000\u0000ab\u0005l\u0000\u0000bc\u0005"+
		"e\u0000\u0000cd\u0005a\u0000\u0000de\u0005n\u0000\u0000e\u0004\u0001\u0000"+
		"\u0000\u0000fg\u0005i\u0000\u0000gh\u0005n\u0000\u0000hi\u0005t\u0000"+
		"\u0000i\u0006\u0001\u0000\u0000\u0000jk\u0005f\u0000\u0000kl\u0005l\u0000"+
		"\u0000lm\u0005o\u0000\u0000mn\u0005a\u0000\u0000no\u0005t\u0000\u0000"+
		"o\b\u0001\u0000\u0000\u0000pq\u0005m\u0000\u0000qr\u0005a\u0000\u0000"+
		"rs\u0005i\u0000\u0000st\u0005n\u0000\u0000t\n\u0001\u0000\u0000\u0000"+
		"uv\u0005p\u0000\u0000vw\u0005r\u0000\u0000wx\u0005i\u0000\u0000xy\u0005"+
		"n\u0000\u0000yz\u0005t\u0000\u0000z\f\u0001\u0000\u0000\u0000{|\u0005"+
		"r\u0000\u0000|}\u0005e\u0000\u0000}~\u0005t\u0000\u0000~\u007f\u0005u"+
		"\u0000\u0000\u007f\u0080\u0005r\u0000\u0000\u0080\u0081\u0005n\u0000\u0000"+
		"\u0081\u000e\u0001\u0000\u0000\u0000\u0082\u0083\u0005f\u0000\u0000\u0083"+
		"\u0084\u0005o\u0000\u0000\u0084\u0085\u0005r\u0000\u0000\u0085\u0010\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005t\u0000\u0000\u0087\u0088\u0005r\u0000"+
		"\u0000\u0088\u0089\u0005u\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a"+
		"\u0012\u0001\u0000\u0000\u0000\u008b\u008c\u0005f\u0000\u0000\u008c\u008d"+
		"\u0005a\u0000\u0000\u008d\u008e\u0005l\u0000\u0000\u008e\u008f\u0005s"+
		"\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090\u0014\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005(\u0000\u0000\u0092\u0016\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005)\u0000\u0000\u0094\u0018\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005:\u0000\u0000\u0096\u001a\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005,\u0000\u0000\u0098\u001c\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"{\u0000\u0000\u009a\u001e\u0001\u0000\u0000\u0000\u009b\u009c\u0005}\u0000"+
		"\u0000\u009c \u0001\u0000\u0000\u0000\u009d\u009e\u0005;\u0000\u0000\u009e"+
		"\"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005=\u0000\u0000\u00a0$\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005[\u0000\u0000\u00a2&\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005]\u0000\u0000\u00a4(\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005?\u0000\u0000\u00a6*\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"=\u0000\u0000\u00a8\u00a9\u0005>\u0000\u0000\u00a9,\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005|\u0000\u0000\u00ab\u00ac\u0005|\u0000\u0000\u00ac"+
		".\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005&\u0000\u0000\u00ae\u00af\u0005"+
		"&\u0000\u0000\u00af0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005=\u0000"+
		"\u0000\u00b1\u00b2\u0005=\u0000\u0000\u00b22\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0005>\u0000\u0000\u00b44\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"<\u0000\u0000\u00b66\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005>\u0000"+
		"\u0000\u00b8\u00b9\u0005=\u0000\u0000\u00b98\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005<\u0000\u0000\u00bb\u00bc\u0005=\u0000\u0000\u00bc:\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005+\u0000\u0000\u00be<\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005-\u0000\u0000\u00c0>\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005*\u0000\u0000\u00c2@\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"/\u0000\u0000\u00c4B\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005%\u0000"+
		"\u0000\u00c6D\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005!\u0000\u0000\u00c8"+
		"\u00c9\u0005=\u0000\u0000\u00c9F\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005"+
		"!\u0000\u0000\u00cbH\u0001\u0000\u0000\u0000\u00cc\u00ce\u0007\u0000\u0000"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0006$\u0000\u0000"+
		"\u00d2J\u0001\u0000\u0000\u0000\u00d3\u00d7\u0005#\u0000\u0000\u00d4\u00d6"+
		"\b\u0001\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0006%\u0000\u0000\u00dbL\u0001\u0000\u0000"+
		"\u0000\u00dc\u00e0\u0007\u0002\u0000\u0000\u00dd\u00df\u0007\u0003\u0000"+
		"\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1N\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e7\u0007\u0004\u0000\u0000\u00e4\u00e6\u0007\u0005\u0000\u0000"+
		"\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8P\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ec\u0007\u0006\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00eeR\u0001\u0000\u0000\u0000\u00ef\u00f1"+
		"\u0007\u0006\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f7\u0007\u0007\u0000\u0000\u00f6\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fa\u0007\u0006\u0000\u0000\u00f9\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fcT\u0001"+
		"\u0000\u0000\u0000\t\u0000\u00cf\u00d7\u00e0\u00e7\u00ed\u00f2\u00f6\u00fb"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}