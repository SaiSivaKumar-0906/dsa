import java.util.Arrays;

public class onefour {
     public static void main(String[] args){
       int[] one = {13, 2, 8, 10, 5};
       bubbleSorts(one);
       System.out.println(Arrays.toString(one));
     }
     static  void bubbleSorts(int[] nums){
        boolean swaped;
       for(int i=0;i<nums.length;i++){
           swaped = false;
           for(int j=1; j<nums.length-i; j++){
            if(nums[j]<nums[j-1]){
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                swaped = true;
            }
           }
           if(!swaped){
            break;
           }
       }
     }
}
