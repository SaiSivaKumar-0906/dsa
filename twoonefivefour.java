
import java.util.Arrays;

public class twoonefivefour {
     public static void main(String[] args){
       int[] one = {8,19,4,2,15,3};
       int three = 2;
       int two = findFinalValue(one, three);
       System.out.println(two);
     }
    static int findFinalValue(int[] nums, int original) {
      Arrays.sort(nums);
       for(int i=0; i<nums.length; i++){
        if(nums[i] == original){
          original = original * 2;
        }
       }        
       return original;
    }
}
