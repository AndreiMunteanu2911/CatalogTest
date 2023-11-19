public class Profesor extends Persoana{
    Facultate facultate;
    Materie materie;

    //constructor fara parametrii
    public Profesor(){
        super();
        this.facultate=new Facultate();
        this.materie=new Materie();
    }

    //constructor cu toti parametrii
    public Profesor(int varsta, String nume, String prenume, String CNP, Adresa adresa, Facultate facultate, Materie materie) {
        super(varsta, nume, prenume, CNP, adresa);
        this.facultate = facultate;
        this.materie = materie;
    }

    //constructor cu parametrii Facultate si specializare
    public Profesor(Facultate facultate, Materie materie) {
        super();
        this.facultate = facultate;
        this.materie = materie;
    }

    //constructor de copiere cu persoana
    public Profesor(Persoana p, Facultate facultate, Materie materie) {
        super(p);
        this.facultate = facultate;
        this.materie = materie;
    }

    //constructor copiere profesor
    public Profesor(Profesor s){
        this.facultate=s.facultate;
        this.materie=s.materie;
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
        return super.toString()+" "+facultate.toString()+" "+materie.toString();
    }
}
