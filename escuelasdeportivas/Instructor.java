package escuelasdeportivas;
import java.util.Scanner;
public class Instructor extends Persona {
    private int item;

    public Instructor() {
        super();
        this.item = 1;
    }
    public Instructor(String nombre, String paterno, String materno, String ci,
                      String seguroMed, int item) {
        super(nombre, paterno, materno, ci, seguroMed);
        this.item = item;
    }

    public void LeerI() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los datos del Instructor");
        System.out.print("Item: ");
        item=input.nextInt();
        super.leer();
    }

    public void MostrarI() {
        super.mostrar();
        System.out.println("Item: "+item);
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }
    
}