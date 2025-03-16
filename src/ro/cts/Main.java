package ro.cts;

import ro.cts.readere.AngajatiReader;
import ro.cts.readere.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        AplicantReader aplicantReader = new AngajatiReader();

        try {
            listaAplicanti = aplicantReader.readAplicanti("angajati.txt");
            for (Aplicant aplicant : listaAplicanti) {
                System.out.println(aplicant.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
