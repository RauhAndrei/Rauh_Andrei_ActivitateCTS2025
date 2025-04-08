package ro.cts.clase.Comanda;

public class ComandaInRestaurant extends AbstractComanda {

    public ComandaInRestaurant(String numeClient, String denumireLocal, double suma) {
        super(numeClient, denumireLocal, suma);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ComandaInRestaurant{");
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", denumireLocal='").append(denumireLocal).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
