package ro.cts.clase.personalNonMedical;

import ro.cts.clase.model.AbstractPersonal;

public class Registrator extends AbstractPersonal {
    public Registrator(String numePrenume, int cnp, String dataAngjare) {
        super(numePrenume, cnp, dataAngjare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Registrator{");
        sb.append("numePrenume='").append(numePrenume).append('\'');
        sb.append(", cnp=").append(cnp);
        sb.append(", dataAngjare='").append(dataAngjare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
