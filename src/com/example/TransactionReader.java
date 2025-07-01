package com.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class TransactionReader {

    public static <T> List<T> readTransactionsFromFile(String fileName, TypeReference<List<T>> typeRef) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(new File(fileName), typeRef);
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();  // Empty immutable list
        }
    }
}
