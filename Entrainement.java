import java.util.Scanner;



public class Entrainement {
public static void main(String[] args) {
    Scanner clavier=new Scanner(System.in);

System.out.println("\u001B[45mDonner une valeur à a :\u001B[0m ");
    
int a =clavier.nextInt();
    

switch (a) {
    case 1:
        System.out.println(a<10);
                break;
                case 2:
                    System.out.println(Couleurs.tableau1[4]+"BRAVO"+Couleurs.FIN);
                    break;

    default:
        System.out.println("LES TUCHES");
        break;
        }

        int b = 0;
        
        while (b<=10) {
            
            b++;
            if (b%2==1) {continue;
                
            }
                
            System.out.print(b+" ");
            
        }
        System.out.println();
        b=10;
        do {
            
            b--;
            if (b%2==0) {continue;
                
            }
            System.out.print(b+" ");
            
        } while (b>0);
        
        System.out.println();

        for (int i = 0; i <= 10; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println();
        int nombre1=0;
        int i;
        int resultat;
        boolean saisieValide=false;

        while (!saisieValide) {
            
        

        try {

        System.out.println("Saisir une valeur de 1 à 10");
        nombre1=clavier.nextInt();
        
           if (nombre1 < 1 || nombre1 > 10) {
            System.out.println("Entrer un chiffre entre 1 et 10");
           } else{saisieValide=true;}

        } catch (java.util.InputMismatchException e){
            System.out.println("format non valide, entrer un chiffre");
            clavier.next();
        }
        }
        
        for (i = 0; i <= 10; i++) {
            resultat=i*nombre1;
            System.out.println(i+" * "+nombre1+" = "+resultat+"\t");
        }
        System.out.println();
        i=0;

        while ((i<=10)) {
            resultat=i*nombre1;
            System.out.print(i+"*"+nombre1+"= "+resultat);
            i++;
            System.out.print(" ");
            
        }

        System.out.println("\n");

        i=10;
        do {
            resultat=i*nombre1;
            System.out.print(i+"*"+nombre1+"= "+resultat);
            i--;
             System.out.print(" ");
        } while (i>=0);







    clavier.close();
}
    
}