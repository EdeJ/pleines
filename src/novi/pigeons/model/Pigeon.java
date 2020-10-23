package novi.pigeons.model;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Pigeon {

    private LocalDate birthDate;
    private String ringNumber;
    private ChipRing chipRing;

    public Pigeon() {
        this.birthDate = LocalDate.now();
        this.ringNumber = createRingNumber();
    }

    public Pigeon(int year, int month, int dayOfMonth) {
        this.birthDate = LocalDate.of(year, month, dayOfMonth);
        this.ringNumber = createRingNumber();
    }

    private String createRingNumber() {
        String countryCode = "NL";

        // Haal het jaar uit de geboortedatum
        int year = this.birthDate.getYear();

        // Maak een random nummer
        int randomNum = ThreadLocalRandom.current().nextInt(100, 1000);
        return countryCode + "-" + year + "-" + randomNum;
    }

    public ChipRing getChipRing() {
        return chipRing;
    }

    public void setChipRing(ChipRing chipRing) {
        this.chipRing = chipRing;
    }

    public boolean isAllowedToContest() {
        LocalDate today = LocalDate.now();

        // is de geboortedag langer dan een jaar geleden
        if (this.birthDate.isBefore(today.minusYears(1))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pigeon { " +
                "birthDate = " + birthDate +
                ", ringNumber = '" + ringNumber + '\'' +
                ", chipRing=" + chipRing +
                '}';
    }
}
