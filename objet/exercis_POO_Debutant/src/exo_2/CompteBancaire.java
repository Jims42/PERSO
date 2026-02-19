package exo_2;

public class CompteBancaire {
    private String titulaire;
    private double solde;

    public CompteBancaire() {
        this.titulaire = "";
        this.solde = 0;
    }

    public CompteBancaire(String _titulaire, double _solde) {
        this.titulaire = _titulaire;
        this.solde = _solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public double deposer(double _montant) {
        return this.solde += _montant;
    }

    public double retirer(double _montant) {
        if (solde - _montant > 0) {
            return  this.solde -= _montant;
        } else {
            System.out.println("solde insuffisant !!!");
            return solde;
        }

    }

    public void afficherSolde() {
        System.out.println("Titulaire ==> "+this.titulaire+"\nSolde ==> "+solde+" euros");
        
    }

}
