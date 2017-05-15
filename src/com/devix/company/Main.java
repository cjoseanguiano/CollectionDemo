package com.devix.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> prueba = new ArrayList<>();

        prueba.add("A");
        prueba.add("B");
        prueba.add("C");
        prueba.add("A");
        prueba.add("A");

//        ArrayList myList = new ArrayList(Arrays.asList(prueba));

        prueba.removeAll(Collections.singleton("A"));
        System.out.println("Use of Singleton " + prueba);


/*        String init[] = {"One", "Two", "Three", "One", "Two", "Three"};
        // create two lists
        List list1 = new ArrayList(Arrays.asList(init));
        List list2 = new ArrayList(Arrays.asList(init));

        // remove from list1
        list1.remove("One");
        System.out.println("List1 value: " + list1);

        // remove from list2 using singleton
        list2.removeAll(Collections.singleton("One"));
        System.out.println("The SingletonList is :" + list2);*/

    }


}
