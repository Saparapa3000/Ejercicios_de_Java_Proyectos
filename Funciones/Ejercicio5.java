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
public class Ejercicio5 {
    public static void mostrarDoble(int numero) {
        double num = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el operador");
        num = teclado.nextDouble();
        double doble = num * 2;
        System.out.println("El doble de " + num + " es: " + doble);
    }

    public static void main(String[] args) {
        mostrarDoble(0);
    }
}
