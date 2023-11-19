/**
 *
 * @author Tudor
 */
public class Student extends Persoana{
    static int CounterNrMatricol=1;//se va incrementa la fiecare obiect nou/ constructor apelat si fiind static va fi retinut pt urm student
    int nrMatricol;
    Facultate facultate;
    Specializare specializare;

    //constructor fara parametrii
    public Student(){
        super();
        this.nrMatricol=Student.CounterNrMatricol;
        Student.CounterNrMatricol++;
        this.facultate=new Facultate();
        this.specializare=new Specializare();
    }

    //constructor cu toti parametrii
    public Student(int varsta, String nume, String prenume, String CNP, Adresa adresa, int nrMatricol, Facultate facultate, Specializare specializare) {
        super(varsta, nume, prenume, CNP, adresa);
        this.nrMatricol = nrMatricol;
        this.facultate = facultate;
        this.specializare = specializare;
    }

    //constructor cu parametrii Facultate si specializare
    public Student(Facultate facultate, Specializare specializare) {
        super();
        this.nrMatricol=Student.CounterNrMatricol;
        Student.CounterNrMatricol++;
        this.facultate = facultate;
        this.specializare = specializare;
    }

    //constructor de copiere cu persoana
    public Student(Persoana p, Facultate facultate, Specializare specializare) {
        super(p);
        this.nrMatricol=Student.CounterNrMatricol;
        Student.CounterNrMatricol++;
        this.facultate = facultate;
        this.specializare = specializare;
    }

    //constructor copiere student
    public Student(Student s){
        this.nrMatricol=Student.CounterNrMatricol;
        Student.CounterNrMatricol++;
        this.facultate=s.facultate;
        this.specializare=s.specializare;
    }

   //getteri


    public int getNrMatricol() {
        return this.nrMatricol;
    }

    public Facultate getFacultate() {
        return this.facultate;
    }

    public Specializare getSpecializare() {
        return this.specializare;
    }

    //setteri

    public void setNrMatricol(int nrMatricol) {
        this.nrMatricol = nrMatricol;
    }

    public void setFacultate(Facultate facultate) {
        this.facultate = facultate;
    }

    public void setSpecializare(Specializare specializare) {
        this.specializare = specializare;
    }
    @Override
    public String toString() {
        return super.toString()+" "+"NrMatricol: "+this.nrMatricol+" "+facultate.toString()+"\n "+specializare.toString();
    }
}
