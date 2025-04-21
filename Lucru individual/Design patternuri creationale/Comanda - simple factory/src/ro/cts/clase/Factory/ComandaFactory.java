package ro.cts.clase.Factory;

import ro.cts.clase.Comanda.*;

public class ComandaFactory implements IFactory {

    protected String numeClient;
    protected String denumireLocal;

    public ComandaFactory(String numeClient, String denumireLocal) {
        this.numeClient = numeClient;
        this.denumireLocal = denumireLocal;
    }

    @Override
    public AbstractComanda getComanda(TipComanda tipComanda, double suma) {
        switch (tipComanda) {
            case COMANDA_ONLINE -> {
                return new ComandaOnline(numeClient, denumireLocal, suma);
            }
            case COMANDA_LA_PACHET -> {
                return new ComandaLaPachet(numeClient, denumireLocal, suma);
            }
            case COMANDA_IN_RESTAURANT -> {
                return new ComandaInRestaurant(numeClient, denumireLocal, suma);
            }
            default -> {
                return null;
            }
        }
    }
}
