package flyweight.models;

import java.util.HashMap;
import java.util.Map;

public class BazaDeDateClienti {
  private Map<String, IClient> clienti;

  public BazaDeDateClienti() {
    this.clienti = new HashMap<>();
  }

  public IClient getClient(String nume, String nrTelefon, String email) {
    if (!clienti.containsKey(nrTelefon)) {
      Client client = new Client(nume, nrTelefon, email);
      clienti.put(nrTelefon, client);
    }
    return clienti.get(nrTelefon);
  }
}
