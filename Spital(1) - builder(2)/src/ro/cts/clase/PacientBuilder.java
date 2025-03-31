package ro.cts.clase;

public class PacientBuilder implements AbstractBuilder {
    private String numePrenume;
    private String cnp;
    private boolean arePatRabatabil;
    private boolean areDejun;
    private boolean arePapuci;
    private boolean areHalat;

    public PacientBuilder() {
        this.numePrenume = "nu are nume";
        this.cnp = "nu are";
        this.arePatRabatabil = false;
        this.areDejun = false;
        this.arePapuci = false;
        this.areHalat = false;
    }

    public PacientBuilder setNumePrenume(String numePrenume) {
        this.numePrenume = numePrenume;
        return this;
    }

    public PacientBuilder setCnp(String cnp) {
        this.cnp = cnp;
        return this;
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreDejun(boolean areDejun) {
        this.areDejun = areDejun;
        return this;
    }

    public PacientBuilder setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    @Override
    public Pacient build(String numePrenume, String cnp) {
        return new Pacient(numePrenume, cnp, arePatRabatabil, areDejun, arePapuci, areHalat);
    }
}
