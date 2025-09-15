package org.example;

import java.util.List;

public class CollectionToArray {
    public static void main(String[] args) {
        List<String> names = List.of("Java", "Spring", "Angular");

        //old way
        System.out.println("Old way");
        String[] oldArray = names.toArray(new String[0]);
        for (String o : oldArray){
            System.out.println(o);
        }

        System.out.println("\n");

        //java 11 way
        System.out.println("Java 11 way");
        String[] newArray = names.toArray(String[]::new);
        for (String n : newArray) {
            System.out.println(n);
        }
    }
}
