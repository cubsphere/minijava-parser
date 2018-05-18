// Generated from minijava.g4 by ANTLR 4.4

	package minijava;

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
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "expression"
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
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
	 
		public GoalContext() { }
		public void copyFrom(GoalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends GoalContext {
		public List<? extends ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(minijavaParser.EOF, 0); }
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ProgramContext(GoalContext ctx) { copyFrom(ctx); }
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
	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(16); mainClass();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(17); classDeclaration();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23); match(EOF);
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
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
	 
		public MainClassContext() { }
		public void copyFrom(MainClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainContext extends MainClassContext {
		public TerminalNode RBRACKET() { return getToken(minijavaParser.RBRACKET, 0); }
		public TerminalNode VOID(int i) {
			return getToken(minijavaParser.VOID, i);
		}
		public TerminalNode LBRACE() { return getToken(minijavaParser.LBRACE, 0); }
		public List<? extends TerminalNode> LCURLY() { return getTokens(minijavaParser.LCURLY); }
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public TerminalNode RBRACE() { return getToken(minijavaParser.RBRACE, 0); }
		public TerminalNode STATIC() { return getToken(minijavaParser.STATIC, 0); }
		public List<? extends TerminalNode> VOID() { return getTokens(minijavaParser.VOID); }
		public TerminalNode RCURLY() { return getToken(minijavaParser.RCURLY, 0); }
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
		public MainContext(MainClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minijavaListener ) ((minijavaListener)listener).exitMain(this);
		}
	}

	@RuleVersion(0)
	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			_localctx = new MainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(CLASS);
			setState(26); match(IDENTIFIER);
			setState(27); match(LCURLY);
			setState(28); match(PUBLIC);
			setState(29); match(STATIC);
			setState(30); match(VOID);
			setState(31); match(VOID);
			setState(32); match(LBRACKET);
			setState(33); match(T__0);
			setState(34); match(LBRACE);
			setState(35); match(RBRACE);
			setState(36); match(IDENTIFIER);
			setState(37); match(RBRACKET);
			setState(38); match(LCURLY);
			setState(39); statement();
			setState(40); match(RCURLY);
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
		public List<? extends MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<? extends VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode RCURLY() { return getToken(minijavaParser.RCURLY, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(minijavaParser.IDENTIFIER, i);
		}
		public TerminalNode LCURLY() { return getToken(minijavaParser.LCURLY, 0); }
		public TerminalNode CLASS() { return getToken(minijavaParser.CLASS, 0); }
		public List<? extends TerminalNode> IDENTIFIER() { return getTokens(minijavaParser.IDENTIFIER); }
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public TerminalNode EXTENDS() { return getToken(minijavaParser.EXTENDS, 0); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
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
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			_localctx = new ClassDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(CLASS);
			setState(43); match(IDENTIFIER);
			setState(46);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(44); match(EXTENDS);
				setState(45); match(IDENTIFIER);
				}
			}

			setState(48); match(LCURLY);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(49); varDeclaration();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC) {
				{
				{
				setState(55); methodDeclaration();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61); match(RCURLY);
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
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(63); type();
			setState(64); match(IDENTIFIER);
			setState(65); match(SEMICOLON);
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
		public List<? extends VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<? extends TerminalNode> COLON() { return getTokens(minijavaParser.COLON); }
		public TerminalNode LCURLY() { return getToken(minijavaParser.LCURLY, 0); }
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(minijavaParser.RETURN, 0); }
		public TerminalNode COLON(int i) {
			return getToken(minijavaParser.COLON, i);
		}
		public TerminalNode RCURLY() { return getToken(minijavaParser.RCURLY, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(minijavaParser.IDENTIFIER, i);
		}
		public TerminalNode PUBLIC() { return getToken(minijavaParser.PUBLIC, 0); }
		public List<? extends TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<? extends StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<? extends TerminalNode> IDENTIFIER() { return getTokens(minijavaParser.IDENTIFIER); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
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
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			_localctx = new MethodDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(PUBLIC);
			setState(68); type();
			setState(69); match(IDENTIFIER);
			setState(70); match(LBRACKET);
			setState(82);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(71); type();
				setState(72); match(IDENTIFIER);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(73); match(COLON);
					setState(74); type();
					setState(75); match(IDENTIFIER);
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(84); match(RBRACKET);
			setState(85); match(LCURLY);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86); varDeclaration();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(92); statement();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98); match(RETURN);
			setState(99); expression(0);
			setState(100); match(SEMICOLON);
			setState(101); match(RCURLY);
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
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new TypeIntArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(INT);
				setState(104); match(LBRACE);
				setState(105); match(RBRACE);
				}
				break;

			case 2:
				_localctx = new TypeBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(BOOLEAN);
				}
				break;

			case 3:
				_localctx = new TypeIntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107); match(INT);
				}
				break;

			case 4:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108); match(IDENTIFIER);
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
		public TerminalNode RCURLY() { return getToken(minijavaParser.RCURLY, 0); }
		public TerminalNode LCURLY() { return getToken(minijavaParser.LCURLY, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<? extends StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
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
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StmBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111); match(LCURLY);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << WHILE) | (1L << IF) | (1L << PRINT) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(112); statement();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118); match(RCURLY);
				}
				break;

			case 2:
				_localctx = new StmIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(IF);
				setState(120); match(LBRACKET);
				setState(121); expression(0);
				setState(122); match(RBRACKET);
				setState(123); statement();
				setState(124); match(ELSE);
				setState(125); statement();
				}
				break;

			case 3:
				_localctx = new StmWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127); match(WHILE);
				setState(128); match(LBRACKET);
				setState(129); expression(0);
				setState(130); match(RBRACKET);
				setState(131); statement();
				}
				break;

			case 4:
				_localctx = new StmPrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133); match(PRINT);
				setState(134); match(LBRACKET);
				setState(135); expression(0);
				setState(136); match(RBRACKET);
				setState(137); match(SEMICOLON);
				}
				break;

			case 5:
				_localctx = new StmAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(139); match(IDENTIFIER);
				setState(140); match(EQUAL_ASSIGN);
				setState(141); expression(0);
				setState(142); match(SEMICOLON);
				}
				break;

			case 6:
				_localctx = new StmArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(144); match(IDENTIFIER);
				setState(145); match(LBRACE);
				setState(146); expression(0);
				setState(147); match(RBRACE);
				setState(148); match(EQUAL_ASSIGN);
				setState(149); expression(0);
				setState(150); match(SEMICOLON);
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
		public TerminalNode COLON(int i) {
			return getToken(minijavaParser.COLON, i);
		}
		public List<? extends TerminalNode> COLON() { return getTokens(minijavaParser.COLON); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(minijavaParser.LBRACKET, 0); }
		public List<? extends ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ExpNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155); match(NOT);
				setState(156); expression(2);
				}
				break;

			case 2:
				{
				_localctx = new ExpIntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157); match(INTEGER_LITERAL);
				}
				break;

			case 3:
				{
				_localctx = new ExpTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158); match(TRUE);
				}
				break;

			case 4:
				{
				_localctx = new ExpFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159); match(FALSE);
				}
				break;

			case 5:
				{
				_localctx = new ExpIdentifierExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160); match(IDENTIFIER);
				}
				break;

			case 6:
				{
				_localctx = new ExpThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161); match(THIS);
				}
				break;

			case 7:
				{
				_localctx = new ExpNewArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162); match(NEW);
				setState(163); match(INT);
				setState(164); match(LBRACE);
				setState(165); expression(0);
				setState(166); match(RBRACE);
				}
				break;

			case 8:
				{
				_localctx = new ExpNewObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168); match(NEW);
				setState(169); match(IDENTIFIER);
				setState(170); match(LBRACKET);
				setState(171); match(RBRACKET);
				}
				break;

			case 9:
				{
				_localctx = new ExpBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172); match(LBRACKET);
				setState(173); expression(0);
				setState(174); match(RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpLessThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(179); match(LESSTHAN);
						setState(180); expression(18);
						}
						break;

					case 2:
						{
						_localctx = new ExpAndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(182); match(AND);
						setState(183); expression(17);
						}
						break;

					case 3:
						{
						_localctx = new ExpPlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(185); match(PLUS);
						setState(186); expression(16);
						}
						break;

					case 4:
						{
						_localctx = new ExpMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(188); match(MINUS);
						setState(189); expression(15);
						}
						break;

					case 5:
						{
						_localctx = new ExpTimesContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(191); match(TIMES);
						setState(192); expression(14);
						}
						break;

					case 6:
						{
						_localctx = new ExpArrayLookupContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(194); match(LBRACE);
						setState(195); expression(0);
						setState(196); match(RBRACE);
						}
						break;

					case 7:
						{
						_localctx = new ExpArrayLengthContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(199); match(DOT);
						setState(200); match(T__1);
						}
						break;

					case 8:
						{
						_localctx = new ExpCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(202); match(DOT);
						setState(203); match(IDENTIFIER);
						setState(204); match(LBRACKET);
						setState(213);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACKET) | (1L << NEW) | (1L << THIS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER_LITERAL) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(205); expression(0);
							setState(210);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COLON) {
								{
								{
								setState(206); match(COLON);
								setState(207); expression(0);
								}
								}
								setState(212);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(215); match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(220);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 17);

		case 1: return precpred(_ctx, 16);

		case 2: return precpred(_ctx, 15);

		case 3: return precpred(_ctx, 14);

		case 4: return precpred(_ctx, 13);

		case 5: return precpred(_ctx, 12);

		case 6: return precpred(_ctx, 11);

		case 7: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uaf6f\u8320\u479d\ub75c\u4880\u1605\u191c\uab37\3(\u00e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\7\4\65"+
		"\n\4\f\4\16\48\13\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\5\6"+
		"U\n\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\7\6`\n\6\f\6\16\6c\13\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\7\bt\n\b"+
		"\f\b\16\bw\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u009b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d3\n\t\f\t\16\t\u00d6\13"+
		"\t\5\t\u00d8\n\t\3\t\7\t\u00db\n\t\f\t\16\t\u00de\13\t\3\t\2\2\3\20\n"+
		"\2\2\4\2\6\2\b\2\n\2\f\2\16\2\20\2\2\2\u00fa\2\22\3\2\2\2\4\33\3\2\2\2"+
		"\6,\3\2\2\2\bA\3\2\2\2\nE\3\2\2\2\fo\3\2\2\2\16\u009a\3\2\2\2\20\u00b2"+
		"\3\2\2\2\22\26\5\4\3\2\23\25\5\6\4\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24"+
		"\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\2\2\3\32\3"+
		"\3\2\2\2\33\34\7\16\2\2\34\35\7\'\2\2\35\36\7\t\2\2\36\37\7\20\2\2\37"+
		" \7\21\2\2 !\7\22\2\2!\"\7\22\2\2\"#\7\5\2\2#$\7\4\2\2$%\7\7\2\2%&\7\b"+
		"\2\2&\'\7\'\2\2\'(\7\6\2\2()\7\t\2\2)*\5\16\b\2*+\7\n\2\2+\5\3\2\2\2,"+
		"-\7\16\2\2-\60\7\'\2\2./\7\17\2\2/\61\7\'\2\2\60.\3\2\2\2\60\61\3\2\2"+
		"\2\61\62\3\2\2\2\62\66\7\t\2\2\63\65\5\b\5\2\64\63\3\2\2\2\658\3\2\2\2"+
		"\66\64\3\2\2\2\66\67\3\2\2\2\67<\3\2\2\28\66\3\2\2\29;\5\n\6\2:9\3\2\2"+
		"\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\n\2\2@\7\3\2"+
		"\2\2AB\5\f\7\2BC\7\'\2\2CD\7\13\2\2D\t\3\2\2\2EF\7\20\2\2FG\5\f\7\2GH"+
		"\7\'\2\2HT\7\5\2\2IJ\5\f\7\2JQ\7\'\2\2KL\7\f\2\2LM\5\f\7\2MN\7\'\2\2N"+
		"P\3\2\2\2OK\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2"+
		"TI\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\6\2\2W[\7\t\2\2XZ\5\b\5\2YX\3\2\2\2"+
		"Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\a\3\2\2\2][\3\2\2\2^`\5\16\b\2_^\3\2"+
		"\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\34\2\2ef\5"+
		"\20\t\2fg\7\13\2\2gh\7\n\2\2h\13\3\2\2\2ij\7\24\2\2jk\7\7\2\2kp\7\b\2"+
		"\2lp\7\25\2\2mp\7\24\2\2np\7\'\2\2oi\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2"+
		"\2\2p\r\3\2\2\2qu\7\t\2\2rt\5\16\b\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2vx\3\2\2\2wu\3\2\2\2x\u009b\7\n\2\2yz\7\27\2\2z{\7\5\2\2{|\5\20"+
		"\t\2|}\7\6\2\2}~\5\16\b\2~\177\7\30\2\2\177\u0080\5\16\b\2\u0080\u009b"+
		"\3\2\2\2\u0081\u0082\7\26\2\2\u0082\u0083\7\5\2\2\u0083\u0084\5\20\t\2"+
		"\u0084\u0085\7\6\2\2\u0085\u0086\5\16\b\2\u0086\u009b\3\2\2\2\u0087\u0088"+
		"\7\31\2\2\u0088\u0089\7\5\2\2\u0089\u008a\5\20\t\2\u008a\u008b\7\6\2\2"+
		"\u008b\u008c\7\13\2\2\u008c\u009b\3\2\2\2\u008d\u008e\7\'\2\2\u008e\u008f"+
		"\7\35\2\2\u008f\u0090\5\20\t\2\u0090\u0091\7\13\2\2\u0091\u009b\3\2\2"+
		"\2\u0092\u0093\7\'\2\2\u0093\u0094\7\7\2\2\u0094\u0095\5\20\t\2\u0095"+
		"\u0096\7\b\2\2\u0096\u0097\7\35\2\2\u0097\u0098\5\20\t\2\u0098\u0099\7"+
		"\13\2\2\u0099\u009b\3\2\2\2\u009aq\3\2\2\2\u009ay\3\2\2\2\u009a\u0081"+
		"\3\2\2\2\u009a\u0087\3\2\2\2\u009a\u008d\3\2\2\2\u009a\u0092\3\2\2\2\u009b"+
		"\17\3\2\2\2\u009c\u009d\b\t\1\2\u009d\u009e\7#\2\2\u009e\u00b3\5\20\t"+
		"\4\u009f\u00b3\7&\2\2\u00a0\u00b3\7$\2\2\u00a1\u00b3\7%\2\2\u00a2\u00b3"+
		"\7\'\2\2\u00a3\u00b3\7\33\2\2\u00a4\u00a5\7\32\2\2\u00a5\u00a6\7\24\2"+
		"\2\u00a6\u00a7\7\7\2\2\u00a7\u00a8\5\20\t\2\u00a8\u00a9\7\b\2\2\u00a9"+
		"\u00b3\3\2\2\2\u00aa\u00ab\7\32\2\2\u00ab\u00ac\7\'\2\2\u00ac\u00ad\7"+
		"\5\2\2\u00ad\u00b3\7\6\2\2\u00ae\u00af\7\5\2\2\u00af\u00b0\5\20\t\2\u00b0"+
		"\u00b1\7\6\2\2\u00b1\u00b3\3\2\2\2\u00b2\u009c\3\2\2\2\u00b2\u009f\3\2"+
		"\2\2\u00b2\u00a0\3\2\2\2\u00b2\u00a1\3\2\2\2\u00b2\u00a2\3\2\2\2\u00b2"+
		"\u00a3\3\2\2\2\u00b2\u00a4\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ae\3\2"+
		"\2\2\u00b3\u00dc\3\2\2\2\u00b4\u00b5\f\23\2\2\u00b5\u00b6\7\37\2\2\u00b6"+
		"\u00db\5\20\t\24\u00b7\u00b8\f\22\2\2\u00b8\u00b9\7\36\2\2\u00b9\u00db"+
		"\5\20\t\23\u00ba\u00bb\f\21\2\2\u00bb\u00bc\7 \2\2\u00bc\u00db\5\20\t"+
		"\22\u00bd\u00be\f\20\2\2\u00be\u00bf\7!\2\2\u00bf\u00db\5\20\t\21\u00c0"+
		"\u00c1\f\17\2\2\u00c1\u00c2\7\"\2\2\u00c2\u00db\5\20\t\20\u00c3\u00c4"+
		"\f\16\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00c6\5\20\t\2\u00c6\u00c7\7\b\2\2"+
		"\u00c7\u00db\3\2\2\2\u00c8\u00c9\f\r\2\2\u00c9\u00ca\7\r\2\2\u00ca\u00db"+
		"\7\3\2\2\u00cb\u00cc\f\f\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\7\'\2\2\u00ce"+
		"\u00d7\7\5\2\2\u00cf\u00d4\5\20\t\2\u00d0\u00d1\7\f\2\2\u00d1\u00d3\5"+
		"\20\t\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00cf\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\7\6\2\2\u00da"+
		"\u00b4\3\2\2\2\u00da\u00b7\3\2\2\2\u00da\u00ba\3\2\2\2\u00da\u00bd\3\2"+
		"\2\2\u00da\u00c0\3\2\2\2\u00da\u00c3\3\2\2\2\u00da\u00c8\3\2\2\2\u00da"+
		"\u00cb\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\21\3\2\2\2\u00de\u00dc\3\2\2\2\22\26\60\66<QT[aou\u009a\u00b2"+
		"\u00d4\u00d7\u00da\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
	}
}