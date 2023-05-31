package testare.mocks;

import testare.NenascutException;
import testare.model.IPersoana;

public class StubMinor implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() throws NenascutException {
        return 17;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
