import novi.pigeons.model.ChipRing;
import novi.pigeons.model.Location;
import novi.pigeons.model.Pigeon;

public class Main {
    public static void main(String[] args) {

        // maak een duif met een lege constructor
        // Bij een lege constructor wordt de geboortedatum automatisch de datum van vandaag.
        Pigeon pigeon1 = new Pigeon();
        System.out.println(pigeon1);
        System.out.println("Is deze duif ouder dan een jaar? : " + pigeon1.isAllowedToContest());

        // maak een nieuwe duif
        // Geef een geboorte datum mee aan de constructor. 1 jaar en 1 dag oud.
        Pigeon pigeon2 = new Pigeon(2019, 10, 22); // year, month, dayOfMonth
        System.out.println(pigeon2);
        System.out.println("Is deze duif ouder dan een jaar? : " + pigeon2.isAllowedToContest());

        // maak een start en aankomstlocatie
        Location releaseLocation = new Location("Brussel", 50.8503463, 4.3517211);
        Location arrivalLocation = new Location("Utrecht", 52.0907374, 5.1214201);

        // Maak een chipRing en voeg de start- en aankomstlocatie toe.
        ChipRing chipRing = new ChipRing(releaseLocation, arrivalLocation);

        // Voeg de ChipRing toe aan een duif
        pigeon2.setChipRing(chipRing);
        System.out.println(pigeon2);

        // Haal de gevlogen afstand uit de chipring van de duif
        double distance = pigeon2.getChipRing().getDistance();

        // print de gevlogen afstand (afgerond op 2 decimalen)
        System.out.println("De gevlogen afstand (Brussel -> Utrecht) is: " + (Math.round(distance * 100.0) / 100.0) + " Kilometer\n");

    }
}
