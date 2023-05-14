package decorator.model;

public class CardContactlessVirtual extends AbstractDecorator {

    public CardContactlessVirtual(ICard card) {
        super(card);
    }

    @Override
    public void payContactless(double sum) {
    System.out.println("S a facut plata contactless din cardul virtual cu suma de " + sum);
    }
}
