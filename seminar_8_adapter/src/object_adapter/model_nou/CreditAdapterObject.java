package object_adapter.model_nou;

import class_adapter.model_existent.Credit;
import class_adapter.new_framework.CreditLeasing;

public class CreditAdapterObject implements Credit {

  private CreditLeasing creditLeasing;

  public CreditAdapterObject(CreditLeasing creditLeasing) {
    this.creditLeasing = creditLeasing;
  }

  @Override
  public void oferaCredit(int suma) {
      this.creditLeasing.oferaLeasing(suma);
  }
}
