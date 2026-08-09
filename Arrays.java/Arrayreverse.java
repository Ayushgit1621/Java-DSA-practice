import java.util.Arrays;
public class Arrayreverse {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    // static void reverse(int[] arr){
    //     int left =0;
    //     int right = arr.length -1;
    //     while(left<right){
    //         swap(arr,left,right);
    //         left++; right --;
    //     }
    // }
    // static void swap(int[] arr, int ind1, int ind2){
    //     int temp = arr[ind1];
    //     arr[ind1]= arr[ind2];
    //     arr[ind2]=temp;
    // }

    static void reverse(int[] arr){
        int left=0;
        int right= arr.length-1;
        if (arr == null|| arr.length <=1) {
            return;
        }
        while (left<right){
            int temp =arr[left];
            arr[left]= arr[right];
            arr[right]=temp;
            right--; left++;
        }
    }
}
