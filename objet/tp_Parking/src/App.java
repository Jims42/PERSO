public class App {
    public static void main(String[] args) throws Exception {
        Parking parking = new Parking();

        Voiture v1 = new Voiture("AB-458-GB", "Renault", 5);
        Voiture v2 = new Voiture("RT-455-PO", "Renault", 5);
        Moto m1 = new Moto("ml-225-PO", "MBK", 125);

        parking.ajouterVehicule(v1);
        parking.ajouterVehicule(v2);
        parking.ajouterVehicule(m1);

        parking.afficherVehicule();

    }
}
