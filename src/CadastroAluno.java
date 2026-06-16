import java.awt.*;
import javax.swing.*;

public class CadastroAluno {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Cadastro de Aluno");

        janela.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(20);
        JLabel lblIdade = new JLabel("Idade:");
        JTextField txtIdade = new JTextField(5);
        JLabel lblCPF = new JLabel("CPF:");
        JTextField txtCPF = new JTextField(15);
        JLabel lblNota = new JLabel("Nota:");
        JTextField txtNota = new JTextField(5);

        
        JButton btnSalvar = new JButton("Salvar");

        btnSalvar.addActionListener(e -> {
            String nome = txtNome.getText();
            JOptionPane.showMessageDialog(janela,"Aluno " + nome + " cadastrado com sucesso!" + "\nIdade: " + txtIdade.getText() + "\nCPF: " + txtCPF.getText() + "\nNota: " + txtNota.getText());
        });

        janela.add(lblNome);
        janela.add(txtNome);
        janela.add(lblIdade);
        janela.add(txtIdade);
        janela.add(lblCPF);
        janela.add(txtCPF);
        janela.add(lblNota);
        janela.add(txtNota);
        janela.add(btnSalvar);

        janela.setSize(400, 100);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}