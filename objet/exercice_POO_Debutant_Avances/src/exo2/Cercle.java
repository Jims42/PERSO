package exo2;

public class Cercle extends Forme{
    private double rayon;
    public Cercle(double _rayon){this.rayon=_rayon;}
    public double getRayon(){return rayon;}
    public void setRayon(double _newRayon){this.rayon=_newRayon;}
    @Override
    public double calculerAire(){return Math.PI * Math.pow(rayon, 2);}

}
