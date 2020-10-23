package novi.pigeons.model;

import java.util.Random;

public class ChipRing {
    private int chipRingNumber;
    //    private Time releaseTime;
    //    private Time arrivalTime;
    private Location releaseLocation;
    private Location arrivalLocation;

    public ChipRing(Location releaseLocation, Location arrivalLocation) {
        this.releaseLocation = releaseLocation;
        this.arrivalLocation = arrivalLocation;
        this.generateChipNumber();
    }

    private void generateChipNumber() {
        Random r = new Random();
        this.chipRingNumber = r.nextInt();
    }

    //      This routine calculates the distance between two points (given the
    //      latitude/longitude of those points). It is being used to calculate
    //      the distance between two locations using GeoDataSource (TM) products
    //      https://www.geodatasource.com/developers/java
        public double getDistance() {
            double lat1 = releaseLocation.getLatitude();
            double lon1 = releaseLocation.getLongitude();
            double lat2= arrivalLocation.getLatitude();
            double lon2= arrivalLocation.getLongitude();

            // Unit could be in 'M' is statute miles (default), 'K' is kilometers or 'N' is nautical miles.
            String unit = "K";


            if ((lat1 == lat2) && (lon1 == lon2)) {
                return 0;
            } else {
                double theta = lon1 - lon2;
                double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
                dist = Math.acos(dist);
                dist = Math.toDegrees(dist);
                dist = dist * 60 * 1.1515;
                if (unit.equals("K")) {
                    dist = dist * 1.609344;
                } else if (unit.equals("N")) {
                    dist = dist * 0.8684;
                }
                return (dist);
            }
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
