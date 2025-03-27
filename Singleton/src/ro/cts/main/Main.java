package ro.cts.main;

import ro.cts.clase.AutoritateReglementareMasiniEager;//aici se face obiectul pt ca e eager si obiectul e static
import ro.cts.clase.AutoritateReglementareMasiniLazy;

public class Main {
    public static void main(String[] args) {
        //nu inteleg cum e facut in cod ca facand obiecte noi sa primim aceeasi instanta - prin crearea obiectului in clasa static. Dacă variabila instance nu ar fi statică, ar fi recreată la fiecare apel al metodei getInstance(), ceea ce ar anula conceptul de Singleton.
        AutoritateReglementareMasiniEager autoritate = AutoritateReglementareMasiniEager.getInstance();
        System.out.println(autoritate);

        AutoritateReglementareMasiniEager autoritate2 = AutoritateReglementareMasiniEager.getInstance();
        autoritate2.setWebSite("site");
        System.out.println(autoritate2);
        System.out.println(autoritate);//se modifica denumirea siteului, il preia de la autoritate2

        autoritate.reglementeazaModel("Dacia Logan");
        System.out.println(autoritate);//se ad 1 la nrReglementari la ambele obiecte
        System.out.println(autoritate2);

        AutoritateReglementareMasiniLazy autoritateLazy = AutoritateReglementareMasiniLazy.getInstance("BMW", "site web");
        System.out.println(autoritateLazy);
        autoritateLazy.reglementeazaModel("BMW");

        AutoritateReglementareMasiniLazy autoritateLazy2 = AutoritateReglementareMasiniLazy.getInstance("Mercedes", "site web Mercedes");
        System.out.println(autoritateLazy2);

        autoritateLazy.setNume("nume nou");
        System.out.println(autoritateLazy);
        System.out.println(autoritateLazy2);

    }
}