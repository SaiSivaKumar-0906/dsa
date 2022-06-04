public class onethreeninefour {
     public static void main(String[] args){
        int[] one = {2,2,2,3,3};
        int two = findLucky(one);
        System.out.println(two);
     }
    static int findLucky(int[] arr) {
        int[] indexArr = new int[500];
        
        for (int i=0; i<arr.length; i++) {
            indexArr[arr[i]]++;
        }
        int result = -1;
        for (int i=0; i<indexArr.length; i++) {
            if (indexArr[i] > 0 && indexArr[i] == i)
                result = Math.max(result,  indexArr[i]);
        }
        return result;
    }
}
