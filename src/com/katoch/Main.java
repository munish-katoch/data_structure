package com.katoch;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try_treeset();
    }

    private static void try_treeset(){
        MyTreeSet set = new MyTreeSet();
        set.add(new Person("aaa",1));
        set.add(new Person("zzz",100));
        set.add(new Person("ccc",10));
        set.add(new Person("bbb",20));

        final Iterator<Person> iterator = set.getIterator();
        while(iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("Name=" + person.getName() + " Age="+person.getAge());
        }
    }
}
