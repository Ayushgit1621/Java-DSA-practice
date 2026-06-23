import java.util.Scanner;
import java.time.Year;
public class Conditional {
    public static void main(String[] args) {
        //1. Relational Operators ---All the Operators always return boolean results 
        //2. To combine 2 or more conditional statements we use the logcical operators 
        //Conditional statements------IF, IF-ELSE 
        int a=5,b=10,c=15; float d=5.4f,e=5.0f;
        System.out.println(a<b&&a>c);//false
        System.out.println(a<d);//true
        System.out.println(a==e);//true
        if(a>0&&b>0&&c>0){
            if(a>b&&a>c){
                
System.out.println("the greatest is a = "+a);
            }
                
                else if(b>c){
                  System.out.println("the greatest is b = "+b);  
                }
            
            else{
                System.out.println("the greatest is c = "+c);
            }
        
    }
    else {
        System.out.println("Any one of the number is negative (Only positive numbers accepted)");
    }



//1. To check if the number entered is odd or even 
Scanner sc=new Scanner(System.in);
System.out.println("Enter an Integer to be checked");
int n=sc.nextInt();
if (n%2==0){
    System.out.println("The number "+n+" is even");
}
else{
    System.out.println("The number "+n+" is odd ");
}




//2.  To check if the Age entered is of a young person or not 
System.out.println("Enter the Age of the person");
int age=sc.nextInt();
if (age>0){
    if((age>=18)&&(age<=55)){
        System.out.println("The person is Young");
    }
    else{
        System.out.println("The person is not young");
    }
}
else{
    System.out.println("Invalid age (Please enter a positive age value)");
}




// 3. Marks Grading of the students 
int i,num;
System.out.println("Enter the number of students in the class");
num=sc.nextInt();
int m1[]=new int[num];
int m2[]=new int[num];
int m3[]=new int[num];
int avg[]=new int[num];
char grade[]=new char[num];
System.out.println("Enter the Marks of the subjects(0-100) in the order (maths,phy,chem)");
for (i=0;i<num;i++){
System.out.println("The Marks of Student "+(i+1));    
m1[i]=sc.nextInt();
m2[i]=sc.nextInt();
m3[i]=sc.nextInt();

}
for (i=0;i<num;i++){
    avg[i]=(m1[i]+m2[i]+m3[i])/3;
    if (avg[i]<=100){
        if(avg[i]>=85&&avg[i]<100){
        grade[i]='A';
    }
    else if(avg[i]>=60&&avg[i]<85){
        grade[i]='B';
    }
    else if(avg[i]>=40&&avg[i]<60){
        grade[i]='C';
    }
    else{
        grade[i]='F';
    }
}
else {
    System.out.println("Enter the valid numbers for the subject marks");
}
    
}
System.out.println("The numbers and their grades of the Students are :");
System.out.println("Std\tMaths\tPhy\tChem\tAvg\tGrades");
for (i=0;i<num;i++){
    System.out.println((i+1)+"\t"+m1[i]+"\t"+m2[i]+"\t"+m3[i]+"\t"+avg[i]+"\t"+grade[i]);
}






//5. To find Leap year 
System.out.println("Enter the Year to be checked");
int year =sc.nextInt();
if(year%4==0||year%400==0&& year%100!=0){
System.out.println("The year entered "+year+"Is a leap year");
}
else{
    System.out.println("The year entered "+year+" Is not a leap year");
}


// 6.  In java their are In built classes to check Leap and not leap 
boolean isLeap1=Year.isLeap(2000);
if(isLeap1){
    System.out.println("The Year entered is Leap year");
}
else{
System.out.println("The Year entered is not a Leap year");
}
Year currYear=Year.of(2026);
boolean isLeap2=currYear.isLeap();
if(isLeap2){
    System.out.println("The Year entered is Leap year");
}
else{
System.out.println("The Year entered is not a Leap year");
}

// 7. Display name of a day Based on number
System.out.println("Enter the Number of The day(1-7)"); 
int d_no=sc.nextInt();
if(d_no==1){
    System.out.println("Monday");
}else if(d_no==2){
    System.out.println("Tuesday");
}
else if(d_no==3){
    System.out.println("Wednesday");
}
else if(d_no==4){
    System.out.println("Thursday");
}
else if(d_no==5){
    System.out.println("Friday");
}
else if(d_no==6){
    System.out.println("Saturday");
}
else if(d_no==7){
    System.out.println("Sunday");
}
else{
    System.out.println("Invalid day number");

}

//8. Find the type of the website and Protocol used 

System.out.println("Enter the Url of the website");
String url=sc.nextLine();
String protocol=url.substring(0,url.indexOf(":"));
String ext=url.substring(url.lastIndexOf(".")+1);
System.out.println("The entered Url is :"+url);

if(protocol.equals("http")){
    System.out.println("The protocol is "+protocol+" Hyper Text Transfer Protocol");
}
else if(protocol.equals("https")){
    System.out.println("The protocol is "+protocol+" Hyper Text Transfer Protocol Secure");
}
else if(protocol.equals("ftp")){
    System.out.println("The protocol is "+protocol+" File Transfer Protocol");
}

if(ext.equals("com")){
    System.out.println("It is a commercial Website");
}
else if(ext.equals("org")){
    System.out.println("It is an organizational Website");
}
else if(ext.equals("gov")){
    System.out.println("It is a government  Website");
}
else if(ext.equals("in")){
    System.out.println("It is an Indian Website");
}
else {
    System.out.println("The extension is invalid ");
}

//To check the Radix of the number 
System.out.println("Enter the Number to be checked");
String Num=sc.next();
System.out.println("The number is "+Num);
if (Num.matches("[01]+")){
System.out.println("Binary Radix = 2");
}
else if (Num.matches("[0-7]+")){
System.out.println("Octal Radix = 8");
}
else if (Num.matches("[0-9]+")){
System.out.println("Decimal Radix = 10");
}
else if (Num.matches("[0-9A-F]+")){
System.out.println("Hexadecimal Radix = 16");
}
else {
    System.out.println("Invalid Number");
}


}
}

