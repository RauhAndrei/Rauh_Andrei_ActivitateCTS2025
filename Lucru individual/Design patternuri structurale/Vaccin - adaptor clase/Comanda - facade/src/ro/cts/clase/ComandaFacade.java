package ro.cts.clase;

public class ComandaFacade {
    Stoc stoc;
    Plata plata;

    public ComandaFacade(Stoc stoc, Plata plata) {
        this.stoc = stoc;
        this.plata = plata;
    }

    public void faceComanda(Utilizator utilizator) {

        if (!stoc.esteInStoc()) {
            System.out.println("Din pacate acest produs nu este in stoc");
            return;
        }

        if (!plata.isEsteMetPlataValida()) {
            System.out.println("Din pacata aceasta metoda de plata nu este valida!");
            return;
        }

        if (!utilizator.isAreAdresaCompleta() || !utilizator.isEsteAutentificat()) {
            System.out.println("Din pacate utilizatorul nu este autentificat!");
            return;
        }

        stoc.scadeStoc();
        System.out.println("Comanda a fost facuta cu succes!");

    }

}
