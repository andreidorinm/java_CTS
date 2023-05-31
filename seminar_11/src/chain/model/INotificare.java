package chain.model;

public abstract class INotificare {
  private INotificare nextNotificare;

  public INotificare(INotificare nextNotificare) {
    this.nextNotificare = nextNotificare;
  }

 public abstract void trimiteNotificare(Client c, String mesaj);

  public INotificare getNextNotificare() {
    return nextNotificare;
  }

  public void setNextNotificare(INotificare nextNotificare) {
    this.nextNotificare = nextNotificare;
  }
}
