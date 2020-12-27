package Section8.ArrayList;

import java.util.ArrayList;

public class P2_MobilePhone {
    private String myNumber;
    private ArrayList<P2_Contact> myContacts;

    public P2_MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }


    public boolean addNewContact(P2_Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("already exist");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean removeContact(P2_Contact contact){
        if(findContact(contact.getName())<0){
            System.out.println("not exist");
            return false;
        }
        myContacts.remove(contact);
        return true;
    }

    public boolean updateContact(P2_Contact oldContact,P2_Contact newContact){
        int position = findContact(oldContact);
        if(position<0){
            System.out.println("not found");
            return false;
        }
        myContacts.set(position,newContact);
        System.out.println("replaced");
        return true;
    }

    private int findContact(P2_Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i=0;i<myContacts.size();i++){
            P2_Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(P2_Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }

        return null;
    }

    public void printContacts(){
        for(int i=0;i<myContacts.size();i++){
            System.out.println((i+1)+"."+myContacts.get(i).getName()+" "+myContacts.get(i).getPhoneNumber());
        }
    }
}
