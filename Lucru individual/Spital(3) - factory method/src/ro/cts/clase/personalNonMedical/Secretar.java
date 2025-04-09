package ro.cts.clase.personalNonMedical;

import ro.cts.clase.model.AbstractPersonal;

public class Secretar extends AbstractPersonal {

    public Secretar(String numePrenume, int cnp, String dataAngjare) {
        super(numePrenume, cnp, dataAngjare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Secretar{");
        sb.append("numePrenume='").append(numePrenume).append('\'');
        sb.append(", cnp=").append(cnp);
        sb.append(", dataAngjare='").append(dataAngjare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
