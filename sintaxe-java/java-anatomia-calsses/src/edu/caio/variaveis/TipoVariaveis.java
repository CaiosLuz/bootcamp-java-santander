package edu.caio.variaveis;
public class TipoVariaveis {
    public static void main(String[] args) {
        
        // Tipos de dados

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero é melhor usar outro tipo para a variavel
        long cpf = 98765432109L;
        float pi = 3.14F; // precisa terminar com F, se não vai pedir para usar o tipo double
        double salario = 1275.33; // precisar terminar com L

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Constante
        // não pode ser modificado depois de declarado
        // Utilizamos o final depois o tipo e por fir o valor
        // variavel tem que ser escrita em caixa alta

        // exemplo sem constante
        int numero = 1;
        numero = 2;

        // exemplo de uma constante 
        final int NUMERO_CONSTANTE = 1;
        
    }
}