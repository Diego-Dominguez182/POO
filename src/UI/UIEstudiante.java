package UI;
import static UI.UIMaestro.maestroConTutorias;

import java.util.Scanner;

import model.Maestro;
public class UIEstudiante {
        public final static String MESES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

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
                    agendarTutoria();
                    break;
                case 2:
                    listarMisTutorias();
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

    private static void listarMisTutorias() {
        System.out.println("..:: Mis tutorías ::..");
    }

    public static void agendarTutoria(){
        System.out.println("..:: Agendar tutoría ::..");


        int i = 1;
        for (Maestro maestro : UIMaestro.maestroConTutorias) {
            System.out.println(i +" " + maestro.getNombre());
            i++;            
        }
        System.out.println("Selecciona maestro");
        Scanner scan = new Scanner(System.in);
        int maestroSeleccionado = scan.nextInt();

        System.out.println("Selecciona una tutoría");
        maestroConTutorias.get(maestroSeleccionado - 1).getTutoriasDisponibles();
        }
        // 1.- Maestro
        //   1.- Tutoría 1
        //   2.- Tutoría 2
        // 2.- Maestro 2
        // 3.- Maestro 3
        // 0.- Cancelar 
    }


