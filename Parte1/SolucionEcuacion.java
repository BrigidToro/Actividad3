import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SolucionEcuacion extends JFrame {

    private final JLabel labelA;
    private final JLabel labelB;
    private final JLabel labelC;
    private JLabel labelResultado;
    private JTextField campoA, campoB, campoC;
    private final JButton botonCalcular;
    private final JButton botonLimpiar;
    
    public SolucionEcuacion() {
        super("Solución de ecuaciones de segundo grado");
        
        labelA = new JLabel("Valor de A:");
        campoA = new JTextField(5);
        labelB = new JLabel("Valor de B:");
        campoB = new JTextField(5);
        labelC = new JLabel("Valor de C:");
        campoC = new JTextField(5);
        
        botonCalcular = new JButton("Calcular");
        botonLimpiar = new JButton("Limpiar");
        
        labelResultado = new JLabel("");
        
        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(3, 2));
        panelCampos.add(labelA);
        panelCampos.add(campoA);
        panelCampos.add(labelB);
        panelCampos.add(campoB);
        panelCampos.add(labelC);
        panelCampos.add(campoC);
        
        JPanel panelBotones = new JPanel();
        panelBotones.add(botonCalcular);
        panelBotones.add(botonLimpiar);
        
        JPanel panelResultado = new JPanel();
        panelResultado.add(labelResultado);
        
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(panelCampos, BorderLayout.CENTER);
        contenedor.add(panelBotones, BorderLayout.SOUTH);
        contenedor.add(panelResultado, BorderLayout.NORTH);
        
        botonCalcular.addActionListener((ActionEvent e) -> {
            try {
                double a = Double.parseDouble(campoA.getText());
                double b = Double.parseDouble(campoB.getText());
                double c = Double.parseDouble(campoC.getText());
                
                double discriminante = b*b - 4*a*c;
                double x1, x2;
                
                if (discriminante >= 0) {
                    x1 = (-b + Math.sqrt(discriminante)) / (2*a);
                    x2 = (-b - Math.sqrt(discriminante)) / (2*a);
                    labelResultado.setText("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
                } else {
                    labelResultado.setText("La ecuación no tiene solución real.");
                }
            } catch (NumberFormatException ex) {
                labelResultado.setText("Error: debe ingresar valores numéricos en todos los campos.");
            }
        });
        
        botonLimpiar.addActionListener((ActionEvent e) -> {
            campoA.setText("");
            campoB.setText("");
            campoC.setText("");
            labelResultado.setText("");
        });
        
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new SolucionEcuacion();
    }
}
