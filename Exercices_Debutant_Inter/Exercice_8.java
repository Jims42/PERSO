package Exercices_Debutant_Inter;
// Exercice 8: Gestion Avancée des Exceptions

// Consigne: Écris un programme qui lit un fichier texte contenant des nombres, un par ligne. Affiche la somme de ces nombres. 
// Gère les exceptions si le fichier n'existe pas ou si une ligne ne contient pas un nombre valide.
// Temps estimé: 40 minutes

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercice_8 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez le chemin du fichier contenant les nombres :");
        String cheminFichier = clavier.nextLine();

        try {
            File fichier = new File(cheminFichier);
            Scanner lecteurFichier = new Scanner(fichier);

            double somme = 0;
            int ligne = 0;

            while (lecteurFichier.hasNextLine()) {
                String contenuLigne = lecteurFichier.nextLine();
                ligne++;

                try {
                    double nombre = Double.parseDouble(contenuLigne);
                    somme += nombre;
                } catch (NumberFormatException e) {
                    System.out.println(
                            "Erreur à la ligne " + ligne + " : '" + contenuLigne + "' n'est pas un nombre valide.");
                }
            }

            System.out.println("La somme des nombres dans le fichier est : " + somme);
            lecteurFichier.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erreur : le fichier '" + cheminFichier + "' n'existe pas.");
        }

        clavier.close();
    }
}
