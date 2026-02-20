package exo_3;

import java.util.ArrayList;

public class Animal {
    private String nomAnimal;
    private int ageAnimal;
    private ArrayList<Animal>listChiens;
    public Animal(){}
    public Animal(String _nom,int _age){
        this.nomAnimal=_nom;
        this.ageAnimal=_age;

    }
    public String getNomAnimal(){return nomAnimal;}
    public int getAgeAnimal(){return ageAnimal;}
    public void faireDuBruit(){
        System.out.print("( "+this.nomAnimal+", "+this.ageAnimal+" ans ) ");
    }

}
