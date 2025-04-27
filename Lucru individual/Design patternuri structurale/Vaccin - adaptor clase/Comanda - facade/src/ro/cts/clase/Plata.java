package ro.cts.clase;

public class Plata {
    private String dataFacturare;
    private float pret;
    private boolean esteMetPlataValida;

    public Plata(String dataFacturare, float pret, boolean esteMetPlataValida) {
        this.dataFacturare = dataFacturare;
        this.pret = pret;
        this.esteMetPlataValida = esteMetPlataValida;
    }

    public boolean isEsteMetPlataValida() {
        return esteMetPlataValida;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plata{");
        sb.append("dataFacturare='").append(dataFacturare).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", esteMetPlataValida=").append(esteMetPlataValida);
        sb.append('}');
        return sb.toString();
    }
}
