package ro.cts.clase.masina;

public class SUV extends AbstractMasina {
    private boolean este4x4;

    public SUV(String marca, int nrUsi, String nrInmatriculare, boolean este4x4) {
        super(marca, nrUsi, nrInmatriculare);
        this.este4x4 = este4x4;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SUV{");
        sb.append("este4x4=").append(este4x4);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", nrUsi=").append(nrUsi);
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
