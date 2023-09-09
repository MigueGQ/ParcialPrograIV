/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package descuentos.descuentos;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Descuentos {

    public static void main(String[] args) {
        
        double salarioBase, descuento, salarioTotal, AFP, ISSS, RENTA=0;
        String sexo;
        
        sexo = JOptionPane.showInputDialog("Escriba ´M´ si es masculino o ´F´ si es femenino");
        salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de su salario"));
        
        if(salarioBase > 300){
            AFP = salarioBase*(6.25/100);
               switch (sexo){
                    case "M" -> {
                        ISSS = salarioBase*0.03;
                        RENTA = salarioBase*0.10;
                        descuento = AFP+ISSS+RENTA;
                        salarioTotal = salarioBase - descuento;
                        JOptionPane.showMessageDialog(null, "Sueldo base=" + salarioBase + ", AFP=" + AFP + ", ISSS=" + ISSS + ", RENTA=" + RENTA + ", el descuento es de=" + descuento + " y el salario total es de=" + salarioTotal);
                    }
                    case "F" -> {
                        ISSS = salarioBase*0.02;
                        descuento = AFP+ISSS+RENTA;
                        salarioTotal = salarioBase - descuento;
                        JOptionPane.showMessageDialog(null, "Sueldo base=" + salarioBase + ", AFP=" + AFP + ", ISSS=" + ISSS + ", RENTA=" + RENTA + ", el descuento es de=" + descuento + " y el salario total es de=" + salarioTotal);
                    }
                    default -> {
                       JOptionPane.showMessageDialog(null, "Solo puede ser M o F");
                    }
               }
               
        }
        else JOptionPane.showMessageDialog(null, "Su sueldo es de: " + salarioBase);
    }
}
