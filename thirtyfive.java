

public class thirtyfive {
     public static void main(String[] args){
      int[] one = {1,3,5,6};
      int two = searchInsert(one, 7);
      System.out.println(two);
     }
    static int searchInsert(int[] nums, int target) {
     int start = 0; 
     int end = nums.length - 1;
     while(start <= end){
        int mid = start + (end - start)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(target > nums[mid]){
            start = mid+1;
        }else if(target < nums[mid]){
            end = mid - 1;
        }
     }
     return start;
    }
}
