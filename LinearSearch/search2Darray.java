package LinearSearch;

import java.util.Arrays;

public class search2Darray {
    public static void main(String[] args) {
        int [][]arr={
        {2,4,6},{9,11,13},
        {3,5,7},{8,10,12}
        };
        int target=34;
        int[]ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr,int target){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]==target){
                    return new int[]{r,c};
                }
            }
        }
         return new int[]{-1,-1};
    }
}
