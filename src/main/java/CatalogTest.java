/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Andrei
 */
public class CatalogTest {
    public static void main(String[] args) {
        // cream specializarea CTI cu 3 materii
        Materie CTI_1=new Materie("Proiectarea cu microprocesoare", "I. Susnea", 5);
        Materie CTI_2 = new Materie("Retele de calculatoare II", "C. Niculita", 4);
        Materie CTI_3=new Materie("Programare WEB", "V. Jascanu", 2);
        Specializare CTI=new Specializare("Calculatoare si tehnologia informatiilor",150);
        CTI.adaugaMaterie(CTI_1);
        CTI.adaugaMaterie(CTI_2);
        CTI.adaugaMaterie(CTI_3);

        // cream specializarea IS cu 3 materii
        Specializare IS=new Specializare("Ingineria sistemelor",200);
        Materie IS_1=new Materie("Sisteme Automate", "A. Serbencu", 4);
        Materie IS_2=new Materie("Masini electrice si actionari", "R. Paduraru", 5);
        Materie IS_3=new Materie("Sisteme cu microprocesoare", "L. Luca", 3);
        IS.adaugaMaterie(IS_1);
        IS.adaugaMaterie(IS_2);
        IS.adaugaMaterie(IS_3);

        // cream specializarea IE cu 3 materii
        Specializare IE=new Specializare("Inginerie electrica",175);
        Materie IE_1=new Materie("Microcontrolere si automate programabile", "A. Serbencu", 5);
        Materie IE_2=new Materie("Echipamente electrice", "N. Badea", 2);
        Materie IE_3=new Materie("Modelarea circuitelor electrice", "A. Burlibasa", 4);
        IE.adaugaMaterie(IE_1);
        IE.adaugaMaterie(IE_2);
        IE.adaugaMaterie(IE_3);

        // test toString
        System.out.println(CTI.toString());
        System.out.println(IS.toString());
        System.out.println(IE.toString());

    }
}
