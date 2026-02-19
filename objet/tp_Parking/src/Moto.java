
/**
 * @author JCoco
 * @version 1.0
 * @created 18-févr.-2026 11:54:04
 */
public class Moto extends Vehicule {

	private int cylindree;

	public Moto() {

	}

	/**
	 * 
	 * @param _cylindre
	 */
	public Moto(String _plaqueImmatriculation, String _marque, int _cylindre) {
		super(_plaqueImmatriculation, _marque);
		this.cylindree = _cylindre;

	}

	public int getcylindree() {
		return cylindree;
	}

	@Override
	public String toString() {
		return "Cylindree ==> " + this.getcylindree();
	}

}