package org.example;

public class InvoiceItem {

    double amount;

    public InvoiceItem(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invoice item amount must be greater than zero!");
        }

        this.amount = amount;
    }

    public boolean updateAmount(double newAmount) {

        if (newAmount <= 0) {
            throw new IllegalArgumentException("Updated amount must be greater than zero!");
        }

        this.amount = newAmount;
        System.out.println("Amount updated to: $" + newAmount);
        return true;
    }

    public void printItem() {
        System.out.println("Item amount: $" + amount);
    }
}