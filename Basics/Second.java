import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        System.out.println("Enter the value of height: ");
        System.out.println("Enter the value of breadth:");
        Scanner sc=new Scanner(System.in);
        float h,b;
        h=sc.nextFloat();       
        b=sc.nextFloat();
    float area=0.5f*(b*h);// area=(b*h)/2
    System.out.println(area);        
    }
}


