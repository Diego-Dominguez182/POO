package model;
import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Usuario{
    private String matricula;
    private String semestre;
    ArrayList<CitaMaestro> tutoriasAgendadas = new ArrayList<>();

    public Estudiante(String nombre, String matricula, String correo) {
        super(nombre, correo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void addTutoriaMaestro(Maestro maestro, Date fecha, String hora) {
        tutoriasAgendadas.add(new CitaMaestro(maestro, this));
    }

    @Override
    public String toString() {
        return "Estudiante{" + matricula;
    }
}
