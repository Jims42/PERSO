import java.util.ArrayList;

/**
 * @author JCoco
 * @version 1.0
 * @created 18-févr.-2026 11:54:05
 */
public class Parking {
	private ArrayList<Vehicule> list = new ArrayList<>();

	public Parking() {

		this.list = new ArrayList<>();
	}

	/**
	 * 
	 * @param _vehicule
	 */
	public void ajouterVehicule(Vehicule _vehicule) {
		this.list.add(_vehicule);

	}

	public void afficherVehicule() {
		for (Vehicule vehicule : this.list) {
			System.out.println("Immatriculation ==> " + vehicule.getplaqueImmatriculation() + "\nMarque ==> "
					+ vehicule.getmarque() + "\n" + vehicule.toString());
			System.out
					.println("--------------------------------------------------------------------------------------");
		}

	}

}