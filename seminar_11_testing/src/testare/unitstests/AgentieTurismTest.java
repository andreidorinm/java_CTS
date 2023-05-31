package testare.unitstests;

import org.junit.Test;
import testare.mocks.FakePachet;
import testare.model.AgentieTurism;

import static org.junit.Assert.*;

public class AgentieTurismTest {
  @Test
  public void shouldReturnExpectedPrice() {
    AgentieTurism agentieTurism = new AgentieTurism();

    FakePachet fakePachet1 = new FakePachet();
    fakePachet1.setSpecialPrice(100.0);
    FakePachet fakePachet2 = new FakePachet();
    fakePachet2.setSpecialPrice(200.0);
    FakePachet fakePachet3 = new FakePachet();
    fakePachet3.setSpecialPrice(60.0);

    agentieTurism.adaugaPachet(fakePachet1);
    agentieTurism.adaugaPachet(fakePachet2);
    agentieTurism.adaugaPachet(fakePachet3);

    assertEquals(360.0, agentieTurism.calculareSumaTotalaPachete(),0.1);
  }
}
