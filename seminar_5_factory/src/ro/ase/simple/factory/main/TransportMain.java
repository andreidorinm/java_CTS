package ro.ase.simple.factory.main;

import ro.ase.simple.factory.ITransportVehicle;
import ro.ase.simple.factory.TransportType;
import ro.ase.simple.factory.VehicleFactory;

import java.util.List;
import java.util.stream.Collectors;

public class TransportMain {
  public static void main(String[] args) throws Exception {
      VehicleFactory factory = new VehicleFactory();
      ITransportVehicle bus = factory.createVehicle(TransportType.BUS, 20);
      ITransportVehicle tram = factory.createVehicle(TransportType.TRAM, 25);
      ITransportVehicle trolley = factory.createVehicle(TransportType.TROLLEY, 30);
      List<ITransportVehicle> vehicleList = List.of(bus, tram, trolley).stream().collect(Collectors.toList());
      vehicleList.add(factory.createVehicle(TransportType.TROLLEY, 40));
      vehicleList.add(factory.createVehicle(TransportType.SUBWAY, 50));
      for(ITransportVehicle vehicle: vehicleList){
          vehicle.showInfo();
      }
  }
}
