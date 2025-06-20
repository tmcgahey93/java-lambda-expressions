package com.example;

public class Transaction {
    private String transactionId;
    private Double transactionAmount;
    private Boolean isFraud;

    void Transaction () {
        this.transactionId = " ";
        this.transactionAmount = 0.00;
        this.isFraud = false;
    }

    void setTransactionId(String t) {
        this.transactionId = t;
    }

    void setAmount(Double a) {
        this.transactionAmount = a;
    }

    void setIsFraud(Boolean f) {
        this.isFraud = f;
    }

    String getTransactionId() {
        return this.transactionId;
    }

    Double getTransactionAmount() {
        return this.transactionAmount;
    }

    Boolean getIsFraud() {
        return this.isFraud;
    }
}