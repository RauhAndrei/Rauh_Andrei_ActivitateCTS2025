package ro.cts.clase;

public class AdaptorVaccinIntern extends VaccinIntern implements IVaccinExtern {


    public AdaptorVaccinIntern(String denumire, boolean esteInStoc, float pret) {
        super(denumire, esteInStoc, pret);
    }

    @Override
    public void injecteaza() {
        super.administreazaVaccin();
    }
}
