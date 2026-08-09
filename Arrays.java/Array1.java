import java.util.Arrays;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] rollno = new int[5];

        /* rollno--> ref variable
           the right side is array obj of int type and of size 5
        */
        // int[] rollno ; || declaration 
        // roolno = {12,23,34,45,56}; ||(Initialization) memory creation for object in heap () 
        String[] arr1= new String[4];
        System.out.println(rollno[1]); // 0
        System.out.println(arr1[1]); // null
        int[] arr2 = new int[5];
        System.out.println("Enter the values inside array");
        for(int i=0;i<arr2.length;i++){
            arr2[i]= sc.nextInt(); // input array values
        }

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " "); // print values of array
        }
        for (int i : arr2) {
            System.out.print(i+" "); // here i represents the element of the array
        } // Here for every element in array, print the element

        System.out.println(Arrays.toString(arr2));

        String[] str = new String[4];
        System.out.println("Enter the values of string Array");
        for(int i=0;i<str.length;i++){
            str[i]= sc.next();
        }
        str[2]="Dubey";
        System.out.println(Arrays.toString(str)); // [Ayush,Shreya,AKD,SHY]

        change(arr2);
        System.out.println(Arrays.toString(arr2));


        // Arrays passed in functions 

        sc.close();
        }
        static void change(int[] nums){
            nums[0]= 99;
            
        }
}
