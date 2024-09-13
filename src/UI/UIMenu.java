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
    
     public static void mostrarMenu(){
        int respuesta;

        do {
            System.out.println("..:: Bienvenido ::..");
            System.out.println("Selecciona una opción:");
    
            System.out.println("1. Maestros");
            System.out.println("2. Estudiantes");
            System.out.println("3. Secretaria");
            System.out.println("0. Salir");
    

            Scanner scan = new Scanner(System.in);

            respuesta = Integer.parseInt(scan.nextLine());
            System.out.println(respuesta);
            
    
            switch (respuesta) {
                case 1:
                    maestroMenu();
                    break;
                case 2:
                    estudianteMenu();
                    break;
                case 3:
                    secretariaMenu();
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

    


}