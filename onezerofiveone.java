import java.util.Arrays;

public class onezerofiveone {
    public static void main(String[] args){
        int[] one = {1,1,4,2,1,3};
        int two = heightChecker(one);
        System.out.println(two);
    }
    static int heightChecker(int[] heights) {
        int i, count = 0;
        int[] expected = new int[heights.length];

        for(i=0; i<heights.length; i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);

        for(i=0; i<heights.length; i++){
            if(expected[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
