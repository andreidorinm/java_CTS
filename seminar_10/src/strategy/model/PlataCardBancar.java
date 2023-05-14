package strategy.model;

public class PlataCardBancar implements TipPlata{
    @Override
    public void plateste(double pretBilet) {
    System.out.println(String.format("Plata biletului in valoare de %f a fost efectuata cu card bancar", pretBilet));
    }
}
