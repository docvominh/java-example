package com.vominh.utilities.collection;

import com.vominh.utilities.model.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(20, "Minh"));
        persons.add(new Person(22, "Obama"));
        persons.add(new Person(34, "Bill Gate"));

        DataPerson data = new DataPerson();
        data.setPersons(persons);
        Iterator<Person> iterator = data.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p.getName());
        }
    }
}

class DataPerson implements Iterable<Person> {
    List<Person> persons;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public Iterator<Person> iterator() {
        return this.persons.iterator();
    }
}

