// Bodea Marius-Theodor

import java.util.ArrayList;

public class Facultate {
    String nume;
    Adresa adresa;
    String email;
    int nrStudenti;
    int nrProfesori;
    ArrayList < Specializare > specializari;


    public Facultate() {
        nume = "NULL";
        adresa = new Adresa();
        email = "NULL";
        nrStudenti = 0;
        nrProfesori = 0;
        specializari = new ArrayList < Specializare > ();
    }

    public Facultate(String nume, Adresa adresa, String email, int nrStudenti, int nrProfesori, ArrayList < Specializare > specializari) {
        this.nume = nume;
        this.adresa = adresa;
        this.email = email;
        this.nrStudenti = nrStudenti;
        this.nrProfesori = nrProfesori;
        this.specializari = specializari;
    }

    public Facultate(Facultate obj) {
        this.nume = obj.nume;
        this.adresa = obj.adresa;
        this.email = obj.email;
        this.nrStudenti = obj.nrStudenti;
        this.nrProfesori = obj.nrProfesori;
        this.specializari = obj.specializari;
    }

    public void adaugaSpecializare(Specializare s) {
        this.specializari.add(s);
    }

    @Override
    public String toString() {
        String ret = "";
        ret += nume + '\n' + adresa.toString() + "\ne-mail: " + email + "\nNumar de studenti: " + nrStudenti + "\nNumar de profesori: " + nrProfesori + "\nSpecializari: \n\n";
        for (int i = 0; i < specializari.size(); i++) {
            ret += specializari.get(i).toString();
        }
        return ret;
    }
}