import java.util.Arrays;

public class twosixeight {
     public static void main(String[] args){
       int[] one = {0, 1};
       int two = missingNumber(one);
       System.out.println(two);
     }
    static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1] != nums.length){
            return nums.length;
        }
      for(int i=0; i<nums.length; i++){
          if(nums[i] != i){
              return i;
          }
      }
      return -1;
    }
}
