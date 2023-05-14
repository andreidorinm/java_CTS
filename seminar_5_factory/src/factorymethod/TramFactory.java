package factorymethod;

public class TramFactory implements Factory{
    @Override
    public TransportVehicle createObject(int noSeats) {
        return new Tram(noSeats);
    }
}
