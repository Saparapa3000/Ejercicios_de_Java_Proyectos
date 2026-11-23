package clase0;

import java.util.Scanner;

/**
 *
 * @author Sara
 */
public class bucleDoWhile {


    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          int a = -1;
          do{
           System.out.println("Elige equipo");
           System.out.println("MENU");
           System.out.println("--------------------");
           System.out.println("1 Real Madrid");
           System.out.println("2 Barça");
           System.out.println("3 Betis");
           System.out.println("4 Atlético de Madrid");
           System.out.println("0 Salir");
           a = teclado.nextInt();
         
           switch (a){
                   case 1:
                      System.out.println("El Real Madrid va tercero");
                   break;
                   
                   case 2:
                     System.out.println("El Cacalona va primero"); 
                   break;
                   
                   case 3:
                      System.out.println("El Betis va quinto"); 
                   break;
                   
                   case 4:
                      System.out.println("El Atlético de Madrid va segundo"); 
                   break;
                  
                   case 0:
                    System.out.println("Adios!!!"); 
                   break;
                   
                   default:
                   System.out.println("Incorrecto");
          
          }
            
          
}while(a!=0);
          }
}