package ro.cts.clase.personalAdministrativ;

import ro.cts.clase.model.AbstractPersonal;

public class Bibliotecar extends AbstractPersonal {
    private boolean areDoctorat;

    public Bibliotecar(String numePrenume, String dataAngajare, boolean areDoctorat) {
        super(numePrenume, dataAngajare);
        this.areDoctorat = areDoctorat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bibliotecar{");
        sb.append("areDoctorat=").append(areDoctorat);
        sb.append(", numePrenume='").append(numePrenume).append('\'');
        sb.append(", dataAngajare='").append(dataAngajare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
