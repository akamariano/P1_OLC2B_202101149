// Generated from /home/mariano/OLC2/Lexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, STRING=3, BOOL=4, CHAR=5, DECLARATION_VAR=6, DECLARATION_LET=7, 
		SEMICOLON=8, COLON=9, DIGIT_PRIMITIVE=10, STRING_PRIMITIVE=11, ID_PRIMITIVE=12, 
		IS_=13, PLUS=14, MINUS=15, MULTIPLY=16, DIVIDE=17, MODULO=18, EQUALS=19, 
		NOT_EQUALS=20, GREATER=21, GREATER_EQUALS=22, LESS=23, LESS_EQUALS=24, 
		AND=25, OR=26, LPAREN=27, RPAREN=28, NIL=29, TRU=30, FAL=31, WHITESPACE=32, 
		COMMENT=33, LINE_COMMENT=34, QUESTION=35, PRINT=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "STRING", "BOOL", "CHAR", "DECLARATION_VAR", "DECLARATION_LET", 
			"SEMICOLON", "COLON", "DIGIT_PRIMITIVE", "STRING_PRIMITIVE", "ID_PRIMITIVE", 
			"IS_", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "EQUALS", "NOT_EQUALS", 
			"GREATER", "GREATER_EQUALS", "LESS", "LESS_EQUALS", "AND", "OR", "LPAREN", 
			"RPAREN", "NIL", "TRU", "FAL", "WHITESPACE", "COMMENT", "LINE_COMMENT", 
			"QUESTION", "PRINT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Int'", "'Float'", "'String'", "'Bool'", "'Character'", "'var'", 
			"'let'", "';'", "':'", null, null, null, "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
			"'('", "')'", "'nil'", "'true'", "'false'", null, null, null, "'?'", 
			"'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "STRING", "BOOL", "CHAR", "DECLARATION_VAR", "DECLARATION_LET", 
			"SEMICOLON", "COLON", "DIGIT_PRIMITIVE", "STRING_PRIMITIVE", "ID_PRIMITIVE", 
			"IS_", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "EQUALS", "NOT_EQUALS", 
			"GREATER", "GREATER_EQUALS", "LESS", "LESS_EQUALS", "AND", "OR", "LPAREN", 
			"RPAREN", "NIL", "TRU", "FAL", "WHITESPACE", "COMMENT", "LINE_COMMENT", 
			"QUESTION", "PRINT"
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


	public Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\6\13{\n\13\r\13\16\13|\3\13\3\13\6\13\u0081\n\13\r\13\16\13\u0082"+
		"\5\13\u0085\n\13\3\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f\3\f\3\f\3\r"+
		"\3\r\7\r\u0092\n\r\f\r\16\r\u0095\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3!\6!\u00cd\n!\r!\16!\u00ce\3!\3!\3\"\3\"\3\"\3\"\7\"\u00d7"+
		"\n\"\f\"\16\"\u00da\13\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#\u00e5\n#\f"+
		"#\16#\u00e8\13#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\u00d8\2\'\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\2\3\2\t\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f"+
		"\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u00fc\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3"+
		"M\3\2\2\2\5Q\3\2\2\2\7W\3\2\2\2\t^\3\2\2\2\13c\3\2\2\2\rm\3\2\2\2\17q"+
		"\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25z\3\2\2\2\27\u0086\3\2\2\2\31\u008f"+
		"\3\2\2\2\33\u0096\3\2\2\2\35\u0098\3\2\2\2\37\u009a\3\2\2\2!\u009c\3\2"+
		"\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2\'\u00a2\3\2\2\2)\u00a5\3\2\2\2+\u00a8"+
		"\3\2\2\2-\u00aa\3\2\2\2/\u00ad\3\2\2\2\61\u00af\3\2\2\2\63\u00b2\3\2\2"+
		"\2\65\u00b5\3\2\2\2\67\u00b8\3\2\2\29\u00ba\3\2\2\2;\u00bc\3\2\2\2=\u00c0"+
		"\3\2\2\2?\u00c5\3\2\2\2A\u00cc\3\2\2\2C\u00d2\3\2\2\2E\u00e0\3\2\2\2G"+
		"\u00eb\3\2\2\2I\u00ed\3\2\2\2K\u00f3\3\2\2\2MN\7K\2\2NO\7p\2\2OP\7v\2"+
		"\2P\4\3\2\2\2QR\7H\2\2RS\7n\2\2ST\7q\2\2TU\7c\2\2UV\7v\2\2V\6\3\2\2\2"+
		"WX\7U\2\2XY\7v\2\2YZ\7t\2\2Z[\7k\2\2[\\\7p\2\2\\]\7i\2\2]\b\3\2\2\2^_"+
		"\7D\2\2_`\7q\2\2`a\7q\2\2ab\7n\2\2b\n\3\2\2\2cd\7E\2\2de\7j\2\2ef\7c\2"+
		"\2fg\7t\2\2gh\7c\2\2hi\7e\2\2ij\7v\2\2jk\7g\2\2kl\7t\2\2l\f\3\2\2\2mn"+
		"\7x\2\2no\7c\2\2op\7t\2\2p\16\3\2\2\2qr\7n\2\2rs\7g\2\2st\7v\2\2t\20\3"+
		"\2\2\2uv\7=\2\2v\22\3\2\2\2wx\7<\2\2x\24\3\2\2\2y{\t\2\2\2zy\3\2\2\2{"+
		"|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0084\3\2\2\2~\u0080\7\60\2\2\177\u0081"+
		"\t\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084~\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\26\3\2\2\2\u0086\u008a\7$\2\2\u0087\u0089\n\3\2\2\u0088\u0087\3"+
		"\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7$\2\2\u008e\30\3\2\2\2"+
		"\u008f\u0093\t\4\2\2\u0090\u0092\t\5\2\2\u0091\u0090\3\2\2\2\u0092\u0095"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\32\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\7?\2\2\u0097\34\3\2\2\2\u0098\u0099\7-\2\2"+
		"\u0099\36\3\2\2\2\u009a\u009b\7/\2\2\u009b \3\2\2\2\u009c\u009d\7,\2\2"+
		"\u009d\"\3\2\2\2\u009e\u009f\7\61\2\2\u009f$\3\2\2\2\u00a0\u00a1\7\'\2"+
		"\2\u00a1&\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3\u00a4\7?\2\2\u00a4(\3\2\2\2"+
		"\u00a5\u00a6\7#\2\2\u00a6\u00a7\7?\2\2\u00a7*\3\2\2\2\u00a8\u00a9\7@\2"+
		"\2\u00a9,\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\u00ac\7?\2\2\u00ac.\3\2\2\2"+
		"\u00ad\u00ae\7>\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7"+
		"?\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7(\2\2\u00b3\u00b4\7(\2\2\u00b4\64"+
		"\3\2\2\2\u00b5\u00b6\7~\2\2\u00b6\u00b7\7~\2\2\u00b7\66\3\2\2\2\u00b8"+
		"\u00b9\7*\2\2\u00b98\3\2\2\2\u00ba\u00bb\7+\2\2\u00bb:\3\2\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7n\2\2\u00bf<\3\2\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		">\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7n\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca@\3\2\2\2\u00cb\u00cd\t\6\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b!\2\2\u00d1B\3\2\2\2\u00d2\u00d3"+
		"\7\61\2\2\u00d3\u00d4\7,\2\2\u00d4\u00d8\3\2\2\2\u00d5\u00d7\13\2\2\2"+
		"\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7,\2\2\u00dc"+
		"\u00dd\7\61\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\"\2\2\u00dfD\3\2\2\2"+
		"\u00e0\u00e1\7\61\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e6\3\2\2\2\u00e3\u00e5"+
		"\n\7\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\b#"+
		"\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7A\2\2\u00ecH\3\2\2\2\u00ed\u00ee\7r\2"+
		"\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2"+
		"\7v\2\2\u00f2J\3\2\2\2\u00f3\u00f4\7^\2\2\u00f4\u00f5\t\b\2\2\u00f5L\3"+
		"\2\2\2\13\2|\u0082\u0084\u008a\u0093\u00ce\u00d8\u00e6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}