public class threethree {
    public static void main(String[] args){
      int[] one = {4,5,6,7,0,1,2};
      int two = search(one, 0);
      System.out.println(two);
    }
    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
          int  mid=(start+end)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[start]<nums[mid] && target>=nums[start] && target<nums[mid])
        {
            end=mid-1;
        }
        else if(nums[start]<=nums[mid] && (target<=nums[end]|| target>nums[mid]))
        {
            start=mid+1;
        }
        else if(nums[end]>nums[mid] && target>nums[mid] && target<=nums[end])
        {
            start=mid+1;
        }
        else 
        {
            end=mid-1;
        }
        }
        return -1;
    }

}
