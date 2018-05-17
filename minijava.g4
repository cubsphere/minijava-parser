grammar minijava;

@header {
	package minijava;
}
goal: MainClass ( ClassDeclaration )*;

MainClass: 'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' Statement '}' '}';
ClassDeclaration: 'class' Identifier ( 'extends' Identifier )? '{' ( VarDeclaration )* ( MethodDeclaration )* '}';

VarDeclaration: Type Identifier ';';
MethodDeclaration: 'public' Type Identifier '(' ( Type Identifier ( ',' Type Identifier )* )? ')' '{' ( VarDeclaration )* ( Statement )* 'return' Expression ';' '}';

Type: 'int' '[' ']' | 'boolean'| 'int' | Identifier;

Statement:
  '{' ( Statement )* '}'
| 'if' '(' Expression ')' Statement 'else' Statement
| 'while' '(' Expression ')' Statement
| 'System.out.println' '(' Expression ')' ';'
| Identifier '=' Expression ';'
| Identifier '[' Expression ']' '=' Expression ';'
;

Expression: Expression1;

/*
Expression:
  Expression ( '&&' | '<' | '+' | '-' | '*' ) Expression
| Expression '[' Expression ']'
| Expression '.' 'length'
| Expression '.' Identifier '(' ( Expression ( ',' Expression )* )? ')'
| INTEGER_LITERAL
| 'true'
| 'false'
| Identifier
| 'this'
| 'new' 'int' '[' Expression ']'
| 'new' Identifier '(' ')'
| '!' Expression
| '(' Expression ')'
;
*/

Expression1:
  INTEGER_LITERAL Expression2
| 'true' Expression2
| 'false' Expression2
| Identifier Expression2
| 'this' Expression2
| 'new' 'int' '[' Expression1 ']' Expression2
| 'new' Identifier '(' ')' Expression2
| '!' Expression1 Expression2
| '(' Expression1 ')' Expression2
;

Expression2:
  ( '&&' | '<' | '+' | '-' | '*' ) Expression1
| '[' Expression1 ']'
| '.' 'length'
| '.' Identifier '(' ( Expression1 ( ',' Expression1 )* )? ')'
|
;

Identifier: [a-z_][a-zA-Z_0-9]*;

WS: [ \t\r\n] -> skip;
INTEGER_LITERAL: [0-9]+;











