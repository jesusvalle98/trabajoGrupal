package deportes;

public class Instructor extends Persona{
    private int item;

    public Instructor(int item) {
        this.item = item;
    }

    public Instructor(int ci, String nombre, boolean seguroMed, int item) {
        super(ci, nombre, seguroMed);
        this.item = item;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Item: "+item);
    }
}
