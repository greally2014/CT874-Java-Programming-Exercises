package com.weektwo.bicycle;

public class Bicycle {

    // Instance variable
    String name;

    // Constructor
    Bicycle() {
        name = "Unassigned";
    }

    // Returns the object's name
    public String getName() {
        return name;
    }

    // Sets the object's name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    // String representation of an object
    public String toString() {
        return getName() + " owns a bicycle";
    }
}
