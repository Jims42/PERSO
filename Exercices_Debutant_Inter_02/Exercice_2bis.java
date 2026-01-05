package Exercices_Debutant_Inter_02;

import java.util.Random;
import java.util.Scanner;

public class Exercice_2bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Random nombres = new Random();
        
        int[] tableau = new int[10];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = nombres.nextInt(50) + 1;
        }

        int nombreSaisie = 0;
        int tentative = 0;
        boolean trouve = false;

        while (!trouve) {
            try {
                System.out.println("Veuillez entrer un entier entre 1 et 50 : ");
                nombreSaisie = clavier.nextInt();
                tentative++;

                // Correction ici : on compare avec 'n' qui parcourt le tableau
                for (int n : tableau) {
                    if (nombreSaisie == n) {
                        trouve = true;
                        break;
                    }
                }

                if (trouve) {
                    System.out.println("BRAVO");
                } else {
                    System.out.println("DOMMAGE, essayez encore");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("ERREUR de saisie");
                clavier.next(); // Nettoie le scanner
            }
        } // Cette accolade ferme le WHILE

        System.out.println("Vous avez trouvé le nombre " + nombreSaisie + " en " + tentative + " essais");
        clavier.close();
    }
}

