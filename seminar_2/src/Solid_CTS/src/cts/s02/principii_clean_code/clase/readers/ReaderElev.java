package Solid_CTS.src.cts.s02.principii_clean_code.clase.readers;

import Solid_CTS.src.cts.s02.principii_clean_code.clase.Aplicant;
import Solid_CTS.src.cts.s02.principii_clean_code.clase.Elev;
import Solid_CTS.src.cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderElev extends ReaderAplicant {

    @Override
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input2.hasNext()) {
            Elev elev=new Elev();
            super.readFromFile(input2,elev);
            elev.setTutore(input2.next());
            elev.setClasa(input2.nextInt());
            studenti.add(elev);
        }

        input2.close();
        return studenti;
    }
}
