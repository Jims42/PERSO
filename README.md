# PERSO
# 📚 Mémo Java : Fondamentaux

Ce document récapitule les points clés abordés lors de l'apprentissage de Java.

---

## 1. Les Tableaux (Arrays)
Les indices commencent toujours à **0**.
* **Déclaration :** `int[] tab = new int[5];`
* **Dernier index :** `tab.length - 1`

### Parcours Inverse
```java
for (int i = tab.length - 1; i >= 0; i--) {
    System.out.println(tab[i]);
}

## 2. Gestion des Erreurs (Try-Catch)
Empêche le programme de planter en capturant les exceptions.
```java
try {
    int resultat = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erreur : Division par zéro !");
} finally {
    System.out.println("Action terminée.");
}

## 3. Scanner et Boucles de Saisie
Pour éviter une boucle infinie lors d'une erreur de saisie, il faut "vider" le tampon :
```java
catch (InputMismatchException e) {
    System.out.println("Entrée invalide !");
    clavier.nextLine(); // Nettoie le scanner
}
