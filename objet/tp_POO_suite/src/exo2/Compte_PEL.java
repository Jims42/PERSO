package exo2;

import exo1.Compte;

public class Compte_PEL extends Compte {
    private static int idPEL=50000;
    private int numeroIdPEL;
    public Compte_PEL(String _titulaire,int _solde){
this.numeroIdPEL=idPEL;
idPEL++;
        super(_titulaire, _solde);
    }
    public int getNumeroidPEL(){return numeroIdPEL;}
@Override
    public void afficherResume() {
        System.out.println("Id compte : " + getNumeroidPEL() + " || Titulaire : " + getTitulaire()
                + " || solde : " + getSolde() + " euros");
    }

}
