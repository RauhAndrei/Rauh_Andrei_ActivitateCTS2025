package ro.cts.clase;

public class RetetaTestata extends AbstractReteta {
    private String dataTestarii;

    public RetetaTestata(String denumireReteta, float cantitatiSolutie1, float cantitatiSolutie2, float cantitatiSolutie3, float cantitatiSolutie4, String dataTestarii) {
        super(denumireReteta, cantitatiSolutie1, cantitatiSolutie2, cantitatiSolutie3, cantitatiSolutie4);
        this.dataTestarii = dataTestarii;
    }

    @Override
    public AbstractReteta cloneaza(String denumireReteta) {
       return new RetetaTestata(denumireReteta, cantitatiSolutie1, cantitatiSolutie2, cantitatiSolutie3, cantitatiSolutie4, dataTestarii);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaTestata{");
        sb.append("dataTestarii='").append(dataTestarii).append('\'');
        sb.append(", denumireReteta='").append(denumireReteta).append('\'');
        sb.append(", cantitatiSolutie1=").append(cantitatiSolutie1);
        sb.append(", cantitatiSolutie2=").append(cantitatiSolutie2);
        sb.append(", cantitatiSolutie3=").append(cantitatiSolutie3);
        sb.append(", cantitatiSolutie4=").append(cantitatiSolutie4);
        sb.append('}');
        return sb.toString();
    }
}
