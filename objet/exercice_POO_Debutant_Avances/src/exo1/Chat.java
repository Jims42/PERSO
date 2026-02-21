package exo1;

public class Chat extends Animal{
    public Chat(String _nom,int _age){
        super(_nom,_age);
    }
    @Override
    public void faireDuBruit(){
        super.faireDuBruit();
        System.out.println("Miaou! Miaou!");
    }

}
