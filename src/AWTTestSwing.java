//importa as funções
import javax.swing.*;
import java.awt.*; // adicionei essa linha pois apos pesquisas só roda com esse import

public class AWTTestSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AWT Test"); // nomeia o popup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200); // define o tamanho padrão da janela
        frame.setLayout(new BorderLayout());

        JLabel label1 = new JLabel("Label1"); // nomeia o "enunciado da caixa de texto"
        JTextField textField1 = new JTextField(15); // caixa de texto com 15 caracteres max


        // define o layout do popup
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout()); // organiza os elementos em linhas 
        topPanel.add(label1); // adiciona o "enunciado"
        topPanel.add(textField1); // adiciona o campo de texto

        // cria os botoes 1 2 e 3
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");


        // define o layout dos botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout()); // organiza os botões em linha
        buttonPanel.add(button1); // add os botões no popup
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        frame.add(topPanel, BorderLayout.NORTH); // fixa a parte do input do user no topo
        frame.add(buttonPanel, BorderLayout.CENTER); // fixa os botões no centro e abaixo do input

        frame.setVisible(true); // deixa visivel
    }
}
