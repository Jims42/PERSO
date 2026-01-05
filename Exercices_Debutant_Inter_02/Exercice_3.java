package Exercices_Debutant_Inter_02;
// Consigne: Écris un programme qui demande à l'utilisateur d'entrer un montant en euros et le convertit en dollars (taux de change : 1 euro = 1.2 dollars). 
// Gère les exceptions pour éviter les entrées invalides.

import java.util.Scanner;

public class Exercice_3 {
    public static void main(String[] args) {
     Scanner clavier=new Scanner(System.in);

     final double EUR_TO_DOLLARS =1.2;
try{
System.out.println("Veuillez entrer le montant en EUROS que vous voulez convertir en DOLLARS");
double sommeEur=clavier.nextDouble();
double sommeConv=sommeEur*EUR_TO_DOLLARS;
System.out.println("la conversion de "+sommeEur+" Euros en dollars est : "+sommeConv);

}catch(java.util.InputMismatchException e){
    System.out.println("ERRUR de saisie");
}

System.out.println("Fin du programme");
     clavier.close();   
    }
}
