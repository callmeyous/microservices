package com.example.demo404;

import java.util.*;

public class Librarian {
     String firstName;
     String lastName;
     int ausId;

    public Librarian(String firstName, String lastName, int ausId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ausId = ausId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAusId() {
        return ausId;
    }

    public void setAusId(int ausId) {
        this.ausId = ausId;
    }
}

