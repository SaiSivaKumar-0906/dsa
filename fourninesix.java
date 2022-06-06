import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class fourninesix {
     public static void main(String[] args){
       int[] one = {2, 4};
       int[] two = {1,2,3,4};
       int[] three = nextGreaterElement(one, two);
       System.out.println(Arrays.toString(three));
     }
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] nge = new int[nums1.length];
    Stack<Integer> st = new Stack<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums2.length; i++) {
        
        while (!st.isEmpty() && nums2[i] > st.peek()) {
            map.put(st.pop(), nums2[i]);
        }

        st.push(nums2[i]);
    }

    for (int i = 0; i < nums1.length; i++) {
        nge[i] = map.getOrDefault(nums1[i], -1);
    }

    return nge;
}
    }
