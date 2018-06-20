package br.ufpe.cin.if688.minijava.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import br.ufpe.cin.if688.minijava.ast.Program;
import br.ufpe.cin.if688.minijava.visitor.BuildSymbolTableVisitor;
import br.ufpe.cin.if688.minijava.visitor.PrettyPrintVisitor;
import br.ufpe.cin.if688.minijava.visitor.TypeCheckVisitor;
import minijava.ASTGenerator;
import minijava.generated.*;

public class Main {
	private static String DIVISOR = "____________________________________________";

	public static void main(String[] args) throws IOException {
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
				BuildSymbolTableVisitor bstv = new BuildSymbolTableVisitor();
				bstv.visit(p);
				new TypeCheckVisitor(bstv.getSymbolTable()).visit(p);
				System.out.println(DIVISOR);
			}
		}
		
		System.out.println("\n###########################################\n" + 
		                     "# Now analyzing programs with type errors #\n" +
				             "###########################################\n");
		
		folder = new File("src/test/resources/type-errors");
		listOfFiles = folder.listFiles();
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
				
				System.out.println("Building symbol table.");
				BuildSymbolTableVisitor bstv = new BuildSymbolTableVisitor();
				try {
					bstv.visit(p);
				} catch (Error e) {
					System.out.println(e.getMessage());
				}
				
				System.out.println("Performing type-checking.");
				try {
					new TypeCheckVisitor(bstv.getSymbolTable()).visit(p);
				} catch (Error e) {
					System.out.println(e.getMessage());
				}
				System.out.println(DIVISOR);
			}
		}
	}

}
