package ro.cts.clase;

public class VaccinExtern implements IVaccinExtern  {
    private String denumire;
    private float pret;

    public VaccinExtern(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void injecteaza() {
        System.out.println("Am injectat vaccinul: " + this.denumire + " la pretul de: " + this.pret);
    }
}
