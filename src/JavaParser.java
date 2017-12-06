// Generated from /home/fox/IdeaProjects/MT3/src/Java.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, VARNAME=8, NUM=9, 
		BOOL=10, TRUE=11, FALSE=12, LPAREN=13, RPAREN=14, LBRACE=15, RBRACE=16, 
		SEMI=17, SEMICOLUMN=18, PP=19, MM=20, SUM=21, SUB=22, MUL=23, DIV=24, 
		MOD=25, AS=26, GT=27, LS=28, GE=29, LE=30, NE=31, EQ=32, OR=33, AND=34, 
		NOT=35, WS=36;
	public static final int
		RULE_mainClass = 0, RULE_code = 1, RULE_instructions = 2, RULE_code_return = 3, 
		RULE_initialization = 4, RULE_assignment = 5, RULE_expression_sum = 6, 
		RULE_expression_mul = 7, RULE_expression_atom = 8, RULE_loop = 9, RULE_condition_or = 10, 
		RULE_condition_and = 11, RULE_condition_atom = 12, RULE_ifelse = 13, RULE_int_op = 14;
	public static final String[] ruleNames = {
		"mainClass", "code", "instructions", "code_return", "initialization", 
		"assignment", "expression_sum", "expression_mul", "expression_atom", "loop", 
		"condition_or", "condition_and", "condition_atom", "ifelse", "int_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class Test'", "'public static void main(String[] args) '", "'return;'", 
		"'while'", "'if'", "'else'", "'int'", null, null, null, "'true'", "'false'", 
		"'('", "')'", "'{'", "'}'", "','", "';'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'=='", 
		"'||'", "'&&'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "INT", "VARNAME", "NUM", "BOOL", 
		"TRUE", "FALSE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", "SEMICOLUMN", 
		"PP", "MM", "SUM", "SUB", "MUL", "DIV", "MOD", "AS", "GT", "LS", "GE", 
		"LE", "NE", "EQ", "OR", "AND", "NOT", "WS"
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
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(JavaParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(JavaParser.LBRACE, i);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public Code_returnContext code_return() {
			return getRuleContext(Code_returnContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(JavaParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(JavaParser.RBRACE, i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			match(LBRACE);
			setState(32);
			match(T__1);
			setState(33);
			match(LBRACE);
			setState(34);
			instructions();
			setState(35);
			code_return();
			setState(36);
			match(RBRACE);
			setState(37);
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

	public static class CodeContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			instructions();
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

	public static class InstructionsContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public IfelseContext ifelse() {
			return getRuleContext(IfelseContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instructions);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case INT:
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(41);
					initialization();
					}
					break;
				case VARNAME:
					{
					setState(42);
					assignment();
					}
					break;
				case T__3:
					{
					setState(43);
					loop();
					}
					break;
				case T__4:
					{
					setState(44);
					ifelse();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(47);
				instructions();
				}
				break;
			case T__2:
			case RBRACE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Code_returnContext extends ParserRuleContext {
		public Code_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCode_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCode_return(this);
		}
	}

	public final Code_returnContext code_return() throws RecognitionException {
		Code_returnContext _localctx = new Code_returnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_code_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
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

	public static class InitializationContext extends ParserRuleContext {
		public Token name;
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode SEMICOLUMN() { return getToken(JavaParser.SEMICOLUMN, 0); }
		public TerminalNode VARNAME() { return getToken(JavaParser.VARNAME, 0); }
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInitialization(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(INT);
			setState(55);
			((InitializationContext)_localctx).name = match(VARNAME);
			setState(56);
			match(SEMICOLUMN);
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
		public Token name;
		public TerminalNode AS() { return getToken(JavaParser.AS, 0); }
		public Expression_sumContext expression_sum() {
			return getRuleContext(Expression_sumContext.class,0);
		}
		public TerminalNode SEMICOLUMN() { return getToken(JavaParser.SEMICOLUMN, 0); }
		public TerminalNode VARNAME() { return getToken(JavaParser.VARNAME, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((AssignmentContext)_localctx).name = match(VARNAME);
			setState(59);
			match(AS);
			setState(60);
			expression_sum();
			setState(61);
			match(SEMICOLUMN);
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

	public static class Expression_sumContext extends ParserRuleContext {
		public Token sum;
		public Token sub;
		public List<Expression_mulContext> expression_mul() {
			return getRuleContexts(Expression_mulContext.class);
		}
		public Expression_mulContext expression_mul(int i) {
			return getRuleContext(Expression_mulContext.class,i);
		}
		public List<TerminalNode> SUM() { return getTokens(JavaParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(JavaParser.SUM, i);
		}
		public List<TerminalNode> SUB() { return getTokens(JavaParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(JavaParser.SUB, i);
		}
		public Expression_sumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression_sum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression_sum(this);
		}
	}

	public final Expression_sumContext expression_sum() throws RecognitionException {
		Expression_sumContext _localctx = new Expression_sumContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression_sum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					expression_mul();
					setState(66);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SUM:
						{
						setState(64);
						((Expression_sumContext)_localctx).sum = match(SUM);
						}
						break;
					case SUB:
						{
						setState(65);
						((Expression_sumContext)_localctx).sub = match(SUB);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(73);
			expression_mul();
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

	public static class Expression_mulContext extends ParserRuleContext {
		public Token mul;
		public Token div;
		public Token mod;
		public List<Expression_atomContext> expression_atom() {
			return getRuleContexts(Expression_atomContext.class);
		}
		public Expression_atomContext expression_atom(int i) {
			return getRuleContext(Expression_atomContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(JavaParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(JavaParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(JavaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(JavaParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(JavaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(JavaParser.MOD, i);
		}
		public Expression_mulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression_mul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression_mul(this);
		}
	}

	public final Expression_mulContext expression_mul() throws RecognitionException {
		Expression_mulContext _localctx = new Expression_mulContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression_mul);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					expression_atom();
					setState(79);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MUL:
						{
						setState(76);
						((Expression_mulContext)_localctx).mul = match(MUL);
						}
						break;
					case DIV:
						{
						setState(77);
						((Expression_mulContext)_localctx).div = match(DIV);
						}
						break;
					case MOD:
						{
						setState(78);
						((Expression_mulContext)_localctx).mod = match(MOD);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(86);
			expression_atom();
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

	public static class Expression_atomContext extends ParserRuleContext {
		public Token name;
		public Token num;
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public Expression_sumContext expression_sum() {
			return getRuleContext(Expression_sumContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode VARNAME() { return getToken(JavaParser.VARNAME, 0); }
		public TerminalNode NUM() { return getToken(JavaParser.NUM, 0); }
		public Expression_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression_atom(this);
		}
	}

	public final Expression_atomContext expression_atom() throws RecognitionException {
		Expression_atomContext _localctx = new Expression_atomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression_atom);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(LPAREN);
				setState(89);
				expression_sum();
				setState(90);
				match(RPAREN);
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((Expression_atomContext)_localctx).name = match(VARNAME);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				((Expression_atomContext)_localctx).num = match(NUM);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public Condition_orContext condition_or() {
			return getRuleContext(Condition_orContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__3);
			setState(97);
			match(LPAREN);
			setState(98);
			condition_or();
			setState(99);
			match(RPAREN);
			setState(100);
			match(LBRACE);
			setState(101);
			code();
			setState(102);
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

	public static class Condition_orContext extends ParserRuleContext {
		public Token or;
		public Condition_andContext expr;
		public List<Condition_andContext> condition_and() {
			return getRuleContexts(Condition_andContext.class);
		}
		public Condition_andContext condition_and(int i) {
			return getRuleContext(Condition_andContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JavaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JavaParser.OR, i);
		}
		public Condition_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCondition_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCondition_or(this);
		}
	}

	public final Condition_orContext condition_or() throws RecognitionException {
		Condition_orContext _localctx = new Condition_orContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition_or);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					condition_and();
					setState(105);
					((Condition_orContext)_localctx).or = match(OR);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(112);
			((Condition_orContext)_localctx).expr = condition_and();
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

	public static class Condition_andContext extends ParserRuleContext {
		public Token and;
		public Condition_atomContext expr;
		public List<Condition_atomContext> condition_atom() {
			return getRuleContexts(Condition_atomContext.class);
		}
		public Condition_atomContext condition_atom(int i) {
			return getRuleContext(Condition_atomContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JavaParser.AND, i);
		}
		public Condition_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCondition_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCondition_and(this);
		}
	}

	public final Condition_andContext condition_and() throws RecognitionException {
		Condition_andContext _localctx = new Condition_andContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_and);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					condition_atom();
					setState(115);
					((Condition_andContext)_localctx).and = match(AND);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(122);
			((Condition_andContext)_localctx).expr = condition_atom();
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

	public static class Condition_atomContext extends ParserRuleContext {
		public Int_opContext op;
		public Token bconst;
		public List<Expression_sumContext> expression_sum() {
			return getRuleContexts(Expression_sumContext.class);
		}
		public Expression_sumContext expression_sum(int i) {
			return getRuleContext(Expression_sumContext.class,i);
		}
		public Int_opContext int_op() {
			return getRuleContext(Int_opContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(JavaParser.BOOL, 0); }
		public TerminalNode NOT() { return getToken(JavaParser.NOT, 0); }
		public Condition_atomContext condition_atom() {
			return getRuleContext(Condition_atomContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public Condition_orContext condition_or() {
			return getRuleContext(Condition_orContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public Condition_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCondition_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCondition_atom(this);
		}
	}

	public final Condition_atomContext condition_atom() throws RecognitionException {
		Condition_atomContext _localctx = new Condition_atomContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition_atom);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				expression_sum();
				setState(125);
				((Condition_atomContext)_localctx).op = int_op();
				setState(126);
				expression_sum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				((Condition_atomContext)_localctx).bconst = match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(NOT);
				setState(130);
				condition_atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(LPAREN);
				setState(132);
				condition_or();
				setState(133);
				match(RPAREN);
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

	public static class IfelseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public Condition_orContext condition_or() {
			return getRuleContext(Condition_orContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(JavaParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(JavaParser.LBRACE, i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(JavaParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(JavaParser.RBRACE, i);
		}
		public IfelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIfelse(this);
		}
	}

	public final IfelseContext ifelse() throws RecognitionException {
		IfelseContext _localctx = new IfelseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__4);
			setState(138);
			match(LPAREN);
			setState(139);
			condition_or();
			setState(140);
			match(RPAREN);
			setState(141);
			match(LBRACE);
			setState(142);
			code();
			setState(143);
			match(RBRACE);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(144);
				match(T__5);
				setState(145);
				match(LBRACE);
				setState(146);
				code();
				setState(147);
				match(RBRACE);
				}
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

	public static class Int_opContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TerminalNode LS() { return getToken(JavaParser.LS, 0); }
		public TerminalNode GE() { return getToken(JavaParser.GE, 0); }
		public TerminalNode LE() { return getToken(JavaParser.LE, 0); }
		public TerminalNode NE() { return getToken(JavaParser.NE, 0); }
		public TerminalNode EQ() { return getToken(JavaParser.EQ, 0); }
		public Int_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInt_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInt_op(this);
		}
	}

	public final Int_opContext int_op() throws RecognitionException {
		Int_opContext _localctx = new Int_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_int_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LS) | (1L << GE) | (1L << LE) | (1L << NE) | (1L << EQ))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u009c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\5\4\65"+
		"\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bE\n\b"+
		"\7\bG\n\b\f\b\16\bJ\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tR\n\t\7\tT\n\t\f\t"+
		"\16\tW\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\na\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\fn\n\f\f\f\16\fq\13\f\3\f\3\f\3"+
		"\r\3\r\3\r\7\rx\n\r\f\r\16\r{\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u008a\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0098\n\17\3\20\3\20\3\20\2\2"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\35\"\2\u009d\2 \3\2"+
		"\2\2\4)\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f<\3\2\2\2\16H\3"+
		"\2\2\2\20U\3\2\2\2\22`\3\2\2\2\24b\3\2\2\2\26o\3\2\2\2\30y\3\2\2\2\32"+
		"\u0089\3\2\2\2\34\u008b\3\2\2\2\36\u0099\3\2\2\2 !\7\3\2\2!\"\7\21\2\2"+
		"\"#\7\4\2\2#$\7\21\2\2$%\5\6\4\2%&\5\b\5\2&\'\7\22\2\2\'(\7\22\2\2(\3"+
		"\3\2\2\2)*\5\6\4\2*\5\3\2\2\2+\60\5\n\6\2,\60\5\f\7\2-\60\5\24\13\2.\60"+
		"\5\34\17\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61\62"+
		"\5\6\4\2\62\65\3\2\2\2\63\65\3\2\2\2\64/\3\2\2\2\64\63\3\2\2\2\65\7\3"+
		"\2\2\2\66\67\7\5\2\2\67\t\3\2\2\289\7\t\2\29:\7\n\2\2:;\7\24\2\2;\13\3"+
		"\2\2\2<=\7\n\2\2=>\7\34\2\2>?\5\16\b\2?@\7\24\2\2@\r\3\2\2\2AD\5\20\t"+
		"\2BE\7\27\2\2CE\7\30\2\2DB\3\2\2\2DC\3\2\2\2EG\3\2\2\2FA\3\2\2\2GJ\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\5\20\t\2L\17\3\2\2\2MQ"+
		"\5\22\n\2NR\7\31\2\2OR\7\32\2\2PR\7\33\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2"+
		"\2RT\3\2\2\2SM\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2"+
		"\2XY\5\22\n\2Y\21\3\2\2\2Z[\7\17\2\2[\\\5\16\b\2\\]\7\20\2\2]a\3\2\2\2"+
		"^a\7\n\2\2_a\7\13\2\2`Z\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\23\3\2\2\2bc\7\6"+
		"\2\2cd\7\17\2\2de\5\26\f\2ef\7\20\2\2fg\7\21\2\2gh\5\4\3\2hi\7\22\2\2"+
		"i\25\3\2\2\2jk\5\30\r\2kl\7#\2\2ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\5\30\r\2s\27\3\2\2\2tu\5\32\16\2uv"+
		"\7$\2\2vx\3\2\2\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y"+
		"\3\2\2\2|}\5\32\16\2}\31\3\2\2\2~\177\5\16\b\2\177\u0080\5\36\20\2\u0080"+
		"\u0081\5\16\b\2\u0081\u008a\3\2\2\2\u0082\u008a\7\f\2\2\u0083\u0084\7"+
		"%\2\2\u0084\u008a\5\32\16\2\u0085\u0086\7\17\2\2\u0086\u0087\5\26\f\2"+
		"\u0087\u0088\7\20\2\2\u0088\u008a\3\2\2\2\u0089~\3\2\2\2\u0089\u0082\3"+
		"\2\2\2\u0089\u0083\3\2\2\2\u0089\u0085\3\2\2\2\u008a\33\3\2\2\2\u008b"+
		"\u008c\7\7\2\2\u008c\u008d\7\17\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7"+
		"\20\2\2\u008f\u0090\7\21\2\2\u0090\u0091\5\4\3\2\u0091\u0097\7\22\2\2"+
		"\u0092\u0093\7\b\2\2\u0093\u0094\7\21\2\2\u0094\u0095\5\4\3\2\u0095\u0096"+
		"\7\22\2\2\u0096\u0098\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\35\3\2\2\2\u0099\u009a\t\2\2\2\u009a\37\3\2\2\2\r/\64DHQU`oy\u0089"+
		"\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}