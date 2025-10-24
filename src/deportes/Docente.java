package deportes;

public class Docente extends Persona{
    private String facultad;
    private int item;

    public Docente(String facultad, int item) {
        this.facultad = facultad;
        this.item = item;
    }

    public Docente(int ci, String nombre, boolean seguroMed, String facultad, int item) {
        super(ci, nombre, seguroMed);
        this.facultad = facultad;
        this.item = item;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Facultad a la que pertenece: "+facultad+" Item: "+item);
    }
}
