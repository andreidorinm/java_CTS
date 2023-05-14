package singletonegistry.model;

import java.util.HashMap;
import java.util.Map;

public class Firma {
    private String nume;
    private int cifraAfaceri;
    private int nrAngajati;

    private static Map<String, Firma> firme= new HashMap<>();

    private Firma(String nume, int cifraAfaceri, int nrAngajati) {
        this.nume = nume;
        this.cifraAfaceri = cifraAfaceri;
        this.nrAngajati = nrAngajati;
    }

    public void angajare(){
        this.nrAngajati++;
    }

    public synchronized static Firma getFirma(String numeFirma){
        if(!firme.containsKey(numeFirma)){
            Firma firma = new Firma(numeFirma, 0,0);
            firme.put(numeFirma, firma);
            return firma;
        }
        return firme.get(numeFirma);
    }

    @Override
    public String toString() {
        return "Firma{" +
                "nume='" + nume + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                ", nrAngajati=" + nrAngajati +
                '}';
    }
}
