package ro.cts.clase;

public class RezervareInterior extends AbstractRezervare {
    private boolean esteLaParter;

    public RezervareInterior() {
        super();
    }

    public RezervareInterior(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteLaParter) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteLaParter = esteLaParter;
    }

    @Override
    public AbstractRezervare copiaza(int ziua) {
        RezervareInterior rezervare = new RezervareInterior();
        rezervare.ora = this.ora;
        rezervare.numeClient = this.numeClient;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.ziuaLunii = ziua;
        rezervare.esteLaParter = this.esteLaParter;
        return rezervare;
        //putem face cu setter e aceeasi chestie
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("esteLaParter=").append(esteLaParter);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}

//reconstruirea - apel constructor