package ro.cts.main;

import ro.cts.clase.PersonalSpital;
import ro.cts.fabricaPersonalSpital.FabricaPersonalSpital;
import ro.cts.fabricaPersonalSpital.TipPersonalSpital;

public class Main {
    public static void main(String[] args) {
        FabricaPersonalSpital fabricaPersonalSpital = new FabricaPersonalSpital(false);
        PersonalSpital asistent = fabricaPersonalSpital.getPersonalSpital(TipPersonalSpital.ASISTENT, "asistent", "12345", 6);
        PersonalSpital medic = fabricaPersonalSpital.getPersonalSpital(TipPersonalSpital.ASISTENT, "medic", "123456", 2);
        PersonalSpital brancardier = fabricaPersonalSpital.getPersonalSpital(TipPersonalSpital.ASISTENT, "brancardier", "123457", 3);

        System.out.println(asistent);
        System.out.println(medic);
        System.out.println(brancardier);
//
    }
}