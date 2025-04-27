package ro.cts.clase;

public class Pacient {
    private String numePrenume;
    private String cnp;
    private boolean esteInStareGrava;

    public Pacient(String numePrenume, String cnp, boolean esteInStareGrava) {
        this.numePrenume = numePrenume;
        this.cnp = cnp;
        this.esteInStareGrava = esteInStareGrava;
    }

    public String getNumePrenume() {
        return numePrenume;
    }

    public boolean isEsteInStareGrava() {
        return esteInStareGrava;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePrenume='").append(numePrenume).append('\'');
        sb.append(", cnp=").append(cnp);
        sb.append(", esteInStareGrava=").append(esteInStareGrava);
        sb.append('}');
        return sb.toString();
    }
}
