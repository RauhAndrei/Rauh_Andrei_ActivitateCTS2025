package ro.cts.clase.factory;

import ro.cts.clase.model.*;
import ro.cts.clase.personalDidactic.*;

public class FactoryPersDidactic implements IFactory {
    private boolean predaSeminare;

    public FactoryPersDidactic(boolean predaSeminare) {
        this.predaSeminare = predaSeminare;
    }

    @Override
    public AbstractPersonal creeazaPersonal(TipPersonal tipPersonal, String numePrenume, String dataAngajare) {
       switch ((TipPersonalDidactic) tipPersonal) {
           case CONFERENTIAR -> {
               return new Conferentiar(numePrenume, dataAngajare, predaSeminare);
           }
           case LECTOR -> {
               return new Lector(numePrenume, dataAngajare, predaSeminare);
           }
           case PROFESOR -> {
               return new Profesor(numePrenume, dataAngajare, predaSeminare);
           }
           default -> {
               return null;
           }
       }
    }
}
