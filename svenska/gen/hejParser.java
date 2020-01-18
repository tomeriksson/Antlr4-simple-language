// Generated from /Users/tomeriksson/Downloads/svenska/src/grammar/hej.g4 by ANTLR 4.7.2

package svenska.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hejParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, INT=12, WS=13;
	public static final int
		RULE_code = 0, RULE_påstående = 1, RULE_deklarering = 2, RULE_tilldelning = 3, 
		RULE_utskrift = 4, RULE_uttryck = 5, RULE_atom = 6, RULE_upprepning = 7, 
		RULE_slut = 8, RULE_räkna = 9, RULE_addera = 10, RULE_subtrahera = 11, 
		RULE_villkor = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "påstående", "deklarering", "tilldelning", "utskrift", "uttryck", 
			"atom", "upprepning", "slut", "räkna", "addera", "subtrahera", "villkor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'variabel'", "'='", "'skriv'", "'upprepa'", "'slut'", "'+'", 
			"'-'", "'mindre'", "'h\u00F6gre'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"INT", "WS"
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
	public String getGrammarFileName() { return "hej.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hejParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public PåståendeContext påstående() {
			return getRuleContext(PåståendeContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(hejParser.EOF, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				påstående();
				setState(27);
				match(T__0);
				setState(28);
				code();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				påstående();
				setState(31);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(EOF);
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

	public static class PåståendeContext extends ParserRuleContext {
		public DeklareringContext deklarering() {
			return getRuleContext(DeklareringContext.class,0);
		}
		public TilldelningContext tilldelning() {
			return getRuleContext(TilldelningContext.class,0);
		}
		public UtskriftContext utskrift() {
			return getRuleContext(UtskriftContext.class,0);
		}
		public UpprepningContext upprepning() {
			return getRuleContext(UpprepningContext.class,0);
		}
		public PåståendeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_påstående; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterPåstående(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitPåstående(this);
		}
	}

	public final PåståendeContext påstående() throws RecognitionException {
		PåståendeContext _localctx = new PåståendeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_påstående);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				deklarering();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				tilldelning();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				utskrift();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				upprepning();
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

	public static class DeklareringContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(hejParser.ID, 0); }
		public RäknaContext räkna() {
			return getRuleContext(RäknaContext.class,0);
		}
		public DeklareringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklarering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterDeklarering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitDeklarering(this);
		}
	}

	public final DeklareringContext deklarering() throws RecognitionException {
		DeklareringContext _localctx = new DeklareringContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_deklarering);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__1);
				setState(43);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__1);
				setState(45);
				match(ID);
				setState(46);
				räkna();
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

	public static class TilldelningContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(hejParser.ID, 0); }
		public UttryckContext uttryck() {
			return getRuleContext(UttryckContext.class,0);
		}
		public TilldelningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tilldelning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterTilldelning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitTilldelning(this);
		}
	}

	public final TilldelningContext tilldelning() throws RecognitionException {
		TilldelningContext _localctx = new TilldelningContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tilldelning);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(50);
			match(T__2);
			setState(51);
			uttryck();
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

	public static class UtskriftContext extends ParserRuleContext {
		public UttryckContext uttryck() {
			return getRuleContext(UttryckContext.class,0);
		}
		public UtskriftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utskrift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterUtskrift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitUtskrift(this);
		}
	}

	public final UtskriftContext utskrift() throws RecognitionException {
		UtskriftContext _localctx = new UtskriftContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_utskrift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__3);
			setState(54);
			uttryck();
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

	public static class UttryckContext extends ParserRuleContext {
		public RäknaContext räkna() {
			return getRuleContext(RäknaContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public VillkorContext villkor() {
			return getRuleContext(VillkorContext.class,0);
		}
		public UttryckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uttryck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterUttryck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitUttryck(this);
		}
	}

	public final UttryckContext uttryck() throws RecognitionException {
		UttryckContext _localctx = new UttryckContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_uttryck);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				räkna();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				villkor();
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(hejParser.ID, 0); }
		public TerminalNode INT() { return getToken(hejParser.INT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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

	public static class UpprepningContext extends ParserRuleContext {
		public VillkorContext villkor() {
			return getRuleContext(VillkorContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public SlutContext slut() {
			return getRuleContext(SlutContext.class,0);
		}
		public UpprepningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upprepning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterUpprepning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitUpprepning(this);
		}
	}

	public final UpprepningContext upprepning() throws RecognitionException {
		UpprepningContext _localctx = new UpprepningContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_upprepning);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__4);
			setState(64);
			villkor();
			setState(65);
			code();
			setState(66);
			slut();
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

	public static class SlutContext extends ParserRuleContext {
		public SlutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterSlut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitSlut(this);
		}
	}

	public final SlutContext slut() throws RecognitionException {
		SlutContext _localctx = new SlutContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_slut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__5);
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

	public static class RäknaContext extends ParserRuleContext {
		public AdderaContext addera() {
			return getRuleContext(AdderaContext.class,0);
		}
		public SubtraheraContext subtrahera() {
			return getRuleContext(SubtraheraContext.class,0);
		}
		public RäknaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_räkna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterRäkna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitRäkna(this);
		}
	}

	public final RäknaContext räkna() throws RecognitionException {
		RäknaContext _localctx = new RäknaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_räkna);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				addera();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				subtrahera();
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

	public static class AdderaContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public UttryckContext uttryck() {
			return getRuleContext(UttryckContext.class,0);
		}
		public AdderaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterAddera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitAddera(this);
		}
	}

	public final AdderaContext addera() throws RecognitionException {
		AdderaContext _localctx = new AdderaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_addera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			atom();
			setState(75);
			match(T__6);
			setState(76);
			uttryck();
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

	public static class SubtraheraContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public UttryckContext uttryck() {
			return getRuleContext(UttryckContext.class,0);
		}
		public SubtraheraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtrahera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterSubtrahera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitSubtrahera(this);
		}
	}

	public final SubtraheraContext subtrahera() throws RecognitionException {
		SubtraheraContext _localctx = new SubtraheraContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subtrahera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			atom();
			setState(79);
			match(T__7);
			setState(80);
			uttryck();
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

	public static class VillkorContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public VillkorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_villkor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).enterVillkor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hejListener ) ((hejListener)listener).exitVillkor(this);
		}
	}

	public final VillkorContext villkor() throws RecognitionException {
		VillkorContext _localctx = new VillkorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_villkor);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				atom();
				setState(83);
				match(T__8);
				setState(84);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				atom();
				setState(87);
				match(T__9);
				setState(88);
				atom();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2\3\3"+
		"\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\5\13K\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16]\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\2\3\3\2\r\16\2[\2$\3\2\2\2\4*\3\2\2\2\6\61\3\2\2\2\b\63\3\2\2\2"+
		"\n\67\3\2\2\2\f=\3\2\2\2\16?\3\2\2\2\20A\3\2\2\2\22F\3\2\2\2\24J\3\2\2"+
		"\2\26L\3\2\2\2\30P\3\2\2\2\32\\\3\2\2\2\34\35\5\4\3\2\35\36\7\3\2\2\36"+
		"\37\5\2\2\2\37%\3\2\2\2 !\5\4\3\2!\"\7\3\2\2\"%\3\2\2\2#%\7\2\2\3$\34"+
		"\3\2\2\2$ \3\2\2\2$#\3\2\2\2%\3\3\2\2\2&+\5\6\4\2\'+\5\b\5\2(+\5\n\6\2"+
		")+\5\20\t\2*&\3\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\7\4"+
		"\2\2-\62\7\r\2\2./\7\4\2\2/\60\7\r\2\2\60\62\5\24\13\2\61,\3\2\2\2\61"+
		".\3\2\2\2\62\7\3\2\2\2\63\64\7\r\2\2\64\65\7\5\2\2\65\66\5\f\7\2\66\t"+
		"\3\2\2\2\678\7\6\2\289\5\f\7\29\13\3\2\2\2:>\5\24\13\2;>\5\16\b\2<>\5"+
		"\32\16\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\r\3\2\2\2?@\t\2\2\2@\17\3\2\2"+
		"\2AB\7\7\2\2BC\5\32\16\2CD\5\2\2\2DE\5\22\n\2E\21\3\2\2\2FG\7\b\2\2G\23"+
		"\3\2\2\2HK\5\26\f\2IK\5\30\r\2JH\3\2\2\2JI\3\2\2\2K\25\3\2\2\2LM\5\16"+
		"\b\2MN\7\t\2\2NO\5\f\7\2O\27\3\2\2\2PQ\5\16\b\2QR\7\n\2\2RS\5\f\7\2S\31"+
		"\3\2\2\2TU\5\16\b\2UV\7\13\2\2VW\5\16\b\2W]\3\2\2\2XY\5\16\b\2YZ\7\f\2"+
		"\2Z[\5\16\b\2[]\3\2\2\2\\T\3\2\2\2\\X\3\2\2\2]\33\3\2\2\2\b$*\61=J\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}