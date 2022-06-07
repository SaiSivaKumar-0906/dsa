public class onetwoninefive {
     public static void main(String[] args){
         int[] one = {12,345,2,6,7896};
         int two = findNumbers(one);
         System.out.println(two);
     }
     static int findNumbers(int[] nums) {
        int one = 0;
          for(int i=0; i<nums.length; i++){
               int two = 0;
              while(nums[i] != 0){
                  nums[i] = nums[i]/10;
                  two++;
              }
              if(two %2 == 0){
                   one++;
              }
          }
          
          return one;
      }
}
