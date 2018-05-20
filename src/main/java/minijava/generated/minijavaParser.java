// Generated from minijava.g4 by ANTLR 4.4

	package minijava.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class minijavaParser extends Parser {
	public static final int
		T__1=1, T__0=2, LBRACKET=3, RBRACKET=4, LBRACE=5, RBRACE=6, LCURLY=7, 
		RCURLY=8, SEMICOLON=9, COLON=10, DOT=11, CLASS=12, EXTENDS=13, PUBLIC=14, 
		STATIC=15, VOID=16, MAIN=17, INT=18, BOOLEAN=19, WHILE=20, IF=21, ELSE=22, 
		PRINT=23, NEW=24, THIS=25, RETURN=26, EQUAL_ASSIGN=27, AND=28, LESSTHAN=29, 
		PLUS=30, MINUS=31, TIMES=32, NOT=33, TRUE=34, FALSE=35, INTEGER_LITERAL=36, 
		IDENTIFIER=37, WS=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'length'", "'String'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "';'", "','", "'.'", "'class'", "'extends'", "'public'", "'static'", 
		"'void'", "'main'", "'int'", "'boolean'", "'while'", "'if'", "'else'", 
		"'System.out.println'", "'new'", "'this'", "'return'", "'='", "'&&'", 
		"'<'", "'+'", "'-'", "'*'", "'!'", "'true'", "'false'", "INTEGER_LITERAL", 
		"IDENTIFIER", "WS"
	};
	public static final int
		RULE_goal = 0, RULE_program = 1, RULE_mainClass = 2, RULE_classDeclaration = 3, 
		RULE_methodDeclList = 4, RULE_varDeclList = 5, RULE_formalList = 6, RULE_stmList = 7, 
		RULE_varDeclaration = 8, RULE_methodDeclaration = 9, RULE_formal = 10, 
		RULE_type = 11, RULE_statement = 12, RULE_expression = 13, RULE_callArguments = 14;
	public static final String[] ruleNames = {
		"goal", "program", "mainClass", "classDeclaration", "methodDeclList", 
		"varDeclList", "formalList", "stmList", "varDeclaration", "methodDeclaration", 
		"formal", "type", "statement", "expression", "callArguments"
	};

	@Override
	public String getGrammarFileName() { return "minijava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	public minijavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN);
	}
	public static class GoalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(minijavaParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitGoal(this);
		}
	}

	@RuleVersion(0)
	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); program();
			setState(31); match(EOF);
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
		public List<? extends ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitProgram(this);
		}
	}

	@RuleVersion(0)
	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); mainClass();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(34); classDeclaration();
				}
				}
				setState(39);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode RBRACKET() { return getToken(minijavaParser.RBRACKET, 0); }
		public TerminalNode LBRACE() { return getToken(minijavaParser.LBRACE, 0); }
		public List<? extends TerminalNode> LCURLY() { return getTokens(minijavaParser.LCURLY); }
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public TerminalNode MAIN() { return getToken(minijavaParser.MAIN, 0); }
		public TerminalNode RBRACE() { return getToken(minijavaParser.RBRACE, 0); }
		public TerminalNode STATIC() { return getToken(minijavaParser.STATIC, 0); }
		public TerminalNode RCURLY(int i) {
			return getToken(minijavaParser.RCURLY, i);
		}
		public TerminalNode VOID() { return getToken(minijavaParser.VOID, 0); }
		public List<? extends TerminalNode> RCURLY() { return getTokens(minijavaParser.RCURLY); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(minijavaParser.IDENTIFIER, i);
		}
		public TerminalNode LCURLY(int i) {
			return getToken(minijavaParser.LCURLY, i);
		}
		public TerminalNode PUBLIC() { return getToken(minijavaParser.PUBLIC, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(minijavaParser.CLASS, 0); }
		public List<? extends TerminalNode> IDENTIFIER() { return getTokens(minijavaParser.IDENTIFIER); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitMainClass(this);
		}
	}

	@RuleVersion(0)
	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(CLASS);
			setState(41); match(IDENTIFIER);
			setState(42); match(LCURLY);
			setState(43); match(PUBLIC);
			setState(44); match(STATIC);
			setState(45); match(VOID);
			setState(46); match(MAIN);
			setState(47); match(LBRACKET);
			setState(48); match(T__0);
			setState(49); match(LBRACE);
			setState(50); match(RBRACE);
			setState(51); match(IDENTIFIER);
			setState(52); match(RBRACKET);
			setState(53); match(LCURLY);
			setState(54); statement();
			setState(55); match(RCURLY);
			setState(56); match(RCURLY);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclContext extends ClassDeclarationContext {
		public MethodDeclListContext methodDeclList() {
			return getRuleContext(MethodDeclListContext.class,0);
		}
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(minijavaParser.RCURLY, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(minijavaParser.IDENTIFIER, i);
		}
		public TerminalNode LCURLY() { return getToken(minijavaParser.LCURLY, 0); }
		public TerminalNode CLASS() { return getToken(minijavaParser.CLASS, 0); }
		public List<? extends TerminalNode> IDENTIFIER() { return getTokens(minijavaParser.IDENTIFIER); }
		public TerminalNode EXTENDS() { return getToken(minijavaParser.EXTENDS, 0); }
		public ClassDeclContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitClassDecl(this);
		}
	}

	@RuleVersion(0)
	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			_localctx = new ClassDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(CLASS);
			setState(59); match(IDENTIFIER);
			setState(62);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(60); match(EXTENDS);
				setState(61); match(IDENTIFIER);
				}
			}

			setState(64); match(LCURLY);
			setState(65); varDeclList();
			setState(66); methodDeclList();
			setState(67); match(RCURLY);
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

	public static class MethodDeclListContext extends ParserRuleContext {
		public List<? extends MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public MethodDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterMethodDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitMethodDeclList(this);
		}
	}

	@RuleVersion(0)
	public final MethodDeclListContext methodDeclList() throws RecognitionException {
		MethodDeclListContext _localctx = new MethodDeclListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC) {
				{
				{
				setState(69); methodDeclaration();
				}
				}
				setState(74);
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

	public static class VarDeclListContext extends ParserRuleContext {
		public List<? extends VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public VarDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterVarDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitVarDeclList(this);
		}
	}

	@RuleVersion(0)
	public final VarDeclListContext varDeclList() throws RecognitionException {
		VarDeclListContext _localctx = new VarDeclListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75); varDeclaration();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class FormalListContext extends ParserRuleContext {
		public TerminalNode COLON(int i) {
			return getToken(minijavaParser.COLON, i);
		}
		public List<? extends TerminalNode> COLON() { return getTokens(minijavaParser.COLON); }
		public List<? extends FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterFormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitFormalList(this);
		}
	}

	@RuleVersion(0)
	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(81); formal();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(82); match(COLON);
					setState(83); formal();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class StmListContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<? extends StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StmListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterStmList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitStmList(this);
		}
	}

	@RuleVersion(0)
	public final StmListContext stmList() throws RecognitionException {
		StmListContext _localctx = new StmListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(91); statement();
				}
				}
				setState(96);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclContext extends VarDeclarationContext {
		public TerminalNode SEMICOLON() { return getToken(minijavaParser.SEMICOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(minijavaParser.IDENTIFIER, 0); }
		public VarDeclContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitVarDecl(this);
		}
	}

	@RuleVersion(0)
	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		try {
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97); type();
			setState(98); match(IDENTIFIER);
			setState(99); match(SEMICOLON);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDeclContext extends MethodDeclarationContext {
		public TerminalNode RBRACKET() { return getToken(minijavaParser.RBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(minijavaParser.SEMICOLON, 0); }
		public VarDeclListContext varDeclList() {
			return getRuleContext(VarDeclListContext.class,0);
		}
		public StmListContext stmList() {
			return getRuleContext(StmListContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(minijavaParser.LCURLY, 0); }
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public TerminalNode RETURN() { return getToken(minijavaParser.RETURN, 0); }
		public TerminalNode RCURLY() { return getToken(minijavaParser.RCURLY, 0); }
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(minijavaParser.PUBLIC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(minijavaParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodDeclContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitMethodDecl(this);
		}
	}

	@RuleVersion(0)
	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDeclaration);
		try {
			_localctx = new MethodDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(PUBLIC);
			setState(102); type();
			setState(103); match(IDENTIFIER);
			setState(104); match(LBRACKET);
			setState(105); formalList();
			setState(106); match(RBRACKET);
			setState(107); match(LCURLY);
			setState(108); varDeclList();
			setState(109); stmList();
			setState(110); match(RETURN);
			setState(111); expression(0);
			setState(112); match(SEMICOLON);
			setState(113); match(RCURLY);
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

	public static class FormalContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(minijavaParser.IDENTIFIER, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitFormal(this);
		}
	}

	@RuleVersion(0)
	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); type();
			setState(116); match(IDENTIFIER);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeIntArrayContext extends TypeContext {
		public TerminalNode RBRACE() { return getToken(minijavaParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(minijavaParser.LBRACE, 0); }
		public TerminalNode INT() { return getToken(minijavaParser.INT, 0); }
		public TypeIntArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterTypeIntArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitTypeIntArray(this);
		}
	}
	public static class TypeIntegerContext extends TypeContext {
		public TerminalNode INT() { return getToken(minijavaParser.INT, 0); }
		public TypeIntegerContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterTypeInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitTypeInteger(this);
		}
	}
	public static class TypeIdentifierContext extends TypeContext {
		public TerminalNode IDENTIFIER() { return getToken(minijavaParser.IDENTIFIER, 0); }
		public TypeIdentifierContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitTypeIdentifier(this);
		}
	}
	public static class TypeBooleanContext extends TypeContext {
		public TerminalNode BOOLEAN() { return getToken(minijavaParser.BOOLEAN, 0); }
		public TypeBooleanContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitTypeBoolean(this);
		}
	}

	@RuleVersion(0)
	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new TypeIntArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(INT);
				setState(119); match(LBRACE);
				setState(120); match(RBRACE);
				}
				break;

			case 2:
				_localctx = new TypeBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(BOOLEAN);
				}
				break;

			case 3:
				_localctx = new TypeIntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122); match(INT);
				}
				break;

			case 4:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123); match(IDENTIFIER);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmWhileContext extends StatementContext {
		public TerminalNode RBRACKET() { return getToken(minijavaParser.RBRACKET, 0); }
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(minijavaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterStmWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitStmWhile(this);
		}
	}
	public static class StmArrayAssignContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(minijavaParser.SEMICOLON, 0); }
		public TerminalNode RBRACE() { return getToken(minijavaParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(minijavaParser.LBRACE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(minijavaParser.IDENTIFIER, 0); }
		public List<? extends ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode EQUAL_ASSIGN() { return getToken(minijavaParser.EQUAL_ASSIGN, 0); }
		public StmArrayAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterStmArrayAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitStmArrayAssign(this);
		}
	}
	public static class StmIfContext extends StatementContext {
		public TerminalNode RBRACKET() { return getToken(minijavaParser.RBRACKET, 0); }
		public TerminalNode ELSE() { return getToken(minijavaParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(minijavaParser.IF, 0); }
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<? extends StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterStmIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitStmIf(this);
		}
	}
	public static class StmPrintContext extends StatementContext {
		public TerminalNode RBRACKET() { return getToken(minijavaParser.RBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(minijavaParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(minijavaParser.PRINT, 0); }
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StmPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterStmPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitStmPrint(this);
		}
	}
	public static class StmAssignContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(minijavaParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(minijavaParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQUAL_ASSIGN() { return getToken(minijavaParser.EQUAL_ASSIGN, 0); }
		public StmAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterStmAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitStmAssign(this);
		}
	}
	public static class StmBlockContext extends StatementContext {
		public StmListContext stmList() {
			return getRuleContext(StmListContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(minijavaParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(minijavaParser.LCURLY, 0); }
		public StmBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterStmBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitStmBlock(this);
		}
	}

	@RuleVersion(0)
	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StmBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126); match(LCURLY);
				setState(127); stmList();
				setState(128); match(RCURLY);
				}
				break;

			case 2:
				_localctx = new StmIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130); match(IF);
				setState(131); match(LBRACKET);
				setState(132); expression(0);
				setState(133); match(RBRACKET);
				setState(134); statement();
				setState(135); match(ELSE);
				setState(136); statement();
				}
				break;

			case 3:
				_localctx = new StmWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138); match(WHILE);
				setState(139); match(LBRACKET);
				setState(140); expression(0);
				setState(141); match(RBRACKET);
				setState(142); statement();
				}
				break;

			case 4:
				_localctx = new StmPrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(144); match(PRINT);
				setState(145); match(LBRACKET);
				setState(146); expression(0);
				setState(147); match(RBRACKET);
				setState(148); match(SEMICOLON);
				}
				break;

			case 5:
				_localctx = new StmAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(150); match(IDENTIFIER);
				setState(151); match(EQUAL_ASSIGN);
				setState(152); expression(0);
				setState(153); match(SEMICOLON);
				}
				break;

			case 6:
				_localctx = new StmArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(155); match(IDENTIFIER);
				setState(156); match(LBRACE);
				setState(157); expression(0);
				setState(158); match(RBRACE);
				setState(159); match(EQUAL_ASSIGN);
				setState(160); expression(0);
				setState(161); match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpNewObjectContext extends ExpressionContext {
		public TerminalNode RBRACKET() { return getToken(minijavaParser.RBRACKET, 0); }
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(minijavaParser.IDENTIFIER, 0); }
		public TerminalNode NEW() { return getToken(minijavaParser.NEW, 0); }
		public ExpNewObjectContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpNewObject(this);
		}
	}
	public static class ExpTrueContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(minijavaParser.TRUE, 0); }
		public ExpTrueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpTrue(this);
		}
	}
	public static class ExpFalseContext extends ExpressionContext {
		public TerminalNode FALSE() { return getToken(minijavaParser.FALSE, 0); }
		public ExpFalseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpFalse(this);
		}
	}
	public static class ExpArrayLookupContext extends ExpressionContext {
		public TerminalNode RBRACE() { return getToken(minijavaParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(minijavaParser.LBRACE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<? extends ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpArrayLookupContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpArrayLookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpArrayLookup(this);
		}
	}
	public static class ExpBracketContext extends ExpressionContext {
		public TerminalNode RBRACKET() { return getToken(minijavaParser.RBRACKET, 0); }
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpBracketContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpBracket(this);
		}
	}
	public static class ExpAndContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(minijavaParser.AND, 0); }
		public List<? extends ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpAnd(this);
		}
	}
	public static class ExpIdentifierExpContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(minijavaParser.IDENTIFIER, 0); }
		public ExpIdentifierExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpIdentifierExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpIdentifierExp(this);
		}
	}
	public static class ExpNewArrayContext extends ExpressionContext {
		public TerminalNode RBRACE() { return getToken(minijavaParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(minijavaParser.LBRACE, 0); }
		public TerminalNode INT() { return getToken(minijavaParser.INT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEW() { return getToken(minijavaParser.NEW, 0); }
		public ExpNewArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpNewArray(this);
		}
	}
	public static class ExpLessThanContext extends ExpressionContext {
		public TerminalNode LESSTHAN() { return getToken(minijavaParser.LESSTHAN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<? extends ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpLessThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpLessThan(this);
		}
	}
	public static class ExpThisContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(minijavaParser.THIS, 0); }
		public ExpThisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpThis(this);
		}
	}
	public static class ExpArrayLengthContext extends ExpressionContext {
		public TerminalNode DOT() { return getToken(minijavaParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpArrayLengthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpArrayLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpArrayLength(this);
		}
	}
	public static class ExpTimesContext extends ExpressionContext {
		public TerminalNode TIMES() { return getToken(minijavaParser.TIMES, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<? extends ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpTimesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpTimes(this);
		}
	}
	public static class ExpPlusContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(minijavaParser.PLUS, 0); }
		public List<? extends ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpPlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpPlus(this);
		}
	}
	public static class ExpMinusContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(minijavaParser.MINUS, 0); }
		public List<? extends ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpMinus(this);
		}
	}
	public static class ExpIntegerLiteralContext extends ExpressionContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(minijavaParser.INTEGER_LITERAL, 0); }
		public ExpIntegerLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpIntegerLiteral(this);
		}
	}
	public static class ExpCallContext extends ExpressionContext {
		public TerminalNode RBRACKET() { return getToken(minijavaParser.RBRACKET, 0); }
		public TerminalNode DOT() { return getToken(minijavaParser.DOT, 0); }
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(minijavaParser.IDENTIFIER, 0); }
		public ExpCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpCall(this);
		}
	}
	public static class ExpNotContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(minijavaParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterExpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitExpNot(this);
		}
	}

	@RuleVersion(0)
	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new ExpNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(166); match(NOT);
				setState(167); expression(2);
				}
				break;

			case 2:
				{
				_localctx = new ExpIntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168); match(INTEGER_LITERAL);
				}
				break;

			case 3:
				{
				_localctx = new ExpTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169); match(TRUE);
				}
				break;

			case 4:
				{
				_localctx = new ExpFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); match(FALSE);
				}
				break;

			case 5:
				{
				_localctx = new ExpIdentifierExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171); match(IDENTIFIER);
				}
				break;

			case 6:
				{
				_localctx = new ExpThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172); match(THIS);
				}
				break;

			case 7:
				{
				_localctx = new ExpNewArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173); match(NEW);
				setState(174); match(INT);
				setState(175); match(LBRACE);
				setState(176); expression(0);
				setState(177); match(RBRACE);
				}
				break;

			case 8:
				{
				_localctx = new ExpNewObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179); match(NEW);
				setState(180); match(IDENTIFIER);
				setState(181); match(LBRACKET);
				setState(182); match(RBRACKET);
				}
				break;

			case 9:
				{
				_localctx = new ExpBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183); match(LBRACKET);
				setState(184); expression(0);
				setState(185); match(RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpTimesContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(190); match(TIMES);
						setState(191); expression(17);
						}
						break;

					case 2:
						{
						_localctx = new ExpAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(193); match(AND);
						setState(194); expression(16);
						}
						break;

					case 3:
						{
						_localctx = new ExpPlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(196); match(PLUS);
						setState(197); expression(15);
						}
						break;

					case 4:
						{
						_localctx = new ExpMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(199); match(MINUS);
						setState(200); expression(14);
						}
						break;

					case 5:
						{
						_localctx = new ExpLessThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(202); match(LESSTHAN);
						setState(203); expression(13);
						}
						break;

					case 6:
						{
						_localctx = new ExpArrayLookupContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(205); match(LBRACE);
						setState(206); expression(0);
						setState(207); match(RBRACE);
						}
						break;

					case 7:
						{
						_localctx = new ExpArrayLengthContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(210); match(DOT);
						setState(211); match(T__1);
						}
						break;

					case 8:
						{
						_localctx = new ExpCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(213); match(DOT);
						setState(214); match(IDENTIFIER);
						setState(215); match(LBRACKET);
						setState(216); callArguments();
						setState(217); match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(223);
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

	public static class CallArgumentsContext extends ParserRuleContext {
		public TerminalNode COLON(int i) {
			return getToken(minijavaParser.COLON, i);
		}
		public List<? extends TerminalNode> COLON() { return getTokens(minijavaParser.COLON); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<? extends ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitCallArguments(this);
		}
	}

	@RuleVersion(0)
	public final CallArgumentsContext callArguments() throws RecognitionException {
		CallArgumentsContext _localctx = new CallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET) | (1L << NEW) | (1L << THIS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(224); expression(0);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(225); match(COLON);
					setState(226); expression(0);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 16);

		case 1: return precpred(_ctx, 15);

		case 2: return precpred(_ctx, 14);

		case 3: return precpred(_ctx, 13);

		case 4: return precpred(_ctx, 12);

		case 5: return precpred(_ctx, 17);

		case 6: return precpred(_ctx, 11);

		case 7: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uaf6f\u8320\u479d\ub75c\u4880\u1605\u191c\uab37\3(\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\7\3&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5A\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\7\7O\n\7\f\7\16\7R\13\7\3\b\3\b\3\b"+
		"\7\bW\n\b\f\b\16\bZ\13\b\5\b\\\n\b\3\t\7\t_\n\t\f\t\16\tb\13\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\177\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a6\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00be\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00de\n\17\f\17\16\17\u00e1"+
		"\13\17\3\20\3\20\3\20\7\20\u00e6\n\20\f\20\16\20\u00e9\13\20\5\20\u00eb"+
		"\n\20\3\20\2\2\3\34\21\2\2\4\2\6\2\b\2\n\2\f\2\16\2\20\2\22\2\24\2\26"+
		"\2\30\2\32\2\34\2\36\2\2\2\u00fe\2 \3\2\2\2\4#\3\2\2\2\6*\3\2\2\2\b<\3"+
		"\2\2\2\nJ\3\2\2\2\fP\3\2\2\2\16[\3\2\2\2\20`\3\2\2\2\22c\3\2\2\2\24g\3"+
		"\2\2\2\26u\3\2\2\2\30~\3\2\2\2\32\u00a5\3\2\2\2\34\u00bd\3\2\2\2\36\u00ea"+
		"\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"\3\3\2\2\2#\'\5\6\4\2$&\5\b\5\2%$\3\2\2"+
		"\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\5\3\2\2\2)\'\3\2\2\2*+\7\16\2\2+,"+
		"\7\'\2\2,-\7\t\2\2-.\7\20\2\2./\7\21\2\2/\60\7\22\2\2\60\61\7\23\2\2\61"+
		"\62\7\5\2\2\62\63\7\4\2\2\63\64\7\7\2\2\64\65\7\b\2\2\65\66\7\'\2\2\66"+
		"\67\7\6\2\2\678\7\t\2\289\5\32\16\29:\7\n\2\2:;\7\n\2\2;\7\3\2\2\2<=\7"+
		"\16\2\2=@\7\'\2\2>?\7\17\2\2?A\7\'\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2B"+
		"C\7\t\2\2CD\5\f\7\2DE\5\n\6\2EF\7\n\2\2F\t\3\2\2\2GI\5\24\13\2HG\3\2\2"+
		"\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LJ\3\2\2\2MO\5\22\n\2NM\3"+
		"\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RP\3\2\2\2SX\5\26\f\2T"+
		"U\7\f\2\2UW\5\26\f\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2"+
		"\2ZX\3\2\2\2[S\3\2\2\2[\\\3\2\2\2\\\17\3\2\2\2]_\5\32\16\2^]\3\2\2\2_"+
		"b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\21\3\2\2\2b`\3\2\2\2cd\5\30\r\2de\7\'\2"+
		"\2ef\7\13\2\2f\23\3\2\2\2gh\7\20\2\2hi\5\30\r\2ij\7\'\2\2jk\7\5\2\2kl"+
		"\5\16\b\2lm\7\6\2\2mn\7\t\2\2no\5\f\7\2op\5\20\t\2pq\7\34\2\2qr\5\34\17"+
		"\2rs\7\13\2\2st\7\n\2\2t\25\3\2\2\2uv\5\30\r\2vw\7\'\2\2w\27\3\2\2\2x"+
		"y\7\24\2\2yz\7\7\2\2z\177\7\b\2\2{\177\7\25\2\2|\177\7\24\2\2}\177\7\'"+
		"\2\2~x\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\31\3\2\2\2\u0080\u0081"+
		"\7\t\2\2\u0081\u0082\5\20\t\2\u0082\u0083\7\n\2\2\u0083\u00a6\3\2\2\2"+
		"\u0084\u0085\7\27\2\2\u0085\u0086\7\5\2\2\u0086\u0087\5\34\17\2\u0087"+
		"\u0088\7\6\2\2\u0088\u0089\5\32\16\2\u0089\u008a\7\30\2\2\u008a\u008b"+
		"\5\32\16\2\u008b\u00a6\3\2\2\2\u008c\u008d\7\26\2\2\u008d\u008e\7\5\2"+
		"\2\u008e\u008f\5\34\17\2\u008f\u0090\7\6\2\2\u0090\u0091\5\32\16\2\u0091"+
		"\u00a6\3\2\2\2\u0092\u0093\7\31\2\2\u0093\u0094\7\5\2\2\u0094\u0095\5"+
		"\34\17\2\u0095\u0096\7\6\2\2\u0096\u0097\7\13\2\2\u0097\u00a6\3\2\2\2"+
		"\u0098\u0099\7\'\2\2\u0099\u009a\7\35\2\2\u009a\u009b\5\34\17\2\u009b"+
		"\u009c\7\13\2\2\u009c\u00a6\3\2\2\2\u009d\u009e\7\'\2\2\u009e\u009f\7"+
		"\7\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\7\b\2\2\u00a1\u00a2\7\35\2\2"+
		"\u00a2\u00a3\5\34\17\2\u00a3\u00a4\7\13\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u0080\3\2\2\2\u00a5\u0084\3\2\2\2\u00a5\u008c\3\2\2\2\u00a5\u0092\3\2"+
		"\2\2\u00a5\u0098\3\2\2\2\u00a5\u009d\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00a8"+
		"\b\17\1\2\u00a8\u00a9\7#\2\2\u00a9\u00be\5\34\17\4\u00aa\u00be\7&\2\2"+
		"\u00ab\u00be\7$\2\2\u00ac\u00be\7%\2\2\u00ad\u00be\7\'\2\2\u00ae\u00be"+
		"\7\33\2\2\u00af\u00b0\7\32\2\2\u00b0\u00b1\7\24\2\2\u00b1\u00b2\7\7\2"+
		"\2\u00b2\u00b3\5\34\17\2\u00b3\u00b4\7\b\2\2\u00b4\u00be\3\2\2\2\u00b5"+
		"\u00b6\7\32\2\2\u00b6\u00b7\7\'\2\2\u00b7\u00b8\7\5\2\2\u00b8\u00be\7"+
		"\6\2\2\u00b9\u00ba\7\5\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\7\6\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00a7\3\2\2\2\u00bd\u00aa\3\2\2\2\u00bd\u00ab\3\2"+
		"\2\2\u00bd\u00ac\3\2\2\2\u00bd\u00ad\3\2\2\2\u00bd\u00ae\3\2\2\2\u00bd"+
		"\u00af\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00df\3\2"+
		"\2\2\u00bf\u00c0\f\22\2\2\u00c0\u00c1\7\"\2\2\u00c1\u00de\5\34\17\23\u00c2"+
		"\u00c3\f\21\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00de\5\34\17\22\u00c5\u00c6"+
		"\f\20\2\2\u00c6\u00c7\7 \2\2\u00c7\u00de\5\34\17\21\u00c8\u00c9\f\17\2"+
		"\2\u00c9\u00ca\7!\2\2\u00ca\u00de\5\34\17\20\u00cb\u00cc\f\16\2\2\u00cc"+
		"\u00cd\7\37\2\2\u00cd\u00de\5\34\17\17\u00ce\u00cf\f\23\2\2\u00cf\u00d0"+
		"\7\7\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2\7\b\2\2\u00d2\u00de\3\2\2\2"+
		"\u00d3\u00d4\f\r\2\2\u00d4\u00d5\7\r\2\2\u00d5\u00de\7\3\2\2\u00d6\u00d7"+
		"\f\f\2\2\u00d7\u00d8\7\r\2\2\u00d8\u00d9\7\'\2\2\u00d9\u00da\7\5\2\2\u00da"+
		"\u00db\5\36\20\2\u00db\u00dc\7\6\2\2\u00dc\u00de\3\2\2\2\u00dd\u00bf\3"+
		"\2\2\2\u00dd\u00c2\3\2\2\2\u00dd\u00c5\3\2\2\2\u00dd\u00c8\3\2\2\2\u00dd"+
		"\u00cb\3\2\2\2\u00dd\u00ce\3\2\2\2\u00dd\u00d3\3\2\2\2\u00dd\u00d6\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\35\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e7\5\34\17\2\u00e3\u00e4\7\f"+
		"\2\2\u00e4\u00e6\5\34\17\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2"+
		"\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\37\3\2\2\2\20\'@JP"+
		"X[`~\u00a5\u00bd\u00dd\u00df\u00e7\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
	}
}