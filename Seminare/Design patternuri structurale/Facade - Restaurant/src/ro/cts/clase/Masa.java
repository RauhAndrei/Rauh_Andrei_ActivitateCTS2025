package ro.cts.clase;

public class Masa {
    private int nrPersoane;
    private boolean esteLibera;
    private int nrMasa;

    public Masa(int nrPersoane, boolean esteLibera, int nrMasa) {
        this.nrPersoane = nrPersoane;
        this.esteLibera = esteLibera;
        this.nrMasa = nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }
}
