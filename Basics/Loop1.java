import java.util.Scanner;
public class Loop1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count= 1;

// Always use this loop when u dont know how many times the loop will run
        while (count!=5){
             System.out.println(count);
            count++;
        }

//Always use the loop when u know how many times the loop will run 

        for(int i=1;i<=5;i++){
             System.out.println(i);
        }

        System.out.println("Enter the temp in C: ");
        float tempC = sc.nextFloat();

        float tempF = tempC *(9/5)+32;
        System.out.println("The temp in fahrenhite is : "+tempF);


 // 1. Print number from 1 to n        
       System.out.println("Enter a number ");
       int num= sc.nextInt();
       for (int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
// do while loop
        int n=1; 
        do {
             System.out.println(n);
             n++;
        } while (n<=10); 
        // this always executes atleast once, be it anything as the value checked 




        sc.close();
    }
   
}

// javac Basics\Loop1.java
// java Basics\Loop1.java

