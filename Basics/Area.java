import java.util.Scanner;public class Area{
    public static void main(String[] args) {
    System.out.println("Enter the value of the three sides a,b,c");    
float a,b,c,s;
double area;
Scanner in=new Scanner(System.in);
a=in.nextFloat();
b=in.nextFloat();
c=in.nextFloat();
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println(area);
in.close();
    }
}