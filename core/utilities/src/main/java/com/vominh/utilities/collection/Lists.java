package com.vominh.utilities.collection;

import com.vominh.utilities.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lists {

    public static void main(String[] args) {
        var persons = new ArrayList<Person>();
        persons.add(new Person(20, "Minh"));
        persons.add(new Person(22, "Obama"));
        persons.add(new Person(34, "Bill Gate"));

        persons.forEach(p -> {
            System.out.println(p.getName());
        });
        System.out.println("--------------------");

        Collections.sort(persons);

        persons.forEach(p -> {
            System.out.println(p.getName());
        });
        System.out.println("--------------------");


        Comparator<Person> compareByAge = (p1, p2) -> p1.getAge() < p2.getAge() ? -1 : 2;

        Collections.sort(persons, compareByAge);

        persons.forEach(p -> {
            System.out.println(p.getName());
        });
        System.out.println("--------------------");

    }
}


