import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.io.IOException;

public class Exercicio_1 {
    public static void main(String[] args) {

        Path caminho = Path.of("Exercicio_1.txt");

        String conteudo = "Júlia Calixto Nunes \nSP3148904";
        // GRAVA AS INFORMAÇÕES NO ARQUIVO
        try {
            Files.writeString(caminho, conteudo); 
            System.out.println("Arquivo gravado com sucesso!");
        } catch (IOException e) { 
            System.err.println("Erro ao gravar: " + e.getMessage());
        }
        // LẼ AS INFORMAÇÕES DO ARQUIVO
        try {
            List<String> linhas = Files.readAllLines(caminho);

            for (String linha : linhas) {
                System.out.println(linha);
            }

        } catch (IOException e){
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        
        Path caminhoNovo = Path.of("Exercicio_1_Rename.txt");
        // RENOMEIA O ARQUIVO
        try {
            Files.move(caminho, caminhoNovo, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Nome do arquivo alterado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao renomear: " + e.getMessage());
        }
    }
}