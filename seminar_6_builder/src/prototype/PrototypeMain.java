package prototype;

public class PrototypeMain {
  public static void main(String[] args) throws CloneNotSupportedException {
    Client client = new Client("Andrei", "0757563236", "andrei@email.com");
    AbstractPrototype client2 = client.createCopy();
    System.out.println(client2 == client);
    System.out.println(client2.toString());
  }
}
