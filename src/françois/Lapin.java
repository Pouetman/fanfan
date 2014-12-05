/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package françois;

/**
 *
 * @author Fanfan
 */
public class Lapin {
    
    private String Nom;
    private int Âge;
    
    public Lapin (String name, int age){
        this.Nom = name;
        this.Âge = age;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getÂge() {
        return Âge;
    }

    public void setÂge(int Âge) {
        this.Âge = Âge;
    }
    
    public void crier(){
        System.out.println("HAAAAAAA!");
    }
}
