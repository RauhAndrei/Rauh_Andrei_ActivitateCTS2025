package ro.cts.main;

import ro.cts.clase.factory.FactoryPersAdministrativ;
import ro.cts.clase.factory.FactoryPersDidactic;
import ro.cts.clase.model.AbstractPersonal;
import ro.cts.clase.personalAdministrativ.TipPersonalAdministrativ;
import ro.cts.clase.personalDidactic.Lector;
import ro.cts.clase.personalDidactic.TipPersonalDidactic;

public class Main {
    public static void main(String[] args) {
        FactoryPersDidactic factoryPersDidactic = new FactoryPersDidactic(true);

        AbstractPersonal lector = factoryPersDidactic.creeazaPersonal(TipPersonalDidactic.LECTOR, "Rauh Andrei",
                "25.09.2022");
        System.out.println(lector);

        AbstractPersonal conferentiar = factoryPersDidactic.creeazaPersonal(TipPersonalDidactic.CONFERENTIAR,
                "Ionut Rusu", "02.11.2024");
        System.out.println(conferentiar);

        AbstractPersonal profesor = factoryPersDidactic.creeazaPersonal(TipPersonalDidactic.PROFESOR,
                "Asachi Gheorghe", "15.12.2025");
        System.out.println(profesor);


        System.out.println();


        FactoryPersAdministrativ factoryPersAdministrativ = new FactoryPersAdministrativ(false);

        AbstractPersonal administrator = factoryPersAdministrativ.creeazaPersonal(TipPersonalAdministrativ.ADMINISTRATOR,
                "Rauh Victor", "25.09.2022");
        System.out.println(administrator);

        AbstractPersonal bibliotecar = factoryPersAdministrativ.creeazaPersonal(TipPersonalAdministrativ.BIBLIOTECAR,
                "Ionut Rusu", "19.11.2023");
        System.out.println(bibliotecar);

        AbstractPersonal secretar = factoryPersAdministrativ.creeazaPersonal(TipPersonalAdministrativ.SECRETAR,
                "Asachi Gheorghe", "05.03.2002");
        System.out.println(secretar);
    }
}