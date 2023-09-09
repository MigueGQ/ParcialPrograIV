/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tienda.tienda;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Tienda {

    public static void main(String[] args) {
        int cantidadProducto, obsequio=0;
        double total=0, monto, descuento=0;/*En el ejercicio propuesto estaba el monto así que lo pondremos que cada docena tiene el monto de $12*/
        
        for(int cliente=1; cliente<=10; cliente++){
            cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de docenas que desea"));
            monto = cantidadProducto*12;

            if(cantidadProducto > 0){
                if (cantidadProducto==3){
                    descuento = monto * 0.15;
                    total = monto - descuento;
                }
                else {
                    if (cantidadProducto > 3){
                        obsequio = cantidadProducto - 3;
                        descuento = monto * 0.10;
                        total = monto - descuento;
                    }
                    descuento = monto * 0.10;
                    total = monto - descuento;
                }
            }
            JOptionPane.showMessageDialog(null, cliente+"-"+" Cantidad (en docenas): "+cantidadProducto+", monto del descuento="+descuento+", total a pagar="+total+" y obsequios="+obsequio);
        }
    }
}
