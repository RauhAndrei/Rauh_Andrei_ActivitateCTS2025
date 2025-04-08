package ro.cts.clase;

public class BuilderConsultatie implements IBuilder {
    private String numeClient;
    private String data;
    private String ora;
    private boolean areDetartraj;
    private boolean areAlbire;
    private boolean areRadiografie;
    private boolean areConsultatieOrtodont;

    public BuilderConsultatie() {
        this.numeClient = "nu are";
        this.data = "nu are";
        this.ora = "nu are";
        this.areDetartraj = false;
        this.areAlbire = false;
        this.areRadiografie = false;
        this.areConsultatieOrtodont = false;
    }

    public BuilderConsultatie setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public BuilderConsultatie setData(String data) {
        this.data = data;
        return this;

    }

    public BuilderConsultatie setOra(String ora) {
        this.ora = ora;
        return this;

    }

    public BuilderConsultatie setAreDetartraj(boolean areDetartraj) {
        this.areDetartraj = areDetartraj;
        return this;

    }

    public BuilderConsultatie setAreAlbire(boolean areAlbire) {
        this.areAlbire = areAlbire;
        return this;

    }

    public BuilderConsultatie setAreRadiografie(boolean areRadiografie) {
        this.areRadiografie = areRadiografie;
        return this;

    }

    public BuilderConsultatie setAreConsultatieOrtodont(boolean areConsultatieOrtodont) {
        this.areConsultatieOrtodont = areConsultatieOrtodont;
        return this;

    }

    @Override
    public Consultatie creeazaConsultatie(String numeClient, String data, String ora) {
        return new Consultatie(numeClient, data, ora, areDetartraj, areAlbire, areRadiografie, areConsultatieOrtodont);
    }


}
