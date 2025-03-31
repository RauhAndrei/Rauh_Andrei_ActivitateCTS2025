package ro.cts.clase.personalMedical;

import ro.cts.clase.model.AbstractPersonal;

public class Medic extends AbstractPersonal {
    private boolean areCabinetPrivat;

    public Medic(String numePrenume, int cnp, String dataAngjare, boolean areCabinetPrivat) {
        super(numePrenume, cnp, dataAngjare);
        this.areCabinetPrivat = areCabinetPrivat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("areCabinetPrivat=").append(areCabinetPrivat);
        sb.append(", numePrenume='").append(numePrenume).append('\'');
        sb.append(", cnp=").append(cnp);
        sb.append(", dataAngjare='").append(dataAngjare).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
