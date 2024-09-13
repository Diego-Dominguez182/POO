import static UI.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Maestro maestro = new Maestro("Morales", 1234, "diegodgz.182@gmail.com");
        //

        Usuario usuario = new Maestro("", 0, "dasd.com");
        Usuario usuario2 = new Secretaria("null", "", "");
        usuario.despedir("null");
        usuario.saludar("null");
}
}