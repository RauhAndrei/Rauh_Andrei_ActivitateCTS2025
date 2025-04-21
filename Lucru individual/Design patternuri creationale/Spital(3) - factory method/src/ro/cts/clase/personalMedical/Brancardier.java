package ro.cts.clase.personalMedical;

import ro.cts.clase.model.AbstractPersonal;

public class Brancardier extends AbstractPersonal {

    private boolean areTureDeNoapte;

    public Brancardier(String numePrenume, int cnp, String dataAngjare, boolean areTureDeNoapte) {
        super(numePrenume, cnp, dataAngjare);
        this.areTureDeNoapte = areTureDeNoapte;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append("areTureDeNoapte=").append(areTureDeNoapte);
        sb.append(", numePrenume='").append(numePrenume).append('\'');
        sb.append(", cnp=").append(cnp);
        sb.append(", dataAngjare='").append(dataAngjare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
