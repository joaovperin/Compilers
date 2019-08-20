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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42;
	public static final int
		RULE_id = 0, RULE_cmd_impedimenta = 1, RULE_variavel = 2, RULE_epsilon = 3, 
		RULE_inteiro = 4, RULE_real = 5, RULE_programa = 6, RULE_houses = 7, RULE_house = 8, 
		RULE_alunos = 9, RULE_aluno = 10, RULE_comandos = 11, RULE_comando = 12, 
		RULE_cmd_revelio = 13, RULE_cmd_petrificus = 14, RULE_cmd_protego = 15, 
		RULE_cmd_homenum = 16, RULE_cmd_expelliarmus = 17, RULE_cmd_leviosa = 18, 
		RULE_else = 19, RULE_expressao = 20, RULE_termo = 21, RULE_fator = 22, 
		RULE_condicao = 23;
	public static final String[] ruleNames = {
		"id", "cmd_impedimenta", "variavel", "epsilon", "inteiro", "real", "programa", 
		"houses", "house", "alunos", "aluno", "comandos", "comando", "cmd_revelio", 
		"cmd_petrificus", "cmd_protego", "cmd_homenum", "cmd_expelliarmus", "cmd_leviosa", 
		"else", "expressao", "termo", "fator", "condicao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TO_WRITE'", "'HOUSES'", "'HOGWARTS'", "'Albus'", "'Dumbledore'", 
		"'@'", "'Gryffindor'", "'$'", "'Ravenclaw'", "'Slytherin'", "'Hufflepuff'", 
		"','", "'.'", "'revelio'", "'('", "')'", "'petrificus'", "'totalus'", 
		"'['", "']'", "'protego'", "'lumos'", "'homenum'", "'expelliarmus'", "'avada'", 
		"'kedavra'", "'crucio'", "'wingardium'", "'leviosa'", "'alohomora'", "'reparo'", 
		"'dissendium'", "'sectumsempra'", "'aguamenti'", "'diffindo'", "'confundo'", 
		"':-)'", "':-('", "':-o'", "':-x'", "':-|'", "';-]'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
	public static class IdContext extends ParserRuleContext {
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
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
		enterRule(_localctx, 2, RULE_cmd_impedimenta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
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

	public static class VariavelContext extends ParserRuleContext {
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
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

	public static class EpsilonContext extends ParserRuleContext {
		public EpsilonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epsilon; }
	}

	public final EpsilonContext epsilon() throws RecognitionException {
		EpsilonContext _localctx = new EpsilonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_epsilon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
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

	public static class InteiroContext extends ParserRuleContext {
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
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

	public static class RealContext extends ParserRuleContext {
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
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
		enterRule(_localctx, 12, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__1);
			setState(61);
			houses();
			setState(62);
			match(T__2);
			setState(63);
			comandos();
			setState(64);
			match(T__3);
			setState(65);
			match(T__4);
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
		enterRule(_localctx, 14, RULE_houses);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				house();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				house();
				setState(69);
				match(T__5);
				setState(70);
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
		enterRule(_localctx, 16, RULE_house);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__6);
				setState(75);
				alunos();
				setState(76);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__8);
				setState(79);
				alunos();
				setState(80);
				match(T__7);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(T__9);
				setState(83);
				alunos();
				setState(84);
				match(T__7);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(T__10);
				setState(87);
				alunos();
				setState(88);
				match(T__7);
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
		enterRule(_localctx, 18, RULE_alunos);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				aluno();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				aluno();
				setState(94);
				match(T__11);
				setState(95);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AlunoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aluno; }
	}

	public final AlunoContext aluno() throws RecognitionException {
		AlunoContext _localctx = new AlunoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_aluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			id();
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
		enterRule(_localctx, 22, RULE_comandos);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				comando();
				setState(102);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				comando();
				setState(105);
				match(T__12);
				setState(106);
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
		enterRule(_localctx, 24, RULE_comando);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				cmd_revelio();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				cmd_petrificus();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				cmd_protego();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				cmd_homenum();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				cmd_expelliarmus();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				cmd_leviosa();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
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
		enterRule(_localctx, 26, RULE_cmd_revelio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__13);
			setState(120);
			match(T__14);
			setState(121);
			expressao(0);
			setState(122);
			match(T__15);
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
		enterRule(_localctx, 28, RULE_cmd_petrificus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__16);
			setState(125);
			match(T__17);
			setState(126);
			match(T__14);
			setState(127);
			condicao();
			setState(128);
			match(T__15);
			setState(129);
			match(T__18);
			setState(130);
			comandos();
			setState(131);
			match(T__19);
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
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_cmd_protego);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__20);
			setState(134);
			variavel();
			setState(135);
			match(T__21);
			setState(136);
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
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Cmd_homenumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_homenum; }
	}

	public final Cmd_homenumContext cmd_homenum() throws RecognitionException {
		Cmd_homenumContext _localctx = new Cmd_homenumContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmd_homenum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__22);
			setState(139);
			match(T__13);
			setState(140);
			match(T__14);
			setState(141);
			variavel();
			setState(142);
			match(T__15);
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
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_cmd_expelliarmus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__23);
			setState(145);
			variavel();
			setState(146);
			match(T__24);
			setState(147);
			match(T__25);
			setState(148);
			expressao(0);
			setState(149);
			match(T__26);
			setState(150);
			expressao(0);
			setState(151);
			match(T__18);
			setState(152);
			comandos();
			setState(153);
			match(T__19);
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
		public ElseContext else() {
			return getRuleContext(ElseContext.class,0);
		}
		public Cmd_leviosaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_leviosa; }
	}

	public final Cmd_leviosaContext cmd_leviosa() throws RecognitionException {
		Cmd_leviosaContext _localctx = new Cmd_leviosaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmd_leviosa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__27);
			setState(156);
			match(T__28);
			setState(157);
			match(T__14);
			setState(158);
			condicao();
			setState(159);
			match(T__15);
			setState(160);
			match(T__18);
			setState(161);
			comandos();
			setState(162);
			match(T__19);
			setState(163);
			else();
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

	public static class ElseContext extends ParserRuleContext {
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
	}

	public final ElseContext else() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_else);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				epsilon();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__29);
				setState(167);
				match(T__18);
				setState(168);
				comandos();
				setState(169);
				match(T__19);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(174);
			termo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(176);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(177);
						match(T__30);
						setState(178);
						termo(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(179);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(180);
						match(T__31);
						setState(181);
						termo(0);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(182);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(183);
						match(T__32);
						setState(184);
						termo(0);
						}
						break;
					}
					} 
				}
				setState(189);
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

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_termo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					fator();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(197);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(198);
						match(T__33);
						setState(199);
						fator();
						}
						break;
					case 2:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(200);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(201);
						match(T__34);
						setState(202);
						fator();
						}
						break;
					case 3:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(203);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(204);
						match(T__35);
						setState(205);
						fator();
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_fator);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				inteiro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				real();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__14);
				setState(214);
				expressao(0);
				setState(215);
				match(T__15);
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
		enterRule(_localctx, 46, RULE_condicao);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				expressao(0);
				setState(220);
				match(T__36);
				setState(221);
				expressao(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				expressao(0);
				setState(224);
				match(T__37);
				setState(225);
				expressao(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				expressao(0);
				setState(228);
				match(T__38);
				setState(229);
				expressao(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				expressao(0);
				setState(232);
				match(T__39);
				setState(233);
				expressao(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				expressao(0);
				setState(236);
				match(T__40);
				setState(237);
				expressao(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				expressao(0);
				setState(240);
				match(T__41);
				setState(241);
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
		case 20:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 21:
			return termo_sempred((TermoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termo_sempred(TermoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tK\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n]\n\n\3\13\3\13\3\13\3\13\3\13\5\13"+
		"d\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\ro\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16x\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00ae\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u00bc\n\26\f\26\16\26\u00bf\13\26\3\27\3\27\7\27\u00c3"+
		"\n\27\f\27\16\27\u00c6\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\7\27\u00d1\n\27\f\27\16\27\u00d4\13\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u00dc\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00f6\n\31\3\31\2\4*,\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\2\2\2\u00fa\2\62\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\b8\3\2"+
		"\2\2\n:\3\2\2\2\f<\3\2\2\2\16>\3\2\2\2\20J\3\2\2\2\22\\\3\2\2\2\24c\3"+
		"\2\2\2\26e\3\2\2\2\30n\3\2\2\2\32w\3\2\2\2\34y\3\2\2\2\36~\3\2\2\2 \u0087"+
		"\3\2\2\2\"\u008c\3\2\2\2$\u0092\3\2\2\2&\u009d\3\2\2\2(\u00ad\3\2\2\2"+
		"*\u00af\3\2\2\2,\u00c0\3\2\2\2.\u00db\3\2\2\2\60\u00f5\3\2\2\2\62\63\7"+
		"\3\2\2\63\3\3\2\2\2\64\65\7\3\2\2\65\5\3\2\2\2\66\67\7\3\2\2\67\7\3\2"+
		"\2\289\7\3\2\29\t\3\2\2\2:;\7\3\2\2;\13\3\2\2\2<=\7\3\2\2=\r\3\2\2\2>"+
		"?\7\4\2\2?@\5\20\t\2@A\7\5\2\2AB\5\30\r\2BC\7\6\2\2CD\7\7\2\2D\17\3\2"+
		"\2\2EK\5\22\n\2FG\5\22\n\2GH\7\b\2\2HI\5\20\t\2IK\3\2\2\2JE\3\2\2\2JF"+
		"\3\2\2\2K\21\3\2\2\2LM\7\t\2\2MN\5\24\13\2NO\7\n\2\2O]\3\2\2\2PQ\7\13"+
		"\2\2QR\5\24\13\2RS\7\n\2\2S]\3\2\2\2TU\7\f\2\2UV\5\24\13\2VW\7\n\2\2W"+
		"]\3\2\2\2XY\7\r\2\2YZ\5\24\13\2Z[\7\n\2\2[]\3\2\2\2\\L\3\2\2\2\\P\3\2"+
		"\2\2\\T\3\2\2\2\\X\3\2\2\2]\23\3\2\2\2^d\5\26\f\2_`\5\26\f\2`a\7\16\2"+
		"\2ab\5\24\13\2bd\3\2\2\2c^\3\2\2\2c_\3\2\2\2d\25\3\2\2\2ef\5\2\2\2f\27"+
		"\3\2\2\2gh\5\32\16\2hi\7\17\2\2io\3\2\2\2jk\5\32\16\2kl\7\17\2\2lm\5\30"+
		"\r\2mo\3\2\2\2ng\3\2\2\2nj\3\2\2\2o\31\3\2\2\2px\5\34\17\2qx\5\36\20\2"+
		"rx\5 \21\2sx\5\"\22\2tx\5$\23\2ux\5&\24\2vx\5\4\3\2wp\3\2\2\2wq\3\2\2"+
		"\2wr\3\2\2\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\33\3\2\2\2yz\7\20"+
		"\2\2z{\7\21\2\2{|\5*\26\2|}\7\22\2\2}\35\3\2\2\2~\177\7\23\2\2\177\u0080"+
		"\7\24\2\2\u0080\u0081\7\21\2\2\u0081\u0082\5\60\31\2\u0082\u0083\7\22"+
		"\2\2\u0083\u0084\7\25\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7\26\2\2\u0086"+
		"\37\3\2\2\2\u0087\u0088\7\27\2\2\u0088\u0089\5\6\4\2\u0089\u008a\7\30"+
		"\2\2\u008a\u008b\5*\26\2\u008b!\3\2\2\2\u008c\u008d\7\31\2\2\u008d\u008e"+
		"\7\20\2\2\u008e\u008f\7\21\2\2\u008f\u0090\5\6\4\2\u0090\u0091\7\22\2"+
		"\2\u0091#\3\2\2\2\u0092\u0093\7\32\2\2\u0093\u0094\5\6\4\2\u0094\u0095"+
		"\7\33\2\2\u0095\u0096\7\34\2\2\u0096\u0097\5*\26\2\u0097\u0098\7\35\2"+
		"\2\u0098\u0099\5*\26\2\u0099\u009a\7\25\2\2\u009a\u009b\5\30\r\2\u009b"+
		"\u009c\7\26\2\2\u009c%\3\2\2\2\u009d\u009e\7\36\2\2\u009e\u009f\7\37\2"+
		"\2\u009f\u00a0\7\21\2\2\u00a0\u00a1\5\60\31\2\u00a1\u00a2\7\22\2\2\u00a2"+
		"\u00a3\7\25\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6"+
		"\5(\25\2\u00a6\'\3\2\2\2\u00a7\u00ae\5\b\5\2\u00a8\u00a9\7 \2\2\u00a9"+
		"\u00aa\7\25\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\7\26\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae)\3\2\2\2\u00af"+
		"\u00b0\b\26\1\2\u00b0\u00b1\5,\27\2\u00b1\u00bd\3\2\2\2\u00b2\u00b3\f"+
		"\6\2\2\u00b3\u00b4\7!\2\2\u00b4\u00bc\5,\27\2\u00b5\u00b6\f\5\2\2\u00b6"+
		"\u00b7\7\"\2\2\u00b7\u00bc\5,\27\2\u00b8\u00b9\f\4\2\2\u00b9\u00ba\7#"+
		"\2\2\u00ba\u00bc\5,\27\2\u00bb\u00b2\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be+\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c4\b\27\1\2\u00c1\u00c3"+
		"\5.\30\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00d2\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\f\6"+
		"\2\2\u00c8\u00c9\7$\2\2\u00c9\u00d1\5.\30\2\u00ca\u00cb\f\5\2\2\u00cb"+
		"\u00cc\7%\2\2\u00cc\u00d1\5.\30\2\u00cd\u00ce\f\4\2\2\u00ce\u00cf\7&\2"+
		"\2\u00cf\u00d1\5.\30\2\u00d0\u00c7\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"-\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00dc\5\n\6\2\u00d6\u00dc\5\f\7\2"+
		"\u00d7\u00d8\7\21\2\2\u00d8\u00d9\5*\26\2\u00d9\u00da\7\22\2\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc"+
		"/\3\2\2\2\u00dd\u00de\5*\26\2\u00de\u00df\7\'\2\2\u00df\u00e0\5*\26\2"+
		"\u00e0\u00f6\3\2\2\2\u00e1\u00e2\5*\26\2\u00e2\u00e3\7(\2\2\u00e3\u00e4"+
		"\5*\26\2\u00e4\u00f6\3\2\2\2\u00e5\u00e6\5*\26\2\u00e6\u00e7\7)\2\2\u00e7"+
		"\u00e8\5*\26\2\u00e8\u00f6\3\2\2\2\u00e9\u00ea\5*\26\2\u00ea\u00eb\7*"+
		"\2\2\u00eb\u00ec\5*\26\2\u00ec\u00f6\3\2\2\2\u00ed\u00ee\5*\26\2\u00ee"+
		"\u00ef\7+\2\2\u00ef\u00f0\5*\26\2\u00f0\u00f6\3\2\2\2\u00f1\u00f2\5*\26"+
		"\2\u00f2\u00f3\7,\2\2\u00f3\u00f4\5*\26\2\u00f4\u00f6\3\2\2\2\u00f5\u00dd"+
		"\3\2\2\2\u00f5\u00e1\3\2\2\2\u00f5\u00e5\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5"+
		"\u00ed\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f6\61\3\2\2\2\17J\\cnw\u00ad\u00bb"+
		"\u00bd\u00c4\u00d0\u00d2\u00db\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}