public class onetwentyone {
     public static void main(String[] args){
         int[] one = {1, 2};
         int two = maxProfit(one);
         System.out.println(two);
 
     }
     static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}
