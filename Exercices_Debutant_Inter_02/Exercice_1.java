package Exercices_Debutant_Inter_02;
// Consigne: Écris un programme qui demande à l'utilisateur d'entrer 5 notes (entre 0 et 20). 
// Calcule et affiche la moyenne de ces notes. Utilise une boucle pour redemander une note tant qu'elle n'est pas dans l'intervalle [0, 20].

import java.util.Scanner;

public class Exercice_1 {
    public static void main(String[] args) {
        Scanner clavier =new Scanner(System.in);
        System.out.println("Veuillez entrer 5 notes : ");

        double notes=0;
        double somme=0;
        for (int i = 1; i <= 5;) {
            System.out.print("Entrz la note "+i+" : ");
            notes=clavier.nextDouble();
            if (notes<0||notes>20) {
                System.out.println("ERREUR de saisie, Veuillez entrer une note entre 0 et 20");
                continue;
                
            } 
                i++;
                somme=somme+notes;
        }
                double moyenne=somme/5;
                System.out.println("La nmoyenne des 5 notes est : "+moyenne);



        clavier.close();
    }
}
