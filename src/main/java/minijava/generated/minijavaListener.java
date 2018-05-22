// Generated from minijava.g4 by ANTLR 4.4

	package minijava.generated;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link minijavaParser}.
 */
public interface minijavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link minijavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull minijavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull minijavaParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull minijavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull minijavaParser.MainClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#callArguments}.
	 * @param ctx the parse tree
	 */
	void enterCallArguments(@NotNull minijavaParser.CallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#callArguments}.
	 * @param ctx the parse tree
	 */
	void exitCallArguments(@NotNull minijavaParser.CallArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link minijavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(@NotNull minijavaParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link minijavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(@NotNull minijavaParser.MethodDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull minijavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull minijavaParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull minijavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull minijavaParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#varDeclList}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclList(@NotNull minijavaParser.VarDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#varDeclList}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclList(@NotNull minijavaParser.VarDeclListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stmBlock}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmBlock(@NotNull minijavaParser.StmBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmBlock}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmBlock(@NotNull minijavaParser.StmBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull minijavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull minijavaParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stmWhile}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmWhile(@NotNull minijavaParser.StmWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmWhile}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmWhile(@NotNull minijavaParser.StmWhileContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expArrayLookup}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpArrayLookup(@NotNull minijavaParser.ExpArrayLookupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expArrayLookup}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpArrayLookup(@NotNull minijavaParser.ExpArrayLookupContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpAnd(@NotNull minijavaParser.ExpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expAnd}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpAnd(@NotNull minijavaParser.ExpAndContext ctx);

	/**
	 * Enter a parse tree produced by the {@code typeIntArray}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeIntArray(@NotNull minijavaParser.TypeIntArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeIntArray}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeIntArray(@NotNull minijavaParser.TypeIntArrayContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expIdentifierExp}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpIdentifierExp(@NotNull minijavaParser.ExpIdentifierExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expIdentifierExp}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpIdentifierExp(@NotNull minijavaParser.ExpIdentifierExpContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expLessThan}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpLessThan(@NotNull minijavaParser.ExpLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLessThan}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpLessThan(@NotNull minijavaParser.ExpLessThanContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull minijavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull minijavaParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expTimes}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpTimes(@NotNull minijavaParser.ExpTimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expTimes}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpTimes(@NotNull minijavaParser.ExpTimesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expIntegerLiteral}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpIntegerLiteral(@NotNull minijavaParser.ExpIntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expIntegerLiteral}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpIntegerLiteral(@NotNull minijavaParser.ExpIntegerLiteralContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expMinus}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpMinus(@NotNull minijavaParser.ExpMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMinus}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpMinus(@NotNull minijavaParser.ExpMinusContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expNot}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpNot(@NotNull minijavaParser.ExpNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNot}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpNot(@NotNull minijavaParser.ExpNotContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stmArrayAssign}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmArrayAssign(@NotNull minijavaParser.StmArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmArrayAssign}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmArrayAssign(@NotNull minijavaParser.StmArrayAssignContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stmIf}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmIf(@NotNull minijavaParser.StmIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmIf}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmIf(@NotNull minijavaParser.StmIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull minijavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull minijavaParser.GoalContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull minijavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull minijavaParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expNewObject}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpNewObject(@NotNull minijavaParser.ExpNewObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNewObject}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpNewObject(@NotNull minijavaParser.ExpNewObjectContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expTrue}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpTrue(@NotNull minijavaParser.ExpTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expTrue}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpTrue(@NotNull minijavaParser.ExpTrueContext ctx);

	/**
	 * Enter a parse tree produced by the {@code classDecl}
	 * labeled alternative in {@link minijavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(@NotNull minijavaParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDecl}
	 * labeled alternative in {@link minijavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(@NotNull minijavaParser.ClassDeclContext ctx);

	/**
	 * Enter a parse tree produced by the {@code typeInteger}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInteger(@NotNull minijavaParser.TypeIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeInteger}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInteger(@NotNull minijavaParser.TypeIntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#stmList}.
	 * @param ctx the parse tree
	 */
	void enterStmList(@NotNull minijavaParser.StmListContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#stmList}.
	 * @param ctx the parse tree
	 */
	void exitStmList(@NotNull minijavaParser.StmListContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull minijavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull minijavaParser.VarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expFalse}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpFalse(@NotNull minijavaParser.ExpFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expFalse}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpFalse(@NotNull minijavaParser.ExpFalseContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#methodDeclList}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclList(@NotNull minijavaParser.MethodDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#methodDeclList}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclList(@NotNull minijavaParser.MethodDeclListContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(@NotNull minijavaParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(@NotNull minijavaParser.FormalContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expBracket}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpBracket(@NotNull minijavaParser.ExpBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expBracket}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpBracket(@NotNull minijavaParser.ExpBracketContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expNewArray}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpNewArray(@NotNull minijavaParser.ExpNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNewArray}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpNewArray(@NotNull minijavaParser.ExpNewArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link minijavaParser#formalList}.
	 * @param ctx the parse tree
	 */
	void enterFormalList(@NotNull minijavaParser.FormalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link minijavaParser#formalList}.
	 * @param ctx the parse tree
	 */
	void exitFormalList(@NotNull minijavaParser.FormalListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expThis}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpThis(@NotNull minijavaParser.ExpThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expThis}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpThis(@NotNull minijavaParser.ExpThisContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stmPrint}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmPrint(@NotNull minijavaParser.StmPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmPrint}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmPrint(@NotNull minijavaParser.StmPrintContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expArrayLength}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpArrayLength(@NotNull minijavaParser.ExpArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expArrayLength}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpArrayLength(@NotNull minijavaParser.ExpArrayLengthContext ctx);

	/**
	 * Enter a parse tree produced by the {@code typeIdentifier}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(@NotNull minijavaParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeIdentifier}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(@NotNull minijavaParser.TypeIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stmAssign}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmAssign(@NotNull minijavaParser.StmAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmAssign}
	 * labeled alternative in {@link minijavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmAssign(@NotNull minijavaParser.StmAssignContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expPlus}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpPlus(@NotNull minijavaParser.ExpPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPlus}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpPlus(@NotNull minijavaParser.ExpPlusContext ctx);

	/**
	 * Enter a parse tree produced by the {@code typeBoolean}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoolean(@NotNull minijavaParser.TypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBoolean}
	 * labeled alternative in {@link minijavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoolean(@NotNull minijavaParser.TypeBooleanContext ctx);

	/**
	 * Enter a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link minijavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull minijavaParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link minijavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull minijavaParser.VarDeclContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expCall}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpCall(@NotNull minijavaParser.ExpCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expCall}
	 * labeled alternative in {@link minijavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpCall(@NotNull minijavaParser.ExpCallContext ctx);
}