
import java.io.Serializable;

public class Profesor extends Persoana implements Serializable{

    Facultate facultate;
    Materie materie;
    int salariu;

    //constructor fara parametrii
    public Profesor() {
        super();
        this.facultate = new Facultate();
        this.materie = new Materie();
        this.salariu = 0;
    }

    //constructor cu toti parametrii
    public Profesor(int varsta, String nume, String prenume, String CNP, Adresa adresa, Facultate facultate, Materie materie, int salariu) {
        super(varsta, nume, prenume, CNP, adresa);
        this.facultate = facultate;
        this.materie = materie;
        this.salariu = salariu;
        this.facultate.cresteNrProfesor();
    }

    //constructor cu toti parametrii 2 (adresa detaliata)
    public Profesor(int varsta, String nume, String prenume, String CNP, String judet, String oras, String numeleStrazii, int nrStrazii, int codPostal, String nrTelefon, Facultate facultate, Materie materie, int salariu) {
        super(varsta, nume, prenume, CNP, judet, oras, numeleStrazii, nrStrazii, codPostal, nrTelefon);
        this.facultate = facultate;
        this.materie = materie;
        this.salariu = salariu;
        this.facultate.cresteNrProfesor();
    }

    //constructor de copiere cu persoana
    public Profesor(Persoana p, Facultate facultate, Materie materie, int salariu) {
        super(p);
        this.facultate = facultate;
        this.materie = materie;
        this.salariu = salariu;
        this.facultate.cresteNrProfesor();
    }

    //constructor copiere profesor
    public Profesor(Profesor s) {
        super(s);
        this.facultate = s.facultate;
        this.materie = s.materie;
        this.salariu = s.salariu;
        this.facultate.cresteNrProfesor();
    }

    //getteri
    public Facultate getFacultate() {
        return this.facultate;
    }

    public Materie getMaterie() {
        return this.materie;
    }

    //setteri
    public void setFacultate(Facultate facultate) {
        this.facultate = facultate;
    }

    public void setMaterie(Materie materie) {
        this.materie = materie;
    }

    //metoda toString()
    @Override
    public String toString() {
        //return super.toString()+" "+facultate.toString()+" "+materie.toString() +this.salariu;
        return "Profesor\n" + super.toString() + "\n" + facultate.nume + "\n" + materie.nume + "\nSalariu: " + this.salariu + "\n";
    }
}