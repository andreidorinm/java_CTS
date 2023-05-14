package builder.model;

public class BuilderV2 implements AbstractBuilder {
    private boolean isNearWindow;
    private boolean isErgoChairs;

    private boolean isDecoratedTable;
    private boolean isAmbientalMusic;
    private String musicGenre;

    @Override
    public Reservation buildReservation() {
        return new Reservation(isNearWindow, isErgoChairs, isDecoratedTable, isAmbientalMusic, musicGenre);
    }

    @Override
    public AbstractBuilder setIsNearWindows(boolean isNearWindow) {
       this.isNearWindow = isNearWindow;
       return this;
    }

    @Override
    public AbstractBuilder setIsErgoChairs(boolean ergoChairs) {
        this.isErgoChairs = ergoChairs;
        return this;
    }

    @Override
    public AbstractBuilder setIsDecoratedTable(boolean decoratedTable) {
        this.isDecoratedTable = decoratedTable;
        return this;
    }

    @Override
    public AbstractBuilder setIsAmbientalMusic(boolean isAmbientalMusic) {
        this.isAmbientalMusic = isAmbientalMusic;
        return this;
    }

    @Override
    public AbstractBuilder setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
        return this;
    }
}
