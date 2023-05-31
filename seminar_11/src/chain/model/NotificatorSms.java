package chain.model;

public class NotificatorSms extends INotificare {
    public NotificatorSms(INotificare nextNotificare) {
        super(nextNotificare);
    }

    @Override
    public void trimiteNotificare(Client c, String mesaj) {
        if (c.getNrTelefon() != null) {
            System.out.println(
                    String.format("Clientul %s ai primit sms cu  mesajul : %s", c.getNume(), mesaj));
        } else {
            if (super.getNextNotificare() != null) {
                super.getNextNotificare().trimiteNotificare(c, mesaj);
            }
        }
    }
}
