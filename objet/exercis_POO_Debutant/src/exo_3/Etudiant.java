package exo_3;

public class Etudiant {
    private String nom;
    private int age;
    private double[] notes;
    double moyenne =0;

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
    public double calculerMoyenne(){
        
        for (int i = 0; i < notes.length; i++) {
         moyenne += notes[i];
        }
return moyenne/notes.length;
    }
    public void afficherDetail(){
        System.out.println("Nom : "+this.nom+"\nAge : "+this.age+"\nMyenne : "+moyenne);
    }

}
