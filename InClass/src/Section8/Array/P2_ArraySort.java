package Section8.Array;

import java.util.Arrays;

public class P2_ArraySort {
    public static void main(String[] args) {
        int[] textArray = {1,7,5,6,9,6};
        int[] finalArray = sortArray(textArray);
        System.out.println(Arrays.toString(textArray));
        System.out.println(Arrays.toString(finalArray));
    }

    public static int[] sortArray(int[] array){
        int temp ;
        //use clone, if use = array, the original value will be changed
        int[] finalArray = array.clone();
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i=0;i<finalArray.length-1;i++){
                if(finalArray[i] < finalArray[i+1]){
                    temp = finalArray[i];
                    finalArray[i] = finalArray[i+1];
                    finalArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return finalArray;
    }
}
