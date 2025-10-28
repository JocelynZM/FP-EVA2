/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_adivina.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_26_ADIVINA_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner Captura = new Scanner(System.in);
        int valor = 0, adivinar;
       
            
            
         while(valor != -1){    
adivinar = (int)(Math.random() * 5);
            
            System.out.println("ADIVINA EL NUMERO. -1 PARA TERMINAR EL JUEGO");
            
            valor = Captura.nextInt();
            
            if(valor == adivinar)
                System.out.println("ADIVINASTE!!");}
    }
}
