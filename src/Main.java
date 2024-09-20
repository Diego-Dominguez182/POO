import static UI.UIMaestro.agregarTutoria;
import static UI.UIMenu.*;

import java.util.Date;

import UI.UIMaestro;
import model.Maestro;
import model.Secretaria;
import model.Usuario;
import model.Estudiante;

public class Main {
    public static void main(String[] args) {
        maestros.add(new Maestro("Juan", 1111, "Juan.com"));
        maestros.add(new Maestro("Javier pino", 1112, "pino.com"));
        maestros.add(new Maestro("Mag", 1113, "Mag.com"));
        maestros.add(new Maestro("Patricia", 1114, "Paty.com"));

        estudiantes.add(new Estudiante("Diego", "S21017297", "diegooooooooo.com"));
        estudiantes.add(new Estudiante("Nava", "S21017242", "Nava.com"));
        estudiantes.add(new Estudiante("Rafa", "S29149219", "Rafa.com"));
    

        mostrarMenu();


    }

}