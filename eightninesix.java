public class eightninesix {
     public static void main(String[] args){
      int[] one = {1,2,2,3};
      boolean two = isMonotonic(one);
      System.out.println(two);
     }
    static boolean isMonotonic(int[] nums) {
        int count1=0,count2=0;
        if(nums[0]<nums[nums.length-1]){
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<=nums[i]){
                count1++;
            }
        }
    }
        else{
         for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                count2++;
            }
        }
    }
        if(count1==nums.length-1 || count2==nums.length-1){
            return true;
        }
        return false;
    }
}