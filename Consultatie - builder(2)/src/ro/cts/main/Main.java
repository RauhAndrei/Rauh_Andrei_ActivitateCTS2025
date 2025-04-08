package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        BuilderConsultatie builderConsultatie = new BuilderConsultatie();

        Consultatie consultatie4 = builderConsultatie
                .creeazaConsultatie("nume", "data", "ora");

        System.out.println(consultatie4);

        Consultatie consultatie = builderConsultatie
                .setAreConsultatieOrtodont(true)
                .setAreRadiografie(true)
                .setAreAlbire(true)
                .creeazaConsultatie("Rauh Andrei","14.11.2022", "15.30");


        Consultatie consultatie2 = builderConsultatie
                .setAreAlbire(true)
                .creeazaConsultatie("Vasile Ganganu", "05.11.2025", "15.30");

        Consultatie consultatie3 = builderConsultatie
                .setAreRadiografie(true)
                .creeazaConsultatie("Ionel Sarbu", "22.12.2023", "08.45");
//TODO e greseala ca se seteaza pe true valorile pe care nu le am setat aici?

        System.out.println(consultatie);
        System.out.println(consultatie2);
        System.out.println(consultatie3);

    }
}