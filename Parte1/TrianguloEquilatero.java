import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TrianguloEquilatero extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private final JTextField ladoTextField;
    private final JTextField perimetroTextField;
    private final JTextField alturaTextField;
    private final JTextField areaTextField;

    public TrianguloEquilatero() {
        setTitle("Triángulo equilátero");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridLayout(2, 1));

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Ingrese el lado del triángulo:"));
        ladoTextField = new JTextField(10);
        inputPanel.add(ladoTextField);
        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(this);
        inputPanel.add(calcularButton);
        mainPanel.add(inputPanel);

        JPanel outputPanel = new JPanel(new GridLayout(3, 2));
        outputPanel.add(new JLabel("Perímetro:"));
        perimetroTextField = new JTextField();
        perimetroTextField.setEditable(false);
        outputPanel.add(perimetroTextField);
        outputPanel.add(new JLabel("Altura:"));
        alturaTextField = new JTextField();
        alturaTextField.setEditable(false);
        outputPanel.add(alturaTextField);
        outputPanel.add(new JLabel("Área:"));
        areaTextField = new JTextField();
        areaTextField.setEditable(false);
        outputPanel.add(areaTextField);
        mainPanel.add(outputPanel);

        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calcular")) {
            try {
                double lado = Double.parseDouble(ladoTextField.getText());
                double perimetro = lado * 3;
                double altura = lado * Math.sqrt(3) / 2;
                double area = Math.pow(lado, 2) * Math.sqrt(3) / 4;
                perimetroTextField.setText(String.format("%.2f", perimetro));
                alturaTextField.setText(String.format("%.2f", altura));
                areaTextField.setText(String.format("%.2f", area));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor válido para el lado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new TrianguloEquilatero();
    }
}