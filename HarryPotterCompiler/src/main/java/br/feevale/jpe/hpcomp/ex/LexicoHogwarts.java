package br.feevale.jpe.hpcomp.ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

/**
 * Lexico - Plataforma 9 3/4 programming language
 *
 * @author Ricardo Ferreira de Oliveira
 * @author turma de compiladores de 2/2019
 *
 * <programa> = 'HOUSES' <houses> 'HOGWARTS' <comandos> 'Albus' 'Dumbledore'
 * <houses> = <house>
 * | <house> '@' <houses>
 * <house> = ['Gryffindor'|'Ravenclaw'|'Slytherin'|'Hufflepuff'] <alunos> '$'
 * <alunos> = <aluno>
 * | <aluno> ',' <alunos>
 * <aluno> = <id>
 * <comandos> = <comando> '.' | <comando> '.' <comandos>
 * <comando> = <cmd_revelio>
 * | <cmd_petrificus>
 * | <cmd_protego>
 * | <cmd_homenum>
 * | <cmd_expelliarmus>
 * | <cmd_leviosa>
 * | <cmd_impedimenta> // break
 * <cmd_revelio> = 'revelio' '(' <expressao> ')' // print
 * <cmd_petrificus> = 'petrificus' 'totalus' '(' <condicao> ')' '[' <comandos>
 * ']' // while
 * <cmd_protego> = 'protego' <variavel> 'lumos' <expressao> // atribuicao
 * <cmd_homenum> = 'homenum' 'revelio' '(' <variavel> ')' // leitura
 * <cmd_expelliarmus> = 'expelliarmus' <variavel> 'avada' 'kedavra' <expressao>
 * // for 'crucio' <expressao> '[' <comandos> ']'
 * <cmd_leviosa> = 'wingardium' 'leviosa' '(' <condicao> ')' '[' <comandos> ']'
 * <else> // if
 * <else> = epsilon | 'alohomora' '[' <comandos> ']'
 * <expressao> = <expressao> 'reparo' <termo> // + | <expressao> 'dissendium'
 * <termo> // - | <expressao> 'sectumsempra' <termo> // maior de dois | <termo>
 * <termo > = <termo> 'aguamenti' <fator> // * | <termo> 'diffindo' <fator> // /
 * | <termo> 'confundo' <fator> // % | <fator>
 *
 * <fator> = <inteiro>
 * | <real>
 * | '(' <expressao> ')
 * <condicao> = <expressao> :-) <expressao> // > | <expressao> :-( <expressao>
 * // < | <expressao> :-o
 * <expressao> // >= | <expressao> :-# <expressao> // <= | <expressao> :-|
 * <expressao> // == | <expressao> ;-] <expressao> // !=
 */
public class LexicoHogwarts {

    static final int T_AND = 1;
    static final int T_ASSERT = 2;
    static final int T_BREAK = 3;
    static final int T_CLASS = 4;
    static final int T_CONTINUE = 5;
    static final int T_DEF = 6;
    static final int T_DEL = 7;
    static final int T_ELIF = 8;
    static final int T_ELSE = 9;
    static final int T_EXCEPT = 10;
    static final int T_EXEC = 11;
    static final int T_FINALLY = 12;
    static final int T_FOR = 13;
    static final int T_FROM = 14;
    static final int T_GLOBAL = 15;
    static final int T_IF = 16;
    static final int T_IMPORT = 17;
    static final int T_IN = 18;
    static final int T_IS = 19;
    static final int T_LAMBDA = 20;
    static final int T_NOT = 21;
    static final int T_OR = 22;
    static final int T_PASS = 23;
    static final int T_PRINT = 24;
    static final int T_RAISE = 25;
    static final int T_RETURN = 26;
    static final int T_TRY = 27;
    static final int T_WHILE = 28;
    static final int T_YIELD = 29;
    static final int T_ID = 30;
    static final int T_NUMERO = 31;
    static final int T_ABRE_PARENTE = 32;
    static final int T_FECHA_PARENTE = 33;

