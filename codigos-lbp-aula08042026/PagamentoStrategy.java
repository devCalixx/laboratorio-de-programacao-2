import java.util.Scanner;

class AuditoriaLog {
    private static AuditoriaLog instancia;

    private AuditoriaLog() {}

    public static AuditoriaLog getInstancia() {
        if (instancia == null) {
            instancia = new AuditoriaLog();
        }
        return instancia;
    }

    public void registrar(String mensagem) {
        System.out.println("LOG: " + mensagem);
    }
}

class LogManager {
    public static AuditoriaLog getInstancia() {
        return AuditoriaLog.getInstancia();
    }
}

interface PagamentoStrategy {
    double calcular(double valor);
}

class Pix implements PagamentoStrategy {
    public double calcular(double valor) {
        return valor * 0.9;
    }
}

class Credito implements PagamentoStrategy {
    public double calcular(double valor) {
        return valor;
    }
}

class PagamentoFactory {
    public static PagamentoStrategy criarPagamento(String tipo) {
        if (tipo.equalsIgnoreCase("Pix")) {
            return new Pix();
        } else if (tipo.equalsIgnoreCase("Credito")) {
            return new Credito();
        }
        throw new IllegalArgumentException("Esse tipo de pagamento não é aceito!");
    }
}

class Main {
    public static void main(String[] args) {
        AuditoriaLog log1 = LogManager.getInstancia();
        AuditoriaLog log2 = LogManager.getInstancia();
        System.out.println("Mesma instância de Log? " + (log1 == log2));
        log1.registrar("Sistema iniciado.");

        double valor = 100.00;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a forma de pagamento: ");
        String entrada = scanner.nextLine();

        System.out.println("Você realizou um pagamento de R$" + valor + " via " + entrada);

        try {
            PagamentoStrategy pagamento = PagamentoFactory.criarPagamento(entrada);
            double valorFinal = pagamento.calcular(valor);
            System.out.println("Valor final: R$" + valorFinal);
            log1.registrar("Pagamento de R$" + valorFinal + " via " + entrada);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}