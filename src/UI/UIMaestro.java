package UI;

import static UI.UIMenu.mostrarMenu;

import java.util.Scanner;
public class UIMaestro {
    public static void maestroMenu(){
        System.out.println("..:: Maestro ::..");
        System.out.println("Seleccione una opción:");
        System.out.println("1.- Agregar curso");
        System.out.println("2.- Ver cursos");
        System.out.println("3.- Salir");

        Scanner scan = new Scanner(System.in);
        int respuesta = scan.nextInt();

        switch (respuesta){
            case 1:
                System.out.println("..:: Agregar curso ::..");
                break;
            case 2:
                System.out.println("..:: Ver cursos ::..");
                break;
            case 3:
                mostrarMenu();
                break;
            default:
                System.out.println("Por favor seleccione una opción válida");
                break;
        }
    }


}
