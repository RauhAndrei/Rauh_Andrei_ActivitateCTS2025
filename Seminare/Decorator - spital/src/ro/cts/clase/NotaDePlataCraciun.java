package ro.cts.clase;

public class NotaDePlataCraciun extends PrintareFelicitare {

    public NotaDePlataCraciun(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit");
    }



}
