import java.util.Arrays;

public class nineonetwo {
     public static void main(String[] args){
        int[] nums = {5, 4, 3, 2, 1};
        int[] two = sortArray(nums);
        System.out.println(Arrays.toString(two));
     }
     static int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}

