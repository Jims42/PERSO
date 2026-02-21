import java.util.ArrayList;
import java.util.Scanner;

import exo1.*;
import exo2.*;
import exo3.*;
import exo5.*;
public class App {
    public static void main(String[] args) throws Exception {
   System.out.println("-----------------------------EXO 1 ----------------------------");
   Chien monChien=new Chien("Tyson", 7);
   Chat monChat=new Chat("tomy", 9);
   monChien.faireDuBruit();
   monChat.faireDuBruit();
   System.out.println("-----------------------------EXO 2 ----------------------------");
   Carre monCarre=new Carre(40);
   Cercle monCercle=new Cercle(40);
   System.out.println("L'aire du carre = "+monCarre.calculerAire());
   System.out.println("L'aire du cercle = "+monCercle.calculerAire());
   System.out.println("-----------------------------EXO 3 ----------------------------");
   Oiseau monOiseau=new Oiseau();
   monOiseau.voler();
   System.out.println("-----------------------------EXO 4 ----------------------------");
   ArrayList<Animal> listAnimaux=new ArrayList<>();
   Chien moChien1=new Chien("Kenza", 6);
   listAnimaux.add(monChien);
   listAnimaux.add(monChat);
   listAnimaux.add(moChien1);
   for (Animal animal : listAnimaux) {
    animal.faireDuBruit();
   }
   System.out.println("-----------------------------EXO 5 ----------------------------");
   Scanner clavier=new Scanner(System.in);
   CompteBancaire monCompte=new CompteBancaire(500);
   try {
    
   System.out.println("Bonjour,\nIndiquer le montant a retirer");
   double montantRet=clavier.nextDouble();
   monCompte.retirer(montantRet);
    } catch (Exception e) {
        System.out.println("OUPS!!!\n"+e.getMessage());
    
   }
   
   clavier.close();
   System.out.println("-----------------------------FIN EXO ----------------------------");
    }
}
