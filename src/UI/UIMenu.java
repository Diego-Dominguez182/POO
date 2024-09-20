package UI;

import model.Estudiante;
import model.Maestro;
import model.Secretaria;

import java.util.Scanner;
import static UI.UIEstudiante.*;
import static UI.UIScretaria.secretariaMenu;
import static UI.UIMaestro.maestroMenu;
import java.util.ArrayList;

public class UIMenu {
    public static ArrayList<Maestro> maestros = new ArrayList<Maestro>();
    public static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    public static ArrayList<Secretaria> secretarias = new ArrayList<Secretaria>();
    public static Maestro maestroLogeado;
    public static Estudiante estudianteLogeado;
    public static Secretaria secretariaLogeado;
    
    public static void mostrarMenu(){
        int respuesta = 0;
        do {
            System.out.println("..:: Bienvenido ::..");
            System.out.println("Selecciona una opción:");

            System.out.println("1. Maestros");
            System.out.println("2. Estudiantes");
            System.out.println("3. Secretaria");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch(respuesta){
                case 1:
                    loginUsuario(respuesta);
                    break;
                case 2:
                    loginUsuario(respuesta);
                    break;
                case 3:
                loginUsuario(respuesta);
                break;
                case 0:
                    System.out.println("..:: Bye ::..");
                    break;
                default:
                    System.out.println("Por favor seleccione una respuesta valida.");
                    break;
            }
        }while(respuesta != 0);
    }

   
    

    public static void loginUsuario(int tipoUsuario) {

        boolean banderaCorreo = true;
        do{
            System.out.println("Ingresa tu correo: ");
            Scanner scan = new Scanner(System.in);
            String correo = scan.nextLine();
    
            if (tipoUsuario == 1) {
                for (Maestro maestro : maestros){
                    if (maestro.getCorreo().equals(correo)){
                        banderaCorreo = false;
                        maestroLogeado = maestro;
                        maestroMenu();
                    }
                }
            } else if (tipoUsuario == 2) {
                for (Estudiante estudiante : estudiantes){
                    if (estudiante.getCorreo().equals(correo)){
                        estudianteLogeado = estudiante;
                        banderaCorreo = false;
                        estudianteMenu();
                    }
                }
            } else if (tipoUsuario == 3) {
                for (Secretaria secretaria : secretarias){
                    if (secretaria.getCorreo().equals(correo)){
                        secretariaLogeado = secretaria;
                        banderaCorreo = false;
                        secretariaMenu();
                    }
                }
            } else {
                System.out.println("Por favor selecciona una opción válida");
            }
        } while(true);
      
}
}