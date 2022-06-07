public class onesixseventwo {
     public static void main(String[] args){
      int[][] one= {
          {1,2,3},
          {3,2,1}
      };
       int three = maximumWealth(one);
       System.out.println(three);
     }
     static int maximumWealth(int[][] accounts) {
        int one  = 0;
        for(int i=0; i<accounts.length; i++){
            int two = 0;
            for(int j=0; j<accounts[i].length; j++){
                two += accounts[i][j];
            }if(two > one){
                one = two;
            }
        }
        return one;
    }
}
