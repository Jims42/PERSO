package Exercices_Debutant_Inter;

import java.util.Scanner;

public class Exercice_3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        boolean saisieValide = false;
        while (!saisieValide) {

            try {

                System.out.println("Veuillez entrer 2 nombres entiers ");
                System.out.print("Entez le premier nombre : ");
                int nombre1 = clavier.nextInt();
                System.out.print("Entrz le deuxieme nombre : ");
                int nombre2 = clavier.nextInt();
                double resultat = (double) nombre1 / nombre2;

                if (nombre2 == 0) {
                    throw new ArithmeticException("Division par zéro impossible");
                }
                System.out.println("Résultat de la division est : " + resultat);
                saisieValide = true;

            } catch (java.util.InputMismatchException e) {
                System.out.println("ERREUR : Veuillez enter un nombre valide");
                clavier.next();
                // saisieValide = false;
            } catch (ArithmeticException e) {
                System.out.println("ERREUR : " + e.getMessage());
                // saisieValide = false;
            }
        }

        clavier.close();
        System.out.println("Fin du programme");
    }
}
