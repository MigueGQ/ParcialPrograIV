/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arrray.array;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Array {

    public static void main(String[] args) {
        String nombre;
        int posicion=0;
        char arrayAbcdario[]={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        nombre = JOptionPane.showInputDialog("Ingrese su primer nombre (todo minúsculas)");
        
        for(int i = 0; i < nombre.length(); i++){
            char caracter = nombre.charAt(i);
            
            for(int j = 0; j < arrayAbcdario.length; j++){
                if(arrayAbcdario[j]==caracter){
                    posicion = j + 1;
                    
                    JOptionPane.showMessageDialog(null, "Letra: "+caracter+" en la posición: "+posicion);
                }
            }
        }
    }
}
