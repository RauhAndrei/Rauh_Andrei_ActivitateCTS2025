package ro.cts.clase;

public class Stoc {
    private int produseDisponibile;

    public Stoc(int produseDisponibile) {
        this.produseDisponibile = produseDisponibile;
    }

    public boolean esteInStoc() {
        return (produseDisponibile > 0) ? true : false;
    }

    public void scadeStoc() {
        produseDisponibile--;
    }

}
