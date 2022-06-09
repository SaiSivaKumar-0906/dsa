import java.util.Arrays;

public class onesixseven {
     public static void main(String[] args){
      int[] arrays = {2,7,11,15};
      int[] two = twoSum(arrays, 9);
      System.out.println(Arrays.toString(two));
     }
    static int[] twoSum(int[] numbers, int target) {
       int[] one = {}; 
       for(int i=1; i<numbers.length; i++){
           for(int j=0; j<i; j++){
               int nums = numbers[i] + numbers[j];
                if(nums == target){
                    int[] three = {i, j};
                    one = three;
                }
           }
       } 
       return one;
    }
}
