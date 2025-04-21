package ro.cts.clase;

public abstract class AbstractReteta {
    protected String denumireReteta;
    protected float cantitatiSolutie1;
    protected float cantitatiSolutie2;
    protected float cantitatiSolutie3;
    protected float cantitatiSolutie4;

    public AbstractReteta() { }

    public AbstractReteta(String denumireReteta, float cantitatiSolutie1, float cantitatiSolutie2, float cantitatiSolutie3, float cantitatiSolutie4) {
        this.denumireReteta = denumireReteta;
        this.cantitatiSolutie1 = cantitatiSolutie1;
        this.cantitatiSolutie2 = cantitatiSolutie2;
        this.cantitatiSolutie3 = cantitatiSolutie3;
        this.cantitatiSolutie4 = cantitatiSolutie4;
    }

    public abstract AbstractReteta cloneaza(String denumireReteta);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractReteta{");
        sb.append("denumireReteta='").append(denumireReteta).append('\'');
        sb.append(", cantitatiSolutie1=").append(cantitatiSolutie1);
        sb.append(", cantitatiSolutie2=").append(cantitatiSolutie2);
        sb.append(", cantitatiSolutie3=").append(cantitatiSolutie3);
        sb.append(", cantitatiSolutie4=").append(cantitatiSolutie4);
        sb.append('}');
        return sb.toString();
    }
}
