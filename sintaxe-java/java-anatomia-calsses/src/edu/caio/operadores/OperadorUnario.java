package edu.caio.operadores;
public class OperadorUnario {
    public static void main(String[] args) {
        
        int numero = 5;
        numero = - numero; // convertemos o número positivo em um numero negativo

        System.out.println("Número negativo: " + numero);

        // Converter em um número postivo
        
        // numero  = + numero; não funciona
        // Jeito certo de se fazer:
        numero = numero * -1;
        System.out.println("Número positivo: " + numero);

        // Incremento
        // numero = numero + 1;
        // System.out.println( ++ numero );
        numero++;
        System.out.println("Incremento: " + numero);

        // Decremento
        // numero = numero - 1;
        numero--;
        System.out.println("Decremento: " + numero);

        // Boolean
        boolean variavel = true;

        variavel = !variavel; // negando a variavel tornando-a false

        variavel = !variavel; // converteu para true

        System.out.println(variavel);
    }
}
