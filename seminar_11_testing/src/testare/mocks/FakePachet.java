package testare.mocks;

import testare.model.IPachet;

public class FakePachet implements IPachet {
  private Double specialPrice;

  @Override
  public boolean poateRezerva() {
    return false;
  }

  @Override
  public void aplicaDiscountVarstnici(int procent) {}

  public void setSpecialPrice(Double specialPrice) {
    this.specialPrice = specialPrice;
  }

  @Override
  public Double getPret() {
    return specialPrice;
  }
}
