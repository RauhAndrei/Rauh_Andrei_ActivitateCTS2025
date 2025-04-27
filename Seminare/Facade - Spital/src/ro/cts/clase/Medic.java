package ro.cts.clase;

public class Medic {
    private String numePrenume;
    private String functia;
    private boolean areTureDeNoapte;

    public Medic(String numePrenume, String functia, boolean areTureDeNoapte) {
        this.numePrenume = numePrenume;
        this.functia = functia;
        this.areTureDeNoapte = areTureDeNoapte;
    }

    public String getNumePrenume() {
        return numePrenume;
    }

    public boolean confirmareInternare(Pacient pacient) {
        return pacient.isEsteInStareGrava();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("numePrenume='").append(numePrenume).append('\'');
        sb.append(", functia='").append(functia).append('\'');
        sb.append(", areTureDeNoapte=").append(areTureDeNoapte);
        sb.append('}');
        return sb.toString();
    }
}
