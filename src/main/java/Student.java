
/**
 *
 * @author Tudor
 */
import java.util.HashMap;

public class Student extends Persoana {

    static int CounterNrMatricol = 1;//se va incrementa la fiecare obiect nou/ constructor apelat si fiind static va fi retinut pt urm student
    int nrMatricol;
    Facultate facultate;
    Specializare specializare;
    HashMap<Materie, Integer> note;

    //constructor fara parametrii
    public Student() {
        super();
        this.nrMatricol = Student.CounterNrMatricol;
        Student.CounterNrMatricol++;
        this.facultate = new Facultate();
        this.specializare = new Specializare();
        this.note = new HashMap<>();
    }

    //constructor cu toti parametrii
    public Student(int varsta, String nume, String prenume, String CNP, Adresa adresa, Facultate facultate, Specializare specializare, HashMap<Materie, Integer> note) {
        super(varsta, nume, prenume, CNP, adresa);
        this.nrMatricol = Student.CounterNrMatricol;
        this.facultate = facultate;
        this.specializare = specializare;
        this.note = note;
        this.facultate.cresteNrStudenti();
    }

    //constructor cu toti parametrii 2 (adresa detaliata, fara note, nr matricol automat)
    public Student(int varsta, String nume, String prenume, String CNP, String judet, String oras, String numeleStrazii, int nrStrazii, int codPostal, String nrTelefon, Facultate facultate, Specializare specializare) {
        super(varsta, nume, prenume, CNP, judet, oras, numeleStrazii, nrStrazii, codPostal, nrTelefon);
        this.nrMatricol = Student.CounterNrMatricol;
        Student.CounterNrMatricol++;
        this.facultate = facultate;
        this.specializare = specializare;
        this.note = new HashMap<>();
        this.facultate.cresteNrStudenti();
    }

    //constructor cu toti parametrii 3 (nr matricol automat)
    public Student(int varsta, String nume, String prenume, String CNP, String judet, String oras, String numeleStrazii, int nrStrazii, int codPostal, String nrTelefon, Facultate facultate, Specializare specializare, HashMap<Materie, Integer> note) {
        super(varsta, nume, prenume, CNP, judet, oras, numeleStrazii, nrStrazii, codPostal, nrTelefon);
        this.nrMatricol = Student.CounterNrMatricol;
        Student.CounterNrMatricol++;
        this.facultate = facultate;
        this.specializare = specializare;
        this.note = note;
        this.facultate.cresteNrStudenti();
    }

    //constructor cu parametrii Facultate si specializare
    public Student(Facultate facultate, Specializare specializare) {
        super();
        this.nrMatricol = Student.CounterNrMatricol;
        Student.CounterNrMatricol++;
        this.facultate = facultate;
        this.specializare = specializare;
        this.facultate.cresteNrStudenti();
    }

    //constructor de copiere cu persoana
    public Student(Persoana p, Facultate facultate, Specializare specializare) {
        super(p);
        this.nrMatricol = Student.CounterNrMatricol;
        this.facultate = facultate;
        this.specializare = specializare;
        this.facultate.cresteNrStudenti();
    }

    //constructor copiere student
    public Student(Student s) {
        this.nrMatricol = Student.CounterNrMatricol;
        this.facultate = s.facultate;
        this.specializare = s.specializare;
        this.note = s.note;
        this.facultate.cresteNrStudenti();
    }

    public void adaugaNota(Materie m, int nota) {
        this.note.put(m, nota);
    }

    public int getNota(Materie m) {
        return (this.note.get(m));
    }

    public String toStringNote() {
        String ret = new String("");
        for (HashMap.Entry<Materie, Integer> set : this.note.entrySet()) {
            ret = ret + set.getKey().nume + ": " + this.getNota(set.getKey()) + "\n";
        }
        return ret;
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

    //metoda toString()
    @Override
    public String toString() {
        // return super.toString()+" "+"NrMatricol: "+this.nrMatricol+" "+facultate.toString()+"\n "+specializare.toString()+this.toStringNote();
        return "Student\n"+super.toString() + "\n" + "NrMatricol: " + this.nrMatricol + "\n" + this.toStringNote();
    }
}
