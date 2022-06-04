import java.util.Arrays;

public class onefoursixfour {
     public static void main(String[] args){
        int[] one = {1, 4, 5, 5};
        int two = maxProduct(one);
        System.out.println(two);
     }
    static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int one = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i] >= nums[j]){
                    one = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
        return one;
    }
}
