package com.andreitam;

import java.util.Set;
import java.util.TreeSet;

public class StorePersons<T> {
    private Set<T> persons = new TreeSet<>();

    public void addPersons(T person) {
        this.persons.add(person);
    }

    public int getSizePersons() {
        return this.persons.size();
    }

    public void deletePersons(T person) {
        this.persons.remove(person);
    }

    public void printPersons() {
        for (T person:
             persons) {
            System.out.println(person);
        }
    }

}
