package Solid_CTS.src.cts.s02.principii_clean_code.clase.readers;

import Solid_CTS.src.cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {
    public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;
    public void readFromFile(Scanner input2,Aplicant aplicant)
    {
        aplicant.setNume(input2.next());
        aplicant.setPrenume(input2.next());
        aplicant.setVarsta(Integer.valueOf(input2.nextInt()));
        aplicant.setPunctaj(Integer.valueOf(input2.nextInt()));
        aplicant.setNr_proiecte(Integer.valueOf(input2.nextInt()));
        String[] vect = new String[5];
        for (int i = 0; i < aplicant.getNr_proiecte(); i++){
            vect[i] = input2.next();
            aplicant.setDenumireProiect(vect);
        }

    }
}
