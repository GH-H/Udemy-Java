package Section8.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> place = new LinkedList<String>();
        place.add("tacoma");
        place.add("seattle");
        place.add("auburn");
        place.add("bellevue");

        place.add(1,"lol");
        place.remove("tacoma");
        print(place);
    }

    public static void print(LinkedList<String> list){
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static boolean addInOrder(LinkedList<String> list,String city){
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()){
            int comp = iterator.next().compareTo(city);
            if(comp == 0){
                System.out.println("exist");
                return false;
            }else if(comp>0){
                iterator.previous();
                iterator.add(city);
                return true;
            }
        }
        iterator.add(city);//add the last element because it needs compare
        return true;
    }
}
