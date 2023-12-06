
import java.util.ArrayList;
import java.util.HashMap;

public class Catalog {
    ArrayList<Student> studenti;


    public ArrayList<Student> filtruNote(){
        ArrayList<Student> filtrat = new ArrayList<Student>();
        for (int i = 0; i < this.studenti.size(); i++) {
                for (HashMap.Entry < Materie, Integer > set: this.studenti.get(i).note.entrySet()) {
                    
                };
            }
        return filtrat;
    }
}