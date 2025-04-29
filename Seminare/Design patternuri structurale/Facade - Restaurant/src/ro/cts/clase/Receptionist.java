package ro.cts.clase;

public class Receptionist {

    public String poateLuaLocLaMasa(Masa masa) {
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if (masa.isEsteLibera()) {
            if (picolo.esteDebarasata(masa)) {
                if (ospatar.esteAranjata(masa)) {
                    return "Va rog luati loc la masa " + masa.getNrMasa();
                } else {
                    return "Asteptati un pic sa aranjam masa";
                }
            } else {
                return "Asteptati putin acum debarasam masa";
            }
        } else {
            return "Masa este deja ocupata!";
        }
    }
}