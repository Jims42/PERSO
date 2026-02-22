import exo1.*;
import exo2.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------------------- EXO 1----------------------------");
        Compte c1 = new Compte("toto", 5000);
        Compte c2 = new Compte("Grominet", 4500);
        Compte c3 = new Compte("toti", 1250);
        c1.afficherResume();
        c2.afficherResume();
        c3.afficherResume();
        c2.setSolde(-100);
        System.out.println("--------------------------------------------- EXO 2----------------------------");
Compte_PEL pel1=new Compte_PEL("mimi", 150);
Compte_PEL pel2=new Compte_PEL("fill", 350);
pel1.afficherResume();
pel2.afficherResume();
System.out.println("--------------------------------------------- EXO 3----------------------------");
System.out.println("--------------------------------------------- EXO 4----------------------------");
    }
}
