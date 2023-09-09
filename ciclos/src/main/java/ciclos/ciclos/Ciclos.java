/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ciclos.ciclos;

/**
 *
 * @author Miguel
 */
public class Ciclos {

    public static void main(String[] args) {
        
        String dia;
        for(int num_dia=1; num_dia<8;num_dia++){
            switch(num_dia){
                case 1 : dia="Lunes"; break;
                case 2 : dia="Martes"; break;
                case 3 : dia="Miercoles"; break;
                case 4 : dia="Jueves"; break;
                case 5 : dia="Viernes"; break;
                case 6 : dia="Sabado"; break;
                case 7 : dia="Domingo"; break;
                default : dia="¿Que Dia es Hoy?"; break;
            }// fin del switch
        System.out.println ("Hoy es "+dia+" el dia Nº "+num_dia+" de la Semana");
        }//fin del for
    }
}
