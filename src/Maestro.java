import java.util.Date;
import java.util.ArrayList;

public class Maestro extends Usuario{
    private int numPersonal ;
    private String especialidad;

    Maestro(String nombre, int numPersonal, String correo) {
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

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();
    public void addCursoDisponible(Date fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }

    ArrayList<Maestro> maestros = new ArrayList<>();
    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    public static class TutoriasDisponibles {
        private int id;
        private Date fecha;
        private String hora;
        
        TutoriasDisponibles(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        @Override
        public String toString() {
            return "\n TutoriasDisponibles{" +
                    "fecha = " + fecha +
                    ", hora = '" + hora  +
                    '}';
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
