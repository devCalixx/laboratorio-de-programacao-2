import javax.swing.*;
import java.awt.*;

public class Exercicio3 extends JFrame {
    public Exercicio3() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());
        JPanel painelFormulario = new JPanel(new GridLayout(2, 2)); 

        JLabel lblUtilizador = new JLabel("Utilizador:");
        JTextField txtUtilizador = new JTextField();

        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField txtSenha = new JPasswordField();
    
        painelFormulario.add(lblUtilizador);
        painelFormulario.add(txtUtilizador);
        painelFormulario.add(lblSenha);
        painelFormulario.add(txtSenha);

        JPanel painelBotao = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton botao = new JButton("Entrar");

        painelBotao.add(botao); 

        add(painelFormulario, BorderLayout.CENTER);
        add(painelBotao, BorderLayout. SOUTH);

        botao.addActionListener(e -> {
            String utilizador = new String(txtUtilizador.getText());
            String senha = new String(txtSenha.getPassword());

            if(utilizador.equals("admin") && senha.equals("1234")) {
                JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Nome ou senha incorretos, seu burro!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            new Exercicio3().setVisible(true);
        });
    }
}
