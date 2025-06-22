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

        // Using a lambda to create a thread
        new Thread(() -> System.out.println("Running in a thread")).start();

        List<Integer> myList = new ArrayList<>();
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
        System.out.print("All Values: ");
        printStream.forEach((n) -> System.out.print(n + " "));

        System.out.println();

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("Sorted Values: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));

        System.out.println();

        Stream<Integer> oddValues = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.print("Odd Values: ");
        oddValues.forEach((n) -> System.out.print(n + " "));

        System.out.println();

        Stream<Integer> evenValues = myList.stream().sorted().filter((n) -> (n % 2) == 0);
        System.out.print("Even Values: ");
        evenValues.forEach((n) -> System.out.print(n + " "));

        System.out.println();

        List<Transaction> transactionListOne = new ArrayList<>();

        transactionListOne = TransactionReader.readTransactionsFromFile("transactions1.json");

        System.out.println("Transactions File One");

        Stream<Transaction> transactionValuesOne = transactionListOne.stream();
        transactionValuesOne.forEach((n) -> System.out.println(n));

        List<Transaction> transactionListTwo = new ArrayList<>();

        transactionListTwo = TransactionReader.readTransactionsFromFile("transactions2.json");

        System.out.println("Transaction File Two");

        Stream<Transaction> transactionsValuesTwo = transactionListTwo.stream();
        transactionsValuesTwo.forEach((n) -> System.out.println(n));



        

    }
}