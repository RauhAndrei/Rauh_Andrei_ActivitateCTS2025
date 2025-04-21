package ro.cts.clase.masina;

public class VAN extends AbstractMasina {
    private boolean areBaie;

    public VAN(String marca, int nrUsi, String nrInmatriculare, boolean areBaie) {
        super(marca, nrUsi, nrInmatriculare);
        this.areBaie = areBaie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VAN{");
        sb.append("areBaie=").append(areBaie);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", nrUsi=").append(nrUsi);
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
