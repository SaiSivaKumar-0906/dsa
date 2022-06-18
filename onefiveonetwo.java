public class onefiveonetwo {
     public static void main(String[] args){
        int[] one = {1,2,3};
        int two = numIdenticalPairs(one);
        System.out.println(two);
     }
     static int numIdenticalPairs(int[] nums) {
        int count = 0; 
        for(int i=0;i<nums.length;i++){
            for(int j=0; j<i; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
