package exo_3;

import java.util.Arrays;

public class Etudiant {
    private String nom;
    private int age;
    private double[] notes;
   

    public Etudiant(){
    }
    public Etudiant(String _nom,int _age){
        this.nom=_nom;
        this.age=_age;
        this.notes=new double[3];
    }
    public String getNom(){
        return nom;
    }
    public int getAge(){
        return age;
    }
    // public void setNotes(double[] _notes){
    //     this.notes=_notes;
    // }
    public void setNotes(double[] notes) {
    this.notes = Arrays.copyOf(notes, notes.length); // Copie défensive
}

    public double calculerMoyenne(){
         double moyenne =0;
        for (int i = 0; i < notes.length; i++) {
         moyenne += notes[i];
        }
return moyenne/notes.length;
    }
    public void afficherDetail(){
        System.out.println("Nom : "+this.nom+"\nAge : "+this.age+"\nMyenne : "+this.calculerMoyenne());
    }

}
