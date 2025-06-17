package com.example;

import java.util.Arrays;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(name -> System.out.println("Hello, " + name));

        // Using a lambda to create a thread
        new Thread(() -> System.out.println("Running in a thread")).start();
    }
}