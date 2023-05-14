package strategy.main;

import strategy.model.Calator;
import strategy.model.PlataCardBancar;
import strategy.model.PlataSms;

public class Main {
    public static void main(String[] args){
        Calator calator = new Calator("Alex Meran");
        calator.platesteBilet(30);
    calator.setMetodaPlata(new PlataCardBancar());
    calator.platesteBilet(45);
    calator.setMetodaPlata(new PlataSms());
    calator.platesteBilet(40);
    }
}
