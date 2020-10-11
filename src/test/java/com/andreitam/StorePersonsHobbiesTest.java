package com.andreitam;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StorePersonsHobbiesTest {
    //create persons
    Person pers1 = new Person("Dani",38);
    Person pers2 = new Employee("Alex", 25);
    Person pers3 = new Unemployed("Gabi", 30);
    Person pers4 = new Student("Marius", 21);
    Person pers5 = new Employee("Marius", 28);
    //create store
    StorePersonsHobbies<Person, Hobby> store = new StorePersonsHobbies<>();

    @Test
    void addAndPrintPersonsHobbiesTest() {
        //cycling address list
        List<Address> cyclingAddresses = new ArrayList<>();
        cyclingAddresses.add(new Address(Country.ROMANIA));
        cyclingAddresses.add(new Address(Country.BULGARIA));
        //swimming address list
        List<Address> swimmingAddresses = new ArrayList<>();
        swimmingAddresses.add(new Address(Country.SERBIA));
        swimmingAddresses.add(new Address(Country.GERMANIA));
        swimmingAddresses.add(new Address(Country.AUSTRIA));
        //hobbies list
        List<Hobby> hobbies1 = new ArrayList<>();
        hobbies1.add(new Hobby("Cycling", 2, cyclingAddresses));
        hobbies1.add(new Hobby("Swimming", 5, swimmingAddresses));
        List<Hobby> hobbies2 = new ArrayList<>();
        hobbies2.add(new Hobby("Cycling", 1,cyclingAddresses ));
        List<Hobby> hobbies3 = new ArrayList<>();
        hobbies3.add(new Hobby("Swimming", 4, swimmingAddresses));
        //add 4 different persons
        store.addPersons(pers1,hobbies1);
        store.addPersons(pers2,hobbies1);
        store.addPersons(pers3,hobbies2);
        store.addPersons(pers4, hobbies3);
        store.addPersons(pers1,hobbies1);//will not be added
        store.addPersons(pers5,hobbies2);
        //delete 2 persons
        store.deletePersons(pers2);
        store.deletePersons(pers5);
        //print the Map
        store.printPersons();

        assertEquals(store.getSizePersons(),3);
    }
}