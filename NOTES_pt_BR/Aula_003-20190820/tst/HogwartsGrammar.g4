grammar HogwartsGrammar;

ID: [a-z]+;
WS: [ \t\r\n]+ -> skip;

DEC_SEP: '.'; // decimal separator

VARIAVEL: ID | ID [_]ID;
INTEIRO: [0-9]+;
REAL: [0-9]+ DEC_SEP [0-9]+; //

programa:
	'HOUSES' houses 'HOGWARTS' comandos 'Albus' 'Dumbledore';

houses: house | house '@' houses;

HOUSE_NAME:
	'Gryffindor'
	| 'Ravenclaw'
	| 'Slytherin'
	| 'Hufflepuff';

house: HOUSE_NAME alunos '$';

alunos: aluno | aluno ',' alunos;

aluno: ID;

comandos: comando '.' | comando '.' comandos;

comando:
	cmd_revelio
	| cmd_petrificus
	| cmd_protego
	| cmd_homenum
	| cmd_expelliarmus
	| cmd_leviosa
	| cmd_impedimenta;

cmd_revelio: 'revelio' '(' expressao ')'; // print

cmd_petrificus:
	'petrificus' 'totalus' '(' condicao ')' '[' comandos ']'; // while

cmd_protego: 'protego' VARIAVEL 'lumos' expressao; // atribuicao

cmd_homenum: 'homenum' 'revelio' '(' VARIAVEL ')'; // leitura

cmd_expelliarmus:
	'expelliarmus' VARIAVEL 'avada' 'kedavra' expressao // for
	'crucio' expressao '[' comandos ']';

cmd_impedimenta: 'break';

cmd_leviosa:
	'wingardium' 'leviosa' '(' condicao ')' '[' comandos ']' // if
	| cmd_leviosa 'alohomora' '[' comandos ']'; // if else

expressao:
	expressao 'reparo' termo // +
	| expressao 'dissendium' termo // -
	| expressao 'sectumsempra' termo // maior de dois 
	| termo;

termo:
	termo 'aguamenti' fator // * 
	| termo 'diffindo' fator // /
	| termo 'confundo' fator // %
	| fator;

fator: INTEIRO | REAL | '(' expressao ')';

condicao:
	expressao ':-)' expressao // >
	| expressao ':-(' expressao // <
	| expressao ':-o' expressao // >=
	| expressao ':-x' expressao // <=
	| expressao ':-|' expressao // ==
	| expressao ';-]' expressao; // !=