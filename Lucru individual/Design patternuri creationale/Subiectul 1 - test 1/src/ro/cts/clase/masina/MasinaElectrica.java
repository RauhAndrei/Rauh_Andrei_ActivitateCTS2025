package ro.cts.clase.masina;

public class MasinaElectrica extends AbstractMasina {
    private boolean areMotorElectric;

    public MasinaElectrica(String marca, int nrUsi, String nrInmatriculare, boolean areMotorElectric) {
        super(marca, nrUsi, nrInmatriculare);
        this.areMotorElectric = areMotorElectric;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MasinaElectrica{");
        sb.append("areMotorElectric=").append(areMotorElectric);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", nrUsi=").append(nrUsi);
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
