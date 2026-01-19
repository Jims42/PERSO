import java.util.Scanner;

class ElementTierce {

    public long nParticip;
    public long nJou;

    ElementTierce(int nParticip, int nJou){
        this.nParticip=nParticip;
        this.nJou=nJou;
    }
    
}
public class Tierce_OO {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.println("Entrer le nombre de chevaux participant\net entrer le nombre de chevaux joués : ");
        new ElementTierce(clavier.nextInt(),clavier.nextInt() );

        formule(ElementTierce.);
        


        clavier.close();
    }
    public static long  formule ( ElementTierce fact){
        long p=fact.nParticip;
        long j=fact.nJou;

        long resulOrdre=calculerFactorielle(p) / calculerFactorielle(p - j);
        long resulDesordre = calculerFactorielle(p) / (calculerFactorielle(j) * calculerFactorielle(p - j));
       
System.out.println("DANS L'ORDRE ==> 1 CHANCE SUR "+resulOrdre);
System.out.println("DANS LE DESORDRE ==> 1 CHANCE SUR "+resulDesordre);
 return resulOrdre;
 return resulDesordre;       

    }
    public static long calculerFactorielle(long n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    
}
