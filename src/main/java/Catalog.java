import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Random;
import java.text.DecimalFormat;

public class Catalog implements Serializable{
    ArrayList<Student> studenti;
    
    // campuri ajutatoare pentru filtre
    ArrayList<Facultate> facultati;
    HashSet <String> orase;
    
    
    public Catalog(){
        this.studenti = new ArrayList < Student > ();
        this.orase = new HashSet < String > ();
        this.facultati = new ArrayList < Facultate > ();
    }
    
    public void adaugaStudent(Student s){
        this.studenti.add(s);
        this.orase.add(s.adresa.oras);
    }

    // filtreaza studentii dupa note (studentii cu toate notele > 5)
    public ArrayList<Student> filtruNote(ArrayList<Student> initial){
        ArrayList<Student> filtrat = new ArrayList<Student>();
        for (int i = 0; i < initial.size(); i++) {
                int ok = 1;
                for (HashMap.Entry < Materie, Integer > set: initial.get(i).note.entrySet()) {
                    if (initial.get(i).getNota(set.getKey()) <5)
                    {
                        ok=0;
                    }
                }
                if (ok==1){
                    filtrat.add(initial.get(i));
                }
            }
        return filtrat;
    }
    
    // filtru dupa adresa
    public ArrayList<Student> filtruOras(String oras, ArrayList<Student> initial){
        ArrayList<Student> filtrat = new ArrayList<Student>();
        for (int i = 0; i < initial.size(); i++) {
                if (initial.get(i).adresa.oras==oras){
                    filtrat.add(initial.get(i));
                }
        }
        return filtrat;
    }
    
    // filtru dupa specializare
    public ArrayList<Student> filtruSpecializare(String spec, ArrayList<Student> initial){
        ArrayList<Student> filtrat = new ArrayList<Student>();
        for (int i = 0; i < initial.size(); i++) {
                if (initial.get(i).specializare.nume==spec){
                    filtrat.add(initial.get(i));
                }
        }
        return filtrat;
    }
    
    // filtru dupa facultate
    public ArrayList<Student> filtruFacultate(String facultate, ArrayList<Student> initial) {
        ArrayList<Student> filtrat = new ArrayList<Student>();
        for(int i = 0; i < initial.size(); i++) {
            if(initial.get(i).facultate.nume.equals(facultate)) {
                filtrat.add(initial.get(i));
            }
        }
        return filtrat;
    }
    
    // filtru dupa materie
    public ArrayList<Student> filtruMaterie(Materie materie, ArrayList<Student> initial) {
        ArrayList<Student> filtrat = new ArrayList<Student>();
        for(int i = 0; i < initial.size(); i++) {
            if(initial.get(i).note.containsKey(materie)) {
                filtrat.add(initial.get(i));
            }
        }
        return filtrat;
    }
    
    public String toStringParametru(ArrayList<Student> studenti){
        StringBuilder  ret = new StringBuilder();
        for (int i = 0; i < studenti.size(); i++) {
            ret.append(studenti.get(i));
        }
        return ret.toString();
    }
    
    public void adaugaFacultate (Facultate fac){
        this.facultati.add(fac);
    }
   
    
    public String toString(){
        String  ret = new String();
        for (int i = 0; i < this.studenti.size(); i++) {
            ret = ret +this.studenti.get(i).toString();
        }
        return ret;
    }
    
    public static void ScrieFisier(Catalog catalog)throws IOException{
        String fileName= "Test.txt";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(catalog);
        oos.close();
    }

    public static Catalog CitesteFisier()throws Exception{
        String fileName= "Test.txt";
        FileInputStream fin = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fin);
        Catalog catalog= (Catalog) ois.readObject();
        ois.close();
        return catalog;
    }
    
    public Student GenereazaStudentAleatoriu(){
        Random rand = new Random();
        int a = 5;
        int b = 6;
        String cnprand = Integer.toString(rand.nextBoolean() ? a : b)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0)+Integer.toString(rand.nextInt((9 - 0) + 1) + 0);
        int varsta = rand.nextInt(35-18) + 18;
        String[] listaPrenume={"Ana", "Alexandru", "Mihaela", "Andreea", "Elena", "Adrian", "Andrei", "Alexandra", "Mihai", "Ionut", "Cristina", "Florin", "Daniel"};
        String randPrn = listaPrenume[rand.nextInt(12)];
        String[] listaNume={"Popescu", "Radu", "Ionescu", "Dumitru", "Stoica", "Stan", "Gheorghe", "Rusu", "Munteanu", "Matei", "Constantin", "Serban", "Marin", "Mihai", "Stefan"};
        String randNume = listaNume[rand.nextInt(15)];
        String[] listaJudete={"Bucuresti", "Iasi", "Prahova", "Cluj", "Constanta", "Timis", "Suceava", "Bacau", "Galati", "Braila", "Dolj", "Arges", "Bihor", "Brasov", "Ilfov"};
        String randJudet = listaJudete[rand.nextInt(15)];
        String[] listaOrase={"Tecuci","Bucuresti", "Iasi", "Cluj-Napoca", "Constanta", "Timisoara", "Brasov", "Craiova", "Galati", "Oradea","Ploiesti", "Braila", "Arad", "Pitesti", "Bacau"};
        String randOras = listaOrase[rand.nextInt(14)];
        String[] listaStrada={"Mihai Eminescu", "Tudor Vladimirescu", "Primaverii", "Balcescu", "Libertatii", "Trandafirilor", "Garii", "Florilor", "1 Mai", "Unirii", "Liliacului","Ion Creanga", "George Cosbuc"};
        String randStrada = listaStrada[rand.nextInt(13)];
        int nr = rand.nextInt(20-1) + 1;
        int post = rand.nextInt(899999-200000) + 200000;
        int num1 = 0 * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        int num2 = rand.nextInt(743);
        int num3 = rand.nextInt(10000);
        DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
        DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros
        String phoneNumber = df3.format(num1) + " " + df3.format(num2) + " " + df4.format(num3);
        Facultate randFac=this.facultati.get(rand.nextInt(this.facultati.size()));
        Specializare randSpec=randFac.specializari.get(rand.nextInt(this.facultati.get(rand.nextInt(this.facultati.size())).specializari.size()-1));
        Student stud = new Student(varsta, randNume, randPrn, cnprand, randJudet, randOras, randStrada, nr, post, phoneNumber, randFac, randSpec);
        stud.note.put(stud.specializare.materii.get(0), rand.nextInt(9-1));
        stud.note.put(stud.specializare.materii.get(1), rand.nextInt(9-1));
        stud.note.put(stud.specializare.materii.get(2), rand.nextInt(9-1));
        this.adaugaStudent(stud);
        return stud;
    }
}