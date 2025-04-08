package ro.cts.main;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder();

        Rezervare rezervare = rezervareBuilder
                .setGenMuzica("rock")
                .setHasAsezareGeam(true)
                .setHasScauneErg(false)
                .build("Andrei");

        System.out.println(rezervare.toString());

        Rezervare rezervare2 = rezervareBuilder
                .setGenMuzica("rap")
                .setHasScauneErg(true)
                .setHasMasaDecorata(true)
                .build("Eugen");

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
    }
}


//TODO 1 tip de builder se face doar cand il folosim 1 sing data(documentbuilder)

