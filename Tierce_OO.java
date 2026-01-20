import java.util.Scanner;

class ElementTierce {

    public long nParticip;
    public long nJou;

    ElementTierce(int nParticip, int nJou) {
        this.nParticip = nParticip;
        this.nJou = nJou;
    }

}

public class Tierce_OO {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrer le nombre de chevaux participant\net entrer le nombre de chevaux joués : ");
        ElementTierce jeu = new ElementTierce(clavier.nextInt(), clavier.nextInt());

        formuleOrdre(jeu);
        formuleDesordre(jeu);

        clavier.close();
    }

    public static long formuleOrdre(ElementTierce _fact) {
        long p = _fact.nParticip;
        long j = _fact.nJou;

        long resulOrdre = calculerorielle(p) / calculerorielle(p - j);
        System.out.println("DANS L'ORDRE ==> 1 CHANCE SUR " + resulOrdre);
        return resulOrdre;

    }

    public static long formuleDesordre(ElementTierce _fact) {
        long p = _fact.nParticip;
        long j = _fact.nJou;

        long resulDesordre = calculerorielle(p) / (calculerorielle(j) * calculerorielle(p - j));
        System.out.println("DANS LE DESORDRE ==> 1 CHANCE SUR " + resulDesordre);
        return resulDesordre;
    }

    public static long calculerorielle(long n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

}
