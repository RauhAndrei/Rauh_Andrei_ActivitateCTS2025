package ro.cts.clase;

public class NotaDePlataRevelion extends PrintareFelicitare {

    public NotaDePlataRevelion(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani!");
    }
}
