import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumeroMayor extends JFrame {
    private final JPanel inputPanel;
    private final JPanel outputPanel;
    private final JLabel inputLabel;
    private JLabel outputLabel;
    private JTextField inputField;
    private final JButton submitButton;

    public NumeroMayor() {
        setTitle("Encontrar el mayor valor");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        inputPanel = new JPanel();
        inputLabel = new JLabel("Ingrese la cantidad de números:");
        inputField = new JTextField(20);
        submitButton = new JButton("Encontrar mayor valor");
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(submitButton);

        outputPanel = new JPanel();
        outputLabel = new JLabel("");
        outputPanel.add(outputLabel);
        
        submitButton.addActionListener((ActionEvent e) -> {
            int num = Integer.parseInt(inputField.getText().trim());
            int max = Integer.MIN_VALUE;
            for (int i = 1; i <= num; i++) {
                String numString = JOptionPane.showInputDialog("Ingrese el número " + i);
                int numInt = Integer.parseInt(numString.trim());
                if (numInt > max) {
                    max = numInt;
                }
            }
            
            outputLabel.setText("El mayor valor es: " + max);
        });

        setLayout(new GridLayout(2, 1));
        add(inputPanel);
        add(outputPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumeroMayor();
    }
}