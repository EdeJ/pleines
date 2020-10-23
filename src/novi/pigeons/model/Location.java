package novi.pigeons.model;

public class Location {
    private String locationName;
    private double latitude;
    private double longitude;

    public Location(String locationName, double latitude, double longitude) {
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocationName() {
        return locationName;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Location { " +
                "latitude = " + latitude +
                ", longtitude = " + longitude +
                '}';
    }
}
