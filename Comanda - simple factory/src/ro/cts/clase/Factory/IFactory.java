package ro.cts.clase.Factory;

import ro.cts.clase.Comanda.AbstractComanda;
import ro.cts.clase.Comanda.TipComanda;

public interface IFactory {
    AbstractComanda getComanda(TipComanda tipComanda, double suma);
}
