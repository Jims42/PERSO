package exo1;

public class Chien extends Animal {
public Chien(String _nom,int _age){
    super(_nom,_age);
}
@Override
public void faireDuBruit(){
System.out.println("Woof! Woof!");
}
}
