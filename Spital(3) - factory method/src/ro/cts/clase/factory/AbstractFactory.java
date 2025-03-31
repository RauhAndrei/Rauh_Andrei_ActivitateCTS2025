package ro.cts.clase.factory;

import ro.cts.clase.model.AbstractPersonal;
import ro.cts.clase.model.TipPersonal;

public interface AbstractFactory {
    AbstractPersonal getPersonal(TipPersonal tip, String numePrenume, int cnp, String dataAngjare);
}
