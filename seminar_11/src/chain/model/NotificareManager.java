package chain.model;

public class NotificareManager extends INotificare {

  public NotificareManager(INotificare nextNotificare) {
    super(nextNotificare);
  }

  @Override
  public void trimiteNotificare(Client c, String mesaj) {
    System.out.println(String.format("Domunle manager, nu avem date pentru %s", c.getNume()));
  }
}
