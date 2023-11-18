/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
/**
 *
 * @author Andrei
 */
public class Specializare {
    String nume;
    ArrayList<Materie> materii;
    int nrLocuri;

    // constructor fara parametrii
    public Specializare(){
        nume="NULL";
        materii=new ArrayList<Materie>();
        nrLocuri=0;

    }
    // constructor cu parametrii partiali
    public Specializare(String nume,  int nrLocuri) {
        this.nume = nume;
        materii=new ArrayList<Materie>();
        this.nrLocuri=nrLocuri;
    }
    // constructor cu parametrii
    public Specializare(String nume, ArrayList<Materie> materii, int nrLocuri) {
        this.nume = nume;
        this.materii=materii;
        this.nrLocuri=nrLocuri;
    }

    // constructor de copiere
    public Specializare(Specializare s){
        this.nume=s.nume;
        this.materii=s.materii;
        this.nrLocuri=s.nrLocuri;
    }

    public void adaugaMaterie(Materie m){
        this.materii.add(m);
    }

    @Override
    public String toString() {
        String ret=new String("Specializarea: "+nume+"\n");
        ret=ret+"Nr de locuri: "+nrLocuri+"\nMaterii: "+"\n\n";
        for(int i = 0; i < materii.size(); i++) {
            ret=ret+materii.get(i).toString()+"\n";
        }
        return ret;
    }
}