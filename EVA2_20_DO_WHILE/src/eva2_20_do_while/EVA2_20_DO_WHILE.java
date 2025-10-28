/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_do_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner captura = new Scanner(System.in);
        int opcion;
        
        do { //HAS          //AQUI VA LO QUE SE QUERAMOS QUE SE REPITA
        System.out.println("MENU PRINCIPAL--------");
        System.out.println("PRESIONA LA OPCION");
        System.out.println("1.PEDIDOS");
        System.out.println("2.PROVEEDORES");
        System.out.println("3.FACTURACION");
        System.out.println("4.SALIR");
         opcion = captura.nextInt();
        
        switch(opcion){
            case 1 :
                System.out.println("PEDIDOS SISTEMA");
                break;
                
            case 2 :
                System.out.println("PROVEEDORES  SISTEMA");
                break;
                
            case 3 :
                System.out.println("FACTURACION DEL SISTEMA");
                break;
                
            
        }

       
        } while(opcion != 4); // MIENTRAS OPCION SEA DIFERENTE DE 4
        
        System.out.println("FIN DEL PROGRAMA");

    }
    
}
