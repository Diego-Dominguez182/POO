package UI;

import static UI.UIMenu.maestroLogeado;
import static UI.UIMenu.mostrarMenu;

import java.util.Scanner;
public class UIMaestro {
    public static void maestroMenu(){
        int respuesta;
        System.out.println("..:: Maestro " + maestroLogeado.getNombre() + " ::..");


        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1.- Agregar curso");
            System.out.println("2.- Ver cursos");
            System.out.println("3.- Salir");
    
            Scanner scan = new Scanner(System.in);
            respuesta = scan.nextInt();
    
            switch (respuesta){
                case 1:
                    agregarTutoria();
                    break;
                case 2:
                    listarCursos();
                    break;
                case 3:
                    mostrarMenu();
                    break;
                default:
                    System.out.println("Por favor seleccione una opción válida");
                    break;
            }
        }
        while (respuesta != 3); 
      
    }

    public static void agregarTutoria(){
        System.out.println("Agregar tutoría");
        System.out.println("Ingresa la fecha de la tutoría: [dd/mm/yyyy] ");
        Scanner scan = new Scanner(System.in);
        String fecha = scan.nextLine();
        System.out.println("Ingresa la hora de la tutoría: [00:00] ");
        String hora = scan.nextLine();
        
    }

    public static void listarCursos(){
        System.out.println();
    }

}
