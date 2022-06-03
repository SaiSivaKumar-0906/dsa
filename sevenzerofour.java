public class sevenzerofour {
    public static void main(String[] args){
       int[] one = {-1,0,3,5,9,12};
       int two = search(one, 2);
       System.out.println(two);
    }   
    static int search(int[] nums, int target) {
      int start = 0; 
      int end = nums.length-1;
      while(start <= end){
        int mid = start + (end - start)/2;
        if(nums[mid] == target){
            return mid;
        }if(target > nums[mid]){
            start = mid + 1;
        }else if(target < nums[mid]){
            end = mid - 1;
        }
      }  
      return -1; 
    } 
}
