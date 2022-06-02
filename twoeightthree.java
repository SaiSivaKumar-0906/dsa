public class twoeightthree {
     public static void main(String[] args){
       int[] one = {0,1,0,3,12};
       int two = moveZeroes(one);
       System.out.println(two);

     }
     static int moveZeroes(int[] nums) {
        
            int index = 0;
                    
            for(int i=0;i< nums.length ;i++){
              
                if(i != index && nums[i] != 0){
                    nums[index++] = nums[i];
                    nums[i] = 0;
                }else if(i == index && nums[i] != 0){
                    index++;
                }
                
            }
            return index;
        }
        
    }

