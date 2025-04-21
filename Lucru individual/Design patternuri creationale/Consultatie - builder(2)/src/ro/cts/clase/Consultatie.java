package ro.cts.clase;

public class Consultatie {
//    detartraj, albire dentară, radiografie panoramică, consultație cu specialist ortodont
    private String numeClient;
    private String data;
    private String ora;
    private boolean areDetartraj;
    private boolean areAlbire;
    private boolean areRadiografie;
    private boolean areConsultatieOrtodont;

    protected Consultatie() {
        this.numeClient = "nu are";
        this.data = "nu are";
        this.ora = "nu are";
        this.areDetartraj = false;
        this.areAlbire = false;
        this.areRadiografie = false;
        this.areConsultatieOrtodont = false;
    }

    protected Consultatie(String numeClient, String data, String ora, boolean areDetartraj,
                       boolean areAlbire, boolean areRadiografie, boolean areConsultatieOrtodont) {
        this.numeClient = numeClient;
        this.data = data;
        this.ora = ora;
        this.areDetartraj = areDetartraj;
        this.areAlbire = areAlbire;
        this.areRadiografie = areRadiografie;
        this.areConsultatieOrtodont = areConsultatieOrtodont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Consultatie{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", ora='").append(ora).append('\'');
        sb.append(", areDetartraj=").append(areDetartraj);
        sb.append(", areAlbire=").append(areAlbire);
        sb.append(", areRadiografie=").append(areRadiografie);
        sb.append(", areConsultatieOrtodont=").append(areConsultatieOrtodont);
        sb.append('}');
        return sb.toString();
    }
}
