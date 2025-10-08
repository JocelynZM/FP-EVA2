/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_15_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner captura = new Scanner(System.in);
        int tama;//tamaño
        
        System.out.println("CUANTAS CALIFICACIONES QUIERES CAPTURAR?");
        tama = captura.nextInt();
        int cali[] = new int[tama];
        
      //  captura
                
        for (int i = 0; i < cali.length; i++ ){
            
         System.out.println("CALIFICACION NUMERO #" +(i+1)+":"); // le sumo 1 para que no de 0 al principio
        cali[i] = captura.nextInt();
            
        }
        //lectura
           for (int i = 0; i < cali.length; i++ ){
               
               System.out.print("["+cali[i] +"] ");

           }
           
           //PROMEDIO DEL GRUPO:
           //SUMAR TODAS LAS CALIFICACIONWS
           
           int sumaCa = 0;
           
            for (int i = 0; i < cali.length; i++ ){
               
             sumaCa = sumaCa + cali[i];
           }
    
           System.out.println("acumulado = "+sumaCa);
           
           double promedio = sumaCa / (double)cali.length;
           System.out.println("PROMEDIO: "+promedio);
}
}
