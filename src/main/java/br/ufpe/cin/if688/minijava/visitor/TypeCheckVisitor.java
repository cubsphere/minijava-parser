package br.ufpe.cin.if688.minijava.visitor;

import br.ufpe.cin.if688.minijava.ast.And;
import br.ufpe.cin.if688.minijava.ast.ArrayAssign;
import br.ufpe.cin.if688.minijava.ast.ArrayLength;
import br.ufpe.cin.if688.minijava.ast.ArrayLookup;
import br.ufpe.cin.if688.minijava.ast.Assign;
import br.ufpe.cin.if688.minijava.ast.Block;
import br.ufpe.cin.if688.minijava.ast.BooleanType;
import br.ufpe.cin.if688.minijava.ast.Call;
import br.ufpe.cin.if688.minijava.ast.ClassDeclExtends;
import br.ufpe.cin.if688.minijava.ast.ClassDeclSimple;
import br.ufpe.cin.if688.minijava.ast.Exp;
import br.ufpe.cin.if688.minijava.ast.False;
import br.ufpe.cin.if688.minijava.ast.Formal;
import br.ufpe.cin.if688.minijava.ast.Identifier;
import br.ufpe.cin.if688.minijava.ast.IdentifierExp;
import br.ufpe.cin.if688.minijava.ast.IdentifierType;
import br.ufpe.cin.if688.minijava.ast.If;
import br.ufpe.cin.if688.minijava.ast.IntArrayType;
import br.ufpe.cin.if688.minijava.ast.IntegerLiteral;
import br.ufpe.cin.if688.minijava.ast.IntegerType;
import br.ufpe.cin.if688.minijava.ast.LessThan;
import br.ufpe.cin.if688.minijava.ast.MainClass;
import br.ufpe.cin.if688.minijava.ast.MethodDecl;
import br.ufpe.cin.if688.minijava.ast.Minus;
import br.ufpe.cin.if688.minijava.ast.NewArray;
import br.ufpe.cin.if688.minijava.ast.NewObject;
import br.ufpe.cin.if688.minijava.ast.Not;
import br.ufpe.cin.if688.minijava.ast.Plus;
import br.ufpe.cin.if688.minijava.ast.Print;
import br.ufpe.cin.if688.minijava.ast.Program;
import br.ufpe.cin.if688.minijava.ast.This;
import br.ufpe.cin.if688.minijava.ast.Times;
import br.ufpe.cin.if688.minijava.ast.True;
import br.ufpe.cin.if688.minijava.ast.Type;
import br.ufpe.cin.if688.minijava.ast.VarDecl;
import br.ufpe.cin.if688.minijava.ast.While;
import br.ufpe.cin.if688.minijava.symboltable.Class;
import br.ufpe.cin.if688.minijava.symboltable.Method;
import br.ufpe.cin.if688.minijava.symboltable.SymbolTable;
import br.ufpe.cin.if688.minijava.symboltable.Variable;

public class TypeCheckVisitor implements IVisitor<Type> {

	private SymbolTable symbolTable;
	private Class currClass;
	private Method currMethod;
	private boolean terminateUponError;

	public TypeCheckVisitor(SymbolTable st) {
		this.symbolTable = st;
		this.terminateUponError = false;
	}
	
	private void err(String s) {
		s = "ERROR: " + s;
		if (terminateUponError) {
			throw new Error(s);
		} else {
			System.out.println(s);
		}
	}
	
