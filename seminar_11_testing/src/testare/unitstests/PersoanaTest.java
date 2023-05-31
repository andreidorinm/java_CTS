package testare.unitstests;

import org.junit.Test;
import testare.NenascutException;
import testare.model.Persoana;

import static org.junit.Assert.*;

public class PersoanaTest {
  @Test
  public void testGetVarsta()  {
    Persoana persoana = new Persoana("Alexandru", "5010728410028");
    assertEquals(21, persoana.getVarsta());
  }
  @Test(expected = NenascutException.class)
  public void testGetVarstaError()  {
    Persoana persoana =
            new Persoana("Gigel", "62305245695954");
    persoana.getVarsta();
  }
}
