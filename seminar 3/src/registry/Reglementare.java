package registry;

public class Reglementare {
    private String model;
    private int nrReglementare;
    private String dataReglementare;

    protected Reglementare() {
    }

//    protected - pt a controla instanțierea obiectelor Reglementare, ca să fie create doar prin intermediul clasei Autoritate
    protected Reglementare(String model, int nrReglementare, String dataReglementare) {
        this.model = model;
        this.nrReglementare = nrReglementare;
        this.dataReglementare = dataReglementare;
    }

    @Override
    public String toString() {
        return "Reglementare{" +
                "model='" + model + '\'' +
                ", nrReglementare=" + nrReglementare +
                ", dataReglementare='" + dataReglementare + '\'' +
                '}';
    }
}
