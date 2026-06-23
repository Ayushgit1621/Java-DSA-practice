public class Strmethods {
    public static void main(String[] args) {
        /******** STRING METHODS **********/
        String str=" java ";
        int l=str.length();//4
        System.out.println(l);//int
        System.out.println(str.toUpperCase());//JAVA
        //even if the Same string name we modify , it actually does not modify the same thing .IT Created a new object and Modifies it The new object will be always be in HEAP.......
        System.out.println(str.trim());

        String str1=" AyushDubey ";

        System.out.println(str1.substring(3));
        System.out.println(str1.substring(3,9));
        System.out.println(str.replace('a','e'));//all a to e
        System.out.println(str1.startsWith("Ayush"));
        System.out.println(str1.endsWith("Dubey"));
        System.out.println(str1.charAt(4));
        System.out.println(str1.indexOf('u'));// WE CAN ASLO CHECK FOR A STRING 
        System.out.println(str1.indexOf('u',4));//checks if index of a after 4
        System.out.println(str1.lastIndexOf('e'));
        System.out.println(str1.lastIndexOf('y',6));// start searching indexes before 6
        System.out.println(str.equals("java"));
        System.out.println(str.equalsIgnoreCase(" JAVA "));
        System.out.println(str.compareTo(" java "));
        System.out.println(str.compareTo(" JAVA "));//-1
        System.out.println(str.compareTo(" JAVA "));
        System.out.println(String.valueOf(24));

    }
}
