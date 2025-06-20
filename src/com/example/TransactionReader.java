package com.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TransactionReader {

    public static ArrayList<Transaction> readTransactionsFromFile() {
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Transaction> transactions = new ArrayList<>();

        try {
            transactions = mapper.readValue(
                new File("src/com/example/transactions.json"),
                new TypeReference<ArrayList<Transaction>>() {}
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        return transactions;
    }
}