package ro.cts.main;

import registry.Autoritate;
import registry.Reglementare;

public class MainRegistry {

    public static void main(String[] args) {
        Autoritate autoritate = Autoritate.getInstance("Autoritate", "www.autoritate.ro");
        Reglementare reglementare1 = autoritate.reglementeazaModel("Dacia Logan");
        Reglementare reglementare2 = autoritate.reglementeazaModel("Tesla Cybertruck");

        System.out.println(reglementare1);
        System.out.println(reglementare2);

        Reglementare reglementare3 = autoritate.reglementeazaModel("Dacia Logan");
        System.out.println(reglementare3);//nrReglementare = 1 pt ca avem deja dacia logan. dc avem 3 insemna ca nu am facut cv corect


        Autoritate autoritate1 = Autoritate.getInstance("Autoritate new", "www.new_autoritate.ro");
        System.out.println(autoritate);
        System.out.println(autoritate1);//nu se schimba denumirea pt ca e singleton






    }

}

//la test nu o sa fie scris eager thread safe etc,
//dc putem avea in acelasi timp 2 obiecte cu denumiri diferite, nu trb sa fie 2 obiecte identice dc folosim singleton -  singleton-ul este aplicat doar pentru clasa Autoritate