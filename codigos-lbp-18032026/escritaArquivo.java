import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class escritaArquivo {
    public static void main(String[] args) {
        // AQUI DEFINIMOS O CAMINHO EM QUE O ARQUIVO DE TEXTO SERÁ CRIADO
        Path caminho = Path.of("dados.txt");
        // QUANDO COLOCARMOS PARA RODAR, ESSE ARQUIVO SERÁ CRIADO. SE RODAR DE NOVO, SOBRESCREVEMOS O QUE FOI ESCRITO
        String conteudo = "Esta é a primeira linha. \nE esta é a segunda."; // ISSO É O QUE SERÁ ESCRITO NO ARQUIVO

        try {
            //ESCREVE A STRING DIRETAMENTE NO ARQUIVO (CRIA OU SOBRESCREVE)
            Files.writeString(caminho, conteudo); // SE O ARQUIVO JÁ EXISTISSE, ELE SÓ GRAVARIA EM CIMA
            // ISSO VAI SER EXIBIDO QUANDO O ARQUIVO FOR GRAVADO
            System.out.println("Arquivo gravado com sucesso!");
        } catch (IOException e) { // esse "e" é o nome do nosso erro
            System.err.println("Erro ao gravar: " + e.getMessage());
        }
    }
}