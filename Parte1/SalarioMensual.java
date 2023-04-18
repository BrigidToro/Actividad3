import javax.swing.*;

public class SalarioMensual {
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("Salario Mensual");
        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreField = new JTextField(20);
        JLabel salarioLabel = new JLabel("Salario básico por hora:");
        JTextField salarioField = new JTextField(10);
        JLabel horasLabel = new JLabel("Número de horas trabajadas en el mes:");
        JTextField horasField = new JTextField(10);
        JButton calcularButton = new JButton("Calcular salario");
        JLabel resultadoLabel = new JLabel("");

        ventana.add(nombreLabel);
        ventana.add(nombreField);
        ventana.add(salarioLabel);
        ventana.add(salarioField);
        ventana.add(horasLabel);
        ventana.add(horasField);
        ventana.add(calcularButton);
        ventana.add(resultadoLabel);

        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.PAGE_AXIS));
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
        calcularButton.addActionListener(e -> {
            String nombre = nombreField.getText();
            double salarioPorHora = Double.parseDouble(salarioField.getText());
            int horasTrabajadas = Integer.parseInt(horasField.getText());
            double salarioMensual = salarioPorHora * horasTrabajadas;
            if (salarioMensual > 450000) {
                resultadoLabel.setText(nombre + " tiene un salario mensual de $" + salarioMensual);
            } else {
                resultadoLabel.setText(nombre);
            }
        });
    }
}