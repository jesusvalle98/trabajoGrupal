package escuelasdeportivas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Instructor instructor1 = new Instructor("Juan", "Perez", "Gonzalez", "1234567", "sus",1);
        Instructor instructor2 = new Instructor("Maria", "Garcia", "Rodriguez", "2345678", "sus",2);

        EscuelaDeportiva escuela1 = new EscuelaDeportiva();
        escuela1.mostrar();
        escuela1.setDisciplina("Futbol");
        escuela1.setIt(instructor1);
        escuela1.setLugar("Campo 1");

        EscuelaDeportiva escuela2 = new EscuelaDeportiva();
        escuela2.setDisciplina("Baloncesto");
        escuela2.setIt(instructor2);
        escuela2.setLugar("Gimnasio 1");

        EstudianteUmsa estudiante1 = new EstudianteUmsa(
                "Carlos", "Lopez", "Martinez", "3456789", "34567",
                "20123456"
        );

        EstudianteUmsa estudiante2 = new EstudianteUmsa(
                "Ana", "Diaz", "Sanchez", "4567890", "45678",
                "20123457"
        );

        Horario horario1 = new Horario();
        horario1.setHoraIni("09:00");
        horario1.setHoraFin("11:00");
        horario1.setDia("Lunes");


        Horario horario2 = new Horario();
        horario2.setHoraIni("11:00");
        horario1.setHoraFin("13:00");
        horario2.setDia("Miercoles");

        Inscripcion I1 = new Inscripcion("20/11/2025",0, "Carlos", "Huanca", "Flores", "11076349", "sus", "1886048");

        System.out.println("=== Sistema de Escuelas Deportivas ===");
        System.out.println("Escuelas disponibles:");
        escuela1.mostrar();
        System.out.print("a cargo del instructor: de ");
        instructor1.mostrar();

        escuela2.mostrar();
        System.out.print("a cargo del instructor: de ");
        instructor2.mostrar();

        System.out.println("Estudiantes inscritos:");
        estudiante1.mostrar();
        estudiante2.mostrar();

        System.out.println("Inscripciones realizadas:");
        I1.mostrar();
        //Leer
        System.out.println("=====================================================");
        EscuelaDeportiva E2=new EscuelaDeportiva();
        E2.leer();
        System.out.println("Ingrese cuantas inscripciones ingresaran al Horario 1");
        int x=input.nextInt();
        for (int j = 0; j < x; j++) {
            Inscripcion X = new Inscripcion();
            X.LeerIns();
            E2.getH1().AgregaI(X);
        }
        System.out.println("Ingrese cuantas inscripciones ingresaran al Horario 2");
        x=input.nextInt();
        for (int j = 0; j < x; j++) {
            Inscripcion X = new Inscripcion();
            X.LeerIns();
            E2.getH2().AgregaI(X);
        }
        System.out.println("=====================================================");
        E2.mostrar();

    }
}