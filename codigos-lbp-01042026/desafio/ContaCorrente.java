package desafio;

public class ContaCorrente extends ContaBancaria{

    private double limiteChequeEspecial;
    
    public ContaCorrente (int numero, double saldoInicial, double limiteChequeEspecial) {
        super(numero, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (this.saldo + limiteChequeEspecial > valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Você não tem limite suficiente para fazer esse saque!");
            return false;
        }
    }
}
