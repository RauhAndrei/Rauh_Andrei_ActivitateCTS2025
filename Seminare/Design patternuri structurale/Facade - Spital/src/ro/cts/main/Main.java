package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic("Rauh Andrei", "chirurg", true);
        Pacient pacient = new Pacient("Popescu Dan", "1234567890111", true);
        Pacient pacient2 = new Pacient("Neagu Ion", "1234567890222", false);
        Salon salon = new Salon(0);

        InternareFacade internareFacade = new InternareFacade(medic, salon);
        internareFacade.interneazaPacient(pacient);
        System.out.println();
        internareFacade.interneazaPacient(pacient2);
    }
}