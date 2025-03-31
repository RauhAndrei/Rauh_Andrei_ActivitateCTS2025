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
        switch (tip) {
            case LEGUME -> {
                return new SupaLegume(pret, cantitate, calorii);
            }
            case VITA -> {
                return new SupaVita(pret, cantitate, calorii);
            }
            case COCOS -> {
                return new SupaCocos(pret, cantitate, calorii);
            }
            default -> {
                return null;
            }
        }
    }



}
