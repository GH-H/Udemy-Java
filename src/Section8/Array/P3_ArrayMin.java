package Section8.Array;

public class P3_ArrayMin {
    public static void main(String[] args) {
        int[] array = {2,6,5,8,9};
        int small = findMin(array);
        System.out.println(small);
    }

    public static int findMin(int[] array){
        int temp = array[0];
        for(int i=1;i<array.length;i++){
            if(temp>array[i]){
                temp = array[i];
            }
        }
        return temp;
    }
}
