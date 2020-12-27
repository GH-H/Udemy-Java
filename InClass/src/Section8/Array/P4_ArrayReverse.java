package Section8.Array;

import java.util.Arrays;

public class P4_ArrayReverse {
    public static void main(String[] args) {
        int[] array = {5,6,2,8,9};
        int[] result = reverse(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] reverse(int[] array){
        int[] result = new int[array.length];
        int pos = 0;
        for(int i=array.length-1;i>=0;i--){
            result[pos] = array[i];
            pos++;
        }
        return result;
    }
}
