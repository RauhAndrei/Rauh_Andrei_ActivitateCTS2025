package ro.cts.clase;

import ro.cts.clase.model.AbstractFelDeMancare;
import ro.cts.clase.model.TipFelDeMancare;

public interface AbstractFactory {
    public AbstractFelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii);
}
