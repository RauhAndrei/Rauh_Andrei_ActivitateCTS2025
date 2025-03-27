package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        FactorySupa factorySupe = new FactorySupa(255);
        FactoryDesert factoryDesert = new FactoryDesert("visine");

        FelDeMancare supaDeLegume = factorySupe.creareFelDeMancare(Supe.LEGUME, 28.99f, 230);
        factorySupe.setCantitate(265);
        FelDeMancare supaDeCiuperi = factorySupe.creareFelDeMancare(Supe.CIUPERCI, 32.99f, 288.9f);
        FelDeMancare papanasi = factoryDesert.creareFelDeMancare(Deserturi.PAPANASI, 31.99f, 300);
        FelDeMancare tiramisu = factoryDesert.creareFelDeMancare(Deserturi.TIRAMISU, 33.99f, 310);

        System.out.println(supaDeLegume);
        System.out.println(supaDeCiuperi);
        System.out.println(papanasi);
        System.out.println(tiramisu);
    }
}