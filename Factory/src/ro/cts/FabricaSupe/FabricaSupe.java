package ro.cts.FabricaSupe;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaCocos;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.SupaVita;

public class FabricaSupe {
    private float pret;
    private float calorii;

    public FabricaSupe(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supa getSupa(TipSupe tip, float cantitate) {
        return switch (tip) {
            case LEGUME -> new SupaLegume(pret, cantitate, calorii);
            case VITA -> new SupaVita(pret, cantitate, calorii);
            case COCOS -> new SupaCocos(pret, cantitate, calorii);
            default -> null;
        };

    }



}
