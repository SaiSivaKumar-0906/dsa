

public class twotwothreenine {
    public static void main(String[] args){
     int[] one = {-4,-2,1,4,8};
     int three = findClosestNumber(one);
     System.out.println(three);
    }
    static int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int val=0;
        for(int i=0;i<nums.length;i++)
        {
            if(min>Math.abs(nums[i]))
            {
                min=Math.abs(nums[i]);
                val=nums[i];
            }
            
            if(min==Math.abs(nums[i]))
            {
                if(nums[i]>0)
                    val=nums[i];
            }
        }
        
        return val;
    }
}
