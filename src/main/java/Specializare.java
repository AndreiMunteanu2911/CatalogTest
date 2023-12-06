// Munteanu Andrei

import java.util.ArrayList;

public class Specializare {

    String nume;
    ArrayList < Materie > materii;
    int nrLocuri;

    // constructor fara parametrii
    public Specializare() {
        nume = "NULL";
        materii = new ArrayList < Materie > ();
        nrLocuri = 0;

    }

    // constructor cu parametrii partiali
    public Specializare(String nume, int nrLocuri) {
        this.nume = nume;
        materii = new ArrayList < Materie > ();
        this.nrLocuri = nrLocuri;
    }

    // constructor cu parametrii
    public Specializare(String nume, ArrayList < Materie > materii, int nrLocuri) {
        this.nume = nume;
        this.materii = materii;
        this.nrLocuri = nrLocuri;
    }

    // constructor de copiere
    public Specializare(Specializare s) {
        this.nume = s.nume;
        this.materii = s.materii;
        this.nrLocuri = s.nrLocuri;
    }

    public void adaugaMaterie(Materie m) {
        this.materii.add(m);
    }

    //metoda toString()
    @Override
    public String toString() {
        StringBuffer ret = new StringBuffer("Specializarea: " + nume + "\n");
        ret.append("Nr de locuri: ").append(nrLocuri).append("\nMaterii: ").append("\n\n");
        for (int i = 0; i < materii.size(); i++) {
            ret.append("o ").append(materii.get(i).toString()).append("\n");
        }
        return ret.toString();
    }
}