
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class swapvalinarrays {
    public static void main(String[] args) {
        int[] arr ={1,3,4,2,5,7};
        System.out.println("The original array is");
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println("Array after index swaping");
        System.out.println(Arrays.toString(arr));
        ArrayList<String> colors =new ArrayList<>();
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");
        colors.add("YELLOW");
        Collections.swap(colors,0,3);
        System.out.println(colors);//[YELLOW, GREEN, BLUE, RED]


    }
    static void swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1]= arr[ind2];
        arr[ind2]=temp;
    }
}
