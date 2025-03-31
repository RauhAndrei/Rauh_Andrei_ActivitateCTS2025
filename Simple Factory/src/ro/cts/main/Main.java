package ro.cts.main;

import ro.cts.FabricaSupe.*;
import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupe = new FabricaSupe(15.99f, 350.57f);
        Supa supaLegume = fabricaSupe.getSupa(TipSupe.LEGUME, 300);
        Supa supaVita = fabricaSupe.getSupa(TipSupe.VITA, 350);
        Supa supaCocos = fabricaSupe.getSupa(TipSupe.COCOS, 330);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();
        supaCocos.afiseazaDescriere();
    }
}
