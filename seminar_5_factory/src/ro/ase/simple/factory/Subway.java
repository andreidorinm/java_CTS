package ro.ase.simple.factory;

public class Subway implements ITransportVehicle{
    private int noSeats;

    public Subway(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void movingType() {
    System.out.println("subway goes underground");
    }

    @Override
    public void showInfo() {
        System.out.println("Subway has " + noSeats + " number of seats");

    }
}
