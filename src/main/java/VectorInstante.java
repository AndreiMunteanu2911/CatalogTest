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
    }
}