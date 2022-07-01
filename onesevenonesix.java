public class onesevenonesix {
     public static void main(String[] args){
       int n = 4;
       int three = totalMoney(n);
       System.out.println(three);
     }
     static int totalMoney(int n){
        int weekday = 1,count=1;
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum+=count;
            count++;
            if(i%7==0)
            {
                weekday++;
                count=weekday;
            }
        }
        return sum;
     }
}
