
public class Profesor extends Persoana {

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
    }

    //constructor cu toti parametrii 2 (adresa detaliata)
    public Profesor(int varsta, String nume, String prenume, String CNP, String judet, String oras, String numeleStrazii, int nrStrazii, int codPostal, String nrTelefon, Facultate facultate, Materie materie, int salariu) {
        super(varsta, nume, prenume, CNP, judet, oras, numeleStrazii, nrStrazii, codPostal, nrTelefon);
        this.facultate = facultate;
        this.materie = materie;
        this.salariu = salariu;
    }

    //constructor cu parametrii Facultate si specializare
    public Profesor(Facultate facultate, Materie materie) {
        super();
        this.facultate = facultate;
        this.materie = materie;
    }

    //constructor de copiere cu persoana
    public Profesor(Persoana p, Facultate facultate, Materie materie, int salariu) {
        super(p);
        this.facultate = facultate;
        this.materie = materie;
        this.salariu = salariu;
    }

    //constructor copiere profesor
    public Profesor(Profesor s) {
        super(s);
        this.facultate = s.facultate;
        this.materie = s.materie;
        this.salariu = salariu;
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

    @Override
    public String toString() {
        //return super.toString()+" "+facultate.toString()+" "+materie.toString() +this.salariu;
        return super.toString() + "\n" + facultate.nume + "\n" + materie.nume + "\nSalariu: " + this.salariu + "\n";
    }
}
