package ro.cts.clase.factory;

import ro.cts.clase.masina.*;

public class MasiniFactory implements IFactory {

    private String marca;
    private int nrUsi;
    private String nrInmatriculare;

    private boolean areMotorElectric;
    private boolean este4x4;
    private boolean areBaie;


    public MasiniFactory(String marca, int nrUsi, String nrInmatriculare, boolean areMotorElectric,
                         boolean este4x4, boolean areBaie) {
        this.marca = marca;
        this.nrUsi = nrUsi;
        this.nrInmatriculare = nrInmatriculare;
        this.areMotorElectric = areMotorElectric;
        this.este4x4 = este4x4;
        this.areBaie = areBaie;
    }

    @Override
    public AbstractMasina creeazaMasina(TipMasina tipMasina) {
        switch (tipMasina) {
            case SUV -> {
                return new SUV(marca, nrUsi, nrInmatriculare, este4x4);
            }
            case VAN -> {
                return new VAN(marca, nrUsi, nrInmatriculare, areBaie);
            }
            case MASINA_ELECTRICA -> {
                return new MasinaElectrica(marca, nrUsi, nrInmatriculare, areMotorElectric);
            }
            default -> {
                return null;
            }
        }
    }
}
