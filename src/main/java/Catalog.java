
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Catalog {
    ArrayList<Student> studenti;
    HashSet<String> orase;
    HashSet<Specializare> specializari;
    ArrayList <Facultate> facultati;

    public Catalog() {
        this.studenti = new ArrayList<Student>();
        this.orase = new HashSet<String>();
        this.facultati = new ArrayList<Facultate>();
    }

    public void adaugaFacultate(Facultate f) {
        this.facultati.add(f);
    }

    public void adaugaStudent(Student s) {
        this.studenti.add(s);
        this.orase.add(s.adresa.oras);
    }

    //filtreaza studentii dupa nume
    public ArrayList<Student> filtruStudent(ArrayList<Student> initial) {
        ArrayList<Student> filtrat = new ArrayList<Student>();
        for (int i = 0; i < initial.size(); i++) {
            int ok = 1;
            for (HashMap.Entry<Materie, Integer> set : initial.get(i).note.entrySet()) {
                if (initial.get(i).getNota(set.getKey()) < 5) {
                    ok = 0;
                }
            }
            if (ok == 1) {
                filtrat.add(initial.get(i));
            }
        }
        return filtrat;
    }


    public ArrayList<Student> filtruAdresa(String oras, ArrayList<Student> initial) {
        ArrayList<Student> filtrat = new ArrayList<Student>();
        for (int i = 0; i < initial.size(); i++) {
            if (initial.get(i).adresa.oras == oras) {
                filtrat.add(initial.get(i));
            }
        }
        return filtrat;
    }

    public ArrayList<Student> filtruSpecializare(Specializare spec, ArrayList<Student> initial) {
        ArrayList<Student> filtrat = new ArrayList<Student>();
        for (int i = 0; i < initial.size(); i++) {
            if (initial.get(i).specializare.nume == spec.nume) {
                filtrat.add(initial.get(i));
            }
        }
        return filtrat;
    }

    public ArrayList<Student> filtruFacultate(String facultate, ArrayList<Student> initial) {
        ArrayList<Student> filtrat = new ArrayList<Student>();
        for(int i = 0; i < initial.size(); i++) {
            if(Objects.equals(initial.get(i).facultate.nume, facultate)) {
                filtrat.add(initial.get(i));
            }
        }
        return filtrat;
    }

    //niste toString-uri
    public String toStringParametru(ArrayList<Student> studenti) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < studenti.size(); i++) {
            ret.append(studenti.get(i));
        }
        return ret.toString();
    }

    public String toString() {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < this.studenti.size(); i++) {
            ret.append(this.studenti.get(i));
        }
        return ret.toString();
    }
}