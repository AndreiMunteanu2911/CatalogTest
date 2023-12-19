import java.util.ArrayList;
import javax.swing.SwingUtilities;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.IOException;

public class CatalogTest {

    public static void main(String[] args) {
        
//      Adresa adresaFEFS = new Adresa("Galati", "Galati", "Strada Garii", 63, 800003, "+0336 130 171");
//      Adresa adresaFDSA = new Adresa("Galati", "Galati", "Strada Domneasca", 111, 800201, "+0236 493 370");
//      System.out.println(adresaFEFS.toString());
//      System.out.println(adresaFDSA.toString());
//      Facultate FEFS = new Facultate("Facultatea de Educație Fizică și Sport", adresaFEFS, "secretariat.fefs@ugal.ro", 1000, 50);
//      Facultate FDSA = new Facultate("Facultatea de Drept și Științe Administrative", adresaFDSA, "secretariat.fdsa@ugal.ro", 800, 40);
//      FEFS.afisareFacultate();
//      FDSA.afisareFacultate();


       
        // cream specializarea CTI cu 3 materii
        Materie CTI_1 = new Materie("Proiectarea cu microprocesoare", 5);
        Materie CTI_2 = new Materie("Retele de calculatoare II", 4);
        Materie CTI_3 = new Materie("Programare WEB", 2);
        Specializare CTI = new Specializare("Calculatoare si tehnologia informatiilor", 150);
        CTI.adaugaMaterie(CTI_1);
        CTI.adaugaMaterie(CTI_2);
        CTI.adaugaMaterie(CTI_3);

        // cream specializarea IS cu 3 materii
        Specializare IS = new Specializare("Ingineria sistemelor", 200);
        Materie IS_1 = new Materie("Sisteme Automate", 4);
        Materie IS_2 = new Materie("Masini electrice si actionari", 5);
        Materie IS_3 = new Materie("Sisteme cu microprocesoare", 3);
        IS.adaugaMaterie(IS_1);
        IS.adaugaMaterie(IS_2);
        IS.adaugaMaterie(IS_3);

        // cream specializarea IE cu 3 materii
        Specializare IE = new Specializare("Inginerie electrica", 175);
        Materie IE_1 = new Materie("Microcontrolere si automate programabile", 5);
        Materie IE_2 = new Materie("Echipamente electrice", 2);
        Materie IE_3 = new Materie("Modelarea circuitelor electrice", 4);
        IE.adaugaMaterie(IE_1);
        IE.adaugaMaterie(IE_2);
        IE.adaugaMaterie(IE_3);

        //cream adresa facultatii FACIEE
        Adresa adresaFACIEE = new Adresa("Galati", "Galati", "Strada Stiintei", 2, 800146, "+0236 470 905");

        //cream facultatea FACIEE
        Facultate FACIEE = new Facultate("Facultatea de Automatică, Calculatoare, Inginerie Electrică si Electronică", adresaFACIEE, "decanat.faciee@ugal.ro");

        //adaugam specializarile
        FACIEE.adaugaSpecializare(CTI);
        FACIEE.adaugaSpecializare(IS);
        FACIEE.adaugaSpecializare(IE);

        // test toString Facultate (afiseaza toate datele facultatii, inclusiv specializarile acesteia)
        // System.out.println(FACIEE.toString());
        // test toString Profesor
        // Profesor prof1 = new Profesor(40, "Florin", "Dabija", "502589338593", "Galati", "Galati", "Domneasca", 1, 800008, "0236 314 044", FACIEE, CTI_1, 2500);
        // System.out.println(prof1.toString());
        // Profesor prof2 = new Profesor(55, "Petre", "Balint", "502759275493", "Galati", "Galati", "Petru Groza", 2, 800423, "0236 464 654", FACIEE, IE_2, 2000);
        // System.out.println(prof2.toString());
        // Profesor prof3 = new Profesor(35, "Georgiana", "Nita", "385938593850", "Galati", "Galati", "Bravilor", 49, 800171, "0236 418 060", FACIEE, IS_3, 3000);
        // System.out.println(prof3.toString());

        // test toString Student
        Student stud1 = new Student(20, "Emilian", "Toma", "502759275493", "Galati", "Tecuci", "Alexandru Ioan Cuza", 52, 800216, "0236 469 100", FACIEE, CTI);
        stud1.adaugaNota(CTI_1, 7);
        stud1.adaugaNota(CTI_2, 4);
        stud1.adaugaNota(CTI_3, 6);
        // System.out.println(stud1.toString());

        Student stud2 = new Student(24, "Eugen", "Andreescu", "502684903855", "Galati", "Tecuci", "General Ioan Dragalina", 1, 800290, "0800 896 622", FACIEE, IS);
        stud2.adaugaNota(IS_1, 10);
        stud2.adaugaNota(IS_2, 8);
        stud2.adaugaNota(IS_3, 9);
        // System.out.println(stud2.toString());

        Student stud3 = new Student(19, "Codrut", "Mihailescu", "5023359583", "Galati", "Galati", "Gheorghe Asachi", 2, 800487, "0336 114 796", FACIEE, IE);
        stud3.adaugaNota(IE_1, 3);
        stud3.adaugaNota(IE_2, 6);
        stud3.adaugaNota(IE_3, 5);
        // System.out.println(stud3.toString());



        //pentru a verifica daca s-a schimbat numarul de profesori & studenti dupa crearea lor
        //FACIEE.afisareFacultate();
        // System.out.println("\n\n\n");
        
        
        // Cream catalog
        Catalog ctl = new Catalog();
        ctl.adaugaStudent(stud1);
        ctl.adaugaStudent(stud2);
        ctl.adaugaStudent(stud3);
        // test toString catalog
        System.out.println(ctl.toString());
        // test filtruNote
        System.out.println("\n\n\n");
        System.out.println(ctl.toStringParametru(ctl.filtruNote(ctl.studenti)));
        // test filtruoras
        System.out.println("\n\n\n");
        System.out.println(ctl.toStringParametru(ctl.filtruOras("Tecuci",ctl.studenti)));
        // test filtruSpecializari
        System.out.println("\n\n\n");
        System.out.println(ctl.toStringParametru(ctl.filtruSpecializare("Inginerie electrica", ctl.studenti)));
        // test filtre multiple
        System.out.println("\n\n\n");
        System.out.println(ctl.toStringParametru(ctl.filtruOras("Tecuci",ctl.filtruNote(ctl.studenti))));
        // test filtruFacultate
        System.out.println("\n\n\n");
        System.out.println("Filtru pe baza numelui facultatii: ");
        System.out.println(ctl.toStringParametru(ctl.filtruFacultate("Facultatea de Litere", ctl.studenti)));
        // Test GUI
        // Creare catalog
        Catalog catalog = new Catalog();
        
        // Creare facultatea de litere
        Adresa adrLitere= new Adresa("Galati", "Galati", "Str. Domneasca", 11, 800201, "0336 130 200");
        Facultate LITERE = new Facultate("Facultatea de Litere",adrLitere , "secretariat.fl @ugal.ro");
        
        // Cream specializarea Limba si Literatura
        Specializare LL = new Specializare("Limba si Literatura", 150);
        Materie LL_1 = new Materie ("Literatura universala", 5);
        Materie LL_2 = new Materie ("Comunicare orala si scrisa", 4);
        Materie LL_3 = new Materie ("Literatura romana", 5);
        LL.adaugaMaterie(LL_1);
        LL.adaugaMaterie(LL_2);
        LL.adaugaMaterie(LL_3);
        
        // Cream specializarea Stiinte ale Comunicarii
        Specializare SC = new Specializare("Stiinte ale comunicarii", 100);
        Materie SC_1 = new Materie ("Istoria scrisului, a cartilor si a bibliotecii", 5);
        Materie SC_2 = new Materie ("Bazele biblioteconomiei", 3);
        Materie SC_3 = new Materie ("Psihologia educatiei", 2);
        SC.adaugaMaterie(SC_1);
        SC.adaugaMaterie(SC_2);
        SC.adaugaMaterie(SC_3);
        
        LITERE.adaugaSpecializare(LL);
        LITERE.adaugaSpecializare(SC);
        
        Adresa adresaFEFS = new Adresa("Galati", "Galati", "Strada Garii", 63, 800003, "+0336 130 171");
        Adresa adresaFDSA = new Adresa("Galati", "Galati", "Strada Domneasca", 111, 800201, "+0236 493 370");
        Facultate FEFS = new Facultate("Facultatea de Educație Fizică și Sport", adresaFEFS, "secretariat.fefs@ugal.ro", 1000, 50);
        Facultate FDSA = new Facultate("Facultatea de Drept și Științe Administrative", adresaFDSA, "secretariat.fdsa@ugal.ro", 800, 40);
        
        Specializare K = new Specializare("Kinetoterapie", 100);
        Materie K_1 = new Materie ("Kinetoterapie și motricitate speciala", 5);
        Materie K_2 = new Materie ("Gimnastica de baza", 3);
        Materie K_3 = new Materie ("Anatomie functionala", 4);
        Specializare EdF = new Specializare("Educatie Fizica si Sport", 150);
        Materie EdF_1 = new Materie ("Educație fizica și sportiva", 5);
        Materie EdF_2 = new Materie ("Fundamentele stiintifice ale jocurilor sportive", 4);
        Materie EdF_3 = new Materie ("Anatomie", 5);
        K.adaugaMaterie(K_1);
        K.adaugaMaterie(K_2);
        K.adaugaMaterie(K_3);
        EdF.adaugaMaterie(EdF_1);
        EdF.adaugaMaterie(EdF_2);
        EdF.adaugaMaterie(EdF_3);
        FEFS.adaugaSpecializare(K);
        FEFS.adaugaSpecializare(EdF);
        
        Specializare DR = new Specializare("Drept", 200);
        Materie DR_1 = new Materie ("Teoria generala a statului", 5);
        Materie DR_2 = new Materie ("Drept civil. Teorie generala", 4);
        Materie DR_3 = new Materie ("Teoria constructiei UE", 2);
        Specializare SA = new Specializare("Stiinte Administrative", 100);
        Materie SA_1 = new Materie ("Comunicare in administratia publica", 4);
        Materie SA_2 = new Materie ("Logica", 2);
        Materie SA_3 = new Materie ("Stiinta administratiei", 4);
        DR.adaugaMaterie(DR_1);
        SA.adaugaMaterie(SA_1);
        DR.adaugaMaterie(DR_2);
        SA.adaugaMaterie(SA_2);
        DR.adaugaMaterie(DR_3);
        SA.adaugaMaterie(SA_3);
        FDSA.adaugaSpecializare(DR);
        FDSA.adaugaSpecializare(SA);
        
        catalog.adaugaFacultate(LITERE);
        catalog.adaugaFacultate(FACIEE);
        catalog.adaugaFacultate(FEFS);
        catalog.adaugaFacultate(FDSA);
        
        Student stud4 = new Student(30, "Alexandru", "Ionescu", "502732424333", "Timis", "Timisoara", "9 Mai", 3, 300085, "0236 215 432", LITERE, LL);
        stud4.adaugaNota(LL_1, 10);
        stud4.adaugaNota(LL_2, 6);
        stud4.adaugaNota(LL_3, 7);
        Student stud5 = new Student(26, "Maria", "Stanciu", "502735364393", "Brasov", "Brasov", "Colinei", 7, 800216, "0236 233 543", FEFS, K);
        stud5.adaugaNota(K_1, 6);
        stud5.adaugaNota(K_2, 3);
        stud5.adaugaNota(K_3, 7);
        Student stud6 = new Student(20, "Vlad", "Aureliu", "502759325493", "Iasi", "Iasi", "Galata", 5, 800216, "0236 339 142", FDSA, SA);
        stud6.adaugaNota(SA_1, 6);
        stud6.adaugaNota(SA_2, 9);
        stud6.adaugaNota(SA_3, 8);
        
        
        
        catalog.adaugaStudent(stud1);
        catalog.adaugaStudent(stud2);
        catalog.adaugaStudent(stud3);
        catalog.adaugaStudent(stud4);
        catalog.adaugaStudent(stud5);
        catalog.adaugaStudent(stud6);
        CatalogGUI test = new CatalogGUI(catalog);
        test.setVisible(true);
        
        
        // Test Serializare
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Text.txt"))) {
            oos.writeObject(catalog);
            System.out.println("Instanta catalog a fost serializata");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Test deserializare
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Text.txt"))) {
            Catalog deserializedObject = (Catalog) ois.readObject();
            System.out.println("Instanta catalog a fost deserializata");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}