import javax.swing.*; // importa tudo do java swing
import java.awt.*;

public class Exercicio2 extends JFrame {
    public Exercicio2() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // setLayout(new GridLayout(2, 2));
        // não podemos setar o GridLayout de uma vez porque o padrão do JFrame é o BorderLayout, então precisamos setar ele primeiro
        
        setLayout(new BorderLayout());
        JPanel painelFormulario = new JPanel(new GridLayout(2, 2)); // esse painel será chamado depois para dizer em que layout estarão os elementos

        JLabel lblUtilizador = new JLabel("Utilizador:");
        JTextField txtUtilizador = new JTextField();

        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField txtSenha = new JPasswordField();
    
        painelFormulario.add(lblUtilizador);
        painelFormulario.add(txtUtilizador);
        painelFormulario.add(lblSenha);
        painelFormulario.add(txtSenha);

        JPanel painelBotao = new JPanel(new FlowLayout(FlowLayout.CENTER)); // podemos misturar os layouts
        JButton botao = new JButton("Entrar");

        painelBotao.add(botao); 
        
        // agora precisamos adicionar tudo isso no BorderLayout

        add(painelFormulario, BorderLayout.CENTER);
        add(painelBotao, BorderLayout. SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            new Exercicio2().setVisible(true);
        });
    }
}
