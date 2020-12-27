package Section8.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class P1_GroceryListMain {
    private static Scanner scanner = new Scanner(System.in);
    private static P1_GroceryList p1GroceryList = new P1_GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while (!quit){
            System.out.println("what is your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    addItem();
                    break;
                case 2:
                    modify();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    quit =true;
                    break;
            }
        }
    }

    public static void addItem(){
        p1GroceryList.addItem(scanner.nextLine());
    }

    public static void modify(){
        int pos = scanner.nextInt();
        scanner.nextLine();
        String item = scanner.nextLine();
        p1GroceryList.modify(pos,item);
    }

    public static void remove(){
        p1GroceryList.remove(scanner.nextInt());
        scanner.nextLine();
    }

    public static void search(){
        p1GroceryList.find(scanner.nextLine());
    }

    public static void copyArrayList(){
        ArrayList<String> newOne = new ArrayList<String>();
        newOne.addAll(p1GroceryList.get());

        ArrayList<String> newTwo = new ArrayList<String>(p1GroceryList.get());
        String[] array = new String[p1GroceryList.get().size()];
        array = p1GroceryList.get().toArray(array);
    }
}
