package minijava;

import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import br.ufpe.cin.if688.minijava.ast.*;
import minijava.generated.*;
import minijava.generated.minijavaParser.*;

public class ASTGenerator extends minijavaBaseListener {
	//only one of these ever exists
	private Program prog;
	private MainClass mc;
	private ClassDeclList cdl;
	
	private Stack<MethodDeclList> mdlStack;
	private Stack<FormalList> flclStack;
	private Stack<VarDeclList> vdlStack;
	private Stack<Type> typeStack;
	
	//blocks make your life harder
	private Stack<Statement> stmStack;
	private Stack<Stack<Statement>> stmStackStack;
	private Stack<StatementList> stmListStack;
	
	//method calls too
	private Stack<Exp> expStack;
	private Stack<Stack<Exp>> expStackStack;
	private Stack<ExpList> expListStack;
	
	public ASTGenerator() {
		super();
	}
	
	public Program getProgram() {
		return prog;
	}
	
	public void hello(int x) {
		System.out.println("hello" + x);
	}

	private Identifier getId(ParseTree ctx, int i) {
		return new Identifier(ctx.getChild(i).getText());
	}
	
	public void enterProgram(ProgramContext ctx) {
		mdlStack = new Stack<MethodDeclList>();
		flclStack = new Stack<FormalList>();
		vdlStack = new Stack<VarDeclList>();
		typeStack = new Stack<Type>();
		
		expStack = new Stack<Exp>();
		expStackStack = new Stack<Stack<Exp>>();
		expListStack = new Stack<ExpList>();
		
		stmStack = new Stack<Statement>();
		stmStackStack = new Stack<Stack<Statement>>();
		stmListStack = new Stack<StatementList>();

		cdl = new ClassDeclList();
	}
	
	public void exitProgram(ProgramContext ctx) {
		prog = new Program(mc,cdl);
	}
	
	public void exitMainClass(MainClassContext ctx) {
		Statement stm = stmStack.pop();
		Identifier className = getId(ctx, 1);
		Identifier args = new Identifier(ctx.getChild(11).getText());
		mc = new MainClass(className, args, stm);
	}
	
	public void exitClassDecl(ClassDeclContext ctx) {		
		Identifier className = getId(ctx, 1);
		VarDeclList vdl = vdlStack.pop();
		MethodDeclList mdl = mdlStack.pop();
		if(ctx.getChild(2).getText().equals("extends")) {
			Identifier parentClass = new Identifier(ctx.getChild(3).getText());
			cdl.addElement(new ClassDeclExtends(className, parentClass, vdl, mdl));
		} else {
			cdl.addElement(new ClassDeclSimple(className, vdl, mdl));
		}
	}
	
	public void enterMethodDeclList(MethodDeclListContext ctx) {
		mdlStack.push(new MethodDeclList());
	}
	
	public void exitMethodDecl(MethodDeclContext ctx) {
		Type t = typeStack.pop();
		Identifier id = getId(ctx, 2);
		FormalList flcl = flclStack.pop();
		VarDeclList vdl = vdlStack.pop();
		StatementList stml = stmListStack.pop();
		Exp exp = expStack.pop();
		mdlStack.peek().addElement(new MethodDecl(t, id, flcl, vdl, stml, exp));
	}
	
	public void enterFormalList(FormalListContext ctx) {
		flclStack.push(new FormalList());
	}
	
	public void exitFormal(FormalContext ctx) {
		Type t = typeStack.pop();
		Identifier id = getId(ctx, 1);
		flclStack.peek().addElement(new Formal(t,id));
	}
	
	public void enterVarDeclList(VarDeclListContext ctx) {
		vdlStack.push(new VarDeclList());
	}
	
	public void exitVarDecl(VarDeclContext ctx) {		
		Identifier id = getId(ctx, 1);
		Type t = typeStack.pop();
		
		vdlStack.peek().addElement(new VarDecl(t, id));
	}
	
	public void exitTypeInteger(TypeIntegerContext ctx) {
		typeStack.push(new IntegerType());
	}
	
	public void exitTypeBoolean(TypeBooleanContext ctx) {
		typeStack.push(new BooleanType());
	}
	
	public void exitTypeIntArray(TypeIntArrayContext ctx) {
		typeStack.push(new IntArrayType());
	}
	
	public void exitTypeIdentifier(TypeIdentifierContext ctx) {
		typeStack.push(new IdentifierType(ctx.getText()));
	}
	
	public void enterStmList(@NotNull StmListContext ctx) {
		stmStackStack.push(stmStack);
		stmStack = new Stack<Statement>();
	}
	
	public void exitStmList(@NotNull StmListContext ctx) {
		StatementList stml = new StatementList();
		for (Statement stm : stmStack) {
			stml.addElement(stm);
		}
		stmListStack.push(stml);
		
		stmStack = stmStackStack.pop();
	}
	
