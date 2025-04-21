package ro.cts.clase.factory;

import ro.cts.clase.masina.*;

public interface IFactory {
    AbstractMasina creeazaMasina(TipMasina tipMasina);
}
