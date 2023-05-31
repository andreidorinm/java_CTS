package chain.model;

public class NotificatorEmail extends INotificare {
  public NotificatorEmail(INotificare nextNotificare) {
    super(nextNotificare);
  }

  @Override
  public void trimiteNotificare(Client c, String mesaj) {
    if (c.getEmail() != null) {
      System.out.println(
          String.format("Clientul %s ai primit mail cu mesajul : %s", c.getNume(), mesaj));
    } else {
      if (super.getNextNotificare() != null) {
        super.getNextNotificare().trimiteNotificare(c, mesaj);
      }
    }
  }
}
