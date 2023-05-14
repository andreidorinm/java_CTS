package flyweight.models;

public class Client implements IClient {

  private String nume;
  private String nrTelefon;
  private String email;

  public Client(String nume, String nrTelefon, String email) {
    this.nume = nume;
    this.nrTelefon = nrTelefon;
    this.email = email;
  }

  @Override
  public void afiseazaDetaliiRezervare(Rezervare rezervare) {
    System.out.println(
        String.format(
            "%s cu numarul de telefon %s si emailul %s a rezervat masa %d pentru %d la ora %s",
            this.nume,
            this.nrTelefon,
            this.email,
            rezervare.getNrMasa(),
            rezervare.getNrPersoane(),
            rezervare.getOra()));
  }
}
