package com.example;

public class Transaction implements Comparable<Transaction>{
    private String transactionId;
    private Double transactionAmount;
    private Boolean isFraud;

    public Transaction() {
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
        return "Transaction{transactionId='" + transactionId + '\'' +
                ", transactionAmount=" + transactionAmount + ", isFraud=" + isFraud +'}';
}
}