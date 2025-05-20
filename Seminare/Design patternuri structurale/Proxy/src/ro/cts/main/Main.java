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

/*
B.9. Managerul restaurantului dorește ca atunci când cineva dorește să realizez e o rezervare sa fie
permisă doar dacă aceasta este realizată pentru minim 4 persoane. În sens contrar rezervarea nu
este realizata, iar persoanele sunt rugate să se prezinte la restaurant deoarece sunt suficiente locuri
pentru mesele de doua persoane. Sa se realizeze un nivel intermediar care sa condiționeze
realizarea rezervărilor de numărul de persoane.
 */