package ro.cts.main;

import ro.cts.clase.ComandaFacade;
import ro.cts.clase.Plata;
import ro.cts.clase.Stoc;
import ro.cts.clase.Utilizator;

public class Main {
    public static void main(String[] args) {
        Stoc stoc = new Stoc(2);
        Plata plata = new Plata("25.09.2024", 299.99f, true);
        Utilizator utilizator = new Utilizator("Rauh Andrei", true, true);
        Utilizator utilizator2 = new Utilizator("Rusu Vadim", false, true);
        Utilizator utilizator3 = new Utilizator("Anonim", true, false);
        Utilizator utilizator4 = new Utilizator("Calin Georgescu", false, false);
        Utilizator utilizator5 = new Utilizator("Rauh Victor", true, true);


        ComandaFacade comandaFacade = new ComandaFacade(stoc, plata);
        comandaFacade.faceComanda(utilizator);
        comandaFacade.faceComanda(utilizator2);
        comandaFacade.faceComanda(utilizator3);
        comandaFacade.faceComanda(utilizator4);
    }
}