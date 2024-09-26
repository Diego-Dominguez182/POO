package model;
import java.util.ArrayList;
public class Secretaria extends Usuario{
    private String area;
    private String turno;
    
    public Secretaria(String nombre, String turno, String correo) {
        super(nombre, correo);
        this.turno = turno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    ArrayList<Secretaria.TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();


    public void addCursoDisponible(String fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }

    ArrayList<Secretaria> secretarias = new ArrayList<>();
    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    public static class TutoriasDisponibles extends CitaTutoria{
        public TutoriasDisponibles(String fecha, String hora) {
            super(fecha, hora);
        }
    
    }

    @Override
    public String toString() {
        return "Secretaria{" + area + ", turno " + turno;	
    }


}
