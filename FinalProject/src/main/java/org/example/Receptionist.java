package org.example;

public class Receptionist extends Person {

    public Receptionist(String name, Address address, String email, String phone) {
        super(name, address, email, phone, AccountType.RECEPTIONIST);
    }

    public boolean createBooking() {
        System.out.println("Receptionist " + name + " is creating a booking...");
        System.out.println("Booking created by receptionist!");
        return true;
    }
}