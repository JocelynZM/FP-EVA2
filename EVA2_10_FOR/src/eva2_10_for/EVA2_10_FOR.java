/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //IMPRIMIR DEL 1 AL 20
        
       for(int i = 1; i<=20; i++){
      System.out.print(i + " - ");

            
       }
        System.out.println("");
        //IMPRIMIR AL REVES

         for(int i = 20; i>=1; i--){
        System.out.print(i + " - ");

            
        }
                 System.out.println("");

         //IMPRIMIR LOS PARES DE 0 A 100
         
         //+= , -= , *=, /=
         
          for(int i = 0; i<=100; i+=2){
        System.out.print(i + " - ");

            
        
        }
                           System.out.println("");

          //IMPRIMIR LOS PARES AL REVES
          
          
          for(int i = 100; i>=0; i-=2){
        System.out.print(i + " - ");

            
        }

          Scanner captura = new Scanner(System.in);
        
         System.out.println("");
         
         //SOLICITAR DOS NUMEROS AL USURAIO, IMPRIMIR LA LISTA ENTRE ESOS NUMEROS
         //-3 Y 3
         //-3 -2 -1 0 1 2 3
        
       int num;
       int num2;
        
        System.out.println("INGRESE EL PRIMER NUMERO:");
        
        num = captura.nextInt();
        
        System.out.println("INGRESE EL SEGUNDO NUMERO:");
        
         num2 = captura.nextInt();
        
        
           
                 System.out.println("");

             //INICIO   //NUM REPETICIONES // COMO INCREMENTA
        for(int i = num; i <= num2; i ++){
                     

      System.out.println(i);

        }

         System.out.println("");
       for(int i = num2; i >= num; i --){
                     

      System.out.println(i);

        }
        
          
          


    }
    
}
