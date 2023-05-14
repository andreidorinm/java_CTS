package decorator.main;

import decorator.model.*;

public class DecoratorMain {
  public static void main(String[] args) {
    ICard card1 = new Card();
    card1.payOnline(1000);
    card1.payPos(1050);
    AbstractDecorator card = new CardContactless(card1);
    card.payContactless(1000);
    AbstractDecorator decoratorVirtual = new CardContactlessVirtual(card1);
    decoratorVirtual.payContactless(100);
  }
}
