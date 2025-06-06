package ro.cts.clase.deserturi;

import ro.cts.clase.model.AbstractFelDeMancare;

public class Tiramisu extends AbstractFelDeMancare {
    private String crema;

    public Tiramisu(float pret, float calorii, String crema) {
        super(pret, calorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString() + "Tiramisu{");
        sb.append("crema='").append(crema).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
