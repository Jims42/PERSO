package Exercices_Debutant_Inter;
// Exercice 2: Tableaux

// Consigne: Crée un tableau de 5 entiers. Demande à l'utilisateur de remplir ce tableau. Ensuite, affiche le tableau en ordre inverse.
// Temps estimé: 20 minutes

import java.util.Arrays;
import java.util.Scanner;

public class Exercice_2 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int[] tableau = new int[5];
        System.out.println("Veuillez entrer 5 nombres : ");
        // tableau[0] =clavier.nextInt();
        // tableau[1]=clavier.nextInt();
        // tableau[2] =clavier.nextInt();
        // tableau[3] =clavier.nextInt();
        // tableau[4] =clavier.nextInt();

        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Entrez le nombre " + (i + 1) + " : ");
            tableau[i] = clavier.nextInt();
        }

        Arrays.sort(tableau);
        System.out.println("Le resultat dans l'ordre décroissant est : ");
        for (int i = tableau.length - 1; i >= 0; i--) {
            System.out.print(tableau[i] + " ");
        }
        clavier.close();

    }

}
