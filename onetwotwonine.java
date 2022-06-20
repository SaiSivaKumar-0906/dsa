import java.util.Arrays;

public class onetwotwonine {
     public static void main(String[] args){
       int[] one = {17,18,5,4,6,1};
       int[] two = replaceElements(one);
       System.out.println(Arrays.toString(two));
     }
    static int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i =  arr.length-1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = max;
            if(max < temp){
                max = temp;
            }
        }
        return arr;
    }
}
