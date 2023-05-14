package prototype_curs;

public class Client extends AbstractPrototype {
    private String nume;
    private String phoneNo;

    private String email;

    public Client() {
    }

    public Client(String nume, String phoneNo, String email) {
        this.nume = nume;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Client clona = new Client();
        clona.email = this.email;
        clona.nume = this.nume;
        clona.phoneNo = this.phoneNo;
        return clona;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
