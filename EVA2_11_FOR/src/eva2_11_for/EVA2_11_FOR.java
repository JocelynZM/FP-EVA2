/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_11_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner captura = new Scanner(System.in);
        
        int rep;
        
        String Mensaje;
        
        System.out.println("MENSAJE A REPETIR:");
        
        Mensaje = captura.nextLine();
        
        System.out.println("CANTIDAD DE REPETICIONES:");
        
        rep = captura.nextInt();
        
        
             //INICIO   //NUM REPETICIONES // COMO INCREMENTA
        for(int i = 1; i <= rep; i ++){
      System.out.println(Mensaje);

        }

        

        
    }
        
    }
    
    

