package model;

public class Estudiante extends Usuario{
    private String matricula;
    private String semestre;

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

    @Override
    public void saludar(String nombre) {
        System.out.println("Hola " + nombre + " soy " + getNombre() + " en que puedo ayudarte?");
    }
    @Override
    public String toString() {
        return "Estudiante{" + matricula;
    }
}
