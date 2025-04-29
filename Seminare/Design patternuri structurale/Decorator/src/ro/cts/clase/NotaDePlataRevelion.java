package ro.cts.clase;

public class NotaDePlataRevelion extends AbstactPrintareFelicitare {

    public NotaDePlataRevelion(Nota notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani! Un an nou fericit!");
    }
}
