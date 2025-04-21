package ro.cts.main;

import ro.cts.clase.factory.MasiniFactory;
import ro.cts.clase.masina.AbstractMasina;
import ro.cts.clase.masina.TipMasina;
import ro.cts.clase.service.ServiceAuto;

public class Main {
    public static void main(String[] args) {

        MasiniFactory masiniElectriceFactory = new MasiniFactory("BMW", 5, "B 228 VOR",
                true, false, false);

        AbstractMasina masinaElectrica = masiniElectriceFactory.creeazaMasina(TipMasina.MASINA_ELECTRICA);
        System.out.println(masinaElectrica);

        ServiceAuto serviceAuto = ServiceAuto.getInstance("Service SRL", true, 250);
        serviceAuto.repara(masinaElectrica);

        MasiniFactory suvFactory = new MasiniFactory("Rolls Royce Cullinam", 5, "B 777 AUE",
                false, true, false);

        AbstractMasina masinaSuv = suvFactory.creeazaMasina(TipMasina.SUV);
        System.out.println(masinaSuv);


        MasiniFactory vanFactory = new MasiniFactory("Mercedes", 5, "B 999 KOT",
                false, false, true);

        AbstractMasina masinaVan = vanFactory.creeazaMasina(TipMasina.VAN);
        System.out.println(masinaVan);
    }
}