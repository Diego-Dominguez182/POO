package UI;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class UIMenu {
    public final static String MESES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

     public static void mostrarMenu(){
        int respuesta;

        do {
            System.out.println("..:: Bienvenido ::..");
            System.out.println("Selecciona una opción:");
    
            System.out.println("1. Maestros");
            System.out.println("2. Estudiantes");
            System.out.println("0. Salir");
    

            Scanner scan = new Scanner(System.in);
            // respuesta = scan.nextInt();
            respuesta = Integer.parseInt(scan.nextLine());
            System.out.println(respuesta);
            
    
            switch (respuesta) {
                case 1:
                    System.out.println("..:: Maestros ::..");
                    break;
                case 2:
                    estudianteMenu();
                    break;
                case 0:
                    System.out.println("..:: Bye ::..");
                    break;
                default:
                    System.out.println("Por favor selecciona una opción válida");
                    break;
            }
        } while (respuesta != 0);
    }

    public static void estudianteMenu(){
        int respuesta;
        do {
            System.out.println("..:: Estudiantes ::..");
            System.out.println("1.- Agendar tutoría");
            System.out.println("2.- Mis tutorías");
            System.out.println("0.- Cancelar");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.parseInt(sc.nextLine());

            switch (respuesta) {
                case 1:
                    System.out.println("..:: Agendar tutoría ::..");
                    System.out.println("Selecciona el mes deseado:");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(i + ". " + MESES[i]);
                    }
                    break;
                case 2:
                    System.out.println("..:: Mis tutorías ::..");
                    break;
                case 0:
                    System.out.println("..:: Cancelar ::..");
                    break;
                default:
                    System.out.println("Por favor selecciona una opción válida");
                    break;
            }
        } while (respuesta != 0);
    }
}
