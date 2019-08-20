grammar HogwartsGrammar;

ID: [a-z]+;
WS: [ \t\r\n]+ -> skip;

cmd_impedimenta: 'cmd_impedimentaTO_WRITE';
variavel: 'variavelTO_WRITE';
inteiro: 'inteiroTO_WRITE';
real: 'realTO_WRITE';

programa:
	'HOUSES' houses 'HOGWARTS' comandos 'Albus' 'Dumbledore';

houses: house | house '@' houses;

house:
	'Gryffindor' alunos '$'
	| 'Ravenclaw' alunos '$'
	| 'Slytherin' alunos '$'
	| 'Hufflepuff' alunos '$';

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
	| cmd_impedimenta; // break

cmd_revelio:
	'revelio' '(' expressao ')'; // print

cmd_petrificus:
	'petrificus' 'totalus' '(' condicao ')' '[' comandos ']'; // while

cmd_protego: 'protego' variavel 'lumos' expressao; // atribuicao

cmd_homenum: 'homenum' 'revelio' '(' variavel ')'; // leitura

cmd_expelliarmus:
	'expelliarmus' variavel 'avada' 'kedavra' expressao // for
	'crucio' expressao '[' comandos ']';

cmd_leviosa:
	'wingardium' 'leviosa' '(' condicao ')' '[' comandos ']'
	| 'wingardium' 'leviosa' '(' condicao ')' '[' comandos ']' else; // if

else: 'alohomora' '[' comandos ']';

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

fator: inteiro | real | '(' expressao ')';

condicao:
	expressao ':-)' expressao // >
	| expressao ':-(' expressao // <
	| expressao ':-o' expressao // >=
	| expressao ':-x' expressao // <=
	| expressao ':-|' expressao // ==
	| expressao ';-]' expressao; // !=