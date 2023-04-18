import javax.swing.*;

public class ComparacionNumeros extends JFrame {

    private final JLabel labelA;
    private final JLabel labelB;
    private final JLabel resultado;
    private final JTextField campoA;
    private final JTextField campoB;
    private final JButton botonComparar; 
    public ComparacionNumeros() {
        setTitle("Comparación de números");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        labelA = new JLabel("Valor de A:");
        labelB = new JLabel("Valor de B:");
        resultado = new JLabel("");
        campoA = new JTextField();
        campoB = new JTextField();
        botonComparar = new JButton("Comparar");
        setLayout(null);
        labelA.setBounds(20, 20, 80, 20);
        campoA.setBounds(100, 20, 80, 20);
        labelB.setBounds(20, 50, 80, 20);
        campoB.setBounds(100, 50, 80, 20);
        botonComparar.setBounds(100, 80, 80, 20);
        resultado.setBounds(20, 110, 200, 20);
        add(labelA);
        add(campoA);
        add(labelB);
        add(campoB);
        add(botonComparar);
        add(resultado);
        botonComparar.addActionListener(e -> compararNumeros());
        setVisible(true);
    }
    
    private void compararNumeros() {
        int a = Integer.parseInt(campoA.getText());
        int b = Integer.parseInt(campoB.getText());
        
        if (a > b) {
            resultado.setText("A es mayor que B");
        } else if (a == b) {
            resultado.setText("A es igual a B");
        } else {
            resultado.setText("A es menor que B");
        }
    }
    
    public static void main(String[] args) {
        new ComparacionNumeros();
    }
}