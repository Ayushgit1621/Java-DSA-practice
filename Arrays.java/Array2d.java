import java.util.Arrays;
import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        // int [][] arr = new int[3][]; //no. of rows is mandatory to specify but not the no. of columns

    /******* Eg:1  *********/    
      int [][] arr2D = new int[3][3];
      System.out.println("Enter the values of matrix");
      // input 
      for(int i=0;i< arr2D.length;i++){
        for(int j=0;j<arr2D[i].length;j++){
            arr2D[i][j]= in.nextInt();
        }
      }
      for(int i=0;i< arr2D.length;i++){
        for(int j=0;j<arr2D[i].length;j++){
            System.out.print(arr2D[i][j]+" ");
        }
        System.out.println();
      }


/********* Eg:2  *********/
int [][] arr1= new int[3][3];
System.out.println("Enter the values of matrix");
for(int r= 0;r<arr1.length;r++){
    for(int c=0;c<arr1[r].length;c++){
        arr1[r][c]= in.nextInt();
    }
}


// for(int r=0;r< arr2D.length;r++){
//         System.out.println(Arrays.toString(arr1[r]));
//       }
      /*
      [1, 2, 3]
      [4, 5, 6]
      [7, 8, 9]
       */
     // Enhanced for loop using the functions  
     for (int[]a : arr1){
        System.out.println(Arrays.toString(a));
     } 

    /*******  Eg:3   **********/
    int [][] arr3= {{1,2,3},{4,5},{6,7,8,9}};
    System.out.println("Array3");
    for(int r=0;r<arr3.length;r++){
        for(int c=0; c <arr3[r].length;c++){
            System.out.print(arr3[r][c]+" ");
        }
        System.out.println();
    }
    /* 1 2 3
       4 5
       6 7 8 9
     */
    
in.close();
    }
}
