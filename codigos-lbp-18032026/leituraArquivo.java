import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.List;

public class leituraArquivo {
    public static void main(String[] args) {
        Path caminho = Path.of("dados.txt");

        try {
            // lê todas as linhas do arquivo para uma lista
            List<String> linhas = Files.readAllLines(caminho);

            // utiliza-se um for para iterar por todas as linhas e printar todas elas
            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (IOException e){
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}

// esse código mostra no terminal, aqui do próprio programa, o que está no arquivo de texto.