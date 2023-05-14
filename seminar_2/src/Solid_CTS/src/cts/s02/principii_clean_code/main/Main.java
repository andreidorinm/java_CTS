package Solid_CTS.src.cts.s02.principii_clean_code.main;

import Solid_CTS.src.cts.s02.principii_clean_code.clase.Angajat;
import Solid_CTS.src.cts.s02.principii_clean_code.clase.Aplicant;
import Solid_CTS.src.cts.s02.principii_clean_code.clase.readers.ReaderAngajat;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        ReaderAngajat readerAngajat=new ReaderAngajat();
        try {
            listaAngajati = readerAngajat.readAplicants("angajati.txt");
            for(Aplicant angajat:listaAngajati){
                System.out.println(angajat.toString());
                //angajat
                angajat.afisareaFinantarii();
                angajat.afisareStatut();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
