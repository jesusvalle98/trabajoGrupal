package escuelasdeportivas;
import java.util.Scanner;
public class EstudianteUmsa extends Persona {
    private String RU;
    public EstudianteUmsa() {
        super();
        this.RU = "1887029";
    }
    public EstudianteUmsa(String nombre, String paterno, String materno, String ci,
                          String seguroMed, String registroUniversitario) {
        super(nombre, paterno, materno, ci, seguroMed);
        this.RU = registroUniversitario;
    }

    public void LeerE() {
        Scanner input = new Scanner(System.in);
        super.leer();
        System.out.print("Registro Universitario:");
        RU=input.next();
    }

    public void MostrarE() {
        System.out.println("***DATOS PERSONALES***");
        super.mostrar();
        System.out.println("Reg. Uni.:"+RU);
    }
    public String getRU() {
        return RU;
    }

    public void setRU(String registroUniversitario) {
        this.RU = registroUniversitario;
    }
}
