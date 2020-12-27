package Section12.setAndHashset;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i=1; i<= 100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("union contains " + union.size() + " elements");

        Set<Integer> repeated = new HashSet<>(squares);
        repeated.retainAll(cubes);
        System.out.println("repeated contains "+repeated.size()+" elements");
        for(int i : repeated){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of "+ Math.cbrt(i));
        }
        System.out.println();

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        List<String> x = Arrays.asList(arrayWords);
        words.addAll(Arrays.asList(arrayWords));
        for(String s : words){
            System.out.println(s);
        }

        ArrayList<String> test = new ArrayList<>();
        test.add("i");
        test.add("am");
        test.add("james");

        System.out.println();
        Set<String> testSet = new HashSet<>(test);
        for(String s : testSet){
            System.out.println(s);
        }

        System.out.println();

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] nWords = {"all","nature","is","but","art","unknown","to","three"};
        String[] dWords = {"to","err","is","human","to","forgive","divine"};
        nature.addAll(Arrays.asList(nWords));
        divine.addAll(Arrays.asList(dWords));

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.retainAll(nature);
        printSet(diff2);
    }

    private static void printSet(Set<String> set){
        for(String s : set){
            System.out.println(s+" ");
            System.out.println();
        }
    }
}
