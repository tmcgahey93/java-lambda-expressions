package com.example;

public class Transaction implements Comparable<Transaction>{
    private String transactionId;
    private Double transactionAmount;
    private Boolean isFraud;

    // No-arg constructor (required for Jackson)
    public Transaction() {}

    public void setTransactionId(String t) {
        this.transactionId = t;
    }

    public void setAmount(Double a) {
        this.transactionAmount = a;
    }

    public void setIsFraud(Boolean f) {
        this.isFraud = f;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public Double getTransactionAmount() {
        return this.transactionAmount;
    }

    public Boolean getIsFraud() {
        return this.isFraud;
    }

    @Override
    public int compareTo(Transaction t) {
        int idCompare = this.transactionId.compareTo(t.transactionId);
        if(idCompare != 0) {
            return idCompare;
        }

        int amountCompare = this.transactionAmount.compareTo(t.transactionAmount);
        if(amountCompare != 0) {
            return amountCompare;
        }

        return this.isFraud.compareTo(t.isFraud);
    }

    @Override
    public String toString() {
        return String.format("Transaction ID: %-8s | Amount: $%-8.2f | Fraudulent: %-5s", 
        transactionId, transactionAmount, isFraud ? "YES" : "NO"
    );
}
}