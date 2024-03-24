package org.example.streams;

public class Transaction {
    private double amount;
    private String type;

    public Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
