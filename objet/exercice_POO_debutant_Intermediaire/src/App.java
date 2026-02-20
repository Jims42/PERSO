import java.util.ArrayList;

import exo_1.*;
import exo_2.*;
import exo_3.*;
import exo_6.*;
import exo_4.Carre;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------------------EXO 1 ---------------------------------");
        Personne p1=new Personne("Jean Batiste", 31);
        Personne p2=new Personne("Marie-Sophie", 24);
        p1.sePresenter(p1);
        p2.sePresenter(p2);
      System.out.println("-------------------------------EXO 2 ---------------------------------");
      Voiture v1=new Voiture("Renault", "Megane", 2012);
      Voiture v2=new Voiture("Peugeot", "405", 1997);
      v1.afficherDetails();
      v2.afficherDetails();
      System.out.println("-------------------------------EXO 3 ---------------------------------");
      Chien chien=new Chien("Rocky", 5);
      chien.faireDuBruit();
      System.out.println("-------------------------------EXO 4 ---------------------------------");
      Carre carre=new Carre(17);
      carre.calculerAire();
      System.out.println("AIR ==> "+carre.calculerAire());
      System.out.println("-------------------------------EXO 5 ---------------------------------");
      Chien chien1=new Chien("Scarle", 7);
      Chien chien2=new Chien("kenza", 3);
      Chien chien3=new Chien("tyson", 9);
      ArrayList<Animal> listChien=new ArrayList<>();
      listChien.add(chien);
      listChien.add(chien1);
      listChien.add(chien2);
      listChien.add(chien3);
      for (Animal animal : listChien) {
        animal.faireDuBruit();
      }
         System.out.println("-------------------------------EXO 6 ---------------------------------");
         CompteBancaire compte=new CompteBancaire(5000);
         
         try {
            System.out.println("Tentative de retrait de 5500 euros...");
            compte.retirer(5500.0);
        } catch (Exception e) {
            // Le bloc catch s'exécute si une exception est levée
            System.out.println("Oups ! " + e.getMessage());
        }

        System.out.println("Le programme continue normalement.");
        System.out.println("--------------------");
        compte.retirer(1500);
        
     System.out.println("-------------------------------FIN EXERCICES ---------------------------------");
      }
}
