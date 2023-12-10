
import java.io.Serializable;

// Munteanu Andrei

public class Materie implements Serializable{

    String nume;
    int nrCredite;

    // constructor gol
    public Materie() {
        nume = "NULL";
        nrCredite = 0;
    }

    // constructor cu parametrii
    public Materie(String nume, int nrCredite) {
        this.nume = nume;
        this.nrCredite = nrCredite;
    }

    // constructor de copiere
    public Materie(Materie m) {
        this.nume = m.nume;
        this.nrCredite = m.nrCredite;
    }

    //getteri

    public String getNume() {
        return this.nume;
    }

    public int getNrCredite() {
        return this.nrCredite;
    }

    //setteri


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrCredite(int nrCredite) {
        this.nrCredite = nrCredite;
    }

    //metoda toString()
    @Override
    public String toString() {
        return nume + "\nNr. de credite: " + nrCredite + "\n";
    }
}