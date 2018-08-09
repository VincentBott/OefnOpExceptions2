package com.company;

import java.time.LocalDate;

public class Student {


    private int leeftijd;
    private String naam;

/*
if (naam.length() < 2) throw new IllegalArgumentException("Naam moet minstens 2 karakters lang zijn.");

if (prijs < 0) throw new IllegalArgumentException("De prijs mag niet negatief zijn.");
 */

    public Student(String naam, int dag, int maand, int jaar) {

        if (naam.length() < 2) throw new IllegalArgumentException("Naam moet minstens 2 karakters lang zijn.");


  //      if (prijs < 0) throw new IllegalArgumentException("De prijs mag niet negatief zijn.");

        this.naam = naam;
    }

    public String getNaam() {

    }

    public int getLeeftijd() {

    }
}
