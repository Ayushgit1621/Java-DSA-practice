
public class Printing {
    public static void main(String[] args) {
        int x=10,y=20;

        System.out.println(x+y+" sum");//30 sum
        System.out.println("sum "+x+y);//sum 1020
        System.out.println("sum of "+y+" and "+x+" is "+(x+y));// sum of 10 and 20 is 30


        /****** THE printf METHOD 
         It takes String format, objects and variable arguments (zero or more args)

         It also takes info related to geo locations plus string format and then obj and variable args 

         ***********/
         System.out.printf("Hello\nAyush\n");//Hello line change and Ayush
       
         int i=10;float f=12.234f;char c='@';String str="Ayush";
         System.out.printf("Hello %d %f %c \n",i,f,c);
         System.out.printf("Hello %e\n",f);//gives the scientific notation of the number

         System.out.printf("%1$d %1$d %1$d\n",i);//10 10 10
         System.out.printf("%3$s %2$f %1$d\n",i,f,str);//Ayush 12.234000 10
         
         
         //giving index of the arg using the $ sign makes it easy to guve arg in any order but print in the given index format 

         /*********** FLAG WIDTH AND PRECIISON      *********/
         //WIDTH
         int a=10;
         System.out.printf("%5d\n", a);//makes width i.e. using 5 places it prints the values 

         //FLAG
         System.out.printf("%05d\n", a);//00005 makes the spaces to be 0
         int b= -10;
         System.out.printf("%(5d\n", b);//  (10) keeps the neg number in brackets 
         System.out.printf("%+5d\n", a);//+10
         System.out.printf("%+5d\n", b);//-10

         float d=123.45f,e=12.2f;
         System.out.printf("%f\n",d);//123.449997
         System.out.printf("%6f\n",d);//123.449997
         System.out.printf("%6.2f\n",d);//123.45
         System.out.printf("%06f\n",e);//

         String Str="Ayush";
         System.out.printf("%20s"+Str);//takes 20 places to print Ayush (Right Aligned)
         System.out.printf("%-20s"+Str);//takes 20 places to print Ayush but spaces at the end (Left aligned)
         
    }
}
