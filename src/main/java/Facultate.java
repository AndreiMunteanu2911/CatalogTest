// Bodea Marius-Theodor

import java.util.ArrayList;

public class Facultate {
    String nume;
    Adresa adresa;
    String email;
    int nrStudenti;
    int nrProfesori;
    ArrayList< Specializare> specializari;

    public Facultate() {
        nume = "NULL";
        adresa = new Adresa();
        email = "NULL";
        nrStudenti = 0;
        nrProfesori = 0;
        specializari = new ArrayList< Specializare>();
    }

    public Facultate(String nume, Adresa adresa, String email, ArrayList<Specializare> specializari) {
        this.nume = nume;
        this.adresa = adresa;
        this.email = email;
        this.nrStudenti=0;
        this.nrProfesori=0;
        this.specializari = specializari;
    }
    public Facultate(String nume, Adresa adresa, String email) {
        this.nume = nume;
        this.adresa = adresa;
        this.email = email;
        this.nrStudenti=0;
        this.nrProfesori=0;
        this.specializari = new ArrayList< Specializare>();
    }

    public Facultate(String nume, Adresa adresa, String email, int nrStudenti, int nrProfesori, ArrayList< Specializare> specializari) {
        this.nume = nume;
        this.adresa = adresa;
        this.email = email;
        this.nrStudenti = nrStudenti;
        this.nrProfesori = nrProfesori;
        this.specializari = specializari;
    }

    public Facultate(String nume, Adresa adresa, String email, int nrStudenti, int nrProfesori) {
        this.nume = nume;
        this.adresa = adresa;
        this.email = email;
        this.nrStudenti = nrStudenti;
        this.nrProfesori = nrProfesori;
        this.specializari = new ArrayList< Specializare>();
    }

    public Facultate(Facultate obj) {
        this.nume = obj.nume;
        this.adresa = obj.adresa;
        this.email = obj.email;
        this.nrStudenti = obj.nrStudenti;
        this.nrProfesori = obj.nrProfesori;
        this.specializari = obj.specializari;
    }

    //getteri


    public String getNume() {
        return this.nume;
    }

    public Adresa getAdresa() {
        return this.adresa;
    }

    public String getEmail() {
        return this.email;
    }

    public int getNrStudenti() {
        return this.nrStudenti;
    }

    public int getNrProfesori() {
        return this.nrProfesori;
    }

    public ArrayList<Specializare> getSpecializari() {
        return this.specializari;
    }

    //setteri


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNrStudenti(int nrStudenti) {
        this.nrStudenti = nrStudenti;
    }

    public void setNrProfesori(int nrProfesori) {
        this.nrProfesori = nrProfesori;
    }

    public void setSpecializari(ArrayList<Specializare> specializari) {
        this.specializari = specializari;
    }

    //adaugare specializare

    public void adaugaSpecializare(Specializare s) {
        this.specializari.add(s);
    }

    //Metode pentru a actualiza nrStudenti dupa fiecare instantiere
    public void cresteNrStudenti(){
         this.nrStudenti++;
    }

    //Metode pentru a actualiza nrProfesori dupa fiecare instantiere
    public void cresteNrProfesor(){
        this.nrProfesori++;
    }

    //metoda toString()
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
