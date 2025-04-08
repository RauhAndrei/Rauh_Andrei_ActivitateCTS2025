package ro.cts.main;

import ro.cts.clase.Comanda.*;
import ro.cts.clase.Factory.*;

public class Main {
    public static void main(String[] args) {
        ComandaFactory comandaFactory = new ComandaFactory("Rauh Andrei", "ChinChin");

        AbstractComanda comandaRestaurant = comandaFactory.getComanda(TipComanda.COMANDA_IN_RESTAURANT, 228.99);
        System.out.println(comandaRestaurant);

        AbstractComanda comandaPachet = comandaFactory.getComanda(TipComanda.COMANDA_LA_PACHET, 157.89);
        System.out.println(comandaPachet);

        AbstractComanda comandaOnline = comandaFactory.getComanda(TipComanda.COMANDA_ONLINE, 123.99);
        System.out.println(comandaOnline);
    }
}