package org.example.domashka2;

public class Address {
    /**
     * City name.
     */
    String city;

    /**
     * Street name.
     */
    String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}
