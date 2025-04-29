package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Nota notaDePlata = new NotaDePlata(500.99f);
        notaDePlata.printare();

        Nota notaDecorataRevelion = new NotaDePlataRevelion(notaDePlata);
        notaDecorataRevelion.printare();

        Nota notaDecorataCraciun = new NotaDePlataCraciun(notaDePlata);
        notaDecorataCraciun.printare();

        Nota nota2 = new NotaDePlataCraciun(notaDecorataRevelion);
        nota2.printare();
    }
}