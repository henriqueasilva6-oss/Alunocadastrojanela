import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MinhaJanela{
     public static void main(String[] args) {

        JFrame janela = new JFrame("Eventos");

        JButton botao = new JButton("Clique Aqui");

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                    janela, 
                    "Botão Clicado!"
                );
            }
        });
        
        janela.add(botao);
        janela.setTitle("Minha Primeira Janela");
        janela.setSize(800, 800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
     }
}