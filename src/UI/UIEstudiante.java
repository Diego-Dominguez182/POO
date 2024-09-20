package UI;
import static UI.UIMaestro.maestroConTutorias;
import static UI.UIMenu.estudianteLogeado;

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
        int respuestaConfirmacion = 0;

        do{
            System.out.println("Selecciona maestro");
        int i = 1;
        for (Maestro maestro : UIMaestro.maestroConTutorias) {
            System.out.println(i +" " + maestro.getNombre());
            i++;            
        }
        Scanner scan = new Scanner(System.in);
        int respuestaMaestro = scan.nextInt();

        Maestro maestroSeleccionado = UIMaestro.maestroConTutorias.get(respuestaMaestro - 1);

        System.out.println("Selecciona una tutoría");
        i = 1;
        for (Maestro.TutoriasDisponibles td : UIMaestro.maestroConTutorias.
            get(respuestaMaestro - 1).getTutoriasDisponibles()) {
                System.out.println(i + " " + td.getFechaDate() + " " + td.getHora());
                i++;
        }
        int tutoriaSeleccionada = scan.nextInt();

        do {
            System.out.println("Maestro: " + maestroSeleccionado.getNombre() + ", Tutoría: "
            + maestroSeleccionado.getTutoriasDisponibles().get(tutoriaSeleccionada - 1));
            System.out.println("1.- Para continuar \n2.- Cambiar tutoría");
            respuestaConfirmacion = scan.nextInt();

        } while (tutoriaSeleccionada < 1 || tutoriaSeleccionada > 2);
        if  (respuestaConfirmacion == 1){
            Maestro.TutoriasDisponibles tutoria = maestroSeleccionado.
            getTutoriasDisponibles().get(tutoriaSeleccionada - 1);
            UIMenu.estudianteLogeado.addTutoriaMaestro(maestroSeleccionado, tutoria.getFecha(), tutoria.getHora());
        } else {
            System.out.println("bye");
        }
           
        } while (respuestaConfirmacion != 1);


        // 1.- Maestro
        //   1.- Tutoría 1
        //   2.- Tutoría 2
        // 2.- Maestro 2
        // 3.- Maestro 3
        // 0.- Cancelar 
    
    
    }
}


