// Bodea Marius-Theodor

public class Adresa {

    String judet;
    String oras;
    String numeleStrazii;
    int numarulStrazii;
    int codPostal;
    String nrTelefon;

    //constructor fara parametrii
    public Adresa() {
        judet = "NULL";
        oras = "NULL";
        numeleStrazii = "NULL";
        numarulStrazii = 0;
        codPostal = 0;
        nrTelefon = "NULL";
    }

    //constructor cu parametrii
    public Adresa(String judet, String oras, String numeleStrazii, int numarulStrazii, int codPostal, String nrTelefon) {
        this.judet = judet;
        this.oras = oras;
        this.numeleStrazii = numeleStrazii;
        this.numarulStrazii = numarulStrazii;
        this.codPostal = codPostal;
        this.nrTelefon = nrTelefon;
    }

    //constructor de copiere
    public Adresa(Adresa obj) {
        this.judet = obj.judet;
        this.oras = obj.oras;
        this.numeleStrazii = obj.numeleStrazii;
        this.numarulStrazii = obj.numarulStrazii;
        this.codPostal = obj.codPostal;
        this.nrTelefon = obj.nrTelefon;
    }

    //metoda toString()
    @Override
    public String toString() {
        return "Adresa: " + judet + ", " + oras + ", " + numeleStrazii + " " + numarulStrazii + ", Cod Postal: " + codPostal + ", Telefon: " + nrTelefon;
    }

}
