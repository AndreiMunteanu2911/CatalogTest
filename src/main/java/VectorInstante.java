import java.util.ArrayList;

public class VectorInstante {
    public static void main(String[] args) {

        //10 instante pentru clasa Adresa
        Adresa[] adrese = new Adresa[10];
        adrese[0] = new Adresa("Judet1", "Oras1", "Strada1", 1, 12345, "123-456-789");
        adrese[1] = new Adresa("Judet2", "Oras2", "Strada2", 2, 67890, "987-654-321");
        adrese[2] = new Adresa("Judet3", "Oras3", "Strada3", 3, 10101, "111-222-333");
        adrese[3] = new Adresa("Judet4", "Oras4", "Strada4", 4, 20202, "444-555-666");
        adrese[4] = new Adresa("Judet5", "Oras5", "Strada5", 5, 30303, "777-888-999");
        adrese[5] = new Adresa("Judet6", "Oras6", "Strada6", 6, 40404, "000-111-222");
        adrese[6] = new Adresa("Judet7", "Oras7", "Strada7", 7, 50505, "999-888-777");
        adrese[7] = new Adresa("Judet8", "Oras8", "Strada8", 8, 60606, "666-555-444");
        adrese[8] = new Adresa("Judet9", "Oras9", "Strada9", 9, 70707, "333-222-111");
        adrese[9] = new Adresa("Judet10", "Oras10", "Strada10", 10, 80808, "123-321-456");

        //10 instante pentru clasa Facultate
        Facultate[] facultati = new Facultate[10];
        facultati[0] = new Facultate("Facultate1", adrese[0], "email1");
        facultati[1] = new Facultate("Facultate2", adrese[1], "email2");
        facultati[2] = new Facultate("Facultate3", adrese[2], "email3");
        facultati[3] = new Facultate("Facultate4", adrese[3], "email4");
        facultati[4] = new Facultate("Facultate5", adrese[4], "email5");
        facultati[5] = new Facultate("Facultate6", adrese[5], "email6");
        facultati[6] = new Facultate("Facultate7", adrese[6], "email7");
        facultati[7] = new Facultate("Facultate8", adrese[7], "email8");
        facultati[8] = new Facultate("Facultate9", adrese[8], "email9");
        facultati[9] = new Facultate("Facultate10", adrese[9], "email10");

        // afisari
        for (int i = 0; i < adrese.length; i++) {
            System.out.println("Adresa " + (i + 1) + ": " + adrese[i].toString());
            System.out.println("Facultate " + (i + 1) + ": " + facultati[i].toString());
            System.out.println();
        }

        //10 instante pentru clasa materii
        Materie[] materii = new Materie[10];
        materii[0] = new Materie("Materie1", 0);
        materii[1] = new Materie("Materie2", 1);
        materii[2] = new Materie("Materie3", 2);
        materii[3] = new Materie("Materie4", 3);
        materii[4] = new Materie("Materie5", 4);
        materii[5] = new Materie("Materie6", 5);
        materii[6] = new Materie("Materie7", 6);
        materii[7] = new Materie("Materie8", 7);
        materii[8] = new Materie("Materie9", 8);
        materii[9] = new Materie("Materie10", 9);

        ArrayList<Materie> m1 = new ArrayList<Materie>();
        m1.add(materii[0]);
        m1.add(materii[1]);
        m1.add(materii[2]);

        //10 instante pentru clasa Specializare
        Specializare[] specializares = new Specializare[10];
        specializares[0] = new Specializare("Specializare1", m1, 1);
        specializares[1] = new Specializare("Specializare2", m1, 2);
        specializares[2] = new Specializare("Specializare3", m1, 3);
        specializares[3] = new Specializare("Specializare4", m1, 4);
        specializares[4] = new Specializare("Specializare5", m1, 5);
        specializares[5] = new Specializare("Specializare6", m1, 6);
        specializares[6] = new Specializare("Specializare7", m1, 7);
        specializares[7] = new Specializare("Specializare8", m1, 8);
        specializares[8] = new Specializare("Specializare9", m1, 9);
        specializares[9] = new Specializare("Specializare10", m1, 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(materii[i].toString());
            System.out.println( specializares[i].toString());
            System.out.println();
        }

        //10 instante pentru clasa Student
        Student[] stundenti = new Student[10];
        stundenti[0] = new Student( 1, "nume1","prenume1", "CNP1", adrese[0],facultati[0] ,specializares[0]);
        stundenti[1] = new Student(2, "nume2","prenume2", "CNP2", adrese[1],facultati[1] ,specializares[1]);
        stundenti[2] = new Student(3, "nume3","prenume3", "CNP3", adrese[2],facultati[2] ,specializares[2]);
        stundenti[3] = new Student(4, "nume4","prenume4", "CNP4", adrese[3],facultati[3] ,specializares[3]);
        stundenti[4] = new Student(5, "nume5","prenume5", "CNP5", adrese[4],facultati[4] ,specializares[4]);
        stundenti[5] = new Student(6, "nume6","prenume6", "CNP6", adrese[5],facultati[5] ,specializares[5]);
        stundenti[6] = new Student(7, "nume7","prenume7", "CNP7", adrese[6],facultati[6] ,specializares[6]);
        stundenti[7] = new Student(8, "nume8","prenume8", "CNP8", adrese[7],facultati[7] ,specializares[7]);
        stundenti[8] = new Student(9, "nume9","prenume9", "CNP9", adrese[8],facultati[8] ,specializares[8]);
        stundenti[9] = new Student(10, "nume10","prenume10", "CNP10", adrese[9],facultati[9] ,specializares[9]);

        Profesor[] profesori = new Profesor[10];
        profesori[0] = new Profesor( 1, "nume1","prenume1", "CNP1", adrese[0],facultati[0] ,materii[0],1);
        profesori[1] = new Profesor(2, "nume2","prenume2", "CNP2", adrese[1],facultati[1] ,materii[1],2);
        profesori[2] = new Profesor(3, "nume3","prenume3", "CNP3", adrese[2],facultati[2] ,materii[2],3);
        profesori[3] = new Profesor(4, "nume4","prenume4", "CNP4", adrese[3],facultati[3] ,materii[3],4);
        profesori[4] = new Profesor(5, "nume5","prenume5", "CNP5", adrese[4],facultati[4] ,materii[4],5);
        profesori[5] = new Profesor(6, "nume6","prenume6", "CNP6", adrese[5],facultati[5] ,materii[5],6);
        profesori[6] = new Profesor(7, "nume7","prenume7", "CNP7", adrese[6],facultati[6] ,materii[6],7);
        profesori[7] = new Profesor(8, "nume8","prenume8", "CNP8", adrese[7],facultati[7] ,materii[7],8);
        profesori[8] = new Profesor(9, "nume9","prenume9", "CNP9", adrese[8],facultati[8] ,materii[8],9);
        profesori[9] = new Profesor(10, "nume10","prenume10", "CNP10", adrese[9],facultati[9] ,materii[9],10);

        for (int i = 0; i < 10; i++) {
            System.out.println(stundenti[i].toString());
            System.out.println( profesori[i].toString());
            System.out.println();
        }
    }
}