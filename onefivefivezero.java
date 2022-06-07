
public class onefivefivezero{
     public static void main(String[] args){
      int[] one  = {1,2,34,3,4,5,7,23,12};
      boolean two = threeConsecutiveOdds(one);
      System.out.println(two);
     }
     static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1) {
                count++;
                if(count == 3){
                    return true; 
                } 
            } else {
                count = 0;
            }
        }
        return false; 
     }  
     }