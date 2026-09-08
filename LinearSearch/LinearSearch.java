package LinearSearch;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int arr[]= new int[8];int i;
        System.out.println("Enter the elements of the array size 8");
        Scanner sc =new Scanner(System.in);
        for(i=0;i<8;i++){
            arr[i]=sc.nextInt();
        }
        int target =4;
        int linearSearch= linearSearch(arr, target);
        if(linearSearch!=-1){
            System.out.println("element "+target+" is found at "+" index "+ linearSearch);
        }
        else 
            System.out.println("Element "+ target+" is not found");
        sc.close();
    }

    static int linearSearch(int[] arr, int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }   
} 

// Its best case : O(1)
// Its worst case : O(n)