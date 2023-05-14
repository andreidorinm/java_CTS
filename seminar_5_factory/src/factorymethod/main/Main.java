package factorymethod.main;

import factorymethod.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory fBus = new BusFactory();
        Factory fTram = new TramFactory();
        Factory fTrolley = new TrolleyFactory();

        List<TransportVehicle> listaVehicule = new ArrayList<>();

        listaVehicule.add(fBus.createObject(10));
        listaVehicule.add(fTrolley.createObject(21));
        listaVehicule.add(fTram.createObject(45));

        Tram tram = (Tram) fTram.createObject(45);

        for(TransportVehicle tr : listaVehicule){
            tr.showInfo();
            tr.moveType();
        }
    }
}
