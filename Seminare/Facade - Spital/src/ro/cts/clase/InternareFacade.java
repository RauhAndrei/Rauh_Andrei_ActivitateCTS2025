package ro.cts.clase;

public class InternareFacade {
    private Medic medic;
    private Salon salon;

    public InternareFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient) {
        if(!pacient.isEsteInStareGrava()) {
            System.out.println("Pacientul: " + pacient.getNumePrenume() + " nu este in stare grava!");
            return;
        }

        if (!medic.confirmareInternare(pacient)) {
            System.out.println("Medicul: " + medic.getNumePrenume() + " nu confirma internarea!");
            return;
        }

        if (!salon.existaPaturiLibere()) {
            System.out.println("Din pacate nu exista niciun pat liber!");
            return;
        }

        salon.ocupaPat();
        System.out.println("Pacientul:" + pacient.getNumePrenume() + " a fost internat cu succes!");
    }


}
