package ro.cts.clase;

public abstract class AbstactPrintareFelicitare implements Nota {
    private Nota notaDePlata;

    public AbstactPrintareFelicitare(Nota notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printare() {
        notaDePlata.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();

}
