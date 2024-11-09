package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location {

    private int id;
    private static int nextId = 1;
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Location.nextId = nextId;
    }

    public Location() {
        id = nextId;
        nextId++;
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Location(String value) {
        this(); // Call the empty constructor to initialize the 'id' field
        this.value = value;
    }
}

        // Custom toString, equals, and hashCode methods:
