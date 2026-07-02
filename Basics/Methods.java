import java.util.*;
public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        // int sum = sum();//int function
        // System.out.println(sum);

        // String greeting = greet(); //string function 
        // System.out.println(greeting);

        // int ans = sum2(20,30);// pass by value 
        // System.out.println("sum of a and b is :"+ans);
        // String naam = in.nextLine();
        // String msg = myGreet(naam);
        // System.out.println(msg);

        int arr[]={1,2,3,4,5};
        changearr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int sum(){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the two numbers");
        int n1,n2;
        n1=in.nextInt();
        n2=in.nextInt();
        int s= n1+n2;
        return s; // this is the end point of the function 
    }
    /*
    Access modifiers| return type|name (arguments){
    body//
    return statement;
    } */
    //  Return type : It determines the valuye type which is returned by the function after the execution 
    static String greet(){
        String greeting = "Hii !! how are you";
        return greeting;
    }
    
    static String myGreet(String name){
        String msg = "Hii"+ name + "!! how are you";
        return msg;
    }
    
    //pass by values in method calling

    static int sum2(int a, int b){
        int sum = a+b;
        return sum;
    }
    static void changearr(int nums[]){
        nums[0]=99;// here the same obj will be changed via this ref varibale 
    }


}

// javac Basics\Methods.java
// java Basics\Methods.java


