package singleton.model;

public class Presedinte {
    private String nume;
    private int nrMandat;
    private float nrVoturi;

    private static Presedinte instance = new Presedinte("Traian Basexcu", 2, 52);
    private Presedinte(String nume, int nrMandat, float nrVoturi) {
        this.nume = nume;
        this.nrMandat = nrMandat;
        this.nrVoturi = nrVoturi;
    }

    public static Presedinte getInstance(){
        return instance;
    }
}
