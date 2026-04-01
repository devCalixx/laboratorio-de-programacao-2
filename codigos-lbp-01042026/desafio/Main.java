package desafio;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca cp1 = new ContaPoupanca(1, 100);
        cp1.sacar(200);
        cp1.renderJuros(0.1);

        ContaCorrente cc1 = new ContaCorrente(2, 100, 500);
        cc1.sacar(400);
        cc1.getSaldo();
    }
}
