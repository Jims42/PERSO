
class Element {

    char lettre;
    int valeur;

    Element(char lettre, int valeur) {
        this.lettre = lettre;
        this.valeur = valeur;
    }
}

public class Tri_Tab2Dim {
    public static void main(String[] args) {
        // 1. création du tableau d'objets Element
        Element[] donnees = {
                new Element('C', 30),
                new Element('A', 10),
                new Element('B', 20)
        };
        // 2. Appel du Tri
        trier(donnees);

        // 3. Affichage
        System.out.println("Données triées par valeur : ");
        for (Element e : donnees) {
            System.out.println(e.lettre + " : " + e.valeur);
        }
    }

    public static void trier(Element[] arr) {
        int n = arr.length;
        Element temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // on compare les valeurs
                if (arr[j].valeur > arr[j + 1].valeur) {
                    // On echange des objets complets
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }
}