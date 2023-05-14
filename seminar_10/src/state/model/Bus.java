package state.model;

public class Bus {
  private IBusState state;
  private String licensePlate;

  public Bus(String licensePlate) {
    this.state = new InEndOfRoute();
    this.licensePlate = licensePlate;
  }

  public IBusState getState() {
    return state;
  }

  void setState(IBusState state) {
    this.state = state;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void pleacaInCursa() {
    IBusState route = new InCursa();
    route.changeState(this);
  }

  public void pleacaInService() {
    IBusState route = new InService();
    route.changeState(this);
  }

  public void pleacaLaFinalTheRuta() {
    IBusState route = new InEndOfRoute();
    route.changeState(this);
  }

}
