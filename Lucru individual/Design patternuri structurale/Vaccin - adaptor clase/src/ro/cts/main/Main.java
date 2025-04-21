package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        VaccinIntern vaccinIntern = new VaccinIntern("vaccinIntern", true, 299.99f);
        VaccinExtern vaccinExtern = new VaccinExtern("vaccinExtern",245.99f);
        AdaptorVaccinIntern adaptorVaccinIntern = new AdaptorVaccinIntern("vaccinintern", true, 299.99f);
        Clinica clinica = new Clinica("Clinica");

        clinica.vindeVaccin(vaccinExtern);
//        clinica.vindeVaccin(vaccinIntern);// eroare
        clinica.vindeVaccin(adaptorVaccinIntern);
    }
}