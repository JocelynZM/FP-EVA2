/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_menu;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_7_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                               //0      //1       //2
        String platillos[] = {"ALITAS","PIZZA","HAMBURGUESA"};
        
        double precios[] = {250.0,100,200};
        
        Scanner captura = new Scanner(System.in);
        
        System.out.println("**************MENU**************");
        System.out.println("0 - "+platillos[0] + "$"+precios[0]);
        System.out.println("1 - "+platillos[1] + "$"+precios[1]);
        System.out.println("2 - "+platillos[2] + "$"+precios[2]);
        System.out.println("3 - "+platillos[3] + "$"+precios[3]);
        
        System.out.println("");

        
        


    }
    
}
