public class onenineeightfour {
     public static void main(String[] args){
         int[] array = {90};
         int two = minimumDifference(array, 2);
         System.out.println(two);
     }
     static int minimumDifference(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]-nums[j] == k){
                    return k;
                }
            }
        }
        return 0;
    }
}
