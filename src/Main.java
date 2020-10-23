import novi.duiven.model.Pigeon;

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
    }
}
