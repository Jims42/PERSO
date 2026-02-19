package exo_1;

public class Voiture {
    protected String marque;
    protected String modele;
    protected int annee;

    public Voiture() {
        
    }

    public Voiture(String _marque, String _modele, int _annee) {
        this.marque = _marque;
        this.modele = _modele;
        this.annee = _annee;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }
    public int getAnnee(){return annee;}
    public void afficherDetail(){
        System.out.println("Marque ==> "+this.marque+"\nModele ==> "+this.modele+"\nAnnee ==> "+this.annee);
    }

}
