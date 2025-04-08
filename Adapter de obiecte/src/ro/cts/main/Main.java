package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Bine ati venit la farmacia Tei!");
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args){
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Aspacardin", "12/2/2026",true,48.4f);
        MedicamentSpital medicamentSpital = new MedicamentSpital("teraflu",67.2f);

        vindeMedicament(medicamentFarmacie);
//        vindeMedicament(medicamentSpital);
        AdapterMedicamente adapterMedicamente = new AdapterMedicamente(medicamentSpital);
        vindeMedicament(adapterMedicamente);
    }
}