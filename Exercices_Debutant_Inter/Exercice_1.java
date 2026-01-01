package Exercices_Debutant_Inter;
// Exercice 1: Boucles et Conditions

// Consigne: Écris un programme qui demande à l'utilisateur un nombre entier entre 1 et 100. 
// Si le nombre est pair, affiche 'Le nombre est pair'. Sinon, affiche 'Le nombre est impair'. 
// Utilise une boucle pour redemander un nombre tant qu'il n'est pas dans l'intervalle [1, 100].
// Temps estimé: 15 minutes

import java.util.Scanner;

public class Exercice_1 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int nombre;
        boolean saisieValide = false;

        while (!saisieValide) {
            System.out.println("Veuillez zntrer un nombre entre 0 et 100 :");
            nombre = clavier.nextInt();

            if (nombre < 0 || nombre > 100) {
                System.out.println("ERREUR Le nombre doit etre saisie dans la fourchette demandée");
                saisieValide = false;

            } else {
                saisieValide = true;
            }

            if (nombre % 2 == 0) {
                System.out.println("Le nombre entier est PAIR");
                continue;

            } else if (nombre % 2 != 0) {
                System.out.println("Le nombre est IMPAIR");

            }
        }
        clavier.close();
    }
}
