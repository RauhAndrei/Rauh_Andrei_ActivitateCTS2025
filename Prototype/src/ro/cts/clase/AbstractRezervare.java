package ro.cts.clase;

public abstract class AbstractRezervare {
    protected int nrParticipanti;
    protected int ora;
    protected String numeClient;
    protected int ziuaLunii;

    public AbstractRezervare() {
        this.nrParticipanti = 5;
        this.numeClient = "Vasile";
        this.ora = 15;
        this.ziuaLunii = 5;
    }

    public AbstractRezervare(int nrParticipanti, int ora, String numeClient, int ziuaLunii) {
        this.nrParticipanti = (nrParticipanti < 2) ? 2 : nrParticipanti;
        this.ora = (ora >= 10 && ora <= 22) ? ora : 12;
        this.numeClient = (numeClient.length() > 2) ? numeClient : "Anonim";
        this.ziuaLunii = (ziuaLunii > 1 && ziuaLunii < 31) ? ziuaLunii : 1;
    }

    public abstract AbstractRezervare copiaza(int ziua);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRezervare{");
        sb.append("nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }
}
