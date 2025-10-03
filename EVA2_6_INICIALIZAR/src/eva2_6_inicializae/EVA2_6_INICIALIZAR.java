/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_inicializae;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_6_INICIALIZAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diaSemana[] ={"LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
         int dia;
        Scanner captura = new Scanner(System.in);
        System.out.println("DIA DE LA SEMANA (0 A 6)");
        dia = captura.nextInt();
        
        System.out.println(diaSemana[dia]);
    }
    
}
