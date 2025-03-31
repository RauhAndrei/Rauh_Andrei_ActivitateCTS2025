package ro.cts.clase.model;

public class AbstractPersonal {
    protected String numePrenume;
    protected int cnp;
    protected String dataAngjare;

    public AbstractPersonal(String numePrenume, int cnp, String dataAngjare) {
        this.numePrenume = numePrenume;
        this.cnp = cnp;
        this.dataAngjare = dataAngjare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractPersonal{");
        sb.append("numePrenume='").append(numePrenume).append('\'');
        sb.append(", cnp=").append(cnp);
        sb.append(", dataAngjare='").append(dataAngjare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
