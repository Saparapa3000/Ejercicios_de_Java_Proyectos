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
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de x (base, menor que 50): ");
        int x = Scanner.nextInt();

        System.out.print("Introduce el valor de n (exponente, menor que 10): ");
        int n = Scanner.nextInt();

        if (x < 50 || n < 10 || n >= 0) {
            long potencia = calcular(x, n);
            System.out.println(x + " elevado a " + n + " es: " + potencia);
        }else {
            System.out.println("Error: Los valores deben ser x menor que 50 y n menor que 10 (n no negativo).");
        }

        Scanner.close();
    }
    
    public static long calcular(int x, int n) {
        long resultado = 1;
        for (int i = 0; i < n; i++) {
            resultado *= x;
        }
        return resultado;
    }
}
