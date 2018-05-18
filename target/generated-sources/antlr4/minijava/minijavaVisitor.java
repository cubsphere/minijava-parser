// Generated from minijava.g4 by ANTLR 4.4

	package minijava;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link minijavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface minijavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code main}
	 * labeled alternative in {@link minijavaParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(@NotNull minijavaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code program}
	 * labeled alternative in {@link minijavaParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull minijavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link minijavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(@NotNull minijavaParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmBlock}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmBlock(@NotNull minijavaParser.StmBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmWhile}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmWhile(@NotNull minijavaParser.StmWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expArrayLookup}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpArrayLookup(@NotNull minijavaParser.ExpArrayLookupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAnd(@NotNull minijavaParser.ExpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeIntArray}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIntArray(@NotNull minijavaParser.TypeIntArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expIdentifierExp}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpIdentifierExp(@NotNull minijavaParser.ExpIdentifierExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLessThan}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLessThan(@NotNull minijavaParser.ExpLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expTimes}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTimes(@NotNull minijavaParser.ExpTimesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expIntegerLiteral}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpIntegerLiteral(@NotNull minijavaParser.ExpIntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMinus}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMinus(@NotNull minijavaParser.ExpMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNot}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNot(@NotNull minijavaParser.ExpNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmArrayAssign}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmArrayAssign(@NotNull minijavaParser.StmArrayAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmIf}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmIf(@NotNull minijavaParser.StmIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNewObject}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNewObject(@NotNull minijavaParser.ExpNewObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDecl}
	 * labeled alternative in {@link minijavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(@NotNull minijavaParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expTrue}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTrue(@NotNull minijavaParser.ExpTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInteger}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInteger(@NotNull minijavaParser.TypeIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expFalse}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFalse(@NotNull minijavaParser.ExpFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expBracket}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBracket(@NotNull minijavaParser.ExpBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNewArray}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNewArray(@NotNull minijavaParser.ExpNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmPrint}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmPrint(@NotNull minijavaParser.StmPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expThis}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpThis(@NotNull minijavaParser.ExpThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expArrayLength}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpArrayLength(@NotNull minijavaParser.ExpArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeIdentifier}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(@NotNull minijavaParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmAssign}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmAssign(@NotNull minijavaParser.StmAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBoolean}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBoolean(@NotNull minijavaParser.TypeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPlus}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPlus(@NotNull minijavaParser.ExpPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link minijavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(@NotNull minijavaParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expCall}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCall(@NotNull minijavaParser.ExpCallContext ctx);
}