package chain.main;

import chain.model.*;

public class MainChainOfResponsibility {
  public static void main(String[] args) {
    INotificare notificatorManager = new NotificareManager(null);
    INotificare notificareEmail = new NotificatorEmail(null);
    INotificare notificareSms = new NotificatorSms(null);
    notificareSms.setNextNotificare(notificareEmail);
    notificareEmail.setNextNotificare(notificatorManager);

    Client c = new Client("Jan", "08904930438", "jan@mail.com");
    Client c2 = new Client("Gigel", null, "gigel@mail.com");
    Client c3 = new Client("Gigel", null, null);

    notificareSms.trimiteNotificare(c, "SALUT ");
    notificareSms.trimiteNotificare(c2, "CIAO ");
    notificareSms.trimiteNotificare(c3, "Buna ziua");

  }
}
