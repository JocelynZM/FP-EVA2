/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglo.string;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_5_ARREGLO_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int[] a,b,c; //SON 3 ARREGLOS
        int x[], y,z; //SOLO LA X ES UN ARREGLO
        String cadenas[] = new String[7];
        
        cadenas[0] ="LUNES";
        cadenas[1] ="MARTES";
        cadenas[2] ="MIERCOLES";
        cadenas[3] ="JUEVES";
        cadenas[4] ="VIERNES";
        cadenas[5] ="SABADO";
        cadenas[6] ="DOMINGO";
        
        
        int dia;
        Scanner captura = new Scanner(System.in);
        System.out.println("DIA DE LA SEMANA (0 A 6)");
        dia = captura.nextInt();
        
        System.out.println(cadenas[dia]);
        




    }
    
}
