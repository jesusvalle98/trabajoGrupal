package escuelasdeportivas;
import java.util.Scanner;
public class Inscripcion extends EstudianteUmsa{
    private String fecha;
    private int evaluacion;

    public Inscripcion() {
        super();
        this.fecha = "20/11/2025";
    }

    public Inscripcion(String fecha, int evaluacion, String nombre, String paterno, String materno, String ci, String seguroMed, String registroUniversitario) {
        super(nombre, paterno, materno, ci, seguroMed, registroUniversitario);
        this.fecha = fecha;
        this.evaluacion=evaluacion;
    }
    public void MostrarIns() {
        System.out.println("Fecha de Inscripcion: "+fecha);
        System.out.println("Evaluacion del Estudiante: "+evaluacion);
        super.MostrarE();
    }
    public void LeerIns(){
        Scanner input = new Scanner(System.in);
        System.out.println("Fecha: ");
        fecha=input.next();
        super.LeerE();
        System.out.println("Evaluacion: ");
        evaluacion=input.nextInt();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(int evaluacion) {
        this.evaluacion = evaluacion;
    }
    
    
}
