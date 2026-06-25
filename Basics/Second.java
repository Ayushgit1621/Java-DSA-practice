import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         float h,b;
        System.out.println("Enter the value of height: ");
         h=sc.nextFloat();  
        System.out.println("Enter the value of breadth:");
        b=sc.nextFloat();       
    float area=0.5f*(b*h);// area=(b*h)/2
    System.out.println(area);        
    }
}


