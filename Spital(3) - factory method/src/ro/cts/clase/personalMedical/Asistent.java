package ro.cts.clase.personalMedical;

import ro.cts.clase.model.AbstractPersonal;

public class Asistent extends AbstractPersonal {
    private boolean areStudiiSuperioare;

    public Asistent(String numePrenume, int cnp, String dataAngjare, boolean areStudiiSuperioare) {
        super(numePrenume, cnp, dataAngjare);
        this.areStudiiSuperioare = areStudiiSuperioare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("areStudiiSuperioare=").append(areStudiiSuperioare);
        sb.append(", numePrenume='").append(numePrenume).append('\'');
        sb.append(", cnp=").append(cnp);
        sb.append(", dataAngjare='").append(dataAngjare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
