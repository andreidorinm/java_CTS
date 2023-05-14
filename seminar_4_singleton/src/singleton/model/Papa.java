package singleton.model;

public class Papa {
    private static Papa papa = new Papa("Benedict", 20, 276);
    private String nume;
    private int nrAniFunctie;
    private int alCatelea;

    private Papa(String nume, int nrAniFunctie, int alCatelea) {
        this.nume = nume;
        this.nrAniFunctie = nrAniFunctie;
        this.alCatelea = alCatelea;
    }

    public static Papa getInstance(){
        //eager initialization
        return papa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrAniFunctie() {
        return nrAniFunctie;
    }

    public void setNrAniFunctie(int nrAniFunctie) {
        this.nrAniFunctie = nrAniFunctie;
    }

    public int getAlCatelea() {
        return alCatelea;
    }

    public void setAlCatelea(int alCatelea) {
        this.alCatelea = alCatelea;
    }

    @Override
    public String toString() {
        return "Papa{" +
                "nume='" + nume + '\'' +
                ", nrAniFunctie=" + nrAniFunctie +
                ", alCatelea=" + alCatelea +
                '}';
    }
}
