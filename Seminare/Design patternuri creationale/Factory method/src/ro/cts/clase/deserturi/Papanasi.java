package ro.cts.clase.deserturi;

import ro.cts.clase.model.AbstractFelDeMancare;

public class Papanasi extends AbstractFelDeMancare {
    private String crema;

    public Papanasi(float pret, float calorii, String crema) {
        super(pret, calorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString() + "Papanasi{");
        sb.append("crema=").append(crema);
        sb.append('}');
        return sb.toString();
    }
}
