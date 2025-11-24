package escuelasdeportivas;
import java.util.Scanner;
public abstract class Persona {
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected String ci;
    protected String seguroMed;

    public Persona() {
        nombre="Pepe";
        paterno="Lopez";
        materno="Flores";
        ci="12345678";
        seguroMed="sus";
    }

    public Persona(String nombre, String paterno, String materno, String ci, String seguroMed) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.ci = ci;
        this.seguroMed = seguroMed;
    }

    public void leer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un nombre y sus apellidos:");
        nombre=input.next();
        paterno=input.next();
        materno=input.next();
        System.out.print("CI:");
        ci=input.next();
        System.out.print("Seguro Medico:");
        seguroMed=input.next();
    }

    public void mostrar() {
        System.out.println(nombre+" "+paterno+" "+materno+". CI:"+ci+", Seguro medico: "+seguroMed);
    }


    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getSeguroMed() {
        return seguroMed;
    }

    public void setSeguroMed(String seguroMed) {
        this.seguroMed = seguroMed;
    }
}
