public class String1 {
    public static void main(String[] args) {
           /********** STRING BASICS*********/
        char c[]={'A','B','C','D'};
        String str1=new String (c);

        System.out.println(str1);//ABCD

        byte b[]={65,66,67,68};//byte array of ascii codes of A,B,C,D
        String str2=new String (b);//this obj is in Heap memory 

        System.out.println(str2);//ABCD

        String str=new String("JAVA");// this obj goes in the pool as well as heap

        System.out.println(str);

        String st1="Java";
        String st2="Java";// both these ref will point to the same literal in the pool memory
        String st3=new String("Java");//a new object in the heap is created but no new obj in the pool for the same literal
        String str4=new String(b,1,2);
        System.out.println(str4);//BC
         String str5=new String(c,1,2);
         System.out.println(str5);//BC

         //STRING POOL//

         String s1="AYUSH";
         String s2="AYUSH"; 
         System.out.println(s1==s2);//true means theres just one obj in the pool where both the ref s1 and s2 hold same obj 
         String s3="Ayush";
         System.out.println(s1==s3);//False
         String srt=new String("AYUSH");
         System.out.println(s1==srt);//False since it srt the new obj is in the heap
    }
}
