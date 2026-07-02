import java.util.Arrays;
import java.util.Scanner;

public class Methodques {
    public static void main(String[] args) {
        int a =10;
        Scanner sc = new Scanner(System.in);
        System.out.println(a);
        {
            a=100;
            System.out.println(a);
        }
        System.out.println(a);
        System.out.println("Enter the number  to be checked for prime");
         int n = sc.nextInt();
        boolean ans = isPrime(n);
         System.out.println(ans);

        // System.out.println("Enter the number to be checked for armstrong");
        // int num =sc.nextInt();
        // System.out.println(isArmstrong(num));

        for (int i =100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.println(i+" Is an armstrong number");
            }
        }

        sc.close();    
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c =2;
        while (c*c <=n){
            if (n % c ==0) {
                return false;
            }
            c++;
        } 
        return c*c > n;
    }
    static boolean isArmstrong(int num){
        int org = num , sum = 0;
        while (num >0){
        int rem = num % 10;
        num = num / 10;
        sum =  sum + rem * rem * rem ;
        }
        return sum == org;   
    }
}


