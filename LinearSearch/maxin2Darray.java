package LinearSearch;

import java.util.Arrays;

public class maxin2Darray {
    public static void main(String[] args) {
        int [][]arr={
        {2,4,6},{9,11,13},
        {3,5,7},{8,10,12}
        };
        
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int max(int[][]arr){
        int max =Integer.MIN_VALUE;
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]>max){
                max=arr[r][c];
                }
            }
        }
         return max;
    }
    static int min(int[][]arr){
        int min =Integer.MAX_VALUE;
        for(int [] ints:arr){// enhnaced for loop
            for(int currInt: ints){
                if(currInt<min){
                min=currInt;
                }
            }
        }
         return min;
    }
    
    
}
