package Sem_2.cts.s02.principii_clean_code.clase.reader;

import Sem_2.cts.s02.principii_clean_code.clase.Aplicant;

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
        int nr=Integer.valueOf(input2.nextInt());
        aplicant.setNr_proiecte(nr);
        String[] vect = new String[nr];
        for (int i = 0; i < aplicant.getNr_proiecte(); i++)
            vect[i] = input2.next();
    }
}
