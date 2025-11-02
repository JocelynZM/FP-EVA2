/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_primo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_34_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int numero;
        
        Scanner captura = new Scanner(System.in);
        
        System.out.println("INGRESE UN NUMERO: ");
        numero = captura.nextInt();
        
        int resultado = numero % numero;
        

        if(numero>1){
            System.out.println("ES PRIMO");
            
        }
        else{
            System.out.println("NO ES PRIMO");
        }
    }
    
}
