package singletoregistrynotrecommended.model;

import singletoregistrynotrecommended.model.Firma;

import java.util.HashMap;
import java.util.Map;

public class Registru {
    private String nume;
    private static Map<String, Firma> firme = new HashMap<>();

    public static Firma getFirme(String nume) {
    if (!firme.containsKey(nume)) {
      Firma firma = new Firma(nume, 0);
      firme.put(nume, firma);
    }
    return firme.get(nume);
  }
}
