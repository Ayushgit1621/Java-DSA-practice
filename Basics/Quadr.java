import java.util.Scanner;
public class Quadr {
    public static void main(String[] args) {
System.out.println("Enter the values of the three coeff a,b,c : ");    
float a,b,c;
double r1,r2;
Scanner in=new Scanner(System.in);
a=in.nextFloat();
b=in.nextFloat();
c=in.nextFloat();
double d;
d=((b*b)-(4*a*c));
if (d==0){
    r1=r2= -b/(2*a);
    System.out.println("The roots are r1=" + r1 + "r2=" + r2);
}
else if(d>0){
r1=(-b+ Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("The roots are r1=" + r1 + "r2=" + r2);
}
else{
    System.out.println("Roots do not exist");
}
}
}
     