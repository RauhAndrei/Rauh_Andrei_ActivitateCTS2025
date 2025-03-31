package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        AbstractReteta retetaTestata = new RetetaTestata("denumire", 11.25f, 55.11f,
                15.25f, 22.5f, "25.09.2002");

        AbstractReteta retetaTestata2 = retetaTestata.cloneaza("denumire noua");

        System.out.println(retetaTestata);
        System.out.println(retetaTestata2);
    }
}