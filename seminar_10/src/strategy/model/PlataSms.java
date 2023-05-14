package strategy.model;

public class PlataSms implements TipPlata {
  @Override
  public void plateste(double pretBilet) {
    System.out.println(
        String.format(
            "Plata biletului in valoare de %f a fost efectuata cu card sms", pretBilet));
  }
}
