import java.util.Arrays;

public class oneninetwonine {
     public static void main(String[] args){
      int[] one = {1,2,1};
      int[] two = getConcatenation(one);
      System.out.println(Arrays.toString(two));
     }
     static  int[] getConcatenation(int[] nums) {
         int[] ans = new int[nums.length*2];
         for(int i=0; i<nums.length; i++){
            ans[i] = ans[nums.length+i] = nums[i];
         }
         return ans;
    }
}
