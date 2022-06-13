import java.util.Arrays;

public class onethreesixfive {
     public static void main(String[] args){
      int[] one  = {8,1,2,2,3};
      int[] two = smallerNumbersThanCurrent(one);
      System.out.println(Arrays.toString(two));

     }
    static int[] smallerNumbersThanCurrent(int[] nums) {
      int[] one  = new int[nums.length];
      for(int i=0; i<nums.length; i++){
        int two = 1;
        for(int j=0; j<nums.length; j++){
          if(nums[j] < nums[i]){
            one[i] = two++;
          }
        }
      }
      return one;
    }
}
