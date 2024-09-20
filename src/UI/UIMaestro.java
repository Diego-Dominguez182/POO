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
            System.out.println("1.- Agregar tutoría");
            System.out.println("2.- Ver tutoría");
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

    boolean banderaExterna = true;
    do {
        Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa la fecha de la tutoría: [dd/mm/yyyy] ");
            Scanner scan = new Scanner(System.in);
            String fecha = scan.nextLine();
            System.out.println("Ingresa la hora de la tutoría: [00:00] ");
            String hora = scan.nextLine();

            boolean banderaInterna = true;
            
        do{
            System.out.println("La tutoría es: " + fecha + " " + hora);
            System.out.println("1.- Para agregar tutoría \n2.- Cambiar tutoría");
            int respuesta = sc.nextInt();
            if (respuesta == 1){
                maestroLogeado.addCursoDisponible(fecha, hora);
                banderaExterna = false;
                banderaInterna = false;
                break;
            }
            else if (respuesta == 2){
                banderaInterna = false;
            }
            else{
                System.out.println("Por favor seleccione una opción válida");
            }
        } while (banderaInterna);
    } while (banderaExterna);

    }    
    public static void listarCursos(){
        if (maestroLogeado.getTutoriasDisponibles().isEmpty()){
            
            System.out.println("No hay tutorías disponibles");
            return;
        } 
        
        int j = 1;
        for (int i = 0; i < maestroLogeado.getTutoriasDisponibles().size(); i++){
            System.out.println(j + ".- " + maestroLogeado.getTutoriasDisponibles().get(i).getFecha()
             + " " + maestroLogeado.getTutoriasDisponibles().get(i).getHora());
            j++;
        }

    }

}
