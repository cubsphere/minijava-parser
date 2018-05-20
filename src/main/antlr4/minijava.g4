grammar minijava;

@header {
	package minijava;
}
goal: program EOF;
program: mainClass ( classDeclaration )*;

mainClass: CLASS IDENTIFIER LCURLY PUBLIC STATIC VOID MAIN LBRACKET 'String' LBRACE RBRACE IDENTIFIER RBRACKET LCURLY statement RCURLY RCURLY;
classDeclaration: CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? LCURLY varDeclList methodDeclList RCURLY #classDecl;

methodDeclList: ( methodDeclaration )*;
varDeclList: ( varDeclaration )*;
formalList: ( formal ( COLON formal )* )?;
stmList: ( statement )*;

varDeclaration: type IDENTIFIER SEMICOLON #varDecl;
methodDeclaration: PUBLIC type IDENTIFIER LBRACKET formalList RBRACKET LCURLY varDeclList stmList RETURN expression SEMICOLON RCURLY #methodDecl;

formal: type IDENTIFIER;

type:
  INT LBRACE RBRACE #typeIntArray
| BOOLEAN #typeBoolean
| INT #typeInteger
| IDENTIFIER #typeIdentifier
;

statement:
  LCURLY stmList RCURLY #stmBlock
| IF LBRACKET expression RBRACKET statement ELSE statement #stmIf
| WHILE LBRACKET expression RBRACKET statement #stmWhile
| PRINT LBRACKET expression RBRACKET SEMICOLON #stmPrint
| IDENTIFIER EQUAL_ASSIGN expression SEMICOLON #stmAssign
| IDENTIFIER LBRACE expression RBRACE EQUAL_ASSIGN expression SEMICOLON #stmArrayAssign
;

expression:
 <assoc=left> expression LBRACE expression RBRACE #expArrayLookup
| <assoc=left> expression TIMES expression #expTimes
| <assoc=left> expression AND expression #expAnd
| <assoc=left> expression PLUS expression #expPlus
| <assoc=left> expression MINUS expression #expMinus
| <assoc=left> expression LESSTHAN expression #expLessThan
| <assoc=left> expression DOT 'length' #expArrayLength
| <assoc=left> expression DOT IDENTIFIER LBRACKET callArguments RBRACKET #expCall
| INTEGER_LITERAL #expIntegerLiteral
| TRUE #expTrue
| FALSE #expFalse
| IDENTIFIER #expIdentifierExp
| THIS #expThis
| NEW INT LBRACE expression RBRACE #expNewArray
| NEW IDENTIFIER LBRACKET RBRACKET #expNewObject
| NOT expression #expNot
| LBRACKET expression RBRACKET #expBracket
;

callArguments: ( expression ( COLON expression )* )?;

//structural tokens
LBRACKET: '(';
RBRACKET: ')';
LBRACE: '[';
RBRACE: ']';
LCURLY: '{';
RCURLY: '}';
SEMICOLON: ';';
COLON: ',';
DOT: '.';

//reserved words
CLASS: 'class';
EXTENDS: 'extends';
PUBLIC: 'public';
STATIC: 'static';
VOID: 'void';
MAIN: 'main';
INT: 'int';
BOOLEAN: 'boolean';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
PRINT: 'System.out.println';
NEW: 'new';
THIS: 'this';
RETURN: 'return';

//operators
EQUAL_ASSIGN: '=';
AND: '&&';
LESSTHAN: '<';
PLUS: '+';
MINUS: '-';
TIMES: '*';
NOT: '!';

//constants
TRUE: 'true';
FALSE: 'false';
INTEGER_LITERAL: [0-9]+;

//id
IDENTIFIER: [_a-zA-Z] [a-zA-Z0-9]*;

WS: [ \t\r\n] -> skip;











