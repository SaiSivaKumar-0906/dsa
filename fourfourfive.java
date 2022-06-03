import java.util.Arrays;

public class fourfourfive {
    public static void main(String[] args){
    int[] one = {1, 2};
    int[] two = {0, 2, 3};
    int three = findContentChildren(one, two);
    System.out.println(three);
    }
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0, j = 0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
                count++;
            }
            j++;
        }
        return count;
    }   
}

