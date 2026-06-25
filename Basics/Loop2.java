import java.util.Scanner;
public class Loop2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value ");
        char ch= sc.next().trim().charAt(0);// we used trim here to remove the leading spaces to avoid blank value in ch 
        System.out.println(ch);


    //1. fibonacci series
        System.out.println("Enter the number till which u need fibonacci series");
        int fibo=sc.nextInt();
        int a=0,b=1,c=0;
         System.out.println("Fibonacci series upto n :");
         System.out.print(a+" ");
         System.out.print(b+" ");
         int i=2;
         if(fibo > 0){
            while(i<=fibo){
            c=a+b;
            a=b;
            b=c;  
            System.out.print(c+" ");  
            i++;        
        }
        System.out.println();
         }


         // 2. Find the no. of occurence of a digit in a number 
        System.out.println("Enter the number with digit repetition : ");
        int n= sc.nextInt();

        System.out.println("enter the digit repetition u want to check");
        int digit=sc.nextInt();
        int count=0;
        while (n>0){
           int rem=n % 10;
           if(rem==digit){
            count++;
           }n=n/10;
        
        }
        System.out.println("The digit "+digit+" was repeated "+count+" times");

    
        //3. Reverse of a number 
        
        System.out.println("Enter the number of your choice (Integer) :");
        int number=sc.nextInt();
         int rev=0;// reverse 
        
         while (number>0){
           int rem= number %10;
            rev= rev*10+rem;
            number/=10;
        }
 
        System.out.println("The reverse of the number entered is "+ rev);


        // 4. Calculator program 
        //to take input till user press X or x
        int ans=0;
        while (true){
            // take an operator
            System.out.print("Enter the Operator ");
            char op= sc.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                // inp two numbers
                System.out.print("Enter two numbers ");
                int num1= sc.nextInt();
                int num2= sc.nextInt();
                
                if(op=='+'){
                     ans=num1+num2;
                }
                else if(op=='-'){
                     ans=num1-num2;
                }
                else if(op=='*'){
                     ans=num1*num2;
                }
                else if(op=='/'){
                     ans=num1/num2;
                }
                else if(op=='%'){
                     ans=num1%num2;
                }
            
           
            }else if(op=='X'||op=='x'){
             break;
            }
            else{
            System.out.println("Invalid operation");
            }
           
           System.out.println(ans);
        }  
        

        



     sc.close();
    } 
    

}

// javac Basics\Loop2.java
// java Basics\Loop2.java