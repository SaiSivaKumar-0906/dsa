public class twozeroonesix {
     public static void main(String[] args){
        int[] arrays = {7,1,5,4};
        int two = maximumDifference(arrays);
        System.out.println(two);
     }
     static int maximumDifference(int[] nums) {
        int min = nums[0];
        int diff = -1;
        int i=1;        
        while(i<nums.length){        
            if(nums[i] > min){
                diff = Math.max(diff, nums[i]-min);
            }else{
                min = nums[i];
            }
            i++;
        }
        
        return diff;
    }
    
}
