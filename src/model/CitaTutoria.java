package model;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CitaTutoria {
    private int id;
    private String fecha;
    private String hora;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public CitaTutoria(String fecha, String hora) {
        this.fecha = formato.format(new Date());
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
