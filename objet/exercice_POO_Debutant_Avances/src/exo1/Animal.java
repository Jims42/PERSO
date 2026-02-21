package exo1;

import java.util.ArrayList;

public class Animal {
    private String nom;
    private int age;
    private ArrayList<Animal> listeAnimaux;
    public Animal(){}
    public Animal(String _nom,int _age){
        this.nom=_nom;
        this.age=_age;
        this.listeAnimaux=new ArrayList<>();
            }
            public void faireDuBruit(){
                System.out.print(this.nom+", "+this.age+" ans ==> ");
            }

}
