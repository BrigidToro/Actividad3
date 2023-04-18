import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {

    private final JLabel label1;
    private JLabel label2;
    private final JTextField texto;
    private final JButton boton;
    private final JTextArea areaTexto;

    public Calculadora() {
        super("Calculadora de raíz cuadrada, cuadrado y cubo");

        label1 = new JLabel("Ingrese la cantidad de números que desea calcular:");
        texto = new JTextField(10);
        boton = new JButton("Calcular");
        boton.addActionListener(this);
        areaTexto = new JTextArea(20, 40);
        areaTexto.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(label1);
        panel1.add(texto);
        panel1.add(boton);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(scrollPane);

        setLayout(new BorderLayout());
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);

        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            String textoCantidad = texto.getText();
            try {
                int cantidad = Integer.parseInt(textoCantidad);

                StringBuilder resultado = new StringBuilder();

                for (int i = 1; i <= cantidad; i++) {
                    String numero = JOptionPane.showInputDialog("Ingrese el número #" + i + ":");
                    try {
                        int num = Integer.parseInt(numero);

                        resultado.append("Número: ").append(num).append("\n");
                        resultado.append("Raíz cuadrada: ").append(Math.sqrt(num)).append("\n");
                        resultado.append("Cuadrado: ").append(num * num).append("\n");
                        resultado.append("Cubo: ").append(num * num * num).append("\n\n");

                        areaTexto.append(resultado.toString());

                        resultado = new StringBuilder();
                    } catch (NumberFormatException ex) {
                        resultado.append("Error: ").append(numero).append(" no es un número entero positivo válido\n\n");

                        areaTexto.append(resultado.toString());

                        resultado = new StringBuilder();
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + textoCantidad + " no es un número entero positivo válido");
            }
        }
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
    }
}