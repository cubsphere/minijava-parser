package minijava;

import java.util.stack;
import br.ufpe.cin.if688.minijava.ast.*;
import minijava.*;

public class ASTGenerator<Void> extends minijavaBaseVisitor<Void> {
	private Stack<Expression> expStack;
	private Stack<Statement> stmStack;
	
	public ASTGenerator() {
		super();
		this.expStack = new Stack<Expression>();
		this.stmStack = new Stack<Statement>();
	}
	
	public void hello() {
		System.out.println("hello");
	}
}