    static final int T_MAIS = 34;
    static final int T_MENOS = 35;
    static final int T_VEZES = 36;
    static final int T_DIVIDIDO = 37;
    static final int T_DOIS_PONTOS = 38;
    static final int T_MAIOR = 39;
    static final int T_MENOR = 40;
    static final int T_MAIOR_IGUAL = 41;
    static final int T_MENOR_IGUAL = 42;
    static final int T_IGUAL = 43;
    static final int T_DIFERENTE = 44;
    static final int T_ATRIBUICAO = 45;

    static final int T_FIM_FONTE = 90;
    static final int T_ERRO_LEX = 98;
    static final int T_NULO = 99;

    static final int FIM_ARQUIVO = 26;

    static File arqFonte;
    static BufferedReader rdFonte;
    static File arqDestino;

    static char lookAhead;
    static int token;
    static String lexema;
    static int ponteiro;
    static String linhaFonte;
    static int linhaAtual;
    static int colunaAtual;
    static String mensagemDeErro;
    static StringBuffer tokensIdentificados = new StringBuffer();

    public static void main(String s[]) throws java.io.IOException {
        try {
            abreArquivo();
            abreDestino();
            linhaAtual = 0;
            colunaAtual = 0;
            ponteiro = 0;
            linhaFonte = "";
            token = T_NULO;
            mensagemDeErro = "";

            movelookAhead();

            while ((token != T_FIM_FONTE) && (token != T_ERRO_LEX)) {
                buscaProximoToken();
                mostraToken();
            }

            if (token == T_ERRO_LEX) {
                JOptionPane.showMessageDialog(null, mensagemDeErro, "Erro L�xico!", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "An�lise L�xica terminada sem erros l�xicos", "An�lise L�xica terminada!", JOptionPane.INFORMATION_MESSAGE);
            }

            exibeTokens();

            gravaSaida(arqDestino);

            fechaFonte();

        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "Arquivo nao existe!", "FileNotFoundException!", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedEncodingException uee) {
            JOptionPane.showMessageDialog(null, "Erro desconhecido", "UnsupportedEncodingException!", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Erro de io: " + ioe.getMessage(), "IOException!", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.out.println("Execucao terminada!");
        }
    }

    static void fechaFonte() throws IOException {
        rdFonte.close();
    }

    static void movelookAhead() throws IOException {
        if ((ponteiro + 1) > linhaFonte.length()) {
            linhaAtual++;
            ponteiro = 0;
            if ((linhaFonte = rdFonte.readLine()) == null) {
                lookAhead = FIM_ARQUIVO;
            } else {
                StringBuffer sbLinhaFonte = new StringBuffer(linhaFonte);
                sbLinhaFonte.append('\13').append('\10');
                linhaFonte = sbLinhaFonte.toString();

                lookAhead = linhaFonte.charAt(ponteiro);
            }
        } else {
            lookAhead = linhaFonte.charAt(ponteiro);
        }

        ponteiro++;
        colunaAtual = ponteiro + 1;
    }

    static void buscaProximoToken() throws IOException {
        int i, j;

        StringBuffer sbLexema = new StringBuffer("");

        while ((lookAhead == 9)
                || (lookAhead == '\n')
                || (lookAhead == 8)
                || (lookAhead == 11)
                || (lookAhead == 12)
                || (lookAhead == '\r')
                || (lookAhead == 32)) {
            movelookAhead();
        }

        /*--------------------------------------------------------------*
     * Caso o primeiro caracter seja alfabetico, procuro capturar a *
     * sequencia de caracteres que se segue a ele e classifica-la   *
     *--------------------------------------------------------------*/
        if (((lookAhead >= 'A') && (lookAhead <= 'Z'))
                || ((lookAhead >= 'a') && (lookAhead <= 'z'))) {

            sbLexema.append(lookAhead);
            movelookAhead();

            while (((lookAhead >= 'a') && (lookAhead <= 'z'))
                    || ((lookAhead >= 'A') && (lookAhead <= 'Z'))
                    || ((lookAhead >= '0') && (lookAhead <= '9'))
                    || (lookAhead == '_')) {
                sbLexema.append(lookAhead);
                movelookAhead();
            }

            lexema = sbLexema.toString();

            /* Classifico o meu token como palavra reservada ou id */
            if (lexema.equals("and")) {
                token = T_AND;
            } else if (lexema.equals("assert")) {
                token = T_ASSERT;
            } else if (lexema.equals("break")) {
                token = T_BREAK;
            } else if (lexema.equals("class")) {
                token = T_CLASS;
            } else if (lexema.equals("continue")) {
                token = T_CONTINUE;
            } else if (lexema.equals("def")) {
                token = T_DEF;
            } else if (lexema.equals("del")) {
                token = T_DEL;
            } else if (lexema.equals("elif")) {
                token = T_ELIF;
            } else if (lexema.equals("else")) {
                token = T_ELSE;
            } else if (lexema.equals("except")) {
                token = T_EXCEPT;
            } else if (lexema.equals("exec")) {
                token = T_EXEC;
            } else if (lexema.equals("finally")) {
                token = T_FINALLY;
            } else if (lexema.equals("for")) {
                token = T_FOR;
            } else if (lexema.equals("from")) {
                token = T_FROM;
            } else if (lexema.equals("global")) {
                token = T_GLOBAL;
            } else if (lexema.equals("if")) {
                token = T_IF;
            } else if (lexema.equals("import")) {
                token = T_IMPORT;
            } else if (lexema.equals("in")) {
                token = T_IN;
            } else if (lexema.equals("is")) {
                token = T_IS;
            } else if (lexema.equals("lambda")) {
                token = T_LAMBDA;
            } else if (lexema.equals("not")) {
                token = T_NOT;
            } else if (lexema.equals("or")) {
                token = T_OR;
            } else if (lexema.equals("pass")) {
                token = T_PASS;
            } else if (lexema.equals("print")) {
                token = T_PRINT;
            } else if (lexema.equals("raise")) {
                token = T_RAISE;
            } else if (lexema.equals("return")) {
                token = T_RETURN;
            } else if (lexema.equals("try")) {
                token = T_TRY;
            } else if (lexema.equals("while")) {
                token = T_WHILE;
            } else if (lexema.equals("yield")) {
                token = T_YIELD;
            } else {
                token = T_ID;
            }
        } else if ((lookAhead >= '0') && (lookAhead <= '9')) {
            sbLexema.append(lookAhead);
            movelookAhead();
            while ((lookAhead >= '0') && (lookAhead <= '9')) {
                sbLexema.append(lookAhead);
                movelookAhead();
            }
            if (lookAhead == '.') {
                sbLexema.append(lookAhead);
                movelookAhead();
                while ((lookAhead >= '0') && (lookAhead <= '9')) {
                    sbLexema.append(lookAhead);
                    movelookAhead();
                }
            }
            token = T_NUMERO;
        } else if (lookAhead == '(') {
            sbLexema.append(lookAhead);
            movelookAhead();
            token = T_ABRE_PARENTE;
        } else if (lookAhead == ')') {
            sbLexema.append(lookAhead);
            movelookAhead();
            token = T_FECHA_PARENTE;
        } else if (lookAhead == '<') {
            sbLexema.append(lookAhead);
            movelookAhead();
            if (lookAhead == '=') {
                sbLexema.append(lookAhead);
                movelookAhead();
                token = T_MENOR_IGUAL;
            } else if (lookAhead == '>') {
                sbLexema.append(lookAhead);
                movelookAhead();
                token = T_DIFERENTE;
            } else {
                token = T_MENOR;
            }
        } else if (lookAhead == '>') {
            sbLexema.append(lookAhead);
            movelookAhead();
            if (lookAhead == '=') {
                sbLexema.append(lookAhead);
                movelookAhead();
                token = T_MAIOR_IGUAL;
            } else {
                token = T_MAIOR;
            }
        } else if (lookAhead == '=') {
            sbLexema.append(lookAhead);
            movelookAhead();
            if (lookAhead == '=') {
                sbLexema.append(lookAhead);
                movelookAhead();
                token = T_IGUAL;
            } else {
                token = T_ATRIBUICAO;
            }
        } else if (lookAhead == '+') {
            sbLexema.append(lookAhead);
            movelookAhead();
            token = T_MAIS;
        } else if (lookAhead == '-') {
            sbLexema.append(lookAhead);
            movelookAhead();
            token = T_MENOS;
        } else if (lookAhead == '*') {
            sbLexema.append(lookAhead);
            movelookAhead();
            token = T_VEZES;
        } else if (lookAhead == '/') {
            sbLexema.append(lookAhead);
            movelookAhead();
            token = T_DIVIDIDO;
        } else if (lookAhead == ':') {
            sbLexema.append(lookAhead);
            movelookAhead();
            token = T_DOIS_PONTOS;
        } else if (lookAhead == FIM_ARQUIVO) {
            token = T_FIM_FONTE;
        } else {
            token = T_ERRO_LEX;
            mensagemDeErro = "Erro L�xico na linha: " + linhaAtual + "\nReconhecido ao atingir a coluna: " + colunaAtual + "\nLinha do Erro: <" + linhaFonte + ">\nToken desconhecido: " + lookAhead;
            sbLexema.append(lookAhead);
        }

        lexema = sbLexema.toString();
    }

    static void mostraToken() {

        StringBuffer tokenLexema = new StringBuffer("");

        switch (token) {
            case T_AND:
                tokenLexema.append("T_AND");
                break;
            case T_ASSERT:
                tokenLexema.append("T_ASSERT");
                break;
            case T_BREAK:
                tokenLexema.append("T_BREAK");
                break;
            case T_CLASS:
                tokenLexema.append("T_CLASS");
                break;
            case T_CONTINUE:
                tokenLexema.append("T_CONTINUE");
                break;
            case T_DEF:
                tokenLexema.append("T_DEF");
                break;
            case T_DEL:
                tokenLexema.append("T_DEL");
                break;
            case T_ELIF:
                tokenLexema.append("T_ELIF");
                break;
            case T_ELSE:
                tokenLexema.append("T_ELSE");
                break;
            case T_EXCEPT:
                tokenLexema.append("T_EXCEPT");
                break;
            case T_EXEC:
                tokenLexema.append("T_EXEC");
                break;
            case T_FINALLY:
                tokenLexema.append("T_FINALLY");
                break;
            case T_FOR:
                tokenLexema.append("T_FOR");
                break;
            case T_FROM:
                tokenLexema.append("T_FROM");
                break;
            case T_GLOBAL:
                tokenLexema.append("T_GLOBAL");
                break;
            case T_IF:
                tokenLexema.append("T_IF");
                break;
            case T_IMPORT:
                tokenLexema.append("T_IMPORT");
                break;
            case T_IN:
                tokenLexema.append("T_IN");
                break;
            case T_IS:
                tokenLexema.append("T_IS");
                break;
            case T_LAMBDA:
                tokenLexema.append("T_LAMBDA");
                break;
            case T_NOT:
                tokenLexema.append("T_NOT");
                break;
            case T_OR:
                tokenLexema.append("T_OR");
                break;
            case T_PASS:
                tokenLexema.append("T_PASS");
                break;
            case T_PRINT:
                tokenLexema.append("T_PRINT");
                break;
            case T_RAISE:
                tokenLexema.append("T_RAISE");
                break;
            case T_RETURN:
                tokenLexema.append("T_RETURN");
                break;
            case T_TRY:
                tokenLexema.append("T_TRY");
                break;
            case T_WHILE:
                tokenLexema.append("T_WHILE");
                break;
            case T_YIELD:
                tokenLexema.append("T_YIELD");
                break;
            case T_ID:
                tokenLexema.append("T_ID");
                break;
            case T_ABRE_PARENTE:
                tokenLexema.append("T_ABRE_PARENTE");
                break;
            case T_FECHA_PARENTE:
                tokenLexema.append("T_FECHA_PARENTE");
                break;
            case T_FIM_FONTE:
                tokenLexema.append("T_FIM_FONTE");
                break;
            case T_ERRO_LEX:
                tokenLexema.append("T_ERRO_LEX");
                break;
            case T_NULO:
                tokenLexema.append("T_NULO");
                break;
            case T_NUMERO:
                tokenLexema.append("T_NUMERO");
                break;
            case T_MAIS:
                tokenLexema.append("T_MAIS");
                break;
            case T_MENOS:
                tokenLexema.append("T_MENOS");
                break;
            case T_VEZES:
                tokenLexema.append("T_VEZES");
                break;
            case T_DIVIDIDO:
                tokenLexema.append("T_DIVIDIDO");
                break;
            case T_DOIS_PONTOS:
                tokenLexema.append("T_DOIS_PONTOS");
                break;
            case T_MAIOR:
                tokenLexema.append("T_MAIOR");
                break;
            case T_MENOR:
                tokenLexema.append("T_MENOR");
                break;
            case T_MAIOR_IGUAL:
                tokenLexema.append("T_MAIOR_IGUAL");
                break;
            case T_MENOR_IGUAL:
                tokenLexema.append("T_MENOR_IGUAL");
                break;
            case T_IGUAL:
                tokenLexema.append("T_IGUAL");
                break;
            case T_DIFERENTE:
                tokenLexema.append("T_DIFERENTE");
                break;
            case T_ATRIBUICAO:
                tokenLexema.append("T_ATRIBUICAO");
                break;

            default:
                tokenLexema.append("N/A");
                break;
        }
        System.out.println(tokenLexema.toString() + " ( " + lexema + " )");
        acumulaToken(tokenLexema.toString() + " ( " + lexema + " )");
        tokenLexema.append(lexema);
    }

    private static void abreArquivo() {

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FiltroMe filtro = new FiltroMe();

        fileChooser.addChoosableFileFilter(filtro);
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }

        arqFonte = fileChooser.getSelectedFile();
        abreFonte(arqFonte);

    }

