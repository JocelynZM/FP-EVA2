/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_tic_tac_toc;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_19_TIC_TAC_TOC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tictac[][] = new int [3][3];
        
        int fila,col,jug;
        Scanner captura = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("INTRODUCE TU JUGADA.FILA:");
            
            fila = captura.nextInt();
            
            System.out.println("INTRODUCE TU JUGADA.COLUMNA:");
            
            col = captura.nextInt();
            
            System.out.println("JUGADOR (1 O 2):");
            jug = captura.nextInt();
            
            tictac[fila][col] = jug;
            
            //ciclos aninados
                 //columna 0 (A)
        for(int a = 0; a < tictac.length; i++){
            
            //EL SEGUNDO FOR VA DENTRO DEL PRIMERO Y ASI
            //columna 0,1,2,etc (B)
            //Cambia la letra
            
            //en el segundo se pregunta cada fial y columna de cada lado
            for(int j = 0; j < tictac[a].length;j++){
                
                System.out.println("["+tictac[a][j]+"]"); 
                
            }
            System.out.println();
        }

            
        }




    }
    
}
