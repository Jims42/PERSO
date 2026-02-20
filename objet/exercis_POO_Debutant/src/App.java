import exo_1.*;
import exo_2.*;
import exo_3.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------------EXO 1 --------------------------------------------------");
       Voiture v1=new Voiture("Peugeot", "308", 2020);
       Voiture v2=new Voiture("Renault", "Clio", 2018);
       v1.afficherDetail();
       System.out.println("------------------------------");
       v2.afficherDetail(); 
System.out.println("-------------------------EXO 2 --------------------------------------------------");
CompteBancaire compte1=new CompteBancaire("toto", 5000);
compte1.afficherSolde();
System.out.println("------------------------------");
compte1.deposer(1500);
System.out.println("Solde apres depot : "+compte1.getSolde()+" euros");
System.out.println("------------------------------");
compte1.retirer(500);
System.out.println("Solde apres retrait : "+compte1.getSolde()+" euros");
System.out.println("------------------------------");
compte1.afficherSolde();
System.out.println("-------------------------EXO 3 --------------------------------------------------");
Etudiant etudiant=new Etudiant("Jean DUPONT", 20);
double [] notes=new double [3];
notes[0]=16;
notes[1]=19;
notes[2]=17;

etudiant.setNotes(notes);
etudiant.afficherDetail();
    }
    
}
