/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;


/**
 *
 * @author alumno
 */
/*public class Ejercicio4 {

    public static void comprendidos(int a, int b) {
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        comprendidos(8, 3);
    }
}*/

public class Ejercicio4 {

    public static void numerosEntre(int ini, int fin){
        if(fin < ini){
            System.out.println("Error el segundo parametro debe ser el mayor");
        }
        else{
            //Accion de numeros entre ini y fin
            for(int i = ini; i <= fin ; i++){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        numerosEntre(2,7);
        numerosEntre(7,2);
    }
}