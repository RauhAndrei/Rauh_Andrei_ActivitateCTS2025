package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> paturiLibere = new ArrayList<>();
    private List<Integer> paturiOcupate = new ArrayList<>();

    public Salon(int nrTotalPaturi) {
        for (int i = 0; i < nrTotalPaturi; i++) {
            paturiLibere.add(i);
        }
    }

    public boolean existaPaturiLibere() {
        return !paturiLibere.isEmpty();
    }

    public void ocupaPat() {
        if (!paturiLibere.isEmpty()) {
            int pat = paturiLibere.remove(0);
            paturiOcupate.add(pat);
        }
    }



}
