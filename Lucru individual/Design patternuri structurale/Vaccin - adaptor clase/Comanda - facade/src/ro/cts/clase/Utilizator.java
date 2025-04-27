package ro.cts.clase;

public class Utilizator {
    private String numePrenume;
    private boolean esteAutentificat;
    private boolean areAdresaCompleta;

    public Utilizator(String numePrenume, boolean esteAutentificat, boolean areAdresaCompleta) {
        this.numePrenume = numePrenume;
        this.esteAutentificat = esteAutentificat;
        this.areAdresaCompleta = areAdresaCompleta;
    }

    public boolean isEsteAutentificat() {
        return esteAutentificat;
    }

    public boolean isAreAdresaCompleta() {
        return areAdresaCompleta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Utilizator{");
        sb.append("numePrenume='").append(numePrenume).append('\'');
        sb.append(", esteAutentificat=").append(esteAutentificat);
        sb.append(", areAdresaCompleta=").append(areAdresaCompleta);
        sb.append('}');
        return sb.toString();
    }
}
