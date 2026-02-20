package exo_6;

public class CompteBancaire {
    private double solde;
    public CompteBancaire(){}
    public CompteBancaire(double _solde){
        this.solde=_solde;
    }
    public void retirer(double _montant) throws Exception {
        if (_montant > solde) {
            // On lève une exception manuellement
            throw new Exception("Erreur : Solde insuffisant ! Solde actuel : " + solde + "euros");
        }
        solde -= _montant;
        System.out.println("Retrait réussi de " + _montant + " euros. Nouveau solde : " + solde + "euros");
    }
}


