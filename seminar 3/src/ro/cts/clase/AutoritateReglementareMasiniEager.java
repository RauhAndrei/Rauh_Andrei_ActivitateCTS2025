package ro.cts.clase;

public class AutoritateReglementareMasiniEager {
    private String nume;
    private String webSite;
    private int nrReglementari;
    private static AutoritateReglementareMasiniEager instance =
            new AutoritateReglementareMasiniEager("Autoritate Auto", "ww.autoritate.ro", 200);
    //init la momentul declararii - eager init

    public AutoritateReglementareMasiniEager() {
    }

    public AutoritateReglementareMasiniEager(String nume, String webSite, int nrReglementari) {
        this.nume = nume;
        this.webSite = webSite;
        this.nrReglementari = nrReglementari;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public static AutoritateReglementareMasiniEager getInstance() {
        return instance;
    }

    public static void setInstance(AutoritateReglementareMasiniEager instance) {
        AutoritateReglementareMasiniEager.instance = instance;
    }

    public void reglementeazaModel(String name) {
        nrReglementari++;
    }

    @Override
    public String toString() {
        return "AutoitateReglementareMasiniEager{" +
                "nume='" + nume + '\'' +
                ", webSite='" + webSite + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
