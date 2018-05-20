package antlr;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.Test;

import br.ufpe.cin.if688.minijava.ast.*;
import br.ufpe.cin.if688.minijava.visitor.PrettyPrintVisitor;
import minijava.*;
import minijava.minijavaParser.*;

public class TestClass {	
	private static String DIVISOR = "____________________________________________";
	
	@Test
	public void testy() throws Exception {
		File folder = new File("src/test/resources/");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			if (file.isFile()) {
				System.out.print("\n\nAnalyzing file: ");
				System.out.println(file);
				InputStream stream = new FileInputStream(file);
				ANTLRInputStream input = new ANTLRInputStream(stream);
				minijavaLexer lexer = new minijavaLexer(input);
				CommonTokenStream token = new CommonTokenStream(lexer);
				
				minijavaParser parser = new minijavaParser(token);
				ASTGenerator gen = new ASTGenerator();
				parser.addParseListener(gen);
				parser.goal();
				assert parser.getNumberOfSyntaxErrors() == 0;
				
				System.out.println("Completed analysis of: " + file + ". Printing with PPV:\n");
				Program p = gen.getProgram();
				PrettyPrintVisitor ppv = new PrettyPrintVisitor();
				ppv.visit(p);
				System.out.println(DIVISOR + "\n");
			}
		}
	}
}