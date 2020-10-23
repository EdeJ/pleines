package novi.pigeons.model;

import java.util.Random;

public class ChipRing {
    private int chipRingNumber;
//    private Time releaseTime;
//    private Time arrivalTime;
    private Location releaseLocation;
    private  Location arrivalLocation;

    public ChipRing(Location releaseLocation, Location arrivalLocation) {
        this.releaseLocation = releaseLocation;
        this.arrivalLocation = arrivalLocation;
        this.generateChipNumber();
    }

    private void generateChipNumber () {
        Random r = new Random();
        this.chipRingNumber = r.nextInt();
    }

    @Override
    public String toString() {
        return "ChipRing { " +
                "chipRingNumber = " + chipRingNumber +
                ", releaseLocation = " + releaseLocation +
                ", arrivalLocation = " + arrivalLocation +
                '}';
    }
}
