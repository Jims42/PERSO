package Exercices_Debutant_Inter_02;

// Consigne: Crée un tableau de 10 entiers aléatoires entre 1 et 50. 

// Demande à l'utilisateur d'entrer un nombre et indique-lui si ce nombre est présent dans le tableau.

import java.util.Random;
import java.util.Scanner;

public class Exercice_2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Random nombres = new Random();

        int[] tableau = new int[10];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = nombres.nextInt(50) + 1;
            // System.out.print(tableau[i] + " ");
        }
        System.out.println();
        int nombreSaisie = 0;
        int tentative = 0;
        boolean trouve = false;

        while (!trouve) {

            try {
                System.out.println("Veuillez entrer un entier entre 1 et 50 : ");
                nombreSaisie = clavier.nextInt();
                tentative++;

                for (int alea : tableau) {
                    if (nombreSaisie == alea) {
                        trouve = true;
                        break;
                    }
                }
                if (trouve) {
                    System.out.println("BRAVO ");

                } else {
                    System.out.println("DOMMAGE, essayer encore ");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("ERREUR de saisie");
                clavier.next();
            }

        }

        System.out.println("Vous avez trouvez le nombre " + nombreSaisie + " en " + tentative + " essais");
        System.out.print("Les nombres cachés étaient : ");
        for (int n : tableau) {
            System.out.print(n + " ");
        }

        clavier.close();

    }
}
