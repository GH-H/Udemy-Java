package Section8.Array;

import java.util.Arrays;
import java.util.Scanner;

public class P1_Array {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        //initial values
        int[] myIntArray = new int[10];
        int[] myIntArray2 = {0,1,2,3};
        myIntArray[5] = 50;
        System.out.println(Arrays.toString(myIntArray2));

        int[] myIntegers = getIntegers(6);
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter"+number+"integer values. \r");
        int[] values = new int[number];

        for(int i = 0;i<number-1;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum/array.length;
    }
}

