package LinearSearch;
import java.util.Scanner;
//To find in an array how many of the number have even number of digits 
public class Evendigits {
    public static void main(String[] args) {
        int[]arr= {23,434,2,65,86,2424,93,22};
        
        System.out.println(searchEven(arr));

    }
    static int searchEven(int[]arr){
        int count=0;
        for(int num: arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int digitcount=optimdigits(num);
        if(digitcount%2==0){
            return true;
        }
        return false;
    } 
    // static int digits(int num){
    //     int count=0;
    //     while(num>0){
    //         count++;
    //         num/=10; 
    //     }
    //     return count;
    // }
    static int optimdigits(int num){
        if(num<0){
            num*=-1;
        }
        return (int)(Math.log10(num))+1;
    }
}
    
    

