package flyweight.main;

import flyweight.models.BazaDeDateClienti;
import flyweight.models.IClient;
import flyweight.models.Rezervare;

public class FlyWeightMain {
    public static void main(String[] args){
        BazaDeDateClienti bdC = new BazaDeDateClienti();
        Rezervare r1 = new Rezervare(1,2, "20:00");
        Rezervare r2 = new Rezervare(2,3, "16:00");
        Rezervare r3 = new Rezervare(3,4, "17:00");
        Rezervare r4 = new Rezervare(3,4, "18:00");

        IClient client = bdC.getClient("Ana", "07329327", "ana@mail.com");
        client.afiseazaDetaliiRezervare(r1);
        bdC.getClient("Alexandru", "072351668", "alex@mail.com").afiseazaDetaliiRezervare(r2);
        bdC.getClient("", "07329327", "").afiseazaDetaliiRezervare(r3);
        bdC.getClient("", "07329327", "").afiseazaDetaliiRezervare(r4);

    }
}
