package iddd.efk.freelancercontext;

public class Location {
    private String country;
    private String city;
    private String streetAddress;
    private String zipCode;

    public Location(String country, String city, String streetAddress, String zipCode) {
        if (isEmptyString((country))) {
            throw new IllegalArgumentException();
        }
        this.country = country;

        if (isEmptyString((city))) {
            throw new IllegalArgumentException();
        }
        this.city = city;

        if (isEmptyString((streetAddress))) {
            throw new IllegalArgumentException();
        }
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }

    private boolean isEmptyString(String source) {
        return source.equals("");
    }
}
