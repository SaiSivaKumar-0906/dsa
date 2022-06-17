import java.util.Arrays;

public class onefoursevenzero {
     public static void main(String[] args){
        int[] one = {2,5,1,3,4,7};
        int[] two  = shuffle(one, 3);
        System.out.println(Arrays.toString(two));
    }
    static int[] shuffle(int[] nums, int n) {
       int[] one = new int[n*2];
       for(int i=0; i<n; i++){
         one[i*2] = nums[i];
         one[i*2+1] = nums[i+n];
       }
       return one;      
    }
}
