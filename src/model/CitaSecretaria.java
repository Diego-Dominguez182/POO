package model;
import java.util.Date;

public class CitaSecretaria implements IAgendable{
    private int id;
    private Secretaria secretaria;
    private Usuario usuario;
    private Date fecha;
    private String hora;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Secretaria getSecretaria() {
        return secretaria;
    }
    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
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

}

