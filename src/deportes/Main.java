package deportes;

public class Main {
    public static void main(String[] args) {
        Persona a=new Persona();
        a.mostrar();
        Persona b=new Estudiante(123,"pepe",false,"nutricion","medicina","6454646");
        b.mostrar();
        Persona i=new Instructor(5555);
        i.mostrar();
        Persona d=new Docente("ingenieria",888);
    }
}