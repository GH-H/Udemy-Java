package Section8.ArrayList;

import java.util.Scanner;

public class P2_MobilePhoneMain {
    private static Scanner scanner = new Scanner(System.in);
    private static P2_MobilePhone phone = new P2_MobilePhone("253 486 2046");
    public static void main(String[] args) {

        boolean quit = false;
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0://shut down
                    quit = true;
                    break;

                case 1:
                    printContacts();
                    break;

                case 2:
                    addContact();
                    break;
                //case 3:
                //    removeContact();
                //   break;
                //case 4:
                //    updateContact();
                //    break;
                //case 5:
                //    queryContact();
                //    break;
            }
        }
    }

    public static void printContacts(){
        phone.printContacts();
    }

    public static void addContact(){
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("enter number");
        String number = scanner.nextLine();
        phone.addNewContact(P2_Contact.createContact(name,number));
    }
}
