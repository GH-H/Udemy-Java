package Section8.ArrayList;

public class P2_Contact {
    private String name;
    private String phoneNumber;

    public P2_Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static P2_Contact createContact(String name,String phoneNumber){
        return new P2_Contact(name, phoneNumber);
    }
}
