package ro.cts.clase;

public class Brancardier extends PersonalSpital {

    public Brancardier(String numePrenume, String codAngajat, int aniExperienta, boolean areBolieCronice) {
        super(numePrenume, codAngajat, aniExperienta, areBolieCronice);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(", numePrenume='").append(numePrenume).append('\'');
        sb.append(", codAngajat='").append(codAngajat).append('\'');
        sb.append(", aniExperienta=").append(aniExperienta);
        sb.append(", areBolieCronice=").append(areBoliCronice);
        sb.append('}');
        return sb.toString();
    }
}
