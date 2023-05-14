package prototype;

public class Client implements AbstractPrototype {
    private String name;
    private String phoneNo;
    private String email;

    public Client() {
    }

    @Override
    public AbstractPrototype createCopy() throws CloneNotSupportedException {
        return (AbstractPrototype) this.clone();
    }

    public Client(String name, String phoneNo, String email){
        if(name.length() > 3){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException();
        }
        this.phoneNo = phoneNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
