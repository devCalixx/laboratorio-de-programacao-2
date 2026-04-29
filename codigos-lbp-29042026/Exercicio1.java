import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Exercicio1 extends JFrame { // sempre vai herdar do JFrame
    public Exercicio1(){
        setTitle("Primeira Janela - LBP2");  // seta o título da janela
        setSize(800, 600); // seta o tamanho da janela em x e y
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // seta como a janela irá ser fechada
        setLocationRelativeTo(null); // seta o local onde a tela irá aparecer. No caso, o null centraliza a janela
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{ // essa setinha é o lambda. Esse invokeLater é o que deixa segura a invocação da sua GUI
            Exercicio1 janela = new Exercicio1(); // aqui criamos uma nova janela
            janela.setVisible(true); // e aqui a exibimos
        });
    }   

}
