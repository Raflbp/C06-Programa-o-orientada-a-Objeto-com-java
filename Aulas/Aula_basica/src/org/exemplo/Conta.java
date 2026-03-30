package org.exemplo;

public class Conta {

    public int NumeroConta;
    public double Saldo;
    public int agencia;
    public double limit;

    public void deposito(double quantia){
        this.Saldo += quantia;
    }

    public void retirada(double quantia){
        this.Saldo -= quantia;
    }
}


