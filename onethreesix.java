import java.util.Arrays;

public class onethreesix {
     public static void main(String[] args){
    int[] one = {2, 2, 1};
    int two = singleNumber(one);
    System.out.println(two);
     }
     static int singleNumber(int[] nums) {
         Arrays.sort(nums);
        int one = 0;
        for(int i=1; i<nums.length; i++){
            one ^= nums[i];
        }
        return one;
    }
}

//1, 2, 2