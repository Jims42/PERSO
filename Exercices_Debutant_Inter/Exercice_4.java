package Exercices_Debutant_Inter;
// Exercice 4: Tables de Multiplication

// Consigne: Demande à l'utilisateur un nombre entre 1 et 10. Affiche la table de multiplication de ce nombre de 1 à 10. Utilise une boucle for.
// Temps estimé: 25 minutes

import java.util.Scanner;

public class Exercice_4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        boolean saisieValide = false;
        while (!saisieValide) {

            try {
                System.out.println("Entrer un nombre entre 1 et 10 : ");
                int nombre = clavier.nextInt();

                if (nombre < 0 || nombre > 10) {
                    System.out.println("ERREUR Entrer invalide");
                    saisieValide = false;
                } else {
                    for (int i = 0; i <= 10; i++) {
                        int resultat = i * nombre;
                        System.out.print(i + "*" + nombre + "=\u001B[4;32m" + resultat + "\u001B[4;0m");
                        System.out.print("\t");
                    }
                    saisieValide = true;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("ERREUR Entrer invalide");
                clavier.next();
                // saisieValide = false;

            }
        }
        clavier.close();

        System.out.println();
        System.out.println("Fin du programme");

    }
}