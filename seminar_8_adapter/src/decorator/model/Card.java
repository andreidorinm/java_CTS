package decorator.model;

public class Card implements ICard {

  @Override
  public void payOnline(double sum) {
    System.out.println("Plata online in valoare de" + sum + " a fost platita");
  }

  @Override
  public void payPos(double sum) {
    System.out.println("Plata pos in valoare de " + sum + " a fost platita");
  }
}
