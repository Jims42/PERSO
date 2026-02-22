package exo1;

public class Compte {
    private static int autoId = 10000;
    private int solde;
    private String titulaire;
    private int numeroId;

    public Compte(String _titulaire, int _solde) {
        this.numeroId = autoId;
        autoId++;
        this.titulaire = _titulaire;
        this.solde = _solde;
    }
    

    public int getNumeroId() {
        return numeroId;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int _newSolde) {
        if (_newSolde < 0) {
            System.out.println("OUPS !!!\nERREUR de saisie");
        }else{
            this.solde = _newSolde;
            System.out.println("Saisie valide");
            

        }afficherResume();
    }

    public void afficherResume() {
        System.out.println("Id compte : " + getNumeroId() + " || Titulaire : " + getTitulaire()
                + " || solde : " + getSolde() + " euros");
    }

}
