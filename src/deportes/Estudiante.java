package deportes;

public class Estudiante extends Persona{
    private String registroUniv,facultad,carrera;


    public Estudiante() {

        carrera="informatica";
        facultad="ciencias puras";
        registroUniv="215487";

    }

    public Estudiante(String carrera, String facultad, String registroUniv) {
        this.carrera = carrera;
        this.facultad = facultad;
        this.registroUniv = registroUniv;
    }

    public Estudiante(int ci, String nombre, boolean seguroMed, String carrera, String facultad, String registroUniv) {
        super(ci, nombre, seguroMed);
        this.carrera = carrera;
        this.facultad = facultad;
        this.registroUniv = registroUniv;
    }


    public void mostrar(){
        super.mostrar();
        System.out.println("R.u: "+registroUniv+" Facultad: "+facultad+" Carrera: "+carrera);
    }
}
