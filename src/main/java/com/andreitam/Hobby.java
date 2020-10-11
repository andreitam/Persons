package com.andreitam;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private Integer frequency;
    private List<Address> addresses;

    public Hobby(String name, Integer frequency, List<Address> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public void addAddresses(Address address) {
        this.addresses.add(address);
    }

    public String printAddresses() {
        String s="";
        for (Address address: addresses) {
            s += address.toString();
        }
        return s;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", addresses=" + printAddresses()+
                '}';
    }
}
