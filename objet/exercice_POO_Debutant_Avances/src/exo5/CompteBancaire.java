package exo5;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double _solde) {
        this.solde = _solde;
    }

    public double getSolde() {
        return solde;
    }

    public void retirer(double _montant) throws Exception {
        if (_montant > solde) {
            throw new Exception("Retrait refuse ! Solde insuffisant\nSolde << " + solde + " euros >>");

        }
        solde -= _montant;
        System.out.println("Retrait de << " + _montant + " euros >> reussi \nNouveau solde << " + solde + " euros >>");

    }

}
