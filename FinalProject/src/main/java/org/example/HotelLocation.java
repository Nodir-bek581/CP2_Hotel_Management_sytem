package org.example;

import java.util.ArrayList;

public class HotelLocation {

    String name;
    Address location;

    ArrayList<Room> rooms;

    public HotelLocation(String name, Address location) {
        this.name = name;
        this.location = location;
        this.rooms = new ArrayList<>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room " + room.roomNumber + " added to " + name);
    }

    public void printLocation() {
        System.out.println("Location: " + name);
        System.out.println("Address: " + location.getFullAddress());
        System.out.println("Total Rooms: " + rooms.size());
    }
}