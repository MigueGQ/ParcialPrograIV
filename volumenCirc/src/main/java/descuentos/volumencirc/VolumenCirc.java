/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package descuentos.volumencirc;
import javax.swing.JOptionPane;
/**
 *
 * @author Miguel
 */
public class VolumenCirc {

    public static void main(String[] args) {
        double pi = 3.1415926535, volumen, radio;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Escriba el valor del radio"));
        volumen = (pi * radio * radio * radio*4/3);
        JOptionPane.showMessageDialog(null, "El valor del volumen de la cricuferencia es = " + volumen);
    }
}