    private static boolean abreFonte(File fileName) {

        if (arqFonte == null || fileName.getName().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nome de Arquivo Inv�lido", "Nome de Arquivo Inv�lido", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            linhaAtual = 1;
            try {
                FileReader fr = new FileReader(arqFonte);
                rdFonte = new BufferedReader(fr);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return true;
        }
    }

    private static void abreDestino() {

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FiltroMe filtro = new FiltroMe();

        fileChooser.addChoosableFileFilter(filtro);
        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }

        arqDestino = fileChooser.getSelectedFile();
    }

    private static boolean gravaSaida(File fileName) {

        if (arqDestino == null || fileName.getName().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nome de Arquivo Inv�lido", "Nome de Arquivo Inv�lido", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            FileWriter fw;
            try {
                System.out.println(arqDestino.toString());
                System.out.println(tokensIdentificados.toString());
                fw = new FileWriter(arqDestino);
                BufferedWriter bfw = new BufferedWriter(fw);
                bfw.write(tokensIdentificados.toString());
                bfw.close();
                JOptionPane.showMessageDialog(null, "Arquivo Salvo: " + arqDestino, "Salvando Arquivo", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de Entrada/Sa�da", JOptionPane.ERROR_MESSAGE);
            }
            return true;
        }
    }

    public static void exibeTokens() {

        JTextArea texto = new JTextArea();
        texto.append(tokensIdentificados.toString());
        JOptionPane.showMessageDialog(null, texto, "Tokens Identificados (token/lexema)", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void acumulaToken(String tokenIdentificado) {

        tokensIdentificados.append(tokenIdentificado);
        tokensIdentificados.append("\n");

    }

}

/**
 * Classe Interna para cria��o de filtro de sele��o
 */
class FiltroMe extends FileFilter {

    public boolean accept(File arg0) {
        if (arg0 != null) {
            if (arg0.isDirectory()) {
                return true;
            }
            if (getExtensao(arg0) != null) {
                if (getExtensao(arg0).equalsIgnoreCase("py")) {
                    return true;
                }
            };
        }
        return false;
    }

    /**
     * Retorna quais extens�es poder�o ser escolhidas
     */
    public String getDescription() {
        return "*.py";
    }

    /**
     * Retorna a parte com a extens�o de um arquivo
     */
    public String getExtensao(File arq) {
        if (arq != null) {
            String filename = arq.getName();
            int i = filename.lastIndexOf('.');
            if (i > 0 && i < filename.length() - 1) {
                return filename.substring(i + 1).toLowerCase();
            };
        }
        return null;
    }
}
