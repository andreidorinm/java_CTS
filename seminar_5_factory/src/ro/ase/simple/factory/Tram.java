package ro.ase.simple.factory;

public class Tram implements ITransportVehicle{
    private int noSeats;

    public Tram(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void showInfo() {
        System.out.println("The tram has " + noSeats + " spots");
    }

    @Override
    public void movingType() {
        System.out.println("Tram is moving by rails");
    }

}
