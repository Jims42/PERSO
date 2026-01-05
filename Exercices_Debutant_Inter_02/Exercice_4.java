package Exercices_Debutant_Inter_02;
// Consigne: Demande à l'utilisateur un nombre entier n. Affiche les n premiers termes de la suite de Fibonacci. 

// La suite de Fibonacci commence par 0 et 1, et chaque terme suivant est la somme des deux précédents.

import java.util.Scanner;


public class Exercice_4 {

    static void Fibonacci(int nombre) {
        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < nombre; i++) {

            System.out.print(n1 + " ");

            int n3 = n1 + n2;

            n1 = n2;
            n2 = n3;

        }
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre entier : ");
        int nombre = clavier.nextInt();

        Fibonacci(nombre);
        clavier.close();

    }

}