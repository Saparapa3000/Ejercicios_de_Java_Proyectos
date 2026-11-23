
import java.util.Scanner;


public class Excepciones {
   
    public static void main(String[] args){
    
    Scanner teclado = new Scanner(System.in);
            
            try {
                System.out.println("Dame un numerador:");
             int numerador = teclado.nextInt();
             
             System.out.println("Dame un denominador:");
             int denominador = teclado.nextInt();
             
             
             int division = numerador / denominador;
             
             System.out.println("Resultado es: "+ division);
            
            }
            catch(ArithmeticException ex2){
                    System.out.println("error no puedes dividir entre 0");
                     System.out.println(ex2.getMessage());
                    
                    }
           
           /* catch(InputMismatchException ex1){
            System.out.println("Error, debes poner un número!");
            System.out.println(ex1.getMessage());
             
           
            
            catch (Exception ex){
             System.out.println("Error genérico!");
                System.out.println(ex);  
              
              
                    } 
            }*/
            }
            
            
            }

