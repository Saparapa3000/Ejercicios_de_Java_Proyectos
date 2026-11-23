package clase0;

import java.util.Scanner;

public class arraysejerejer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
       
        String[] nombres = new String[20];
        String[] tipos = new String[20];
        int contador = 0;
        int opciones;

        do {
            System.out.println("1) Alta");
            System.out.println("2) Listar");
            System.out.println("3) Buscar");
            System.out.println("4) Salir");
            System.out.println("Ingrese una opcion:");
            opciones = input.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("Ingrese el nombre del equipo:");
                    nombres[contador] = input2.nextLine();
                    System.out.println("Ingrese el tipo de equipo:");
                    tipos[contador] = input2.nextLine();
                    contador++;
                    break;
                case 2:
                    for (int i = 0; i < contador; i++) {
                        System.out.println(nombres[i] + " - " + tipos[i]);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre a buscar:");
                    String buscar = input.nextLine();
                    for (int i = 0; i < contador; i++) {
                        if (nombres[i].equals(buscar)) {
                            System.out.println("Encontrado: " + nombres[i] + " - " + tipos[i]);
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opciones != 4);
    }
}