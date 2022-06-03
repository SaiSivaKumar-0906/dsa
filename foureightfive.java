public class foureightfive {
    public static void main(String[] args){
      int[] one = {1,0,1,1,0,1};
      int two = findMaxConsecutiveOnes(one);
      System.out.println(two);
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i]==1){
                sum++;
            }else{
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
