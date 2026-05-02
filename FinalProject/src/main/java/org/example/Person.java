package org.example;

public abstract class Person {

    String name;
    Address address;
    String email;
    String phone;
    AccountType accountType;

    public Person(String name, Address address, String email, String phone, AccountType accountType) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.accountType = accountType;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Account Type: " + accountType);
    }
}