	public void exitStmBlock(@NotNull StmBlockContext ctx) {
		stmStack.push(new Block(stmListStack.pop()));
	}
	
	public void exitStmWhile(@NotNull StmWhileContext ctx) {
		Exp exp = expStack.pop();
		Statement stm = stmStack.pop();
		stmStack.push(new While(exp, stm));
	}
	
	public void exitStmArrayAssign(@NotNull StmArrayAssignContext ctx) {
		Identifier id = getId(ctx, 0);
		//attention to order!
		Exp rightSide = expStack.pop();
		Exp index = expStack.pop();
		stmStack.push(new ArrayAssign(id, index, rightSide));
	}
	
	public void exitStmIf(@NotNull StmIfContext ctx) {
		Exp exp = expStack.pop();
		//attention to order!
		Statement stmElse = stmStack.pop();
		Statement stmThen = stmStack.pop();
		stmStack.push(new If(exp, stmThen, stmElse));
	}
	
	public void exitStmPrint(@NotNull StmPrintContext ctx) {
		Exp exp = expStack.pop();
		stmStack.push(new Print(exp));
	}
	
	public void exitStmAssign(@NotNull StmAssignContext ctx) {
		Identifier id = getId(ctx, 0);
		Exp rightSide = expStack.pop();
		stmStack.push(new Assign(id, rightSide));
	}
	
    public void exitExpArrayLookup(@NotNull ExpArrayLookupContext ctx) {
    	//attention to order!
    	Exp address = expStack.pop();
    	Exp arr = expStack.pop();
    	expStack.push(new ArrayLookup(arr, address));
	}

    public void exitExpTimes(@NotNull ExpTimesContext ctx) {
    	Exp e2 = expStack.pop();
		Exp e1 = expStack.pop();
		expStack.push(new Times(e1, e2));
	}

    public void exitExpAnd(@NotNull ExpAndContext ctx) {
    	//attention to order!
    	Exp e2 = expStack.pop();
		Exp e1 = expStack.pop();
		expStack.push(new And(e1, e2));
	}

    public void exitExpPlus(@NotNull ExpPlusContext ctx) {
    	Exp e2 = expStack.pop();
		Exp e1 = expStack.pop();
		expStack.push(new Plus(e1, e2));
	}

    public void exitExpMinus(@NotNull ExpMinusContext ctx) {
    	Exp e2 = expStack.pop();
		Exp e1 = expStack.pop();
		expStack.push(new Minus(e1, e2));
	}

    public void exitExpLessThan(@NotNull ExpLessThanContext ctx) {
    	//attention to order!
    	Exp e2 = expStack.pop();
		Exp e1 = expStack.pop();
		expStack.push(new LessThan(e1, e2));
	}

    public void exitExpIntegerLiteral(@NotNull ExpIntegerLiteralContext ctx) {
    	int i = Integer.parseInt(ctx.getText());
		expStack.push(new IntegerLiteral(i));
	}

    public void exitExpIdentifierExp(@NotNull ExpIdentifierExpContext ctx) {
		expStack.push(new IdentifierExp(ctx.getText()));
	}

    public void exitExpNot(@NotNull ExpNotContext ctx) {
		Exp e = expStack.pop();
		expStack.push(new Not(e));
	}

    public void exitExpNewObject(@NotNull ExpNewObjectContext ctx) {
    	Identifier id = getId(ctx, 1);
		expStack.push(new NewObject(id));
	}

    public void exitExpTrue(@NotNull ExpTrueContext ctx) {
		expStack.push(new True());
	}

    public void exitExpFalse(@NotNull ExpFalseContext ctx) {
		expStack.push(new False());
	}

    public void exitExpBracket(@NotNull ExpBracketContext ctx) {
		//no corresponding element in AST
	}

    public void exitExpNewArray(@NotNull ExpNewArrayContext ctx) {
    	Exp e = expStack.pop();
		expStack.push(new NewArray(e));
	}

    public void exitExpThis(@NotNull ExpThisContext ctx) {
		expStack.push(new This());
	}

    public void exitExpArrayLength(@NotNull ExpArrayLengthContext ctx) {
    	Exp e = expStack.pop();
		expStack.push(new ArrayLength(e));
	}
    
    public void enterCallArguments(@NotNull CallArgumentsContext ctx) {
    	expStackStack.push(expStack);
    	expStack = new Stack<Exp>();
    }
    
    public void exitCallArguments(@NotNull CallArgumentsContext ctx) {
    	ExpList expl = new ExpList();
    	for(Exp e : expStack) {
    		expl.addElement(e);
    	}
    	expListStack.push(expl);
    	expStack = expStackStack.pop();
    }

    public void exitExpCall(@NotNull ExpCallContext ctx) {
    	ExpList args = expListStack.pop();
    	Identifier id = getId(ctx, 2);
    	Exp e = expStack.pop();
    	expStack.push(new Call(e, id, args));
	}
}
