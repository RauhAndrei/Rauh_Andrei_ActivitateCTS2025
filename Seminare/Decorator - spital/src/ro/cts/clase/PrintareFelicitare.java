package ro.cts.clase;

public abstract class PrintareFelicitare implements Nota {
    private Nota notaDePlata;

    public PrintareFelicitare(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printare() {
        notaDePlata.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();

}
