package ro.cts.readere;

import ro.cts.Angajat;
import ro.cts.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader {

    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (scanner.hasNext()) {
            Angajat angajat = new Angajat();
            //ce face aceasta fct super - citeste datele din txt cu angajati, facem asta ca sa nu suprascriem acel cod in fiecare reader
            // e oblig sa scriem super ca sa o folosim? - nu, facem asta ca sa intelegem ca e fct din clasa de baza
            super.readAplicant(scanner, angajat);
            int salariu = scanner.nextInt();
            angajat.setSalariu(salariu);
            String ocupatie = scanner.next();
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
            //dc am folosit setteri, nu puteam sa introducem aceste date prin constructor? - nu pt ca obiectul s a trimis deja mai sus
        }
        scanner.close();
        return angajati;
    }

}
