package ro.cts.clase.factory;

import ro.cts.clase.model.AbstractPersonal;
import ro.cts.clase.model.TipPersonal;

public interface IFactory {
    AbstractPersonal creeazaPersonal(TipPersonal tipPersonal, String numePrenume, String dataAngajare);
    }
