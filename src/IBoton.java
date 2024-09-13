public abstract class IBoton {

    public abstract void click();
    public abstract void render();

    public void focus() {
        System.out.println("Focus");
    }

    public void blur() {
        System.out.println("Blur");
    }
}