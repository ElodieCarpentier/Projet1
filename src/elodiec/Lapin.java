package elodiec;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arya
 */
public class Lapin {
    
    private String Nom;
    private int Age;

    public Lapin(String Nom, int Age) {
        this.Nom = Nom;
        this.Age = Age;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
public void crier()
{
    System.out.println("HAAAAAAA");
}

 }
