/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_13_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 Scanner captura = new Scanner(System.in);

         int num;
       int num2;
        
        System.out.println("INGRESE EL PRIMER NUMERO:");
        
        num = captura.nextInt();
        
        System.out.println("INGRESE EL SEGUNDO NUMERO:");
        
         num2 = captura.nextInt();
         
         
         
         for(int i = num; i <= num2; i++){
            
             
             int resi = i % 2;
             if(resi ==0)
                  System.out.print(i +" - ");
             
         }
        
        
        
        
    }
    
}
