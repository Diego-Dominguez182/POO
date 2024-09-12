public class ClaseExterna {
    private String nombre = "Morales";

    public void metodoExterno(){
        class ClaseLoca{
            public void metodoLoco(){
                System.out.println("Hola " + nombre);
            }
        }

        ClaseLoca cl = new ClaseLoca();
        cl.metodoLoco();
    }
}