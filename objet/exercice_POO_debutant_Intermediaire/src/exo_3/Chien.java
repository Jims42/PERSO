package exo_3;

public class Chien extends Animal{
public Chien(String _nomAnimal,int _ageAnimal){
    super(_nomAnimal, _ageAnimal);
}
@Override
public void faireDuBruit(){
    super.faireDuBruit();
    System.out.println(" Woof! Woof!");
}
}
