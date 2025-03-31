package ro.cts.main;

import ro.cts.clase.factory.FabricaPersonalMedical;
import ro.cts.clase.factory.FabricaPersonalNonMedical;
import ro.cts.clase.model.AbstractPersonal;
import ro.cts.clase.personalMedical.PersonalMedical;
import ro.cts.clase.personalNonMedical.PersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FabricaPersonalMedical fabricaPersonalMedical = new FabricaPersonalMedical(true, true,
                false);

        AbstractPersonal medic = fabricaPersonalMedical.getPersonal(PersonalMedical.MEDIC,
                "Rauh Andrei", 1234567890, "25.09.2002");
        AbstractPersonal asistent = fabricaPersonalMedical.getPersonal(PersonalMedical.ASISTENT,
                "Rusu Vadim", 1234567891, "05.03.2022");

        System.out.println(medic);
        System.out.println(asistent);

        FabricaPersonalNonMedical fabricaPersonalNonMedical = new FabricaPersonalNonMedical(false,
                false);

        AbstractPersonal secretar = fabricaPersonalNonMedical.getPersonal(PersonalNonMedical.SECRETAR,
                "Vasile Ganganu", 1234567892,  "27.01.2017");
        AbstractPersonal registrator = fabricaPersonalNonMedical.getPersonal(PersonalNonMedical.REGISTRATOR,
                "Ion Varanita", 1234567893, "07.11.2011");

        System.out.println(secretar);
        System.out.println(registrator);

    }
}