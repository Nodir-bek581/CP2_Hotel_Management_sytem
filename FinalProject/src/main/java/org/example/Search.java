package org.example;

import java.util.Date;
import java.util.ArrayList;

public interface Search {

    ArrayList<Room> searchRoom(RoomStyle style, Date startDate, int durationDays);
}