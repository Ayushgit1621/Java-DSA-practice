public class RegExpChlng1 {
    public static void main(String[] args) {
        String str = "ayush@gmail.com";
        
//         int i=str.indexOf("@");
//         String uname= str.substring(0,i);
//         System.out.println("The username is "+uname);

//         String domain=str.substring(i+1,str.length());
//         System.out.println("The domainname is "+domain);
//         int dot=domain.indexOf(".");
//         String Check=domain.substring(0,dot);
//  System.out.println(Check);
//         if(Check.equals("gmail")){
//         System.out.println("It is a gmail");
//         }
//         else{
//             System.out.println("Its some other kind of email id ");
//     }

        /**** An alternate method being *******/
        // if (domain.startsWith("gmail")){
        //     System.out.println("It is a gmail");
        // }
        // else
        //     System.out.println("Its some other kind of email id ");
     
      /*********Remove Special Characters From String  *******/
        String spl="a@sdgf%%67##AYUSH";
       
        System.out.println(spl.replaceAll("[^a-z0-9A-Z]",""));
        String space="    abc   de   fgh   ijk   "; 
        System.out.println(space.replaceAll("\\s+"," ").trim()) ;   
        
        
        /************* find the number of wordds in String  **********/
        String Sentence="  Ayush is writing Codes for hours now  ";
        Sentence= Sentence.replaceAll("\\s+"," ").trim();
        System.out.println(Sentence);
        String words[]=Sentence.split("\\s");
        
        System.out.println("The number of words here in the string is "+words.length);

        
    }
}
 