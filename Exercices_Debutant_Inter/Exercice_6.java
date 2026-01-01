package Exercices_Debutant_Inter;

import java.util.Scanner;

public class Exercice_6 {
    public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    int nombre;
    System.out.println("Entrer un nombre positif : ");
    if (clavier.hasNextInt()) {
      nombre=clavier.nextInt();
    

     if (nombre<=0) {
        System.out.println("ERRUR : Entrer un nombre positif et non egal a zero");
     } else {
        long resultat = calculerFactorielle(nombre);
        System.out.println("La factorielle de [\u001B[33m"+nombre+"\u001B[0m] est : \u001B[4;32m"+resultat+"\u001B[4;0m");
        
     }}
     else {
        System.out.println("ERRUR Entrer un nombre valide");
     }


    clavier.close();
    }
    public static long calculerFactorielle(int n){
      long f=1;
      for (int i = 1; i <=n; i++) {
         f *= i;
      }
      return f;
    }
}
