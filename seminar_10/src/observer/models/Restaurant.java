package observer.models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
  private String nume;
  private List<IClient> clienti;

  public Restaurant(String nume) {
    this.nume = nume;
    this.clienti = new ArrayList<>();
  }

  @Override
  public void abonareClient(IClient client) {
    clienti.add(client);
  }

  @Override
  public void dezabonareClient(IClient client) {
    clienti.remove(client);
  }

  @Override
  public void trimiteNotificare(String mesaj) {
    for (IClient c : clienti) {
      System.out.println("SAlUT " + c.getNume() + " Restaurantul " + nume + "iti trimite notificare : " + mesaj);
    }
  }
  public void adaugaMeniuNou(){
    trimiteNotificare("SALUT! AM ADAUGAT UN MENIU NOU");
  }
  public void adaugareDiscount(int discount){
    trimiteNotificare(String.format("SALUT! AM ADAUGAT UN DISCOUNT NOU de %d%% pentru toate produsele", discount));
  }
}
