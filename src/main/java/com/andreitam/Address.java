package com.andreitam;

public class Address {
    private Country country;

    public Address(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "{" +
                " " + country +
                '}';
    }
}
