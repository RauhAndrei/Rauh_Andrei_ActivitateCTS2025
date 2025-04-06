package ro.cts.clase.factory;

import ro.cts.clase.model.AbstractPersonal;
import ro.cts.clase.model.TipPersonal;
import ro.cts.clase.personalMedical.Asistent;
import ro.cts.clase.personalMedical.Brancardier;
import ro.cts.clase.personalMedical.Medic;
import ro.cts.clase.personalMedical.PersonalMedical;

public class FabricaPersonalMedical implements AbstractFactory {

    private boolean areTureDeNoapte;
    private boolean areStudiiSuperioare;
    private boolean areCabinetPrivat;

    public FabricaPersonalMedical(boolean areTureDeNoapte, boolean areStudiiSuperioare, boolean areCabinetPrivat) {
        this.areTureDeNoapte = areTureDeNoapte;
        this.areStudiiSuperioare = areStudiiSuperioare;
        this.areCabinetPrivat = areCabinetPrivat;
    }

    @Override
    public AbstractPersonal crearePersonal(TipPersonal tip, String numePrenume, int cnp, String dataAngjare) {
       switch ((PersonalMedical) tip) {
           case BRANCARDIER -> {
               return new Brancardier(numePrenume, cnp, dataAngjare, areTureDeNoapte);
           }
           case ASISTENT -> {
               return new Asistent(numePrenume, cnp, dataAngjare, areStudiiSuperioare);
           }
           case MEDIC -> {
               return new Medic(numePrenume, cnp, dataAngjare, areCabinetPrivat);
           }
           default -> {
               return null;
           }
       }
   }


}
