package com.andreitam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorePersonsTest {
    //create persons
    Person pers1 = new Person("Dani",38);
    Person pers2 = new Employee("Alex", 25);
    Person pers3 = new Unemployed("Gabi", 30);
    Person pers4 = new Student("Marius", 21);
    Person pers5 = new Employee("Marius", 28);
    //create store
    StorePersons<Person> store = new StorePersons();

    @Test
    void addAndPrintPersonsTest() {
        //add 4 different persons
        store.addPersons(pers1);
        store.addPersons(pers2);
        store.addPersons(pers3);
        store.addPersons(pers4);
        //add 1 identical person and 1 person with only de name identical (Comparable criteria) -> will not add to Set
        store.addPersons(pers1);
        store.addPersons(pers5);
        //delete 2 person
        store.deletePersons(pers2);
        store.deletePersons(pers3);
        //print the Set
        store.printPersons();

        assertEquals(store.getSizePersons(),2);
    }
}