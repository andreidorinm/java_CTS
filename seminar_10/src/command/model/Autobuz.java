package command.model;

public class Autobuz implements IAutomobil {

  private int numar;

  public Autobuz(int numar) {
    this.numar = numar;
  }

  @Override
  public void plecareInCursa(int linia) {
    System.out.println(
        String.format("Autobuzul %d a plecat in cursa pe linia numar %s", numar, linia));
  }
}
