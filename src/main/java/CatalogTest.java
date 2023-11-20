
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class CatalogTest {

    public static void main(String[] args) {
        // cream specializarea CTI cu 3 materii
        Materie CTI_1 = new Materie("Proiectarea cu microprocesoare", "I. Susnea", 5);
        Materie CTI_2 = new Materie("Retele de calculatoare II", "C. Niculita", 4);
        Materie CTI_3 = new Materie("Programare WEB", "V. Jascanu", 2);
        Specializare CTI = new Specializare("Calculatoare si tehnologia informatiilor", 150);
        CTI.adaugaMaterie(CTI_1);
        CTI.adaugaMaterie(CTI_2);
        CTI.adaugaMaterie(CTI_3);

        // cream specializarea IS cu 3 materii
        Specializare IS = new Specializare("Ingineria sistemelor", 200);
        Materie IS_1 = new Materie("Sisteme Automate", "A. Serbencu", 4);
        Materie IS_2 = new Materie("Masini electrice si actionari", "R. Paduraru", 5);
        Materie IS_3 = new Materie("Sisteme cu microprocesoare", "L. Luca", 3);
        IS.adaugaMaterie(IS_1);
        IS.adaugaMaterie(IS_2);
        IS.adaugaMaterie(IS_3);

        // cream specializarea IE cu 3 materii
        Specializare IE = new Specializare("Inginerie electrica", 175);
        Materie IE_1 = new Materie("Microcontrolere si automate programabile", "A. Serbencu", 5);
        Materie IE_2 = new Materie("Echipamente electrice", "N. Badea", 2);
        Materie IE_3 = new Materie("Modelarea circuitelor electrice", "A. Burlibasa", 4);
        IE.adaugaMaterie(IE_1);
        IE.adaugaMaterie(IE_2);
        IE.adaugaMaterie(IE_3);

        //test toString Specializari
        //System.out.println(CTI.toString());
        //System.out.println(IS.toString());
        //System.out.println(IE.toString());
        //cream facultatea FACIEE
        Adresa adresaFACIEE = new Adresa("Galati", "Galati", "Strada Stiintei", 2, 800146, "+0236 470 905");
        //ArrayList < Specializare > specializari = new ArrayList < Specializare >();
        //specializari.add(CTI);
        //specializari.add(IS);
        //specializari.add(IE);
        //Facultate FACIEE = new Facultate("Facultatea de Automatică, Calculatoare, Inginerie Electrică și Electronică", adresaFACIEE, "decanat.faciee@ugal.ro", 1000, 50, specializari);
        Facultate FACIEE = new Facultate("Facultatea de Automatică, Calculatoare, Inginerie Electrică si Electronică", adresaFACIEE, "decanat.faciee@ugal.ro", 1000, 50);
        FACIEE.adaugaSpecializare(CTI);
        FACIEE.adaugaSpecializare(IS);
        FACIEE.adaugaSpecializare(IE);

        // test toString Facultate
        System.out.println(FACIEE.toString());
        // test toString Student
        Student stud1 = new Student(20, "Emilian", "Toma", "502759275493", "Galati", "Galati", "Alexandru Ioan Cuza", 52, 800216, "0236 469 100", FACIEE, CTI);
        stud1.adaugaNota(CTI_1, 7);
        stud1.adaugaNota(CTI_2, 4);
        stud1.adaugaNota(CTI_3, 6);
        System.out.println(stud1.toString());

        Student stud2 = new Student(24, "Eugen", "Andreescu", "502684903855", "Galati", "Galati", "General Ioan Dragalina", 1, 800290, "0800 896 622", FACIEE, IS);
        stud2.adaugaNota(IS_1, 10);
        stud2.adaugaNota(IS_2, 8);
        stud2.adaugaNota(IS_3, 9);
        System.out.println(stud2.toString());

        Student stud3 = new Student(19, "Codrut", "Mihailescu", "5023359583", "Galati", "Galati", "Gheorghe Asachi", 2, 800487, "0336 114 796", FACIEE, IE);
        stud3.adaugaNota(IE_1, 3);
        stud3.adaugaNota(IE_2, 6);
        stud3.adaugaNota(IE_3, 5);
        System.out.println(stud3.toString());
        // test toString Profesor
        Profesor prof1 = new Profesor(40, "Florin", "Dabija", "502589338593", "Galati", "Galati", "Domneasca", 1, 800008, "	0236 314 044", FACIEE, CTI_1, 2500);
        System.out.println(prof1.toString());
        Profesor prof2 = new Profesor(55, "Petre", "Balint", "502759275493", "Galati", "Galati", "Petru Groza", 2, 800423, "0236 464 654", FACIEE, IE_2, 2000);
        System.out.println(prof2.toString());
        Profesor prof3 = new Profesor(35, "Georgiana", "Nita", "385938593850", "Galati", "Galati", "Bravilor", 49, 800171, "0236 418 060", FACIEE, IS_3, 3000);
        System.out.println(prof3.toString());


    }
}
