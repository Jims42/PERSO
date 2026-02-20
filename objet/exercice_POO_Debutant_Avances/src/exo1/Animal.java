package exo1;

public class Animal {
    private String nom;
    private int age;
    public Animal(){}
    public Animal(String _nom,int _age){
        this.nom=_nom;
        this.age=_age;
            }
            public void faireDuBruit(){
                System.out.println(this.nom+", "+this.age+" ans");
            }

}
