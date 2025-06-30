package com.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TransactionReader {

    public static List<Transaction> readTransactionsFromFile(String transactionFile) {
        ObjectMapper mapper = new ObjectMapper();
        List<Transaction> transactions = new ArrayList<>();
        //String transactionFile;

        try {
            transactions = mapper.readValue(
                //new File("src/com/example/transactions.json"),
                new File("src/com/example/" + transactionFile),
                new TypeReference<ArrayList<Transaction>>() {}
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        return transactions;
    }
}