package ro.cts.clase;

public class NotaDePlata implements Nota {

    private float totalDePlata;

    public NotaDePlata(float totalDePlata) {
        this.totalDePlata = totalDePlata;
    }

    @Override
    public void printare() {
        System.out.println("\nAveti de plata: " + this.totalDePlata + " RON");
    }



}
