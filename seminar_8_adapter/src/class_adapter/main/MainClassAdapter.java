package class_adapter.main;

import class_adapter.model_existent.Credit;
import class_adapter.model_existent.CreditIpotecat;
import class_adapter.new_framework.CreditAdapterClass;

public class MainClassAdapter {
     static void afiseazaCredit(Credit credit, int sum){
         credit.oferaCredit(sum);
     }
    public static void main(String[] args){
        Credit creditIpotecat = new CreditIpotecat();
        afiseazaCredit(creditIpotecat,100);
        Credit creditLeasing = new CreditAdapterClass();
        afiseazaCredit(creditLeasing,150);
    }
}
