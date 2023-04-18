import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalarioNeto extends JFrame implements ActionListener {
    private final JLabel lblCodigo;
    private final JLabel lblNombres;
    private final JLabel lblHoras;
    private final JLabel lblValorHora;
    private final JLabel lblRetencion;
    private final JTextField txtCodigo;
    private final JTextField txtNombres;
    private final JTextField txtHoras;
    private final JTextField txtValorHora;
    private final JTextField txtRetencion;
    private final JButton btnCalcular;
    private final JTable tablaResultados;

    public SalarioNeto() {
        setTitle("Calculadora de Salario de Empleados");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        lblCodigo = new JLabel("Código:");
        txtCodigo = new JTextField(10);

        lblNombres = new JLabel("Nombres:");
        txtNombres = new JTextField(30);

        lblHoras = new JLabel("Horas Trabajadas:");
        txtHoras = new JTextField(10);

        lblValorHora = new JLabel("Valor Hora:");
        txtValorHora = new JTextField(10);

        lblRetencion = new JLabel("Retención en la Fuente (%):");
        txtRetencion = new JTextField(10);

        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(this);
        tablaResultados = new JTable();
        tablaResultados.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Código", "Nombres", "Salario Bruto", "Salario Neto"}
        ));

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(lblCodigo);
        panel.add(txtCodigo);
        panel.add(lblNombres);
        panel.add(txtNombres);
        panel.add(lblHoras);
        panel.add(txtHoras);
        panel.add(lblValorHora);
        panel.add(txtValorHora);
        panel.add(lblRetencion);
        panel.add(txtRetencion);
        panel.add(btnCalcular);
        
        Container contentPane = getContentPane();
        contentPane.add(panel, BorderLayout.NORTH);
        contentPane.add(new JScrollPane(tablaResultados), BorderLayout.CENTER);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            String codigo = txtCodigo.getText();
            String nombres = txtNombres.getText();
            double horas = Double.parseDouble(txtHoras.getText());
            double valorHora = Double.parseDouble(txtValorHora.getText());
            double retencion = Double.parseDouble(txtRetencion.getText());
            double salarioBruto = horas * valorHora;
            double salarioNeto = salarioBruto * (1 - retencion / 100);
            DefaultTableModel model = (DefaultTableModel) tablaResultados.getModel();
            model.addRow(new Object[]{codigo, nombres, salarioBruto, salarioNeto});
        }
    }

    public static void main(String[] args) {
        new SalarioNeto();
    }
}