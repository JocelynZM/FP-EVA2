/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_triangulo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_30_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor;
       
        
        Scanner captura = new Scanner(System.in);
        
        System.out.println("CAPTURA EL VALOR DE * DEL TRIANGULO");
        
        valor = captura.nextInt();
        
        
      
       
           for(int i = 1; i<=valor;i++){
               
               for(int a = 1; a<=i; a++ ){
               
               System.out.print("*");
               
                            
           }
           System.out.println("");
           }
           
            
           
       
           
           
           
      
      
    }
    
}
