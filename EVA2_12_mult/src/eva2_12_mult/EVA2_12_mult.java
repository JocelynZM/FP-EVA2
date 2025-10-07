/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_mult;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_12_mult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner captura = new Scanner(System.in);
        
        int num;
        
        System.out.println("INGRESE EL NUMERO A MULTIPLICAR: ");
        
        num = captura.nextInt();
        
        for(int i = 0; i<=10; i++){
            
            int mul = num * i;
            
       
        System.out.println(num+"*"+i+"="+mul);
            
        }
        
        
    }
    
}
