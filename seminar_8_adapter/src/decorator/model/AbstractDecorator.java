package decorator.model;

public abstract class AbstractDecorator implements ICard{
    private ICard card;

    public AbstractDecorator(ICard card) {
        this.card = card;
    }

    public abstract void payContactless(double sum);


    @Override
    public void payOnline(double sum) {
        card.payOnline(sum);
    }

    @Override
    public void payPos(double sum) {
        card.payPos(sum);
    }
}
