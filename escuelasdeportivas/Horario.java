package escuelasdeportivas;
import java.util.Scanner;
public class Horario {
    private String horaInicio,horaFin,dia;
    private int nroInscripciones;
    private Inscripcion[] ins= new Inscripcion[50];
    public Horario() {
        this.horaInicio="12:00";
        this.horaFin="14:00";
        dia="lunes";
        nroInscripciones=0;
    }
    public Horario(String horaIni,String horaFin, String dia) {
        this.horaInicio = horaIni;
        this.dia = dia;
        this.nroInscripciones = 0;
    }
    public void leer() {
        Scanner a=new Scanner(System.in);
        System.out.print("Hora Inicio: ");
        horaInicio=a.next();
        System.out.print("Hora Fin: ");
        horaFin=a.next();
        System.out.print("Dia: ");
        dia= a.next();
    }

    public void mostrar() {
        System.out.println("Hora: "+horaInicio+" - "+horaFin+"/ Dia: "+dia);
        if(nroInscripciones>0){
            System.out.println("....INSCRITOS....");
        }
        for (int i = 0; i < nroInscripciones; i++) {
            ins[i].MostrarIns();
            System.out.println("..........................");
        }
    }
    
    public void AgregaI(Inscripcion x){
        ins[nroInscripciones]=x;
        nroInscripciones++;
    }
    public void QuitaI(){
        for (int i = 0; i < nroInscripciones; i++) {
            ins[i]=ins[i+1];
        }
        ins[nroInscripciones]=null;
        nroInscripciones--;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraIni(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getNroInscripciones() {
        return nroInscripciones;
    }

    public void setNroInscripciones(int nroInscripciones) {
        this.nroInscripciones = nroInscripciones;
    }

    public Inscripcion[] getIns() {
        return ins;
    }

    public void setIns(Inscripcion[] ins) {
        this.ins = ins;
    }

    
}