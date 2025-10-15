/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arreglos_multi;

/**
 *
 * @author Usuario
 */
public class EVA2_17_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int matriz[][] = new int [3][4]; //dependiendo de las dimensiones es el numero de for que necesita
        
       // int cubo [][][] = new int [2][2][2];
             //(a)(b)
        matriz [0][0] = 100;
        matriz [0][1] = 200;
        matriz [0][2] = 300;
        matriz [0][3] = 400;
        
        //primer for //length = fila o cantidad
        System.out.println(matriz.length);
        //
        System.out.println(matriz[0].length);
        System.out.println(matriz[1].length);
        System.out.println(matriz[2].length);
        
        //segundo for
        //ciclos aninados
                 //columna 0 (A)
        for(int i = 0; i < matriz.length; i++){
            
            //EL SEGUNDO FOR VA DENTRO DEL PRIMERO Y ASI
            //columna 0,1,2,etc (B)
            //Cambia la letra
            
            //en el segundo se pregunta cada fial y columna de cada lado
            for(int j = 0; j < matriz[i].length;j++){
                
                System.out.println("["+matriz[i][j]+"]"); 
                
            }
            System.out.println();
        }
        



    }
    
}
