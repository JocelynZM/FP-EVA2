/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SWITCH --> OPCION MULTIPLE
        Scanner captura = new Scanner(System.in);
        int dia;
        System.out.println("DIA DE LA SEMANA EN NUMERO (1-7)");
        
        dia = captura.nextInt();
        
        //if(dia ==1){ System.out.println("lunes"); ejemplo if
        
        switch(dia){
            //case no lleban llaves
            case 1:
         System.out.println("LUNES");
         break;//fin de caso del switch
            case 2:
         System.out.println("MARTES");
         break;//fin de caso del switch
            case 3:
         System.out.println("MIERCOLES");
         break;//fin de caso del switch
            case 4:
         System.out.println("JUEVES");
         break;//fin de caso del switch
            case 5:
         System.out.println("VIERNES");
         break;//fin de caso del switch
            case 6:
         System.out.println("SABADO");
         break;//fin de caso del switch
            case 7:
         System.out.println("DOMINGO");
         break;//fin de caso del switch

         
            default: //COMO ELSE, SIEMPRE AL FINAL NO NECESITA break;
                System.out.println("NUMERO INCORRECTO");
            
            
        }
        
    
        
    }
    
}