	private void informativeError(String s) {
		if(currClass != null) {
			s += ", in method " + currMethod.getId() + ", in class" + currClass.getId();
		} else {
			s += ", in public static void main";
		}
		err(s);
	}

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		n.s.accept(this);
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		currClass = symbolTable.getClass(n.i.s);
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		return null;
	}

	private void parentCheck(String name, String parent) {
		if (symbolTable.getClass(parent) == null) {
			err("Parent class " + parent + " of class " + name + " was not defined");
		}
		while (parent != null) {
			if (name.equals(parent)) {
				err("Cyclic inheritance at class " + name);
				return;
			}
			try {
				parent = symbolTable.getClass(parent).parent();
			} catch (NullPointerException e) {
				return;
			}
		}
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		currClass = symbolTable.getClass(n.i.s);
		parentCheck(n.i.s, n.j.toString());
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		currClass = null;
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		return n.t;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {
		currMethod = currClass.getMethod(n.i.s);
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		
		Type t = n.e.accept(this);
		if (!symbolTable.compareTypes(t, currMethod.type())) {
			informativeError("Return value must be of type " +
		                     currMethod.type().getClass().getSimpleName() +
				             "(currently of type " + t.getClass().getSimpleName() + ")");
		}
		
		currMethod = null;
		return n.t;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		return n.t;
	}

	public Type visit(IntArrayType n) {
		return n;
	}

	public Type visit(BooleanType n) {
		return n;
	}

	public Type visit(IntegerType n) {
		return n;
	}

	// String s;
	public Type visit(IdentifierType n) {
		return n;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		if (!(n.e.accept(this) instanceof BooleanType)) {
			informativeError("Condition of an if must be evaluate to a boolean");
		}
		n.s1.accept(this);
		n.s2.accept(this);
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		if (!(n.e.accept(this) instanceof BooleanType)) {
			informativeError("Condition of a while must be evaluate to a boolean");
		}
		n.s.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		Type t1 = n.i.accept(this);
		Type t2 = n.e.accept(this);
		if(!symbolTable.compareTypes(t1, t2)) {
			informativeError("Assigment to " + n.i.s +
					         " must be of type " + t1.getClass().getSimpleName() +
					         " (currently of type " + t2.getClass().getSimpleName() + ")");
		}
		return null;
	}
	
	private void arrayCheck(Exp e , Object n) {
		Type t = e.accept(this);
		if(!(t instanceof IntArrayType)) {
			informativeError("Expected array, got " + t.getClass().getSimpleName() +
			                 ", in " + n.getClass().getSimpleName());
		}
	}
	
	private BooleanType boolCheck(Exp e, Object n) {
		Type t = e.accept(this);
		if(!(t instanceof BooleanType)) {
			informativeError("Expected boolean, got " + t.getClass().getSimpleName() +
					         ", in " + n.getClass().getSimpleName());
			return new BooleanType(); //this allows the program to continue
			                          //and possibly find more type errors.
		}
		return (BooleanType) t;
	}
	
	private IntegerType intCheck(Exp e , Object n) {
		Type t = e.accept(this);
		if(!(t instanceof IntegerType)) {
			informativeError("Expected integer, got " + t.getClass().getSimpleName() +
			                 ", in " + n.getClass().getSimpleName());
			return new IntegerType();
		}
		return (IntegerType) t;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		arrayCheck(new IdentifierExp(n.i.s), n);
		intCheck(n.e1, n);
		intCheck(n.e2, n);
		return null;
	}

	// Exp e1,e2;
	public Type visit(And n) {
		boolCheck(n.e1, n);
		return boolCheck(n.e2, n);
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		intCheck(n.e1, n);
		intCheck(n.e2, n);
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		intCheck(n.e1, n);
		return intCheck(n.e2, n);
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		intCheck(n.e1, n);
		return intCheck(n.e2, n);
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		intCheck(n.e1, n);
		return intCheck(n.e2, n);
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		arrayCheck(n.e1, n);
		return intCheck(n.e2, n);
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		arrayCheck(n.e, n);
		return new IntegerType();
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {
		IdentifierType classType = null;
		Type t = n.e.accept(this);
		if(!(t instanceof IdentifierType)) {
			informativeError("Attempted to call method of non-class type " +
		                     t.getClass().getSimpleName());
			throw new Error(""); //can't figure out the intended return type
			                     //so just stop execution instead
		} else {
			classType = (IdentifierType) t;
		}
		Method m = symbolTable.getMethod(n.i.s, classType.s);
		
		int i;
		for (i = 0; i < n.el.size(); i++) {
			Variable v = m.getParamAt(i);
			if (v == null) {
				informativeError("Call to method " + m.getId() + " has too many arguments");
				return m.type();
			}
			
			Type argType = n.el.elementAt(i).accept(this);
			if (!symbolTable.compareTypes(v.type(), argType)) {
				informativeError("Parameter \"" + v.id() + "\" of method " + m.getId() +
						         " must be of type " + v.type().getClass().getSimpleName() +
						         ", got type " + argType.getClass().getSimpleName());
			}
		}
		if (m.getParamAt(i) != null) {
			informativeError("Call to method " + m.getId() + " has too few arguments");
		}
		
		return m.type();
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) {
		return new BooleanType();
	}

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		return symbolTable.getVarType(currMethod, currClass, n.s);
	}

	public Type visit(This n) {
		try {
			return new IdentifierType(currClass.getId());
		} catch (NullPointerException e) {
			err("Cannot use \"this\" in main method");
		}
		System.exit(0);
		return null;
	}

	// Exp e;
	public Type visit(NewArray n) {
		intCheck(n.e, n);
		return new IntArrayType();
	}

	// Identifier i;
	public Type visit(NewObject n) {
		return new IdentifierType(n.i.s);
	}

	// Exp e;
	public Type visit(Not n) {
		boolCheck(n.e, n);
		return new BooleanType();
	}

	// String s;
	public Type visit(Identifier n) {
		return symbolTable.getVarType(currMethod, currClass, n.s);
	}
}
