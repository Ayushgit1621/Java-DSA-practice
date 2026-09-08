package LinearSearch;

public class Mineleinarray {
    public static void main(String[] args) {
        int[]arr={2,18,42,67,6,17,3,54};
        System.out.println(minSearch(arr));
        
    }
    static int minSearch(int[] arr){
        int res= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<res){
                res=arr[i];
            }
        }
        return res;
    }
}
