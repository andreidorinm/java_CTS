package ro.ase.simple.factory;

public class Trolley implements ITransportVehicle{

    private int noSeats;

    public Trolley(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void showInfo() {
        System.out.println("The trolley has " + noSeats + " spots");
    }

    @Override
    public void movingType() {
        System.out.println("Trolley is electric");
    }
}
