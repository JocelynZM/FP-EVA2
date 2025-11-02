package eva2_33_cuenta;

import java.util.Scanner;

public class EVA2_33_CUENTA {

    public static void main(String[] args) {
        
        Scanner captura = new Scanner(System.in);
        
        int cuenta = 1000000;
        int retiro;
        
        System.out.println("SU CUENTA TIENE: " + cuenta);
        
        do {
            System.out.println("INTRODUZCA LA CANTIDAD A RETIRAR: ");
            retiro = captura.nextInt();
            
            if (retiro > cuenta) {
                System.out.println("NO TIENE SUFICIENTES FONDOS.");
            } else {
                cuenta = cuenta - retiro; 
                System.out.println("SU NUEVO SALDO ES: " + cuenta);
            }
            
        } while (cuenta > 0); 
        
        System.out.println("SE HA QUEDADO SIN CREDITOS.");
    }
}
