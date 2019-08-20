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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		ID=46, WS=47;
	public static final int
		RULE_cmd_impedimenta = 0, RULE_variavel = 1, RULE_inteiro = 2, RULE_real = 3, 
		RULE_programa = 4, RULE_houses = 5, RULE_house = 6, RULE_alunos = 7, RULE_aluno = 8, 
		RULE_comandos = 9, RULE_comando = 10, RULE_cmd_revelio = 11, RULE_cmd_petrificus = 12, 
		RULE_cmd_protego = 13, RULE_cmd_homenum = 14, RULE_cmd_expelliarmus = 15, 
		RULE_cmd_leviosa = 16, RULE_else = 17, RULE_expressao = 18, RULE_termo = 19, 
		RULE_fator = 20, RULE_condicao = 21;
	public static final String[] ruleNames = {
		"cmd_impedimenta", "variavel", "inteiro", "real", "programa", "houses", 
		"house", "alunos", "aluno", "comandos", "comando", "cmd_revelio", "cmd_petrificus", 
		"cmd_protego", "cmd_homenum", "cmd_expelliarmus", "cmd_leviosa", "else", 
		"expressao", "termo", "fator", "condicao"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'cmd_impedimentaTO_WRITE'", "'variavelTO_WRITE'", "'inteiroTO_WRITE'", 
		"'realTO_WRITE'", "'HOUSES'", "'HOGWARTS'", "'Albus'", "'Dumbledore'", 
		"'@'", "'Gryffindor'", "'$'", "'Ravenclaw'", "'Slytherin'", "'Hufflepuff'", 
		"','", "'.'", "'revelio'", "'('", "')'", "'petrificus'", "'totalus'", 
		"'['", "']'", "'protego'", "'lumos'", "'homenum'", "'expelliarmus'", "'avada'", 
		"'kedavra'", "'crucio'", "'wingardium'", "'leviosa'", "'alohomora'", "'reparo'", 
		"'dissendium'", "'sectumsempra'", "'aguamenti'", "'diffindo'", "'confundo'", 
		"':-)'", "':-('", "':-o'", "':-x'", "':-|'", "';-]'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ID", "WS"
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
	public static class Cmd_impedimentaContext extends ParserRuleContext {
		public Cmd_impedimentaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_impedimenta; }
	}

	public final Cmd_impedimentaContext cmd_impedimenta() throws RecognitionException {
		Cmd_impedimentaContext _localctx = new Cmd_impedimentaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmd_impedimenta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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
		enterRule(_localctx, 2, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__1);
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
		enterRule(_localctx, 4, RULE_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__2);
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
		enterRule(_localctx, 6, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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
		enterRule(_localctx, 8, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__4);
			setState(53);
			houses();
			setState(54);
			match(T__5);
			setState(55);
			comandos();
			setState(56);
			match(T__6);
			setState(57);
			match(T__7);
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
		enterRule(_localctx, 10, RULE_houses);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				house();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				house();
				setState(61);
				match(T__8);
				setState(62);
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
		enterRule(_localctx, 12, RULE_house);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__9);
				setState(67);
				alunos();
				setState(68);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__11);
				setState(71);
				alunos();
				setState(72);
				match(T__10);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(T__12);
				setState(75);
				alunos();
				setState(76);
				match(T__10);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(T__13);
				setState(79);
				alunos();
				setState(80);
				match(T__10);
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
		enterRule(_localctx, 14, RULE_alunos);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				aluno();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				aluno();
				setState(86);
				match(T__14);
				setState(87);
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
		enterRule(_localctx, 16, RULE_aluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		enterRule(_localctx, 18, RULE_comandos);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				comando();
				setState(94);
				match(T__15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				comando();
				setState(97);
				match(T__15);
				setState(98);
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
		enterRule(_localctx, 20, RULE_comando);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				cmd_revelio();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				cmd_petrificus();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				cmd_protego();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				cmd_homenum();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				cmd_expelliarmus();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				cmd_leviosa();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
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
		enterRule(_localctx, 22, RULE_cmd_revelio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__16);
			setState(112);
			match(T__17);
			setState(113);
			expressao(0);
			setState(114);
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
		enterRule(_localctx, 24, RULE_cmd_petrificus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__19);
			setState(117);
			match(T__20);
			setState(118);
			match(T__17);
			setState(119);
			condicao();
			setState(120);
			match(T__18);
			setState(121);
			match(T__21);
			setState(122);
			comandos();
			setState(123);
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
		enterRule(_localctx, 26, RULE_cmd_protego);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__23);
			setState(126);
			variavel();
			setState(127);
			match(T__24);
			setState(128);
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
		enterRule(_localctx, 28, RULE_cmd_homenum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__25);
			setState(131);
			match(T__16);
			setState(132);
			match(T__17);
			setState(133);
			variavel();
			setState(134);
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
		enterRule(_localctx, 30, RULE_cmd_expelliarmus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__26);
			setState(137);
			variavel();
			setState(138);
			match(T__27);
			setState(139);
			match(T__28);
			setState(140);
			expressao(0);
			setState(141);
			match(T__29);
			setState(142);
			expressao(0);
			setState(143);
			match(T__21);
			setState(144);
			comandos();
			setState(145);
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
		enterRule(_localctx, 32, RULE_cmd_leviosa);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__30);
				setState(148);
				match(T__31);
				setState(149);
				match(T__17);
				setState(150);
				condicao();
				setState(151);
				match(T__18);
				setState(152);
				match(T__21);
				setState(153);
				comandos();
				setState(154);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__30);
				setState(157);
				match(T__31);
				setState(158);
				match(T__17);
				setState(159);
				condicao();
				setState(160);
				match(T__18);
				setState(161);
				match(T__21);
				setState(162);
				comandos();
				setState(163);
				match(T__22);
				setState(164);
				else();
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

	public static class ElseContext extends ParserRuleContext {
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
		enterRule(_localctx, 34, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__32);
			setState(169);
			match(T__21);
			setState(170);
			comandos();
			setState(171);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expressao, _p);
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
						match(T__33);
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
						match(T__34);
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
						match(T__35);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_termo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(193);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(194);
						match(T__36);
						setState(195);
						fator();
						}
						break;
					case 2:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(196);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(197);
						match(T__37);
						setState(198);
						fator();
						}
						break;
					case 3:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(199);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(200);
						match(T__38);
						setState(201);
						fator();
						}
						break;
					}
					} 
				}
				setState(206);
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
		enterRule(_localctx, 40, RULE_fator);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				inteiro();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				real();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__17);
				setState(210);
				expressao(0);
				setState(211);
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
		enterRule(_localctx, 42, RULE_condicao);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				expressao(0);
				setState(216);
				match(T__39);
				setState(217);
				expressao(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				expressao(0);
				setState(220);
				match(T__40);
				setState(221);
				expressao(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				expressao(0);
				setState(224);
				match(T__41);
				setState(225);
				expressao(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				expressao(0);
				setState(228);
				match(T__42);
				setState(229);
				expressao(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				expressao(0);
				setState(232);
				match(T__43);
				setState(233);
				expressao(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(235);
				expressao(0);
				setState(236);
				match(T__44);
				setState(237);
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
		case 18:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 19:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00f4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7C\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bU"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13g\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fp\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a9\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00bc\n\24\f\24\16\24\u00bf\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00cd\n\25\f\25\16\25\u00d0\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d8\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f2\n\27\3\27\2\4&(\30\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\2\u00f7\2.\3\2\2\2\4\60\3\2"+
		"\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\fB\3\2\2\2\16T\3\2\2\2\20"+
		"[\3\2\2\2\22]\3\2\2\2\24f\3\2\2\2\26o\3\2\2\2\30q\3\2\2\2\32v\3\2\2\2"+
		"\34\177\3\2\2\2\36\u0084\3\2\2\2 \u008a\3\2\2\2\"\u00a8\3\2\2\2$\u00aa"+
		"\3\2\2\2&\u00af\3\2\2\2(\u00c0\3\2\2\2*\u00d7\3\2\2\2,\u00f1\3\2\2\2."+
		"/\7\3\2\2/\3\3\2\2\2\60\61\7\4\2\2\61\5\3\2\2\2\62\63\7\5\2\2\63\7\3\2"+
		"\2\2\64\65\7\6\2\2\65\t\3\2\2\2\66\67\7\7\2\2\678\5\f\7\289\7\b\2\29:"+
		"\5\24\13\2:;\7\t\2\2;<\7\n\2\2<\13\3\2\2\2=C\5\16\b\2>?\5\16\b\2?@\7\13"+
		"\2\2@A\5\f\7\2AC\3\2\2\2B=\3\2\2\2B>\3\2\2\2C\r\3\2\2\2DE\7\f\2\2EF\5"+
		"\20\t\2FG\7\r\2\2GU\3\2\2\2HI\7\16\2\2IJ\5\20\t\2JK\7\r\2\2KU\3\2\2\2"+
		"LM\7\17\2\2MN\5\20\t\2NO\7\r\2\2OU\3\2\2\2PQ\7\20\2\2QR\5\20\t\2RS\7\r"+
		"\2\2SU\3\2\2\2TD\3\2\2\2TH\3\2\2\2TL\3\2\2\2TP\3\2\2\2U\17\3\2\2\2V\\"+
		"\5\22\n\2WX\5\22\n\2XY\7\21\2\2YZ\5\20\t\2Z\\\3\2\2\2[V\3\2\2\2[W\3\2"+
		"\2\2\\\21\3\2\2\2]^\7\60\2\2^\23\3\2\2\2_`\5\26\f\2`a\7\22\2\2ag\3\2\2"+
		"\2bc\5\26\f\2cd\7\22\2\2de\5\24\13\2eg\3\2\2\2f_\3\2\2\2fb\3\2\2\2g\25"+
		"\3\2\2\2hp\5\30\r\2ip\5\32\16\2jp\5\34\17\2kp\5\36\20\2lp\5 \21\2mp\5"+
		"\"\22\2np\5\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2om"+
		"\3\2\2\2on\3\2\2\2p\27\3\2\2\2qr\7\23\2\2rs\7\24\2\2st\5&\24\2tu\7\25"+
		"\2\2u\31\3\2\2\2vw\7\26\2\2wx\7\27\2\2xy\7\24\2\2yz\5,\27\2z{\7\25\2\2"+
		"{|\7\30\2\2|}\5\24\13\2}~\7\31\2\2~\33\3\2\2\2\177\u0080\7\32\2\2\u0080"+
		"\u0081\5\4\3\2\u0081\u0082\7\33\2\2\u0082\u0083\5&\24\2\u0083\35\3\2\2"+
		"\2\u0084\u0085\7\34\2\2\u0085\u0086\7\23\2\2\u0086\u0087\7\24\2\2\u0087"+
		"\u0088\5\4\3\2\u0088\u0089\7\25\2\2\u0089\37\3\2\2\2\u008a\u008b\7\35"+
		"\2\2\u008b\u008c\5\4\3\2\u008c\u008d\7\36\2\2\u008d\u008e\7\37\2\2\u008e"+
		"\u008f\5&\24\2\u008f\u0090\7 \2\2\u0090\u0091\5&\24\2\u0091\u0092\7\30"+
		"\2\2\u0092\u0093\5\24\13\2\u0093\u0094\7\31\2\2\u0094!\3\2\2\2\u0095\u0096"+
		"\7!\2\2\u0096\u0097\7\"\2\2\u0097\u0098\7\24\2\2\u0098\u0099\5,\27\2\u0099"+
		"\u009a\7\25\2\2\u009a\u009b\7\30\2\2\u009b\u009c\5\24\13\2\u009c\u009d"+
		"\7\31\2\2\u009d\u00a9\3\2\2\2\u009e\u009f\7!\2\2\u009f\u00a0\7\"\2\2\u00a0"+
		"\u00a1\7\24\2\2\u00a1\u00a2\5,\27\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\7"+
		"\30\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\7\31\2\2\u00a6\u00a7\5$\23\2"+
		"\u00a7\u00a9\3\2\2\2\u00a8\u0095\3\2\2\2\u00a8\u009e\3\2\2\2\u00a9#\3"+
		"\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\5\24\13\2\u00ad"+
		"\u00ae\7\31\2\2\u00ae%\3\2\2\2\u00af\u00b0\b\24\1\2\u00b0\u00b1\5(\25"+
		"\2\u00b1\u00bd\3\2\2\2\u00b2\u00b3\f\6\2\2\u00b3\u00b4\7$\2\2\u00b4\u00bc"+
		"\5(\25\2\u00b5\u00b6\f\5\2\2\u00b6\u00b7\7%\2\2\u00b7\u00bc\5(\25\2\u00b8"+
		"\u00b9\f\4\2\2\u00b9\u00ba\7&\2\2\u00ba\u00bc\5(\25\2\u00bb\u00b2\3\2"+
		"\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\'\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\u00c0\u00c1\b\25\1\2\u00c1\u00c2\5*\26\2\u00c2\u00ce\3\2\2\2\u00c3\u00c4"+
		"\f\6\2\2\u00c4\u00c5\7\'\2\2\u00c5\u00cd\5*\26\2\u00c6\u00c7\f\5\2\2\u00c7"+
		"\u00c8\7(\2\2\u00c8\u00cd\5*\26\2\u00c9\u00ca\f\4\2\2\u00ca\u00cb\7)\2"+
		"\2\u00cb\u00cd\5*\26\2\u00cc\u00c3\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c9"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		")\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d8\5\6\4\2\u00d2\u00d8\5\b\5\2"+
		"\u00d3\u00d4\7\24\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\7\25\2\2\u00d6\u00d8"+
		"\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8"+
		"+\3\2\2\2\u00d9\u00da\5&\24\2\u00da\u00db\7*\2\2\u00db\u00dc\5&\24\2\u00dc"+
		"\u00f2\3\2\2\2\u00dd\u00de\5&\24\2\u00de\u00df\7+\2\2\u00df\u00e0\5&\24"+
		"\2\u00e0\u00f2\3\2\2\2\u00e1\u00e2\5&\24\2\u00e2\u00e3\7,\2\2\u00e3\u00e4"+
		"\5&\24\2\u00e4\u00f2\3\2\2\2\u00e5\u00e6\5&\24\2\u00e6\u00e7\7-\2\2\u00e7"+
		"\u00e8\5&\24\2\u00e8\u00f2\3\2\2\2\u00e9\u00ea\5&\24\2\u00ea\u00eb\7."+
		"\2\2\u00eb\u00ec\5&\24\2\u00ec\u00f2\3\2\2\2\u00ed\u00ee\5&\24\2\u00ee"+
		"\u00ef\7/\2\2\u00ef\u00f0\5&\24\2\u00f0\u00f2\3\2\2\2\u00f1\u00d9\3\2"+
		"\2\2\u00f1\u00dd\3\2\2\2\u00f1\u00e1\3\2\2\2\u00f1\u00e5\3\2\2\2\u00f1"+
		"\u00e9\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2-\3\2\2\2\16BT[fo\u00a8\u00bb"+
		"\u00bd\u00cc\u00ce\u00d7\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}