package ro.cts.clase;

public class SupaLegume extends Supa {
    public SupaLegume() {
    }

    public SupaLegume(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.toString());
    }
}
