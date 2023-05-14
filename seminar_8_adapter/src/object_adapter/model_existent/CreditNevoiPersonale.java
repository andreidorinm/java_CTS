package object_adapter.model_existent;

public class CreditNevoiPersonale implements Credit {

    @Override
    public void oferaCredit(int suma) {
    System.out.println("A fost oferit creditul de nev personale  " + suma);
    }
}
