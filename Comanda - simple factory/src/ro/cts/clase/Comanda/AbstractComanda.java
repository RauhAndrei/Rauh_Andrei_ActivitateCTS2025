package ro.cts.clase.Comanda;

public abstract class AbstractComanda {
    protected String numeClient;
    protected String denumireLocal;
    protected double suma;

    public AbstractComanda(String numeClient, String denumireLocal, double suma) {
        this.numeClient = numeClient;
        this.denumireLocal = denumireLocal;
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractComanda{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", denumireLocal='").append(denumireLocal).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
