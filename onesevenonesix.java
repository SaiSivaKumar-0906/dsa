public class onesevenonesix {
     public static void main(String[] args){
       int n = 7;
       int three = totalMoney(n);
       System.out.println(three);
     }
     static int totalMoney(int n){
      int weekday = 1,count=1;
      int sum = 0;
      int i=1;
      while(i<=n)
      {
          sum+=count;
          count++;
          if(i%7==0)
          {
              weekday++;
              count=weekday;
          }
          i++;
      }
      return sum;
     }
}
