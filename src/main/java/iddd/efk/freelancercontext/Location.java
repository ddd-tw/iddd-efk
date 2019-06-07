package iddd.efk.freelancercontext;

public class Location {
    private final String country;
    private final String city;
    private final String streetAddress;
    private final String zipCode;

    public Location(String country, String city, String streetAddress, String zipCode) {
        if (isEmptyString(country)) {
            throw new IllegalArgumentException();
        }
        this.country = country;

        if (isEmptyString(city)) {
            throw new IllegalArgumentException();
        }
        this.city = city;

        if (isEmptyString(streetAddress)) {
            throw new IllegalArgumentException();
        }
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    private boolean isEmptyString(String source) {
        return "".equals(source);
    }
}
