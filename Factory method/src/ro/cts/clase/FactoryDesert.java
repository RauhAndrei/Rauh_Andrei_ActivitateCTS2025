package ro.cts.clase;

public class FactoryDesert implements AbstractFactory {

    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }


    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch ((Deserturi) tipFelDeMancare) {
            case TIRAMISU -> {
                return new Tiramisu(pret,calorii,crema);
            }
            case PAPANASI -> {
                return new Papanasi(pret,calorii,crema);}
            default -> {
                return null;
            }
        }
    }
}
