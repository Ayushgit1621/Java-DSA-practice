
public class Bit_Ops {
    public static void main(String[] args) {
    System.out.println("enter the value to be used :");    
  
    int n=0b1010;//10
    int m=0b1000;//16
    int o,y,z,k,l;
    o=n|m;
    y=n&m;
    z=n^m;
    k=n<<3;
    l=m>>3;
    int n1=o>>>1;
    System.out.println(o);//10
    System.out.println(y);//8
    System.out.println(z);//2
    System.out.println(k);//80
    System.out.println(l);//1
    System.out.println(String.format("%32s",Integer.toBinaryString(k)));//1010000
    System.out.println(String.format("%32s",Integer.toBinaryString(y)));//1000
    System.out.println(String.format("%32s",Integer.toBinaryString(o)));//1010
    System.out.println(String.format("%32s",Integer.toBinaryString(n1)));// 101 
    

    /*************BIT MERGING  AND BIT MASKING  ********/
// MERGING --------OR OPERATION 
// MASKING --------AND OPERATION (TO CHECK IF A BIT IS ON OR NOT)
// TO STORE NUMBERS B/W 0-10 WE NEED MAXIMUM 4 BITS AND 1 BYTE HAS 8 BITS HENCE WE CAN STORE 2 DISTINCT NUMBERS IN A SINGLE BYTE AS 1ST 4 BITS(NIBBLE) FIR NUM1 AND REST FOR NUM2
/*EX- TO STORE 5 AND 9 IN A BYTE 
a-00000000 AND b-00000101 NOW a=a|b GIVES 5
NOW b-00001001 AND b=b<<4 AND THEN a=a|b*/

//SWAPPING//
/******* a=00001001(9) b=00001100(12)
 a=a^b;b=a^b;a=a^b; hence a=12 and b=9 now and here the a^b will never be more than the max of the two i.e. 12 here * ********/

 int a=10,b=15;
 a=a^b;
 b=a^b;
 a=a^b;
 System.out.println(a);//15
 System.out.println(b);//10
 byte c=9,d=12;
 byte e=(byte)(c<<4);// bracket imp for the operation or else the type conversion considers only a as the byte type
 e=(byte)(e|d);//same as above bracket 
System.out.println((e&0b11110000)>>4);//9
System.out.println((e&0b00001111));//12


/************WIDENING AND NARROWING        ************/
//WIDENING(UPCASTING) -----CONVERSION OF SMALLER TYPE TO LARGER TYPE DATA EX-BYTE TO SHORT OR INT (IMPLICITLY)MUST BE COMPATIBLE 
// NARROWING (DOWNCASTING)-----CONVERSION OF LARGER TYPE DATA TO SMALLER TYPE EXPLICITLY(NON COMPATIBLE CONVERSION i.e. SOURCE TYPE IS LARGER THAN THE DESTINATION)

byte b1=10;
short s=10;
int i;
long l1;
float f;


s=b1;i=b1;l1=b1;f=b1;// compatible and widening is smooth
//c1=b1;b2=b1; not possible incompatible types

//narrowing 
b1=(byte)s;//data loss occurs hence we must know the value must not loose data 
short s1=120,s2=200;
byte by=(byte)s1,byy;
byy=(byte)s2;
System.out.println(by);//120
System.out.println(byy);//-56
}
}
