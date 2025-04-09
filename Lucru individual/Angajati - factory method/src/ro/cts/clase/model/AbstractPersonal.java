package ro.cts.clase.model;

public abstract class AbstractPersonal {
    protected String numePrenume;
    protected String dataAngajare;

    public AbstractPersonal(String numePrenume, String dataAngajare) {
        this.numePrenume = numePrenume;
        this.dataAngajare = dataAngajare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractPersonal{");
        sb.append("numePrenume='").append(numePrenume).append('\'');
        sb.append(", dataAngajare='").append(dataAngajare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
