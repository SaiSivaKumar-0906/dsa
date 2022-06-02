import java.util.Arrays;

public class twoonesevens {
     public static void main(String[] args){
        int[] one = {1, 2, 3, 4};
        boolean two = containsDuplicate(one);
        System.out.println(two);

     }
     static boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
          for(int j=0; j<i; j++){
              if(nums[j] == nums[i]){
                  return true;
              }
          }
        }
        return false;    
    }
}
