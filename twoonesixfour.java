import java.util.Arrays;

public class twoonesixfour {
   public static void main(String[] args){
      int[] one = {4,1,2,3};
      int[] two = sortEvenOdd(one);
      System.out.println(Arrays.toString(two));
   }
   static int[] sortEvenOdd(int[] nums) {
    for(int i=0;i<nums.length-2;i=i+2){
        for(int j=i+2;j<nums.length;j+=2){
            if(nums[i]>nums[j]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
        }
    }

for(int i=1;i<nums.length-2;i=i+2){
    for(int j=i+2;j<nums.length;j=j+2){
         if(nums[i]<nums[j]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    }
}
return nums;
}
}    

