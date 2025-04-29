package ro.cts.clase;

public class NotaDePlataCraciun extends AbstactPrintareFelicitare {

    public NotaDePlataCraciun(Nota notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit");
    }



}
