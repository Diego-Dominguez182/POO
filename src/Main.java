import static UI.UIMenu.*;
import UI.UIMaestro;
import model.Maestro;
import model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Maestro maestro1 = new Maestro("Javier pino", 123, "jpino.uv");
        Maestro maestro2 = new Maestro("Magdiel mercado", 1112, "mamercado.uv");
        Maestro maestro3 = new Maestro("Mag", 1113, "Mag.com");
        maestro1.addCursoDisponible("12/12/2021", "12:00");
        maestro2.addCursoDisponible("25/02/2021", "12:00");
        maestro2.addCursoDisponible("06/03/2021", "12:00");
        maestro2.addCursoDisponible("05/04/2021", "12:00");

        maestros.add(maestro1);
        maestros.add(maestro2);
        maestros.add(maestro3);

        UIMaestro.maestroConTutorias.add(maestro1);
        UIMaestro.maestroConTutorias.add(maestro2);
        UIMaestro.maestroConTutorias.add(maestro3);
        

        estudiantes.add(new Estudiante("Diego", "S21017297", "diegooooooooo.com"));
        estudiantes.add(new Estudiante("Nava", "S21017242", "Nava.com"));
        estudiantes.add(new Estudiante("Rafa", "S29149219", "Rafa.com"));
    
        UI.UIMenu.mostrarMenu();


    }

}