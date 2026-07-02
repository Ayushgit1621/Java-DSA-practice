import java.util.Scanner;
public class Cuboid{
    public static void main(String args[]){
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the values of the three dimensions l,b,h : ");
        float l,b,h;
        double area,vol;
        l=in.nextFloat();
        b=in.nextFloat();
        h=in.nextFloat();
        /*front & back= l*h
        rigth & left= b*h
        bottom & top= l*b 
        vol=l*b*h */ 
        area= 2*(l*b+b*h+l*h);
        vol= l*b*h;
        System.out.println("The total area of the cuboid is: "+area);
        System.out.println("The total volume of the cuboid is: "+vol);

in.close();
    }
}
