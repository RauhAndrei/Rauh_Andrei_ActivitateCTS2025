package ro.cts.clase.factory;

import ro.cts.clase.model.*;
import ro.cts.clase.personalAdministrativ.*;

public class FactoryPersAdministrativ implements IFactory {
    private boolean areDoctorat;

    public FactoryPersAdministrativ(boolean areDoctorat) {
        this.areDoctorat = areDoctorat;
    }

    @Override
    public AbstractPersonal creeazaPersonal(TipPersonal tipPersonal, String numePrenume, String dataAngajare) {
        switch ((TipPersonalAdministrativ) tipPersonal) {
            case ADMINISTRATOR -> {
                return new Administrator(numePrenume, dataAngajare, areDoctorat);
            }
            case BIBLIOTECAR -> {
                return new Bibliotecar(numePrenume, dataAngajare, areDoctorat);
            }
            case SECRETAR -> {
                return new Secretar(numePrenume, dataAngajare, areDoctorat);
            }
            default -> {
                return  null;
            }
        }
    }
}
