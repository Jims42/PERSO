package exo_2;

public class Voiture {
    private String marque;
    private String modele;
    private int annee;

    public Voiture(){}
    public Voiture(String _marque,String _modele,int _annee){
        this.marque=_marque;
        this.modele=_modele;
        this.annee=_annee;
    }
    public String getMarque(){return marque;}
    public String getModele(){return modele;}
    public int getAnnee(){return annee;}
    public void afficherDetails(){
        System.out.println("Marque : "+this.marque+" || Modele : "+this.modele+" || Annee : "+this.annee);
    }

}
