package object_adapter.main;

import class_adapter.model_existent.Credit;
import class_adapter.model_existent.CreditIpotecat;
import class_adapter.new_framework.CreditLeasing;
import object_adapter.model_nou.CreditAdapterObject;

public class MainClassAdapter {
  static void afiseazaCredit(Credit credit, int sum) {
    credit.oferaCredit(sum);
  }

  public static void main(String[] args) {
    Credit creditIpotecat = new CreditIpotecat();
    afiseazaCredit(creditIpotecat, 100);
    CreditLeasing leasing = new CreditLeasing();
    afiseazaCredit(new CreditAdapterObject(leasing), 500);
  }
}
