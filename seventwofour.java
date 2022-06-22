public class seventwofour {
    public static void main(String[] args){
      int[] one = {1,7,3,6,5,6};
      int two = pivotIndex(one);
      System.out.println(two);
    }
    static int pivotIndex(int[] nums) {
       int sum = 0;
       for(int one : nums){
            sum += one;
       }
        int leftsum = 0;
        for(int i=0; i<nums.length; i++){
            if(leftsum == (sum-nums[i]-leftsum)){
                return i;
            }
            leftsum = leftsum+nums[i];
        }           
        return -1;
    }       

}   
