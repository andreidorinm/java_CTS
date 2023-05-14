package singleton;

import singleton.model.Director;
import singleton.model.LazyPresedinte;
import singleton.model.Papa;
import singleton.model.Presedinte;

public class Main {
  public static void main(String[] args) {
//    Papa papa = Papa.getInstance();
//    Papa papa1 = Papa.getInstance();
//    System.out.println(papa);
//    System.out.println(papa1);
////
//    Director director = Director.getInstance("Meran");
//    System.out.println(director);
//    Director director2 = Director.getInstance("Alex");
//    System.out.println(director2);

    Presedinte presedinte = Presedinte.getInstance();
    System.out.println(presedinte);
    Presedinte presedinte1 = Presedinte.getInstance();
    System.out.println(presedinte1);


    LazyPresedinte presedinte2 = LazyPresedinte.getInstance("Klaus Iohannus");
    System.out.println(presedinte2);
    LazyPresedinte presedinte3 = LazyPresedinte.getInstance("Iliescu ");
    System.out.println(presedinte2);
  }
}
