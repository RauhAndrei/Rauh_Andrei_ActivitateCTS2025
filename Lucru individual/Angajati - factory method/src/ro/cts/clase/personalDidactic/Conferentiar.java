package ro.cts.clase.personalDidactic;

import ro.cts.clase.model.AbstractPersonal;

public class Conferentiar extends AbstractPersonal {
    private boolean predaSeminare;

    public Conferentiar(String numePrenume, String dataAngajare, boolean predaSeminare) {
        super(numePrenume, dataAngajare);
        this.predaSeminare = predaSeminare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conferentiar{");
        sb.append("predaSeminare=").append(predaSeminare);
        sb.append(", numePrenume='").append(numePrenume).append('\'');
        sb.append(", dataAngajare='").append(dataAngajare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
