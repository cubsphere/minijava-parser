grammar minijava;

@header {
	package minijava;
}
goal: mainClass ( classDeclaration )* EOF;

mainClass: CLASS IDENTIFIER RCURLY PUBLIC STATIC VOID VOID LBRACKET 'String' LBRACE RBRACE IDENTIFIER RBRACKET LCURLY statement RCURLY;
classDeclaration: CLASS IDENTIFIER ( EXTENDS IDENTIFIER )? LCURLY ( varDeclaration )* ( methodDeclaration )* RCURLY;

varDeclaration: type IDENTIFIER SEMICOLON;
methodDeclaration: PUBLIC type IDENTIFIER LBRACKET ( type IDENTIFIER ( COLON type IDENTIFIER )* )? RBRACKET LCURLY ( varDeclaration )* ( statement )* RETURN expression SEMICOLON RCURLY;

type:
  INT LBRACE RBRACE
| BOOLEAN
| INT
| IDENTIFIER
;

statement:
  LCURLY ( statement )* RCURLY
| IF LBRACKET expression RBRACKET statement ELSE statement
| WHILE LBRACKET expression RBRACKET statement
| PRINT LBRACKET expression RBRACKET SEMICOLON
| IDENTIFIER EQUAL_ATTRIBUTION expression SEMICOLON
| IDENTIFIER LBRACE expression RBRACE EQUAL_ATTRIBUTION expression SEMICOLON
;

expression:
  <assoc=left> expression ( LESSTHAN | AND | PLUS | MINUS | TIMES ) expression
| <assoc=left> expression LBRACE expression RBRACE
| <assoc=left> expression DOT 'length'
| <assoc=left> expression DOT IDENTIFIER LBRACKET ( expression ( COLON expression )* )? RBRACKET
| INTEGER_LITERAL
| TRUE
| FALSE
| IDENTIFIER
| THIS
| NEW INT LBRACE expression RBRACE
| NEW IDENTIFIER LBRACKET RBRACKET
| NOT expression
| LBRACKET expression RBRACKET
;

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
EQUAL_ATTRIBUTION: '=';
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











