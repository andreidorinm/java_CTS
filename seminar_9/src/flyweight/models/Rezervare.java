package flyweight.models;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private String ora;

    public Rezervare(int nrMasa, int nrPersoane, String ora) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", ora='" + ora + '\'' +
                '}';
    }
}
