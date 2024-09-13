package UI;
import java.util.Scanner;
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

