package singletonegistry;

import singletonegistry.model.CasaDeCopii;
import singletonegistry.model.Firma;

public class Main {
  public static void main(String[] args) {
    //
//    Firma firma = Firma.getFirma("SC ceva SRL");
//    Firma firma1 = Firma.getFirma("SC altceva SRL");
//    Firma firma2 = Firma.getFirma("SC ceva SRL");
//    firma.angajare();
//    firma1.angajare();
//    firma2.angajare();
//
//    System.out.println(firma);
//    System.out.println(firma1);
//    System.out.println(firma2);

    CasaDeCopii c1 = CasaDeCopii.getCasaDeCopii("Robin hood");
    CasaDeCopii c2 = CasaDeCopii.getCasaDeCopii("Casa copii1");
    CasaDeCopii c3 = CasaDeCopii.getCasaDeCopii("3");

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    c3.trimiteCopilLaOrfelinat();

    System.out.println(c3);
    CasaDeCopii c4 = CasaDeCopii.getCasaDeCopii("3");
    System.out.println(c4);
  }
}
