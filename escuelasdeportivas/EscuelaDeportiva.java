package escuelasdeportivas;
import java.util.Scanner;
public class EscuelaDeportiva {
    private String disciplina;
    private String lugar;
    private Horario H1=new Horario();
    private Horario H2=new Horario();
    public Instructor it=new Instructor();
    
    public EscuelaDeportiva() {
        this.disciplina = "Volleyball";
        this.lugar ="Coliseo UMSA";
        H1=new Horario();
        H2=new Horario();
        it=new Instructor();
    }
    public EscuelaDeportiva(String disciplina, String lugar,Horario H1,Horario H2,Instructor It) {
        this.disciplina = disciplina;
        this.lugar =lugar;
        this.H1=H1;
        this.H2=H2;
        this.it=It;
    }
    public void leer() {
        System.out.println("***INGRESE LOS DATOS DE LA ESCUELA DEPORTIVA***");
        Scanner a=new Scanner(System.in);
        System.out.print("Disciplina: ");
        disciplina=a.nextLine();
        System.out.print("Lugar: ");
        lugar= a.nextLine();
        System.out.println("---Instructor---");
        it.LeerI();
        System.out.println("**HORARIO 1**");
        H1.leer();
        System.out.println("**HORARIO 2**");
        H2.leer();
    }

    public void mostrar() {
        System.out.println("Displina: "+disciplina+" / Lugar: "+lugar);
        System.out.println("----INSTRUCTOR----");
        it.MostrarI();
        System.out.println("----HORARIOS----");
        System.out.println("**HORARIO 1**");
        H1.mostrar();
        System.out.println("**HORARIO 2**");
        H2.mostrar();
    }
    public void mostrarMejorEvaluacion() {
        // Implementación de mostrarMejorEvaluacion
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Horario getH1() {
        return H1;
    }

    public void setH1(Horario H1) {
        this.H1 = H1;
    }

    public Horario getH2() {
        return H2;
    }

    public void setH2(Horario H2) {
        this.H2 = H2;
    }
    
    public Instructor getIt() {
        return it;
    }

    public void setIt(Instructor it) {
        this.it = it;
    }

    
}
