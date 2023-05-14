package builder.main;

import builder.model.Builder;
import builder.model.BuilderV2;
import builder.model.Reservation;

public class Main {
  public static void main(String[] args) {
    Reservation reservation =
        new Builder()
            .setIsNearWindows(true)
            .setIsAmbientalMusic(true)
            .setIsDecoratedTable(true)
            .setIsErgoChairs(true)
            .setMusicGenre("MANELE")
            .buildReservation();

    System.out.println(reservation);
    Reservation r2 =
        new BuilderV2()
            .setIsNearWindows(true)
            .setIsAmbientalMusic(true)
            .setIsDecoratedTable(true)
            .setIsErgoChairs(false)
            .setMusicGenre("ROK")
            .buildReservation();
    System.out.println(r2);
  }
}
