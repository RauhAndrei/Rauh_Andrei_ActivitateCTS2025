package ro.cts.clase;

public abstract class PersonalSpital {
    protected String numePrenume;
    protected String codAngajat;
    protected int aniExperienta;
    protected boolean areBoliCronice;

    public PersonalSpital(String numePrenume, String codAngajat, int aniExperienta, boolean areBoliCronice) {
        this.numePrenume = numePrenume;
        this.codAngajat = codAngajat;
        this.aniExperienta = aniExperienta;
        this.areBoliCronice = areBoliCronice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("numePrenume='").append(numePrenume).append('\'');
        sb.append(", codAngajat='").append(codAngajat).append('\'');
        sb.append(", aniExperienta=").append(aniExperienta);
        sb.append(", areBolieCronice=").append(areBoliCronice);
        sb.append('}');
        return sb.toString();
    }
}
