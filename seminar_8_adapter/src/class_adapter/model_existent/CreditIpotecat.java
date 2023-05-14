package class_adapter.model_existent;

public class CreditIpotecat implements Credit   {

    @Override
    public void oferaCredit(int suma) {
    System.out.println("A fost oferite creditul iportecat de " + suma );
    }
}
