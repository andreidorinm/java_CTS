package state.model;

import command.model.Autobuz;

public class InService implements IBusState {
  @Override
  public void changeState(Bus autobuz) {
    if (autobuz.getState() instanceof InEndOfRoute) {
      System.out.println(
          String.format("The bus %s started goin to the service", autobuz.getLicensePlate()));
    } else {
      System.out.println(String.format("The %s cannot go to the service", autobuz.getLicensePlate()));
    }
  }
}
