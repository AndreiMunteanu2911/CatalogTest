
/**
 *
 * @author Tudor
 */
public class Persoana {
    int varsta;
    String nume,prenume,CNP;
    Adresa adresa;

    //constructor fara parametrii
    public Persoana(){
        this.varsta=0;
        this.nume="Neprecizat";
        this.prenume="Neprecizat";
        this.CNP="Neprecizat";
        this.adresa=new Adresa();
    }
    //constructor cu toate atributele
    public Persoana(int varsta,String nume,String prenume,String CNP,Adresa adresa){
        this.varsta=varsta;
        this.nume=nume;
        this.prenume=prenume;
        this.CNP=CNP;
        this.adresa=adresa;
    }
    //constructor cu toate atributele 2
    public Persoana(int varsta,String nume,String prenume,String CNP,String judet, String oras, String numeleStrazii, int nrStrazii, int codPostal, String nrTelefon){
        this.varsta=varsta;
        this.nume=nume;
        this.prenume=prenume;
        this.CNP=CNP;
        this.adresa=new Adresa(judet,oras, numeleStrazii, nrStrazii, codPostal, nrTelefon);
        
    }
    //constructor copiere
    public Persoana(Persoana p) {
        this.varsta = p.varsta;
        this.nume = p.nume;
        this.prenume = p.prenume;
        this.CNP = p.CNP;
        this.adresa = p.adresa;
    }

    //setteri
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public void setCNP(String CNP) {
        this.CNP = CNP;
    }
    //getteri
    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getCNP() {
        return CNP;
    }
    //Afisare persoana
    @Override
    public String toString() {
        return "Nume: "+this.nume+" Prenume: "+this.prenume+" CNP: "+this.CNP+" Varsta: "+this.varsta+"\n"+this.adresa.toString();
    }
}
