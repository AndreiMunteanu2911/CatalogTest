/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andrei
 */
public class Materie {
    String nume;
    String profesor;
    int nrCredite;

    // constructor gol
    public Materie(){
        nume="NULL";
        profesor = "NULL";
        nrCredite=0;

    }
    // constructor cu parametrii
    public Materie(String nume, String profesor, int nrCredite) {
        this.nume = nume;
        this.profesor=profesor;
        this.nrCredite=nrCredite;
    }

    // constructor de copiere
    public Materie(Materie m){
        this.nume=m.nume;
        this.profesor= m.profesor;
        this.nrCredite=m.nrCredite;
    }

    @Override
    public String toString() {
        return nume+"\nProfesor: "+profesor+"\nNr. de credite: "+nrCredite+"\n";
    }
}