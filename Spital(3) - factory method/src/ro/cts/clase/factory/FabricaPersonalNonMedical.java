package ro.cts.clase.factory;

import ro.cts.clase.model.AbstractPersonal;
import ro.cts.clase.model.TipPersonal;
import ro.cts.clase.personalNonMedical.PersonalNonMedical;
import ro.cts.clase.personalNonMedical.Registrator;
import ro.cts.clase.personalNonMedical.Secretar;

public class FabricaPersonalNonMedical implements AbstractFactory {

    private boolean areTureDeNoapte;
    private boolean areStudiiSuperioare;

    public FabricaPersonalNonMedical(boolean areTureDeNoapte, boolean areStudiiSuperioare) {
        this.areTureDeNoapte = areTureDeNoapte;
        this.areStudiiSuperioare = areStudiiSuperioare;
    }

    @Override
    public AbstractPersonal getPersonal(TipPersonal tip, String numePrenume, int cnp, String dataAngjare) {
        switch ((PersonalNonMedical) tip) {
            case SECRETAR -> {
                return new Secretar(numePrenume, cnp, dataAngjare);
            }
            case REGISTRATOR -> {
                return new Registrator(numePrenume, cnp, dataAngjare);
            }
            default -> {
                return null;
            }
        }
    }

}
