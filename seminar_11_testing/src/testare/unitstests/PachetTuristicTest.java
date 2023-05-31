package testare.unitstests;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.mocks.StubMinor;
import testare.mocks.StubPerson;
import testare.model.IPersoana;
import testare.model.PachetTuristic;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PachetTuristicTest {
  @Test
  public void poate_Rezerva() {
    final IPersoana stub = new StubPerson();
    PachetTuristic pachetTuristic = new PachetTuristic(stub, "Tenerife", 1200.0);
    assertTrue(pachetTuristic.poateRezerva());
  }

  @Test
  public void nuPoate_Rezerva() {
    final IPersoana stubMinor = new StubMinor();
    PachetTuristic pachetTuristic = new PachetTuristic(stubMinor, "Tenerife", 1200.0);
    assertFalse(pachetTuristic.poateRezerva());
  }

  private int getValoare() {
    return 10;
  }

  private boolean getBoolean() {
    return true;
  }

  private List<Object> getLista() {
    List<Object> objects = new ArrayList<>();
    objects.add(Integer.valueOf(10));
    return objects;
  }

  private List<Object> getListaNull(){
    return null;
  }

  @Test
  public void testDemonstrativ() {
    assertEquals(10, getValoare());
    assertTrue(getBoolean());
    assertFalse(!getBoolean());
    assertNotNull(getLista());
    assertNull(getListaNull());
  }
}
