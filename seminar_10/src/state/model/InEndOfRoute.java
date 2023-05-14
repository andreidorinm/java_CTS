package state.model;

import command.model.Autobuz;

public class InEndOfRoute implements IBusState {

    @Override
    public void changeState(Bus autobuz) {
        if (autobuz.getState() instanceof InEndOfRoute || autobuz.getState() instanceof InService) {
            System.out.println(
                    String.format("The bus %s had reached the end of line", autobuz.getLicensePlate()));
            autobuz.setState(this);
        }
        else {
            System.out.println(String.format("Bus %s cannot reach end of the line", autobuz.getLicensePlate()));
        }
    }
}
