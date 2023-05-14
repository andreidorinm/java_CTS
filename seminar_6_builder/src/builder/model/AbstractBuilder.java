package builder.model;

public interface AbstractBuilder {
    public  Reservation buildReservation();

    public AbstractBuilder setIsNearWindows(boolean isNearWindow);

    public AbstractBuilder setIsErgoChairs(boolean ergoChairs);

    public AbstractBuilder setIsDecoratedTable(boolean decoratedTable);

    public AbstractBuilder setIsAmbientalMusic(boolean isAmbientalMusic);

    public AbstractBuilder setMusicGenre(String musicGenre);

}
