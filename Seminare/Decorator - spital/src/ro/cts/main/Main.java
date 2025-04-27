package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata(500.99f);
        notaDePlata.printare();

        Nota notaDecorata = new NotaDePlataRevelion(notaDePlata);
        notaDecorata.printare();

        Nota notaDecorataCraciun = new NotaDePlataCraciun(notaDePlata);
        Nota nota2 = new NotaDePlataCraciun(notaDecorata);
        nota2.printare();
        notaDecorataCraciun.printare();
    }
}