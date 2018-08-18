package com.company;

import java.time.DateTimeException;
import java.time.LocalDate;


/*  De versie hieronder is deels van een andere oefening.

public class Student {
    private String naam;
    private LocalDate geboorteDatum;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }
    public void setGeboorteDatum(int dag, int maand, int jaar) {
        this.geboorteDatum = LocalDate.of(jaar, maand, dag);
    }
    public int getLeeftijd(){
        LocalDate vandaag = LocalDate.now();
        int leeftijd = vandaag.getYear() - geboorteDatum.getYear();
        LocalDate verjaardag = geboorteDatum.plusYears(leeftijd);
        if (verjaardag.compareTo(vandaag) > 0){
            leeftijd--;
        }
        return leeftijd;
    }
}

*/



/*    Eigen versie hieronder.   */

/*
public class Student {


    private String naam;
    private LocalDate geboortedatum;

    private LocalDate vandaag = LocalDate.now();


    public Student(String naam, int dag, int maand, int jaar) {


        if (naam.length() < 2) throw new IllegalArgumentException("Naam moet minstens 2 karakters lang zijn.");


        if (geboortedatum.of(jaar, maand, dag) == null) throw new IllegalArgumentException("U moet een geldige datum ingeven.");



        if (geboortedatum.isAfter(vandaag))
            throw new DateTimeException("De geboortedatum kan niet in de toekomst liggen.");


        this.naam = naam;
    }

    public String getNaam() {
        return this.naam;
    }

    public int getLeeftijd() {


        return 1;
    }
*/

// Hieronder de werkende versie van Alexej en Jef, de docent.


    public class Student {

        private String naam;
        private LocalDate geboortedatum;

        private LocalDate datumVandaag = LocalDate.now();

        private int leeftijd;


        public Student(String naam, int dag, int maand, int jaar) {


            if (naam.length() < 2) throw new IllegalArgumentException("Naam is te kort");


            try {
                this.geboortedatum = LocalDate.of(jaar, maand, dag);

            } catch (DateTimeException ex) {
                throw new IllegalArgumentException("Datum is ongeldig");
            }

            if (geboortedatum.isAfter(datumVandaag))               // Kan ook met compareTo()
                throw new IllegalArgumentException("Datum mag niet in de toekomst liggen");


            this.naam = naam;
        }

        public String getNaam() {

            return this.naam;
        }

        public int getLeeftijd() {

            this.leeftijd = datumVandaag.getYear() - geboortedatum.getYear();

            if (geboortedatum.getDayOfYear() > LocalDate.now().getDayOfYear())
                this.leeftijd--;

            return this.leeftijd;
        }
    }




