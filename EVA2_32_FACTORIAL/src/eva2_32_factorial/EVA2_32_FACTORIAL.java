/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_32_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int factorial;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("INTRODUZCA EL NUMERO PARA FACTORIAR: ");
        factorial = captura.nextInt();
        
        int fac =1;
        for(int i = 1; i<=factorial; i++){
            
                   
                    fac = fac*i;

            
           
            
         System.out.println("EL FACTIRIAL "+i+" ES: "+fac);   
        }




    }
    
}
