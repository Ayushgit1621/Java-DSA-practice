import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        // Order of the cases can be anything
        // the Cases can be ---byte,short,int,char, and now String also
        //Faster than if-else since they do go directly to the suitable option 

        //Menu Driven program for arithmetic Operations 
        String option;int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the option in words  : ");
        option=sc.nextLine();
        option=option.toUpperCase();

        switch(option){
            case "ADD":System.out.println("Sum is "+n1+n2);break;
            case "SUB":System.out.println("Sum is"+(n1-n2));break;
            case "MUL":System.out.println("Sum is "+n1*n2);break;
            case "DIV":System.out.println("Sum is "+n1/n2);break;
            default:System.out.println("Invalid Option");break;
        }

    }
}
