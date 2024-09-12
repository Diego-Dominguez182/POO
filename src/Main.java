import static UI.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        mostrarMenu();

        Maestro maestro = new Maestro("Morales", 1234);
        //
        maestro.addCursoDisponible(new Date(), "12:00");
        maestro.addCursoDisponible(new Date(), "19:00");
        maestro.addCursoDisponible(new Date(), "14:00");
        System.out.println("Cursos disponibles:");
        for (Maestro.TutoriasDisponibles tutoria : maestro.getTutoriasDisponibles()) {
            System.out.println(tutoria.getHora() + " " + tutoria.getFecha());
        }

       
        ClaseExterna ce = new ClaseExterna();
        ce.metodoExterno();
}
}