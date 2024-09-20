package model;
import java.util.Date;
import java.util.ArrayList;

public class Maestro extends Usuario{
    private int numPersonal ;
    private String especialidad;

    public Maestro(String nombre, int numPersonal, String correo) {
        super(nombre, correo);
        this.numPersonal = numPersonal;
    }

    public int getNumPersonal() {
        return numPersonal;
    }

    public void setNumPersonal(int numPersonal) {
        this.numPersonal = numPersonal;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    ArrayList<Maestro.TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();
    public void addCursoDisponible(String fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }

    ArrayList<Maestro> maestros = new ArrayList<>();
    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    public static class TutoriasDisponibles extends CitaTutoria{
        public TutoriasDisponibles(String fecha, String hora) {
            super(fecha, hora);
        }
    
    }

    @Override
    public void saludar(String nomString) {
        System.out.println("Hola soy un maestro");
    }
    @Override
    public String toString(){
        return super.toString() + "Numero de personal: " + numPersonal + " Tutorias disponibles: " + tutoriasDisponibles.toString();
    }
}
