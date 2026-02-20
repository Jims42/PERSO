package exo_4;

public class Carre extends Forme {
    private double rayon;
    public Carre(double _rayon){
        this.rayon=_rayon;
    }
    @Override
    public double calculerAire(){
        return Math.PI * Math.pow(rayon, 2);
    }
    

}
