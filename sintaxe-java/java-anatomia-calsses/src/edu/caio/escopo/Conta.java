package edu.caio.escopo;

public class Conta {
    // Variavel da classe conta
    double saldo = 10.0;

    public void sacar(Double valor){
        // Variavel local do método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        // diponivel em toda classe
        System.out.println(saldo);

        // disponivel apenas no método sacar
        // System.out.println(novoSaldo); não exibe
    }
}
