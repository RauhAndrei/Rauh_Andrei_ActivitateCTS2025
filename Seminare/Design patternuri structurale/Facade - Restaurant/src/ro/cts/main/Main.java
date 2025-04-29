package ro.cts.main;

import ro.cts.clase.Masa;
import ro.cts.clase.Ospatar;
import ro.cts.clase.Picolo;
import ro.cts.clase.Receptionist;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(4, true, 20);
        Masa masa2 = new Masa(4, true, 23);

        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        //Folosim direct
        if (masa1.isEsteLibera()) {
            if (picolo.esteDebarasata(masa1)) {
                if (ospatar.esteAranjata(masa1)) {
                    System.out.println("Va rog luati loc la masa " + masa1.getNrMasa());
                } else {
                    System.out.println("Asteptati un pic sa aranjam masa");
                }
            } else {
                System.out.println("Asteptati putin acum debarasam masa");
            }
        } else {
            System.out.println("Masa este deja ocupata!");
        }


        //Folosim facade
        Receptionist receptionist = new Receptionist();
        System.out.println(receptionist.poateLuaLocLaMasa(masa1));
        System.out.println(receptionist.poateLuaLocLaMasa(masa2));

        Masa masa3 = new Masa(4, true, 4);
        System.out.println(receptionist.poateLuaLocLaMasa(masa3));

    }
}