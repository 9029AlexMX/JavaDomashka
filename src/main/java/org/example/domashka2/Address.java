package org.example.domashka2;

public class Address {
    /**
     * City name.
     */
    private String city;

    /**
     * Street name.
     */
    private String street;

    /**
     * Constructor.
     *
     * @param city City name.
     * @param street Street name.
     */
    public Address(final String city, final String street) {
        this.city = city;
        this.street = street;
    }

    /**
     * Returns street name.
     *
     * @return Street name.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Returns city name.
     *
     * @return City name.
     */
    public String getCity() {
        return city;
    }
}
