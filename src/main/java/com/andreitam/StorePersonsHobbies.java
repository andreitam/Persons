package com.andreitam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorePersonsHobbies <K,V> {
    private Map<K,List<V>> personsHobbies = new HashMap<>();

    public void addPersons(K person, List<V> hobbies) {
        this.personsHobbies.put(person, hobbies);
    }

    public int getSizePersons() {
        return this.personsHobbies.size();
    }

    public void deletePersons(K person) {
        this.personsHobbies.remove(person);
    }

    public void printPersons() {
        for (Map.Entry<K, List<V>> entry : personsHobbies.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
