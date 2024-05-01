package edu.caio.variaveis;
public class Variaveis {
    public static void main(String[] args) {

        // Variavel que nunca sofrerá alteração de valores
        // Para isso utilizamos a convenção UPPERCASE

        final String BR = "Brasil";
        double PI = 3.14;

        System.out.println(BR);

        /* variaveis invalidas
         * int numero&um = 1;
         * int 1numero = 1;
         * int numero um = 1;
         * int long = 1;
        */

        // Variaveis validas

        int numero$1 = 1;
        int numero1 = 1;
        int numero_um = 1;
        int longo = 1;

        // declarando variaveis e metodos

        // estrutura: tipo nomeBemDefinido = Atribuicao (opcional)

        int idade = 23;
        double altura = 1.81;
        String meuNome = "Caio";
        boolean verdadeiraFalsa;
        boolean veradeira = true;
        
        // Variaveis é uma classe, spike não tem valor
        Variaveis spike; 

        /* sugestão de nomenclatura
            definir de forma clara, sem abreviações ou definição sem sentido
            sempre no singular, exceto para se referir a um array ou coleção
            definir um idioma
         */

        // Exemplos

        double salarioMedio = 1500.99;
        String email = "aluno@email.com";
        String [] emails = {"aluno@email.com", "professor@email.com"};

        // Métodos, susgetão de nomenclatura

        /* somar(int 1, int 2){};
        abrirConexao(){};
        findById(int id){};*/

    }
}
