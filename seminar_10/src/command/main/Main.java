package command.main;

import command.model.Autobuz;
import command.model.CommandPlecareCursa;
import command.model.ManagerComenzi;

public class Main {
  public static void main(String[] args) {
    ManagerComenzi operator = new ManagerComenzi();

    operator.invocaComanda(new CommandPlecareCursa(10, new Autobuz(13)));
    operator.invocaComanda(new CommandPlecareCursa(13, new Autobuz(14)));
    operator.invocaComanda(new CommandPlecareCursa(21, new Autobuz(15)));
    operator.invocaComanda(new CommandPlecareCursa(22, new Autobuz(16)));

    operator.executaComanda();
    operator.executaComanda();
    operator.executaComanda();
    operator.executaComanda();


  }
}
