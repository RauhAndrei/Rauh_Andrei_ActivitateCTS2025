package ro.cts.main;

import ro.cts.clase.IRezervare;
import ro.cts.clase.ProxyNrPersoane;
import ro.cts.clase.ProxyOra;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Gigel", 5, 15);
        IRezervare proxyNrPersoane = new ProxyNrPersoane(rezervare);
        proxyNrPersoane.rezerva("Gigel", 3, 15);

        IRezervare proxyOra = new ProxyOra(proxyNrPersoane);
        proxyOra.rezerva("Gigel", 5, 15);
        proxyOra.rezerva("Gigel", 5, 22);

    }
}