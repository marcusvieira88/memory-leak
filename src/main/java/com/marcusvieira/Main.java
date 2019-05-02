package com.marcusvieira;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        int personCount = 0;
        do {
            personCount++;
            final Person newPerson = new Person(String.format("PersonTest %s", personCount),
                new Random().nextInt(100));
            System.out.println(String.format("New person %s was created!", newPerson.getName()));
            people.add(newPerson);
            //Create a memory leak situation
        } while (true);
    }
}
