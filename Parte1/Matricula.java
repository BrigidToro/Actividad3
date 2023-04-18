import javax.swing.*;
import java.text.DecimalFormat;

public class Matricula {
    public static void main(String[] args) {
        String NI = JOptionPane.showInputDialog(null, "Ingrese el número de inscripción");
        String NOM = JOptionPane.showInputDialog(null, "Ingrese los nombres");
        double PAT = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el patrimonio"));
        int EST = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el estrato social"));
        
        double PAGMAT = 50000;
        
        if (PAT > 2000000 && EST > 3) {
            PAGMAT += 0.03 * PAT;
        }
        
        DecimalFormat formato = new DecimalFormat("#,###.00");
        String pagoConFormato = formato.format(PAGMAT);
        
        JOptionPane.showMessageDialog(null, "El estudiante con número de inscripción " + NI + " y nombre " + NOM + " debe pagar: $" + pagoConFormato);
    }
}