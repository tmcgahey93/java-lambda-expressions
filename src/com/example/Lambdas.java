package com.example;

import java.util.Arrays;
import java.util.List;

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
    }
}