package desafio;

public class ContaBancaria {
    protected int numero;
    protected double saldo;

    public ContaBancaria (int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Você tentou sacar R$" + valor + ". Porém, você só possui R$" + saldo + ". Saldo insuficiente!");
            return false;
        }
    }

    public boolean depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + saldo + " realizado com sucesso!");
        return true;
    }

    public double getSaldo() {
        System.out.println("Seu saldo atual é de R$" + saldo);
        return this.saldo;
    }
}
