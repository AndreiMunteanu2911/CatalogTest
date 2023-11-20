// Munteanu Andrei

public class Materie {

    String nume;
    String profesor;
    int nrCredite;

    // constructor gol
    public Materie() {
        nume = "NULL";
        profesor = "NULL";
        nrCredite = 0;
    }

    // constructor cu parametrii
    public Materie(String nume, String profesor, int nrCredite) {
        this.nume = nume;
        this.profesor = profesor;
        this.nrCredite = nrCredite;
    }

    // constructor de copiere
    public Materie(Materie m) {
        this.nume = m.nume;
        this.profesor = m.profesor;
        this.nrCredite = m.nrCredite;
    }

    //getteri


    public String getNume() {
        return this.nume;
    }

    public String getProfesor() {
        return this.profesor;
    }

    public int getNrCredite() {
        return this.nrCredite;
    }

    //setteri


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setNrCredite(int nrCredite) {
        this.nrCredite = nrCredite;
    }

    //metoda toString()
    @Override
    public String toString() {
        return nume + "\nProfesor: " + profesor + "\nNr. de credite: " + nrCredite + "\n";
    }
}
