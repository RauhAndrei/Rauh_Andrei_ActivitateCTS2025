package ro.cts.clase;

public class SupaCocos extends Supa {
    public SupaCocos(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.toString());
    }
}
