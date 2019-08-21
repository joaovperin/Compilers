grammar PerinGrammar;

ID: [a-z]+;
WS: [ \t\r\n]+ -> skip;

DEC_SEP: '.'; // decimal separator

VARIAVEL: ID | ID [_]ID;
NUMBER: [0-9]+ | [0-9]+ . [0-9]+;

function: intrinsec_function;
intrinsec_function: 'print' | 'puts' | 'printf';

program: stmt stmt | stmt;

stmt: stmt_function | stmt_if;

stmt_if:
	'if' '(' condicao ')' stmt
	| 'if' '(' condicao ')' '{' stmt '}'
	| stmt_if 'else' stmt
	| stmt_if 'else' '{' stmt '}';

stmt_function: function '(' expr ')';

expr: expr '+' term | expr '-' term | term;

term: term '*' factor | term '/' factor | factor;

factor: NUMBER | '(' expr ')';

condicao:
	expr '>' expr
	| expr '<' expr
	| expr '>=' expr
	| expr '<=' expr
	| expr '==' expr
	| expr '!=' expr;