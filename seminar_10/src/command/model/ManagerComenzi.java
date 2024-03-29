package command.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
  List<ICommand> comenzi = new ArrayList<>();

  public void invocaComanda(ICommand command) {
    comenzi.add(command);
  }

  public void executaComanda() {
    this.comenzi.get(0).execute();
    if (this.comenzi.size() != 0) {
      this.comenzi.remove(this.comenzi.get(0));
    }
  }
}
