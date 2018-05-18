package minijava;

import java.util.Stack;

import br.ufpe.cin.if688.minijava.ast.*;
import minijava.*;

public class ASTGenerator<Program> extends minijavaBaseVisitor<Program> {
	private Stack<Exp> expStack;
	private Stack<Statement> stmStack;
	
	public ASTGenerator() {
		super();
		this.expStack = new Stack<Exp>();
		this.stmStack = new Stack<Statement>();
	}
	
	public void hello() {
		System.out.println("hello");
	}
}
