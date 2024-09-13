public class Secretaria extends Usuario{
    private String area;
    private String turno;
    
    Secretaria(String nombre, String turno, String correo) {
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

    @Override
    public void saludar(String nombre) {
        System.out.println("Hola " + nombre + " soy " + getNombre() + " en que puedo ayudarte?");
    }
    @Override
    public String toString() {
        return "Secretaria{" + area + ", turno " + turno;	
    }
}
