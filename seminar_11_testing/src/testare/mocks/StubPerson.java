package testare.mocks;

import testare.NenascutException;
import testare.model.IPersoana;

public class StubPerson implements IPersoana {
  @Override
  public String getSex() {
    return "M";
  }

  @Override
  public int getVarsta() throws NenascutException {
    return 21;
  }

  @Override
  public boolean checkCNP() {
    return true;
  }
}
