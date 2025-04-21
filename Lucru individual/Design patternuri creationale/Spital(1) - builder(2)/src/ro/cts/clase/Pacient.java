package ro.cts.clase;

public class Pacient {
    private String numePrenume;
    private String cnp;
    private boolean arePatRabatabil;
    private boolean areDejun;
    private boolean arePapuci;
    private boolean areHalat;

    protected Pacient(String numePrenume, String cnp, boolean arePatRabatabil, boolean areDejun, boolean arePapuci, boolean areHalat) {
        this.numePrenume = numePrenume;
        this.cnp = cnp;
        this.arePatRabatabil = arePatRabatabil;
        this.areDejun = areDejun;
        this.arePapuci = arePapuci;
        this.areHalat = areHalat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePrenume='").append(numePrenume).append('\'');
        sb.append(", cnp='").append(cnp).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areDejun=").append(areDejun);
        sb.append(", arePapuci=").append(arePapuci);
        sb.append(", areHalat=").append(areHalat);
        sb.append('}');
        return sb.toString();
    }
}
