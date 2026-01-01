package Exercices_Debutant_Inter;
// Exercice 5: Combinaison de Concepts

// Consigne: Crée un programme qui demande à l'utilisateur de saisir 5 nombres. Stocke ces nombres dans un tableau et affiche:
// - La somme des nombres.
// - La moyenne des nombres.
// - Le plus grand nombre.
// Temps estimé: 30 minutes

import java.util.Arrays;
import java.util.Scanner;

public class Exercice_5 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int[] tableau = new int[5];
        System.out.println("Entrer 5 nombres : ");

        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Entrer nombre " + (i + 1) + " : ");
            tableau[i] = clavier.nextInt();
        }
        Arrays.sort(tableau);
        System.out.print("[ ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("\u001B[4;33m" + tableau[i] + "\u001B[4;0m" + " ");
        }
        System.out.println("]");
        System.out.print("La somme des nombres est :");
        int addition = 0;
        for (int i = 0; i < tableau.length; i++) {
            addition = addition + tableau[i];
        }
        // addition=0;
        // for (int n : tableau) {
        // addition += n;
        // }
        System.out.println("\u001B[4;32m" + addition + "\u001B[4;0m");

        System.out.print("La moyenne des nombres est : ");
        double moyenne = (double) addition / tableau.length;
        System.out.println("\u001B[4;32m" + moyenne + "\u001B[4;0m");

        System.out.print("Le nombre le plus grand est : ");
        System.out.println("\u001B[4;32m" + tableau[4] + "\u001B[4;0m");

        clavier.close();
    }
}
