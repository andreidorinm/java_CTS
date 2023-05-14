package observer.main;

import observer.models.Client;
import observer.models.IClient;
import observer.models.IRestaurant;
import observer.models.Restaurant;

public class ObserverMain {
  public static void main(String[] args){
      IClient client = new Client("Alex");
      IClient client1 = new Client("Yarina");
      IClient client3 = new Client("Rares");

      Restaurant restaurant = new Restaurant("Casa Buna");
      restaurant.adaugareDiscount(10);
      restaurant.abonareClient(client);
      restaurant.adaugaMeniuNou();

      restaurant.abonareClient(client1);
      restaurant.abonareClient(client3);
      restaurant.dezabonareClient(client1);
      restaurant.adaugareDiscount(40);

  }
}
