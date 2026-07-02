import java.util.Scanner;
public class First{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
     
            // String name1,name2;int a; double b;
            // System.out.println("Tell ur name");
            // name1=sc.nextLine();
            // name2=sc.next();
            // a=sc.nextInt();
            // b=sc.nextDouble();
            // System.out.println("Welcome!! "+name1);
            // System.out.println("Welcome!! "+name2);
            // System.out.println(a);
            // System.out.println(b);
            int x,y;
            System.out.println("Enter two numbers : ");
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println("The sum of two numbers is :"+(x+y) );
            sc.useRadix(2);
            int z=sc.nextInt();//a binary code of a number is enetered 
            System.out.println(z);// the decimal value of the number is obtained
            sc.close();
        }
    }
