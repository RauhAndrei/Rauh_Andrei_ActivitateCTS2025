package ro.cts.fabricaPersonalSpital;

import ro.cts.clase.Asistent;
import ro.cts.clase.Brancardier;
import ro.cts.clase.Medic;
import ro.cts.clase.PersonalSpital;

public class FabricaPersonalSpital {

    private boolean areBoliCronice;

    public FabricaPersonalSpital(boolean areBoliCronice) {
        this.areBoliCronice = areBoliCronice;
    }

    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String numePrenume, String codAngajat, int aniExperienta) {
        switch (tip) {
            case BRANCARDIER -> {
                return new Brancardier(numePrenume, codAngajat, aniExperienta, areBoliCronice);
            }
            case MEDIC -> {
                return new Medic(numePrenume, codAngajat, aniExperienta, areBoliCronice);
            }
            case ASISTENT -> {
                return new Asistent(numePrenume, codAngajat, aniExperienta, areBoliCronice);
            }
            default -> {
                return null;
            }
        }
    }

}
