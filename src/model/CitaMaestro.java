package model;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CitaMaestro implements IAgendable{
    private int id;
    private Maestro maestro;
    private Usuario usuario;
    private Date fecha;
    private String hora;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    CitaMaestro(Maestro maestro, Estudiante estudiante){
        this.maestro = maestro;
        this.usuario = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getFechaDate() {
        return formato.format(fecha);
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
    public void agendar(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return maestro.getNombre() + " " + getFechaDate() + " " + getHora();
    }
    
}
