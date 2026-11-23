package clase0;

import java.util.Scanner;

public class calculadora {
       public static void main(String[] args) {
           //bloque de creación de variables
           double operando1 = 0;
           double operando2 = 0;
           double resultado = 0;
           int operacion = 0;
           
           Scanner teclado = new Scanner(System.in);
           
           //Bloque de lógica del proceso
           System.out.println("Dime el primer operando");
           operando1 = teclado.nextDouble();
                   
                   
                   
           System.out.println("Dime el segundo operando");
           operando2 = teclado.nextDouble();

           
           System.out.println("Dime la operación");
           System.out.println("MENU");
           System.out.println("--------------------");
           System.out.println("1 Suma");
           System.out.println("2 Resta");
           System.out.println("3 Multiplicación");
           System.out.println("4 División");
           operacion = teclado.nextInt();
           
           
           switch (operacion){
                   case 1:
                       resultado = operando1 + operando2;
                       System.out.println("La suma es:" + " " + resultado);
                   break;
                   
                   case 2:
                       resultado = operando1 - operando2;
                        System.out.println("La resta es:" + " " + resultado);
                   break;
                   
                   case 3:
                       resultado = operando1 * operando2;
                        System.out.println("La multiplicación es:" + " " + resultado);
                   break;
                   
                   case 4:
                       resultado = operando1 / operando2;
                       System.out.println("La división es:" + " " + resultado);
                   break;
                   
                   default:
                   System.out.println("Error");

                 } //fin switch
           
       } //fin main
       
} //fin de la clase