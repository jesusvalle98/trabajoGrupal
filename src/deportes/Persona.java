package deportes;

public class  Persona {
    protected String nombre;
    protected int ci;
    protected boolean seguroMed;


    public Persona() {
        ci=12345789;
        nombre="juan lopez";
        seguroMed=true;
    }

    public Persona(int ci, String nombre, boolean seguroMed) {
        this.ci = ci;
        this.nombre = nombre;
        this.seguroMed = seguroMed;
    }


    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSeguroMed() {
        return seguroMed;
    }

    public void setSeguroMed(boolean seguroMed) {
        this.seguroMed = seguroMed;
    }

    public void mostrar(){
        System.out.println("nombre: "+nombre+" ci: "+ci+" tiene seguro: "+seguroMed);
    }


}
