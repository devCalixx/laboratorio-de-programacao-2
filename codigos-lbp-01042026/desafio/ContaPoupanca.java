package desafio;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca (int numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    public double renderJuros(double taxa) {
        this.saldo += this.saldo * taxa;
        System.out.println("Seu dinheiro rendeu! Seu novo saldo é R$" + saldo);
        return saldo;
    }
}
