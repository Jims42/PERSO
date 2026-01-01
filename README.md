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
```
## 2. Gestion des Erreurs (Try-Catch)
### Empêche le programme de planter en capturant les exceptions.
```java
try {
    int resultat = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erreur : Division par zéro !");
} finally {
    System.out.println("Action terminée.");
}
```
## 3. Scanner et Boucles de Saisie
### Pour éviter une boucle infinie lors d'une erreur de saisie, il faut "vider" le tampon :
```java
catch (InputMismatchException e) {
    System.out.println("Entrée invalide !");
    clavier.nextLine(); // Nettoie le scanner
}
```
## 4. Algorithmes Utiles
Trier : Arrays.sort(tab);

Somme : ```java int somme = 0; for (int n : tab) somme += n;

Aléatoire : Random gen = new Random(); int n = gen.nextInt(100) + 1;
## 5. Lecture de Fichier
```java
try (Scanner lecteur = new Scanner(new File("data.txt"))) {
    while (lecteur.hasNextLine()) {
        System.out.println(lecteur.nextLine());
    }
} catch (FileNotFoundException e) {
    System.out.println("Fichier non trouvé.");
}
```
---

### Comment faire la mise à jour sur GitHub ?

1.  Va sur ton **dépôt (repository)** sur GitHub.
2.  Clique sur le fichier **README.md**.
3.  Clique sur l'icône **crayon (Edit)** en haut à droite.
4.  Colle le texte ci-dessus.
5.  Descends en bas de la page et clique sur le bouton vert **"Commit changes"**.

### Pourquoi utiliser les trois accents graves (\`\`\`) ?
Dans un fichier Markdown (comme le README), entourer ton code de ` ```java ` et ` ``` ` permet à GitHub de colorer automatiquement la syntaxe pour qu'elle soit lisible, comme dans un éditeur de code.




