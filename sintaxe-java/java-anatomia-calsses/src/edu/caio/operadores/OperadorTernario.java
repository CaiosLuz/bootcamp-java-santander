package edu.caio.operadores;
public class OperadorTernario {
    public static void main(String[] args) {
        int a, b;

        a = 5; 
        b = 6;

        String resultado = "";

        if(a == b){
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }

        System.out.println(resultado);

        // Utilizando o Ternário
        String resultadoTernario = a == b ? "verdadeiro" : "falso";

        System.out.println(resultadoTernario);
    }
}
