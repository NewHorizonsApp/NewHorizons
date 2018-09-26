package nti.newhorizons.newhorizons.data.entities;

public class Client {

    private int id;
    private String password;
    private String type;
    private Person person=new Person();

    public Client(String s, String fred) {
        this.setPassword(fred);
        this.getPerson().setEmail(s);
    }

    public Client() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
