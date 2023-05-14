package prototype_curs;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    Client clientProt = new Client("Alex", "50454", "alexmeran@mail.com");
    Client client1 = (Client) clientProt.clone();
    Client client2 = (Client) clientProt.clone();
    client1.setEmail("alexnicolae@mail.com");

    System.out.println(clientProt);
    System.out.println(client1);
    System.out.println(client2);
  }
}
