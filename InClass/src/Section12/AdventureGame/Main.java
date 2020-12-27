package Section12.AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> location = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        location.put(0,new Location(0,"in front of pc"));
        location.put(1,new Location(1,"road"));
        location.put(2,new Location(2,"hill"));
        location.put(3,new Location(3,"building"));
        location.put(4,new Location(4,"vally"));
        location.put(5,new Location(5,"forest"));

        location.get(1).addExit("W",2);
        location.get(1).addExit("E",3);
        location.get(1).addExit("S",4);
        location.get(1).addExit("N",5);
        location.get(1).addExit("Q", 0);

        location.get(2).addExit("N", 5);
        location.get(2).addExit("Q", 0);

        location.get(3).addExit("W", 1);
        location.get(3).addExit("Q", 0);

        location.get(4).addExit("N", 1);
        location.get(4).addExit("W", 2);
        location.get(4).addExit("Q", 0);

        location.get(5).addExit("S", 1);
        location.get(5).addExit("W", 2);
        location.get(5).addExit("Q", 0);

        Map<String,String> vocabulary = new HashMap<>();
        vocabulary.put("quit","Q");
        vocabulary.put("west","W");
        vocabulary.put("east","E");
        vocabulary.put("north","N");
        vocabulary.put("south","S");

        int loc = 1;
        
        while(true){
            System.out.println(location.get(loc).getDescription());
            if(loc == 0){
                break;
            }

            Map<String,Integer> exits = location.get(loc).getExits();
            System.out.println("Available exits are ");
            for(String exit: exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();

            if(direction.length() >1 ){
                String[] words = direction.split(" ");
                for(String word : words){
                    if(vocabulary.containsKey(word.toLowerCase())){
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            } else {
                System.out.println("you cannot go in that direction");
            }
        }
    }
}
