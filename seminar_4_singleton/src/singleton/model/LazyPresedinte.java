package singleton.model;

public class LazyPresedinte {
    //aici implementez aceeasi clasa dar cu lazy loading
    private String nume;
    private int nrMandat;
    private float nrVoturi;

    private static LazyPresedinte instance = null;

    public LazyPresedinte(String nume, int nrMandat) {
        this.nume = nume;
        this.nrMandat = nrMandat;
    }

    public static LazyPresedinte getInstance(String nume){
        if(instance == null){
            instance = new LazyPresedinte(nume, 1);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "LazyPresedinte{" +
                "nume='" + nume + '\'' +
                ", nrMandat=" + nrMandat +
                ", nrVoturi=" + nrVoturi +
                '}';
    }
}
