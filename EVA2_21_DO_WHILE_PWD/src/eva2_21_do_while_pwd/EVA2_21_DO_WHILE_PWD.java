/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_do_while_pwd;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_21_DO_WHILE_PWD {
    final static String USUARIO = "admin";
    final static String PWD = "admin";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usu, contra;
        Scanner captura = new Scanner(System.in);
        do{
        
        System.out.println("ACCESO AL SISTEMA-----------");
        System.out.println("USUARIO:");
        usu = captura.nextLine();
        System.out.println("CONTRASEÑA:");
        contra = captura.nextLine();
        }
        while(!(usu.equals(USUARIO) && contra.equals(PWD))); //MIENTRAS NO SEA IGUAL SE REPITE
        System.out.println("BIENVENIDO AL SISTEMA");
        
    
        
    }
    
}
