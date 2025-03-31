package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        Pacient pacient = pacientBuilder.build("Rauh Andrei", "1234567890");
        System.out.println(pacient);

        Pacient pacient2 = pacientBuilder
                .setAreHalat(true)
                .setAreDejun(true)
                .setArePatRabatabil(true)
                .build("Vasilica", "1234567890");

        System.out.println(pacient);
        System.out.println(pacient2);

    }
}