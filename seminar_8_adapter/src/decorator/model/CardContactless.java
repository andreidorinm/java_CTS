package decorator.model;

public class CardContactless extends AbstractDecorator {

    public CardContactless(ICard card) {
        super(card);
    }

    @Override
    public void payContactless(double sum) {
    System.out.println("S a platit contactless suma de " + sum + " lei" );
    }
}
