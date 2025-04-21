package ro.cts.clase;

public class VaccinIntern {
    private String denumire;
    private boolean esteInStoc;
    private float pret;

    public VaccinIntern(String denumire, boolean esteInStoc, float pret) {
        this.denumire = denumire;
        this.esteInStoc = esteInStoc;
        this.pret = pret;
    }

    public void verificaStoc() {
        if (esteInStoc) {
            System.out.println("Vaccinul: " + this.denumire + " este in stoc!");
        } else {
            System.out.println("Vaccinul: " + this.denumire + " nu este in stoc!");
        }
    }

    public void administreazaVaccin() {
        verificaStoc();
        System.out.println("Administrez vaccinul: " + this.denumire + " la pretul de: " + this.pret);
    }



}
