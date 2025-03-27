package ro.cts.clase;

public class FactorySupa implements AbstractFactory {
    private int cantitate;

    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch ((Supe) tipFelDeMancare) {
            case LEGUME -> {
                return new SupaLegume(pret, calorii, cantitate);
            }
            case CIUPERCI -> {
                return new SupaCiuperci(pret, calorii, cantitate);
            }
            default -> {
                return null;
            }
        }
    }
}
