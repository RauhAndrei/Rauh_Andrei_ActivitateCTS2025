package ro.cts.main;

import ro.cts.clase.AbstractRezervare;
import ro.cts.clase.RezervareTerasa;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervareTerasa = new RezervareTerasa(
                2, 15, "Popica", 12, true);
        AbstractRezervare rezervareTerasa2 = rezervareTerasa.copiaza(25);
        AbstractRezervare rezervareTerasa3 = rezervareTerasa.copiaza(29);

        System.out.println(rezervareTerasa.toString());
        System.out.println(rezervareTerasa2.toString());
        System.out.println(rezervareTerasa3.toString());


    }
}