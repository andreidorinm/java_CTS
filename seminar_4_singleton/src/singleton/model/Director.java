package singleton.model;

public class Director {
    private String name;
    private int varsta;
    private static Director director = null;

    private Director(String name, int varsta) {
        this.name = name;
        this.varsta = varsta;
    }
    public synchronized static Director getInstance(String nume){
        //lazy initialization
       if (director == null){
           director = new Director(nume, 30);
       }
       return director;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
