# PERSO
# 📚 Mémo Java : Fondamentaux

## 📌 Sommaire
* [Les Tableaux](#1-les-tableaux-arrays)
* [Gestion des Exceptions](#2-gestion-des-erreurs-try-catch)
* [Scanner et Saisie](#3-scanner-et-boucles-de-saisie)
* [Les Méthodes](#4-les-méthodes-fonctions)
* [Les Méthodes](#4b-les-méthodes-fonctions)
* [Algorithmes Utiles](#5-algorithmes-utiles)
* [Lecture de Fichier](#6-lecture-de-fichier)
* 
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
### Tri manuel croissant
* **Public class void :** 
  ```java
  public static void AfficherTableau(int[] tab) {
        for (int val : tab)
            System.out.print(val + " ");
        {
            System.out.println();
        }
  ````
  * **affichage tableau avant :** ` AfficherTableau(tab);`

### TRI PAR SELECTION

````java
int n = tab.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (tab[j] < tab[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = tab[i];
                tab[i] = tab[min];
                tab[min] = temp;
            }
        }
````

### TRI BULLE

```java
boolean echange;
for (int i = 0; i < tab.length; i++) {
 echange = false;

for (int j = 0; j < tab.length - 1 - i; j++) {
if (tab[j] > tab[j + 1]) {
 int temp = tab[j];
 tab[j] = tab[j + 1];
tab[j + 1] = temp;
echange = true;
                }
            }
if (!echange)
break;
}
```
* **Affichage tableau trié après :** ` AfficherTableau(tab);`
  ### mettre un mot dans un tableau
  * **exemple de mot avec ou sant Scanner :**
  ```java
  String mot = "";
  mot = scanner.nextline();
  char[] affichage = new char[mot.length()];
  for (int i = 0; i < mot.length(); i++) {
            affichage[i] = mot.charAt(i);
  }
  ```
 * **Pour affichage espacé :**
 on créé une variable `affichageEspace `
 ```java
  for (char c : affichage) {
  affichageEspace += c + " ";
  }
  ```
 * **Pour affichage masqué :**
   ```java
   for (int i = 0; i < mot.length(); i++) {
    if (i == 0 || i == mot.length() - 1) {
    affichage[i] = mot.charAt(i);
   } else {
    affichage[i] = '_';
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
## 4. Les Méthodes (Fonctions)

Une méthode est un bloc de code réutilisable qui effectue une tâche spécifique. Elle permet de fragmenter un gros programme en petits morceaux plus simples.

### Structure d'une méthode
`public static [Type de retour] nomDeLaMethode(Type parametre1, Type parametre2)`

* **Type de retour** : Le type de donnée que la méthode "renvoie" à la fin (ex: `int`, `double`, `String`). Si elle ne renvoie rien, on utilise **`void`**.
* **Paramètres** : Les informations dont la méthode a besoin pour travailler (les entrées).
* **Return** : Le mot-clé pour envoyer le résultat final.

### Exemple concret : Calculer une moyenne
```java
public static void main(String[] args) {
    double resultat = calculerMoyenne(15, 10); // Appel de la méthode
    System.out.println("La moyenne est : " + resultat);
}

// Définition de la méthode
public static double calculerMoyenne(int note1, int note2) {
    double moyenne = (note1 + note2) / 2.0;
    return moyenne; // Sortie de la méthode
}
````
---

## 4b. Les Méthodes (Fonctions)

Une méthode permet d'isoler un bloc de code pour le réutiliser.

### Structure d'une méthode :
`public static [Type de retour] nomMethode([Paramètres])`

* **Paramètres d'entrée** : Ce sont les données que tu donnes à la méthode pour qu'elle travaille.
* **Valeur de sortie (return)** : C'est le résultat que la méthode te renvoie.

### Exemple : Calcul de la Factorielle
```java
// Appel de la méthode dans le main
long resultat = calculerFactorielle(5);

// Définition de la méthode
public static long calculerFactorielle(int n) {
    long f = 1;
    for (int i = 1; i <= n; i++) {
        f *= i;
    }
    return f; // Renvoie le résultat au programme principal
}
````
### Exemple : Calcul Finobacci
```java
// Appel de la méthode dans le main
Fibonacci(nombre);

// Définition de la méthode
 static void Fibonacci(int nombre) {
 int n1 = 0;int n2 = 1;
  for (int i = 0; i < nombre; i++) {
  System.out.print(n1 + " ");
    int n3 = n1 + n2;
   n1 = n2;
   n2 = n3;
        }
    }
````
## 5. Algorithmes Utiles
Trier : Arrays.sort(tab);

Somme : ```java int somme = 0; for (int n : tab) somme += n;

Aléatoire : Random gen = new Random(); int n = gen.nextInt(100) + 1;
## 6. Lecture de Fichier
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


---



### Pourquoi utiliser les trois accents graves (\`\`\`) ?
Dans un fichier Markdown (comme le README), entourer ton code de ` ```java ` et ` ``` ` permet à GitHub de colorer automatiquement la syntaxe pour qu'elle soit lisible, comme dans un éditeur de code.



