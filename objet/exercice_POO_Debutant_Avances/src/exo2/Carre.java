package exo2;

public class Carre extends Forme {
    private double cote;
    public Carre(double _cote){
        this.cote=_cote;
    }
    public double getCote(){return cote;}
    public void setCote(double _newCote){this.cote=_newCote;}
    @Override
    public double calculerAire(){return Math.pow(cote, 2);}

}
