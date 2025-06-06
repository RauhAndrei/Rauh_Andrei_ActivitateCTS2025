package ro.cts.readere;

import ro.cts.Aplicant;
import ro.cts.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader {

    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException, NumberFormatException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student student = new Student();
            super.readAplicant(scanner, student);
            int anStudii = scanner.nextInt();
            student.setAnStudii(anStudii);
            String facultate = (scanner.next()).toString();
            student.setFacultate(facultate);
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }



}
