import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame janela = new JFrame();
        janela.setLayout(new BorderLayout());

        // Label
        JLabel texto = new JLabel("MENU DE CADASTRO");
        texto.setFont(new Font("Arial", Font.BOLD, 28));
        texto.setHorizontalAlignment(JLabel.CENTER);

        // Botões de cima
        JPanel botoes = new JPanel(new FlowLayout());
        botoes.add(new JButton("ALUNO"));
        botoes.add(new JButton("PROFESSOR"));

        // Junta label + botões em UM painel só
        JPanel topo = new JPanel(new BorderLayout());
        topo.add(texto, BorderLayout.NORTH);
        topo.add(botoes, BorderLayout.CENTER);

        janela.add(topo, BorderLayout.NORTH); // só um add no NORTH da janela

        JPanel botoesInferiores = new JPanel(new FlowLayout());
        botoesInferiores.add(new JButton("VOLTAR"));
        botoesInferiores.add(new JButton("SAIR"));
        janela.add(botoesInferiores, BorderLayout.SOUTH);

        JPanel painel = new JPanel(new GridLayout(1, 2));
        painel.setBackground(Color.LIGHT_GRAY);
        janela.add(painel, BorderLayout.CENTER);

        janela.setTitle("Seleção de Cadastro");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}