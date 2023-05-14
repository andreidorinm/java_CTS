package observer.models;

public class Client implements IClient {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
    System.out.println(String.format("Domnule %s ati primit urmatoarea notificare : %s", nume, mesaj));
    }

    @Override
    public String getNume() {
        return null;
    }
}
