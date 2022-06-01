import java.util.Arrays;

public class ones{
     public static void main(String[] args){
         int[] one = {2,7,11,15};
         int[] two = twosum(one, 9);
         System.out.println(Arrays.toString(two));

     }
     static int[] twosum(int[] nums, int target){
         int[] three = {};
       for(int i =0; i<nums.length; i++){
           int one = 0;
           for(int j=0; j<i; j++){
             one  = nums[i] + nums[j];
             if(one == target){
                 three = new int[] {j, i};
             }
           }
       }
       return three;
     }
}