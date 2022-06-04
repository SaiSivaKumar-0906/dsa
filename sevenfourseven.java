public class sevenfourseven {
     public static void main(String[] args){
        int[] one = {3,6,1,0};
        int two = dominantIndex(one);
        System.out.println(two);
     }
     static int dominantIndex(int[] nums) {
     int i;  
     int count = 0;
     int index = 0;
     int max = nums[0];

	
    for(i = 1; i<nums.length; i++){
        if(nums[i]>max){
            max = nums[i];
            index = i;
        }
    }
	
    for( i = 0; i<nums.length; i++){
        if( max >= 2*nums[i]){
            count++;
        }
    }

	
    if(count == nums.length-1){
         return index;
    }else{
         return -1;
    }


}
     }

