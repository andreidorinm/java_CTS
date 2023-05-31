package state.model;

import command.model.Autobuz;

public class InCursa implements IBusState {
  @Override
  public void changeState(Bus autobuz) {
    if (autobuz.getState() instanceof InEndOfRoute) {
      System.out.println(
          String.format("The bus %s has left for a new route", autobuz.getLicensePlate()));
      autobuz.setState(this);
    } else {
      System.out.println(
          String.format("The bus %s cannot go for a new route", autobuz.getLicensePlate()));
    }
  }
}
