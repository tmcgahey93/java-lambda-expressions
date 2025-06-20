package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;

@FunctionalInterface
interface StringTransformer {
    String transform(String input);
}

public class Lambdas {
    public static void main(String[] args) {

        // Reusable lambda expression
        StringTransformer toUpper = s -> s.toUpperCase();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Apply transformation inside forEach
        names.forEach(name -> System.out.println("Hello, " + toUpper.transform(name)));

        //names.forEach(name -> System.out.println("Hello, " + name));

        // Using a lambda to create a thread
        new Thread(() -> System.out.println("Running in a thread")).start();

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(35);
        myList.add(14);
        myList.add(49);
        myList.add(56);
        myList.add(21);
        myList.add(42);
        myList.add(28);
        myList.add(63);

        Stream<Integer> printStream = myList.stream();

        printStream.forEach((n) -> System.out.print(n + " "));
    }
}