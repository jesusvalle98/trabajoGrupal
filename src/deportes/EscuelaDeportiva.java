public class EscuelaDeportiva {
    private String disciplina;
    private int nroInscritos=0;
    private Instructor i;
    private Estudiante e[]=new Estudiante[20];
    public EscuelaDeportiva(){
        disciplina="futbol";
        i=new Instructor(55555);
    }
    public EscuelaDeportiva(String disciplina,int item){
        this.disciplina=disciplina;
        i=new Instructor(item);
    }
    public void agregarEstudiante(Estudiante estudiante){
        e[nroInscritos]=estudiante;
        nroInscritos++;
    }
    public void eliminarEstudiante(int i){
        for (int j=i;j<nroInscritos;j++){
            e[j]=e[j+1];
        }
    }
    public void mostrar(){
        System.out.println("Disciplina:"+" "+disciplina);
        i.mostrar();
        if (nroInscritos>0){
            for (int i=0;i<nroInscritos;i++){
                e[i].mostrar();
            }
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getNroInscritos() {
        return nroInscritos;
    }

    public void setNroInscritos(int nroInscritos) {
        this.nroInscritos = nroInscritos;
    }

    public Instructor getI() {
        return i;
    }

    public void setI(Instructor i) {
        this.i = i;
    }
    public Estudiante getEstudiante(int i){
        return e[i];
    }
}
