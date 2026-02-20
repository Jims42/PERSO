package exo_1;

public class Personne {
private String nom;
private int age;

public Personne(){

}
public Personne(String _nom,int _age){
    this.nom=_nom;
    this.age=_age;

}
public String getNom(){return nom;}
public int getAge(){return age;}
public void sePresenter(Personne _Personne){
    System.out.println("Je m'appel "+_Personne.getNom()+" et j'ai "+_Personne.getAge()+" ans");
}
}
