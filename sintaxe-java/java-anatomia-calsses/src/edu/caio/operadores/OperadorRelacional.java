package edu.caio.operadores;
public class OperadorRelacional {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Numeros iguais: " + simNao);

        String nomeUm = "caio";
        String nomeDois = new String("caio");

        System.out.println(nomeUm == nomeDois);
        
        // Para objetos ou texto usamos equals()
        System.out.println(nomeUm.equals(nomeDois));
    }
}
