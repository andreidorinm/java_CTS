package singletonegistry.model;

import java.util.HashMap;
import java.util.Map;

public class CasaDeCopii {

    private String nume;
    private int anInfiintare;
    private int nrCopii;
    private static Map<String, CasaDeCopii> caseCopii = new HashMap<>();

    private CasaDeCopii(String nume, int anInfiintare, int nrCopii) {
        this.nume = nume;
        this.anInfiintare = anInfiintare;
        this.nrCopii = nrCopii;
    }

    public synchronized static CasaDeCopii getCasaDeCopii(String numeCasaDeCopii){
        if(!caseCopii.containsKey(numeCasaDeCopii)){
            CasaDeCopii casa = new CasaDeCopii(numeCasaDeCopii, 2023, 0);
            caseCopii.put(numeCasaDeCopii, casa);
        }
        return caseCopii.get(numeCasaDeCopii);
    }

    public void trimiteCopilLaOrfelinat(){
        this.nrCopii++;
    }

    @Override
    public String toString() {
        return "CasaDeCopii{" +
                "nume='" + nume + '\'' +
                ", anInfiintare=" + anInfiintare +
                ", nrCopii=" + nrCopii +
                '}';
    }
}
