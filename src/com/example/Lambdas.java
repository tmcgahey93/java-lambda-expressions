package com.example;

import java.util.stream.*;
import java.util.*;
import com.fasterxml.jackson.core.type.TypeReference;

@FunctionalInterface
interface StringTransformer {
   String transform(String input);
}

public class Lambdas {
    public static void main(String[] args) {

        // Reusable lambda expression
        StringTransformer toUpper = s -> s.toUpperCase();

        //List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Apply transformation inside forEach
        names.forEach(name -> System.out.println("Hello, " + toUpper.transform(name)));

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

        List<Transaction> transactionValuesOne = TransactionReader.readTransactionsFromFile(
            "src/com/example/transactions1.json",
            new TypeReference<List<Transaction>>() {}
        );

        System.out.println("Transactions File One");

        Stream<Transaction> transactionsStreamOne = transactionValuesOne.stream();
        transactionsStreamOne.forEach((n) -> System.out.println(n));


        List<Transaction> transactionValuesTwo = TransactionReader.readTransactionsFromFile(
            "src/com/example/transactions2.json",
            new TypeReference<List<Transaction>>() {}
        );

        System.out.println("Transaction File Two");

        Stream<Transaction> transactionsStreamTwo = transactionValuesTwo.stream();
        transactionsStreamTwo.forEach((n) -> System.out.println(n));

        Set<Transaction> setOne = new HashSet<>(transactionValuesOne);
        Set<Transaction> setTwo = new HashSet<>(transactionValuesTwo);

        Set<Transaction> onlyInOne = setOne.stream()
            .filter(e -> !setTwo.contains(e))
            .collect(Collectors.toSet());

        System.out.println("Only in One:");

        onlyInOne.forEach((n) -> System.out.println(n));

        Set<Transaction> onlyInTwo = setTwo.stream()
            .filter(e -> !setOne.contains(e))
            .collect(Collectors.toSet());

        System.out.println("Only in Two:");

        onlyInTwo.forEach((n) -> System.out.println(n));

    }
}