package builder.model;

public class Builder implements AbstractBuilder {
  private Reservation reservation = new Reservation(false, false, false, false, null);

  @Override
  public Reservation buildReservation() {
    return this.reservation;
  }

  @Override
  public AbstractBuilder setIsNearWindows(boolean isNearWindow) {
    this.reservation.setNearWindow(isNearWindow);
    return this;
  }

  @Override
  public AbstractBuilder setIsErgoChairs(boolean ergoChairs) {
    this.reservation.setErgoChairs(ergoChairs);
    return this;
  }

  @Override
  public AbstractBuilder setIsDecoratedTable(boolean decoratedTable) {
    this.reservation.setDecoratedTable(decoratedTable);
    return this;
  }

  @Override
  public AbstractBuilder setIsAmbientalMusic(boolean isAmbientalMusic) {
    this.reservation.setAmbientalMusic(isAmbientalMusic);
    return this;
  }

  @Override
  public AbstractBuilder setMusicGenre(String musicGenre) {
    this.reservation.setMusicGenre(musicGenre);
    return this;
  }


}
