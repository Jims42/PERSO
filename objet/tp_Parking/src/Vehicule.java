
/**
 * @author JCoco
 * @version 1.0
 * @created 18-févr.-2026 11:54:02
 */
public class Vehicule {

	protected String plaqueImmatriculation;
	protected String marque;

	public Vehicule(){

	}

	/**
	 * 
	 * @param _plaqueImmatriculation
	 * @param _marque
	 */
	public Vehicule(String _plaqueImmatriculation, String _marque){
		this.plaqueImmatriculation=_plaqueImmatriculation;
		this.marque=_marque;

	}

	public String getplaqueImmatriculation(){
		return plaqueImmatriculation;
	}

	public String getmarque(){
		return marque;
	}

}