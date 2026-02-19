
/**
 * @author JCoco
 * @version 1.0
 * @created 18-févr.-2026 11:54:03
 */
public class Voiture extends Vehicule {

	private int nombreDePortes;

	public Voiture() {

	}

	/**
	 * 
	 * @param _nombreDePortes
	 */
	public Voiture(String _plaqueImmatriculation, String _marque, int _nombreDePortes) {
		super(_plaqueImmatriculation, _marque);
		this.nombreDePortes = _nombreDePortes;

	}

	public int getnombreDePortes() {
		return nombreDePortes;
	}

	public String toString() {
		return "Nombre de portes ==> " + this.getnombreDePortes();
	}

}