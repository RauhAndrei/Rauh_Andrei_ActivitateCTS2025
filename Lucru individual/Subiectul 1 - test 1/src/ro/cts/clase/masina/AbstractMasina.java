package ro.cts.clase.masina;

public abstract class AbstractMasina {
    protected String marca;
    protected int nrUsi;
    protected String nrInmatriculare;

    public AbstractMasina(String marca, int nrUsi, String nrInmatriculare) {
        this.marca = marca;
        this.nrUsi = nrUsi;
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractMasina{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", nrUsi=").append(nrUsi);
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
