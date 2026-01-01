package Exercices_Debutant_Inter;

import java.util.Random;
import java.util.Scanner;

public class Exercice_7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Random chiffre = new Random();

        int[] tableau = new int[10];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) chiffre.nextInt(101);
        }
        System.out.print("[ ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println("]");
        System.out.println("Tentez de trouver un nombre dans le tableau : ");
        int tentative = clavier.nextInt();
        boolean trouve = false;
        for (int nombre : tableau) {
            if (nombre == tentative) {
                trouve = true;
                break;
            }
        }
        if (trouve) {
            System.out.println("Felicitation , vous avez trouvé le nombre " + tentative + " dans le tableau");
        } else
            System.out.println("Dommage vous n'avez pas trouvé un nombre dans le tableau");

        clavier.close();
    }
}
