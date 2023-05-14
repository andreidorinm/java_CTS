package state.main;

import state.model.Bus;

public class Main {
   public static void main(String[] args){
       Bus bus = new Bus("BL21BUN");
       bus.pleacaInService();
       bus.pleacaLaFinalTheRuta();
       bus.pleacaInCursa();
       bus.pleacaInService();
   }

}
