/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;
import java.util.Scanner;

/**
 *
 * @author alumno
 */

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Introduce un código de error: ");
        int codigo = Scanner.nextInt();

        MensajeError(codigo);

        Scanner.close();
    }
    
    public static void MensajeError(int codigo) {
        switch (codigo) {
            case 1 -> System.out.println("Error en memoria.");
            case 2 -> System.out.println("Papel atascado en impresora.");
            case 3 -> System.out.println("Disco defectuoso.");
            default -> System.out.println("Error indefinido.");
        }
    }

    
}