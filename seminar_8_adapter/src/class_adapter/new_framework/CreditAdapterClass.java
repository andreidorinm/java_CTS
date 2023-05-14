package class_adapter.new_framework;

import class_adapter.model_existent.Credit;

public class CreditAdapterClass extends CreditLeasing implements Credit {
  @Override
  public void oferaCredit(int suma) {
    super.oferaLeasing(suma);
  }
}
