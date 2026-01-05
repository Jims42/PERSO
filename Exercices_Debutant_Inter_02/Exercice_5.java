package Exercices_Debutant_Inter_02;
// Consigne: Demande à l'utilisateur de saisir 7 nombres entiers. Stocke ces nombres dans un tableau, trie-les par ordre croissant, et affiche le tableau trié.

import java.util.Arrays;
import java.util.Scanner;

public class Exercice_5 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int[] tableau = new int[7];

        System.out.println("Veuillez entrer 7 Entier : ");

        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Veuillez entrer le nombre " + (i + 1) + " : ");
            tableau[i] = clavier.nextInt();
        }
        System.out.println();
        Arrays.sort(tableau);
        System.out.println("les nombres dans l'ordre croissant sont : ");
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }

        clavier.close();

    }
}

