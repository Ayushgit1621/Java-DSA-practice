import java.util.Scanner;
public class RgExpChlng2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=10110001;
        int a=12000234;
       
        String str=String.valueOf(b);//or String str=b+""
        String str1=a+"";
        if(str.matches("[01]+")){
        System.out.println("The number "+b+" is Binary");
        }else 
        System.out.println("The number "+b+" is not Binary");
        if(str1.matches("[01]+")){
        System.out.println("The number "+a+" is Binary");
        }else 
        System.out.println("The number "+a+" is not Binary");
        
        String str2="234AE";
        if (str2.matches("[0-9A-F]+")){
            System.out.println("The number entered is Hexamdecimal");
        }
        else
            System.out.println("The number entered is not Hexamdecimal");
        String date="21/09/2005";
        if (date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}")){
            System.out.println("The date is in correct format");
        }
        else
            {
                System.out.println("The date is not in correct format");
}
    sc.close();        
    }
}
