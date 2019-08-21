// Generated from /home/joaovperin/Projetos/Feevale/Compilers/NOTES_pt_BR/Aula_003-20190820/tst/HogwartsGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HogwartsGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, WS=39, 
		DEC_SEP=40, VARIAVEL=41, INTEIRO=42, REAL=43, HOUSE_NAME=44;
	public static final int
		RULE_programa = 0, RULE_houses = 1, RULE_house = 2, RULE_alunos = 3, RULE_aluno = 4, 
		RULE_comandos = 5, RULE_comando = 6, RULE_cmd_revelio = 7, RULE_cmd_petrificus = 8, 
		RULE_cmd_protego = 9, RULE_cmd_homenum = 10, RULE_cmd_expelliarmus = 11, 
		RULE_cmd_impedimenta = 12, RULE_cmd_leviosa = 13, RULE_expressao = 14, 
		RULE_termo = 15, RULE_fator = 16, RULE_condicao = 17;
	public static final String[] ruleNames = {
		"programa", "houses", "house", "alunos", "aluno", "comandos", "comando", 
		"cmd_revelio", "cmd_petrificus", "cmd_protego", "cmd_homenum", "cmd_expelliarmus", 
		"cmd_impedimenta", "cmd_leviosa", "expressao", "termo", "fator", "condicao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'HOUSES'", "'HOGWARTS'", "'Albus'", "'Dumbledore'", "'@'", "'$'", 
		"','", "'revelio'", "'('", "')'", "'petrificus'", "'totalus'", "'['", 
		"']'", "'protego'", "'lumos'", "'homenum'", "'expelliarmus'", "'avada'", 
		"'kedavra'", "'crucio'", "'break'", "'wingardium'", "'leviosa'", "'alohomora'", 
		"'reparo'", "'dissendium'", "'sectumsempra'", "'aguamenti'", "'diffindo'", 
		"'confundo'", "':-)'", "':-('", "':-o'", "':-x'", "':-|'", "';-]'", null, 
		null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "WS", "DEC_SEP", "VARIAVEL", "INTEIRO", "REAL", "HOUSE_NAME"
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
	public String getGrammarFileName() { return "HogwartsGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HogwartsGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public HousesContext houses() {
			return getRuleContext(HousesContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			houses();
			setState(38);
			match(T__1);
			setState(39);
			comandos();
			setState(40);
			match(T__2);
			setState(41);
			match(T__3);
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

	public static class HousesContext extends ParserRuleContext {
		public HouseContext house() {
			return getRuleContext(HouseContext.class,0);
		}
		public HousesContext houses() {
			return getRuleContext(HousesContext.class,0);
		}
		public HousesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_houses; }
	}

	public final HousesContext houses() throws RecognitionException {
		HousesContext _localctx = new HousesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_houses);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				house();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				house();
				setState(45);
				match(T__4);
				setState(46);
				houses();
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

	public static class HouseContext extends ParserRuleContext {
		public TerminalNode HOUSE_NAME() { return getToken(HogwartsGrammarParser.HOUSE_NAME, 0); }
		public AlunosContext alunos() {
			return getRuleContext(AlunosContext.class,0);
		}
		public HouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_house; }
	}

	public final HouseContext house() throws RecognitionException {
		HouseContext _localctx = new HouseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_house);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(HOUSE_NAME);
			setState(51);
			alunos();
			setState(52);
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

	public static class AlunosContext extends ParserRuleContext {
		public AlunoContext aluno() {
			return getRuleContext(AlunoContext.class,0);
		}
		public AlunosContext alunos() {
			return getRuleContext(AlunosContext.class,0);
		}
		public AlunosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alunos; }
	}

	public final AlunosContext alunos() throws RecognitionException {
		AlunosContext _localctx = new AlunosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alunos);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				aluno();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				aluno();
				setState(56);
				match(T__6);
				setState(57);
				alunos();
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

	public static class AlunoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HogwartsGrammarParser.ID, 0); }
		public AlunoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aluno; }
	}

	public final AlunoContext aluno() throws RecognitionException {
		AlunoContext _localctx = new AlunoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ID);
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

	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandos);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				comando();
				setState(64);
				match(DEC_SEP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				comando();
				setState(67);
				match(DEC_SEP);
				setState(68);
				comandos();
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

	public static class ComandoContext extends ParserRuleContext {
		public Cmd_revelioContext cmd_revelio() {
			return getRuleContext(Cmd_revelioContext.class,0);
		}
		public Cmd_petrificusContext cmd_petrificus() {
			return getRuleContext(Cmd_petrificusContext.class,0);
		}
		public Cmd_protegoContext cmd_protego() {
			return getRuleContext(Cmd_protegoContext.class,0);
		}
		public Cmd_homenumContext cmd_homenum() {
			return getRuleContext(Cmd_homenumContext.class,0);
		}
		public Cmd_expelliarmusContext cmd_expelliarmus() {
			return getRuleContext(Cmd_expelliarmusContext.class,0);
		}
		public Cmd_leviosaContext cmd_leviosa() {
			return getRuleContext(Cmd_leviosaContext.class,0);
		}
		public Cmd_impedimentaContext cmd_impedimenta() {
			return getRuleContext(Cmd_impedimentaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				cmd_revelio();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				cmd_petrificus();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				cmd_protego();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				cmd_homenum();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				cmd_expelliarmus();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				cmd_leviosa(0);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				cmd_impedimenta();
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

	public static class Cmd_revelioContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Cmd_revelioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_revelio; }
	}

	public final Cmd_revelioContext cmd_revelio() throws RecognitionException {
		Cmd_revelioContext _localctx = new Cmd_revelioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd_revelio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__7);
			setState(82);
			match(T__8);
			setState(83);
			expressao(0);
			setState(84);
			match(T__9);
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

	public static class Cmd_petrificusContext extends ParserRuleContext {
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Cmd_petrificusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_petrificus; }
	}

	public final Cmd_petrificusContext cmd_petrificus() throws RecognitionException {
		Cmd_petrificusContext _localctx = new Cmd_petrificusContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd_petrificus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__10);
			setState(87);
			match(T__11);
			setState(88);
			match(T__8);
			setState(89);
			condicao();
			setState(90);
			match(T__9);
			setState(91);
			match(T__12);
			setState(92);
			comandos();
			setState(93);
			match(T__13);
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

	public static class Cmd_protegoContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(HogwartsGrammarParser.VARIAVEL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Cmd_protegoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_protego; }
	}

	public final Cmd_protegoContext cmd_protego() throws RecognitionException {
		Cmd_protegoContext _localctx = new Cmd_protegoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmd_protego);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__14);
			setState(96);
			match(VARIAVEL);
			setState(97);
			match(T__15);
			setState(98);
			expressao(0);
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

	public static class Cmd_homenumContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(HogwartsGrammarParser.VARIAVEL, 0); }
		public Cmd_homenumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_homenum; }
	}

	public final Cmd_homenumContext cmd_homenum() throws RecognitionException {
		Cmd_homenumContext _localctx = new Cmd_homenumContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmd_homenum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__16);
			setState(101);
			match(T__7);
			setState(102);
			match(T__8);
			setState(103);
			match(VARIAVEL);
			setState(104);
			match(T__9);
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

	public static class Cmd_expelliarmusContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(HogwartsGrammarParser.VARIAVEL, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Cmd_expelliarmusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_expelliarmus; }
	}

	public final Cmd_expelliarmusContext cmd_expelliarmus() throws RecognitionException {
		Cmd_expelliarmusContext _localctx = new Cmd_expelliarmusContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmd_expelliarmus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__17);
			setState(107);
			match(VARIAVEL);
			setState(108);
			match(T__18);
			setState(109);
			match(T__19);
			setState(110);
			expressao(0);
			setState(111);
			match(T__20);
			setState(112);
			expressao(0);
			setState(113);
			match(T__12);
			setState(114);
			comandos();
			setState(115);
			match(T__13);
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

	public static class Cmd_impedimentaContext extends ParserRuleContext {
		public Cmd_impedimentaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_impedimenta; }
	}

	public final Cmd_impedimentaContext cmd_impedimenta() throws RecognitionException {
		Cmd_impedimentaContext _localctx = new Cmd_impedimentaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmd_impedimenta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__21);
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

	public static class Cmd_leviosaContext extends ParserRuleContext {
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Cmd_leviosaContext cmd_leviosa() {
			return getRuleContext(Cmd_leviosaContext.class,0);
		}
		public Cmd_leviosaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_leviosa; }
	}

	public final Cmd_leviosaContext cmd_leviosa() throws RecognitionException {
		return cmd_leviosa(0);
	}

	private Cmd_leviosaContext cmd_leviosa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cmd_leviosaContext _localctx = new Cmd_leviosaContext(_ctx, _parentState);
		Cmd_leviosaContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_cmd_leviosa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120);
			match(T__22);
			setState(121);
			match(T__23);
			setState(122);
			match(T__8);
			setState(123);
			condicao();
			setState(124);
			match(T__9);
			setState(125);
			match(T__12);
			setState(126);
			comandos();
			setState(127);
			match(T__13);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cmd_leviosaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cmd_leviosa);
					setState(129);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(130);
					match(T__24);
					setState(131);
					match(T__12);
					setState(132);
					comandos();
					setState(133);
					match(T__13);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(141);
			termo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(143);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(144);
						match(T__25);
						setState(145);
						termo(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(146);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(147);
						match(T__26);
						setState(148);
						termo(0);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(149);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(150);
						match(T__27);
						setState(151);
						termo(0);
						}
						break;
					}
					} 
				}
				setState(156);
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

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		return termo(0);
	}

	private TermoContext termo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermoContext _localctx = new TermoContext(_ctx, _parentState);
		TermoContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_termo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(158);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(161);
						match(T__28);
						setState(162);
						fator();
						}
						break;
					case 2:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						match(T__29);
						setState(165);
						fator();
						}
						break;
					case 3:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						match(T__30);
						setState(168);
						fator();
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(HogwartsGrammarParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(HogwartsGrammarParser.REAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fator);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(INTEIRO);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(REAL);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__8);
				setState(177);
				expressao(0);
				setState(178);
				match(T__9);
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

	public static class CondicaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicao);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				expressao(0);
				setState(183);
				match(T__31);
				setState(184);
				expressao(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				expressao(0);
				setState(187);
				match(T__32);
				setState(188);
				expressao(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				expressao(0);
				setState(191);
				match(T__33);
				setState(192);
				expressao(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				expressao(0);
				setState(195);
				match(T__34);
				setState(196);
				expressao(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				expressao(0);
				setState(199);
				match(T__35);
				setState(200);
				expressao(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				expressao(0);
				setState(203);
				match(T__36);
				setState(204);
				expressao(0);
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
		case 13:
			return cmd_leviosa_sempred((Cmd_leviosaContext)_localctx, predIndex);
		case 14:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 15:
			return termo_sempred((TermoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cmd_leviosa_sempred(Cmd_leviosaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termo_sempred(TermoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00d3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7I\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bR\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u008a\n\17\f\17\16\17\u008d\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u009b\n\20\f\20"+
		"\16\20\u009e\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\7\21\u00ac\n\21\f\21\16\21\u00af\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00b7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00d1\n\23\3\23\2\5\34\36 \24\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$\2\2\2\u00d7\2&\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\b=\3\2"+
		"\2\2\n?\3\2\2\2\fH\3\2\2\2\16Q\3\2\2\2\20S\3\2\2\2\22X\3\2\2\2\24a\3\2"+
		"\2\2\26f\3\2\2\2\30l\3\2\2\2\32w\3\2\2\2\34y\3\2\2\2\36\u008e\3\2\2\2"+
		" \u009f\3\2\2\2\"\u00b6\3\2\2\2$\u00d0\3\2\2\2&\'\7\3\2\2\'(\5\4\3\2("+
		")\7\4\2\2)*\5\f\7\2*+\7\5\2\2+,\7\6\2\2,\3\3\2\2\2-\63\5\6\4\2./\5\6\4"+
		"\2/\60\7\7\2\2\60\61\5\4\3\2\61\63\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2\63"+
		"\5\3\2\2\2\64\65\7.\2\2\65\66\5\b\5\2\66\67\7\b\2\2\67\7\3\2\2\28>\5\n"+
		"\6\29:\5\n\6\2:;\7\t\2\2;<\5\b\5\2<>\3\2\2\2=8\3\2\2\2=9\3\2\2\2>\t\3"+
		"\2\2\2?@\7(\2\2@\13\3\2\2\2AB\5\16\b\2BC\7*\2\2CI\3\2\2\2DE\5\16\b\2E"+
		"F\7*\2\2FG\5\f\7\2GI\3\2\2\2HA\3\2\2\2HD\3\2\2\2I\r\3\2\2\2JR\5\20\t\2"+
		"KR\5\22\n\2LR\5\24\13\2MR\5\26\f\2NR\5\30\r\2OR\5\34\17\2PR\5\32\16\2"+
		"QJ\3\2\2\2QK\3\2\2\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2"+
		"R\17\3\2\2\2ST\7\n\2\2TU\7\13\2\2UV\5\36\20\2VW\7\f\2\2W\21\3\2\2\2XY"+
		"\7\r\2\2YZ\7\16\2\2Z[\7\13\2\2[\\\5$\23\2\\]\7\f\2\2]^\7\17\2\2^_\5\f"+
		"\7\2_`\7\20\2\2`\23\3\2\2\2ab\7\21\2\2bc\7+\2\2cd\7\22\2\2de\5\36\20\2"+
		"e\25\3\2\2\2fg\7\23\2\2gh\7\n\2\2hi\7\13\2\2ij\7+\2\2jk\7\f\2\2k\27\3"+
		"\2\2\2lm\7\24\2\2mn\7+\2\2no\7\25\2\2op\7\26\2\2pq\5\36\20\2qr\7\27\2"+
		"\2rs\5\36\20\2st\7\17\2\2tu\5\f\7\2uv\7\20\2\2v\31\3\2\2\2wx\7\30\2\2"+
		"x\33\3\2\2\2yz\b\17\1\2z{\7\31\2\2{|\7\32\2\2|}\7\13\2\2}~\5$\23\2~\177"+
		"\7\f\2\2\177\u0080\7\17\2\2\u0080\u0081\5\f\7\2\u0081\u0082\7\20\2\2\u0082"+
		"\u008b\3\2\2\2\u0083\u0084\f\3\2\2\u0084\u0085\7\33\2\2\u0085\u0086\7"+
		"\17\2\2\u0086\u0087\5\f\7\2\u0087\u0088\7\20\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0083\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\35\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\b\20\1\2\u008f\u0090"+
		"\5 \21\2\u0090\u009c\3\2\2\2\u0091\u0092\f\6\2\2\u0092\u0093\7\34\2\2"+
		"\u0093\u009b\5 \21\2\u0094\u0095\f\5\2\2\u0095\u0096\7\35\2\2\u0096\u009b"+
		"\5 \21\2\u0097\u0098\f\4\2\2\u0098\u0099\7\36\2\2\u0099\u009b\5 \21\2"+
		"\u009a\u0091\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0097\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\37\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\b\21\1\2\u00a0\u00a1\5\"\22\2\u00a1\u00ad\3"+
		"\2\2\2\u00a2\u00a3\f\6\2\2\u00a3\u00a4\7\37\2\2\u00a4\u00ac\5\"\22\2\u00a5"+
		"\u00a6\f\5\2\2\u00a6\u00a7\7 \2\2\u00a7\u00ac\5\"\22\2\u00a8\u00a9\f\4"+
		"\2\2\u00a9\u00aa\7!\2\2\u00aa\u00ac\5\"\22\2\u00ab\u00a2\3\2\2\2\u00ab"+
		"\u00a5\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae!\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b7"+
		"\7,\2\2\u00b1\u00b7\7-\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\5\36\20\2"+
		"\u00b4\u00b5\7\f\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1"+
		"\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7#\3\2\2\2\u00b8\u00b9\5\36\20\2\u00b9"+
		"\u00ba\7\"\2\2\u00ba\u00bb\5\36\20\2\u00bb\u00d1\3\2\2\2\u00bc\u00bd\5"+
		"\36\20\2\u00bd\u00be\7#\2\2\u00be\u00bf\5\36\20\2\u00bf\u00d1\3\2\2\2"+
		"\u00c0\u00c1\5\36\20\2\u00c1\u00c2\7$\2\2\u00c2\u00c3\5\36\20\2\u00c3"+
		"\u00d1\3\2\2\2\u00c4\u00c5\5\36\20\2\u00c5\u00c6\7%\2\2\u00c6\u00c7\5"+
		"\36\20\2\u00c7\u00d1\3\2\2\2\u00c8\u00c9\5\36\20\2\u00c9\u00ca\7&\2\2"+
		"\u00ca\u00cb\5\36\20\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd\5\36\20\2\u00cd"+
		"\u00ce\7\'\2\2\u00ce\u00cf\5\36\20\2\u00cf\u00d1\3\2\2\2\u00d0\u00b8\3"+
		"\2\2\2\u00d0\u00bc\3\2\2\2\u00d0\u00c0\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d0"+
		"\u00c8\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1%\3\2\2\2\r\62=HQ\u008b\u009a"+
		"\u009c\u00ab\u00ad\u00b6\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}