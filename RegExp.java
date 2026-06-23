public class RegExp {
    public static void main(String[] args) {
/******** REGULAR EXPRESSIONS *********/
/* Mathching symbols 

. ------Any character but just one single 
[abc]-----exactly the given letters 
[abc][vz]------either first or second set
[^abc] except abc
[a-z1-7]-----a-z or 1-7
A|B----------A or B
XZ-------exactly XZ

    */
  String st="@";
  String st1="a";
  String str1="a6";
  String str="86";
  System.out.println("Check Reg Expressions");
  System.out.println(st.matches("[abc]"));//false
  System.out.println(st.matches("[^abc]"));//true
  System.out.println(str.matches("[a-x1-9]"));//false
  System.out.println(st.matches("[a-z][0-]"));//false
  System.out.println(str1.matches("[a-z][0-9]"));//true
  System.out.println(st1.matches("[a|b]"));//true
  System.out.println(str.matches("86"));//true

  /*
               ********META CHARACTERS*********
    \d--------Digits
    \D--------Not Digits
    \s--------space
    \S-------Not Space
    \\w-------Alphabets or digits
    \W--------Neither Alphabet Or digits
      */
     System.out.println("Check Meta Characters");
    System.out.println(str.matches("\\W"));//false
    System.out.println(str.matches("\\w"));
 /*
            ********* Quantifiers ************** 
         *---------any no. of times(including 0)
         +---------one or more time 
         ?---------0 or 1 time 
        {X}--------X times  
        {X,Y}------Between X and Y time  
 */
String word="abcdef";
String word1="abCCdef";
String word2="ab45def";
String word3="";
String word4="abccddb";
String gmail="ayush@gmail.com";
System.out.println("Check Quantifiers");
System.out.println(word2.matches(".*"));
System.out.println(word1.matches("[a-z]*"));
System.out.println(word3.matches("[a-z]+"));
System.out.println(word4.matches("[abc]{3,7}"));
System.out.println(gmail.matches(".*gmail.*"));

    }
}
