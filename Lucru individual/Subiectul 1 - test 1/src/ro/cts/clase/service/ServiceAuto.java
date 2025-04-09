package ro.cts.clase.service;

import ro.cts.clase.masina.AbstractMasina;

public class ServiceAuto implements IService {
    private String denumireService;
    private boolean esteDeschis;
    private int pretConsultatie;
    private static ServiceAuto instance = null;

    private ServiceAuto() {
    }

    private ServiceAuto(String denumireService, boolean esteDeschis, int pretConsultatie) {
        this.denumireService = denumireService;
        this.esteDeschis = esteDeschis;
        this.pretConsultatie = pretConsultatie;
    }

    public String getDenumireService() {
        return denumireService;
    }

    public void setDenumireService(String denumireService) {
        this.denumireService = denumireService;
    }

    public boolean isEsteDeschis() {
        return esteDeschis;
    }

    public void setEsteDeschis(boolean esteDeschis) {
        this.esteDeschis = esteDeschis;
    }

    public int getPretConsultatie() {
        return pretConsultatie;
    }

    public void setPretConsultatie(int pretConsultatie) {
        this.pretConsultatie = pretConsultatie;
    }

    public static ServiceAuto getInstance(String denumireService, boolean esteDeschis, int pretConsultatie) {
        if (instance == null) {
            instance = new ServiceAuto(denumireService, esteDeschis, pretConsultatie);
        }
        return instance;
    }

    @Override
    public void repara(AbstractMasina abstractMasina) {
        System.out.println("Masina " + abstractMasina.getMarca() + " se repara");
    }
}
