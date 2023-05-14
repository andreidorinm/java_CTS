package ro.ase.simple.factory;

public class Bus implements ITransportVehicle{

    private int noSeats;

    public Bus(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void movingType() {
    System.out.println("Bus is moving by wheels");
    }

    @Override
    public void showInfo() {
    System.out.println("The bus has " + noSeats + " spots");
    }
}
