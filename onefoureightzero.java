import java.util.Arrays;

public class onefoureightzero {
     public static void main(String[] args){
         int [] one = {3,1,2,10,1};
         int[] two = runningsum(one);
         System.out.println(Arrays.toString(two));

     }
     static int[] runningsum(int[] nums){
         int[] one = new int[nums.length];
         int sum = 0;
         for(int i=0; i<nums.length; i++){
            sum += nums[i];
            one[i] = sum;
        }
        return one;
     }
}
