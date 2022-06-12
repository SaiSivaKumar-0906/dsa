import java.util.Arrays;

public class oneeighteightzero {
     public static void main(String[] args){
        int[] one  = {4,2,5,9,7,4,8};
        int two = maxAscendingSum(one);
        System.out.println(two);
     }
    static int maxAscendingSum(int[] nums) {
        Arrays.sort(nums);
        int[] five = new int[4];
        int three = 0;

        for(int i=0; i<4; i++){
            if(i < 2){
              five[i] = nums[nums.length-1-i];  
            }else{
                five[i] = nums[three];
                three++;
            }
        }
        int one = (five[0] * five[1]) - (five[2] * five[3]);
        return one;
        
    }
}
