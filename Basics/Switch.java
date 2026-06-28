import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        // Order of the cases can be anything
        // the Cases can be ---byte,short,int,char, and now String also
        //Faster than if-else since they do go directly to the suitable option 

        //Menu Driven program for arithmetic Operations 

        // String doesnt use == it does use .equals (only checks the value)
        //duplicate cases are not allowed 

        String option,fruit;
        int n1,n2,day,id;
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
            default:System.out.println("Invalid Option");
        }

        // New syntax for switch case, break condition not required 
        fruit = sc.next();
        switch(fruit){
            
            case "Mango"->System.out.println("Its Mango");
            case "Apple"->System.out.println("Its Apple");
            case "Orange"->System.out.println("Its Orange");
            case "Grapes"->System.out.println("Its Grapes");
            default ->System.out.println("Enter a valid fruit");
        }

        // weekdays or Weekends
        day =sc.nextInt();
        switch(day){
            // case 1:
            // case 2:
            // case 3:
            // case 4:
            // case 5:
            //     System.out.println("Its a weekday"); break;
            
            // case 6:    
            // case 7:
            //     System.out.println("Its a weekend");  break; 
            // default:
            //     System.out.println("Enter a valid day number");    

            case 1,2,3,4,5 ->
            System.out.println("Its a weekday"); 
            case 6,7->
                System.out.println("Its a weekend");
            default ->
                System.out.println("Enter a valid day numbers");           
        }

        // Nested switch case 
        // based on empID give their names
        id=sc.nextInt();
        String dept =sc.nextLine();
        switch(id){
            case 1->System.out.println("Ayush Dubey");
            case 2->System.out.println("Ankit Mishra");
            case 3->{
                System.out.println("Emp no. Three");
                switch(dept){
                    case "IT"->System.out.println("Dept. Of IT");
                    case "CSE"->System.out.println("Dept. Of IT");
                    case "ECE"->System.out.println("Dept. Of IT");
                    default->System.out.println("Enter correct Dept");
                }
            }
            default->System.out.println("Enter correct employee id");
        }








        sc.close();
    }
}

// javac Basics\Switch.java
// java Basics\Switch.java
