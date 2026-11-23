package clase0;


import java.util.Scanner;


public class ejerciciosString {

    
    public static void main(String[] args) {
       
        String txt = "HOLA QUE TAL";
        
       String cad1 ="Hola";
       String cad2 = "Hola";
        
        //Longitud
        
        for( int i=0;i<txt.length();i++){
        
        System.out.println(txt.charAt(i));        
        }
        
        //Substring
        
        System.out.println("substring 5");
        System.out.println(txt.substring(5));
        
        
       System.out.println(txt); 
        
       
        System.out.println("Dos parametros");
        System.out.println(txt.substring(1, 3));
        
        
        
        //Split
        
        String[] s2 = txt.split(" ");
        System.out.println(s2[0]);
        System.out.println(s2[1]);
        System.out.println(s2[2]);
        
        if(cad1.compareTo(cad2) ==0 ){
        System.out.println("Son iguales " + cad1 + " " + cad2);
        
        }
        else{
        System.out.println("Son distintas " + cad1 + " " + cad2);
        }
        
        
    }
}

