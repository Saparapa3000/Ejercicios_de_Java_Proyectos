package clase0;

import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class MiPrimeraClase {


    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();
        boolean eresMayorDeEdad = edad >= 18;
        
        if (eresMayorDeEdad){
        System.out.println("Eres Mayor De Edad");
        } 
        else
            System.out.println("No eres mayor de edad");

    }
    
}
 