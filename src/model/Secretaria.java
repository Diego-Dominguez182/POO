package model;
import java.util.ArrayList;
import java.util.Date;
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

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();
    public void addCursoDisponible(Date fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }

    ArrayList<Secretaria> secretarias = new ArrayList<>();
    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    public static class TutoriasDisponibles extends CitaTutoria{
        public TutoriasDisponibles(Date fecha, String hora) {
            super(fecha, hora);
        }
    
    }

    @Override
    public String toString() {
        return "Secretaria{" + area + ", turno " + turno;	
    }

    @Override
    public void saludar(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saludar'");
    }
}
