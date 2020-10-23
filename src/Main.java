import novi.pigeons.model.ChipRing;
import novi.pigeons.model.Location;
import novi.pigeons.model.Pigeon;
import novi.pigeons.service.DistanceCalculator;

public class Main {
    public static void main(String[] args) {

        // maak een duif met een lege constructor
        // de geboortedatum wordt dan de datum van vandaag.
        Pigeon pigeon1 = new Pigeon();
        System.out.println(pigeon1);
        System.out.println("Is deze duif ouder dan een jaar? : " + pigeon1.isAllowedToContest());

        // maak een nieuwe duif
        // Geef een geboorte datum mee aan de constructor. 1 jaar en 1 dag oud.
        Pigeon pigeon2 = new Pigeon(2019, 10, 22);
        System.out.println(pigeon2);
        System.out.println("Is deze duif ouder dan een jaar? : " + pigeon2.isAllowedToContest());

        // maak een start en aankomstlocatie
        Location releaseLocation = new Location("Brussel", 50.8503463, 4.3517211);
        Location arrivalLocation = new Location("Utrecht", 52.0907374, 5.1214201);

        // Maak een chipRing met de start en aankomstlocatie
        ChipRing chipRing = new ChipRing(releaseLocation, arrivalLocation);
        System.out.println(chipRing);

        // Bereken de afstand tussen twee locaties.
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        double distance = distanceCalculator.distance(releaseLocation.getLatitude(),
                releaseLocation.getLongitude(),
                arrivalLocation.getLatitude(),
                arrivalLocation.getLongitude(), "K");
        System.out.println("Afstand tussen Brussel en Utrecht is: " + (Math.round(distance *100.0) / 100.0) + " Kilometers\n");

    }
}
