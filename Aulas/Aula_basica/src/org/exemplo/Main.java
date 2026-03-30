package org.exemplo;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.Saldo = 700;
        conta.NumeroConta = 157;
        conta.agencia = 0001;
        conta.limit = 400;

        conta.deposito(600);

        System.out.println("Sua agencia é " + conta.agencia);
        System.out.println("R$ " + conta.Saldo);

        conta.retirada(800);

        System.out.println("R$ " + conta.Saldo);

    }
}