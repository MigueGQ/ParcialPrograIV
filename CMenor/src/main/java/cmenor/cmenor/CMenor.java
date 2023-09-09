/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cmenor.cmenor;
import javax.swing.JOptionPane;


/**
 *
 * @author Miguel
 */
public class CMenor {

    public static void main(String[] args) {
        float a, b, c, menor, mayor;
        String primerNumero, segundoNumero, tercerNumero;
        //Leer los valores de a, b, y c
        primerNumero = JOptionPane.showInputDialog("Digite el primer número: " );
        segundoNumero = JOptionPane.showInputDialog("Digite el segundo número: " );
        tercerNumero = JOptionPane.showInputDialog("Digite el tercer número: " );
        a = Float.parseFloat(primerNumero);
        b = Float.parseFloat(segundoNumero);
        c = Float.parseFloat(tercerNumero);
        
        if (a < b) {
            if (a < c){
                mayor = b;
                menor = a;
            }
            else {
                mayor = b;
                menor = c;
            }
        }
        else {
            if (b > c){
                mayor = a;
                menor = c;
            }
            else {
                mayor = a;
                menor = b;    
                }
        }
        if (c > a) {
            if (a > b){
                mayor = c;
                menor = b;
            }
            else {
                mayor = c;
                menor = a;
            }
        }
        
        
        System.out.println("Menor:" + menor);
        System.out.println("Mayor:" + mayor);
    } //fin de main
} // fin de clase
