package ro.cts.clase;

public class Clinica {
    private String denumire;

    public Clinica(String denumire) {
        this.denumire = denumire;
    }

    public void vindeVaccin(IVaccinExtern iVaccinExtern) {
        System.out.println("Bun venit la clinica: " + this.denumire);
        iVaccinExtern.injecteaza();
    }

}
