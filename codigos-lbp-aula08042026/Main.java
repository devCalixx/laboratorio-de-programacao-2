interface Logger {
    void log(String msg);
}

class ConsoleLogger implements Logger {
    public void log(String msg) { System.out.println("IMPRIME NA TELA: " + msg); }
}

class FileLogger implements Logger {
    // SIMULAÇÃO DE ESCRITA EM ARQUIVO
    public void log(String msg) { System.out.println("SIMULA IMPRESSÃO DE ARQUIVO: " + msg); }
}

// FACTORY
class LoggerFactory {
    public static Logger getLogger(String tipo) {
        if(tipo.equalsIgnoreCase("console")) return new ConsoleLogger();
        if(tipo.equalsIgnoreCase("file")) return new FileLogger();
        throw new IllegalArgumentException("Tipo de log inválido");
    }
}

// MÉTODO MAIN
public class Main {
    public static void main(String[] args) {
        Logger loggerTela = LoggerFactory.getLogger("console");
        loggerTela.log("Erro de compilação na linha 42");

        Logger loggerArquivo = LoggerFactory.getLogger("file");
        loggerArquivo.log("Usuário logado com sucesso");
    }
}