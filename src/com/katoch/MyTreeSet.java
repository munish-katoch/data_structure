package com.katoch;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
    class SortByAge implements Comparator<Person> {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Person a, Person b) {
            return a.getAge() - b.getAge();
        }
    }

    class SortByName implements Comparator<Person> {
        // Used for sorting in ascending order of
        // roll name
        public int compare(Person a, Person b) {
            return a.getName().compareTo(b.getName());
        }
    }

    Set<Person> set;

    MyTreeSet() {
        set = new TreeSet<Person>(new SortByName());
    }

    public void add(Person person) {
        set.add(person);
    }

    public Iterator<Person> getIterator() {
        return set.iterator();
    }
}
