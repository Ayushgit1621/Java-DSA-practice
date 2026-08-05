package Leetcode;

public class Q125 {
     public boolean isPalindrome(String s) {
        int i=0;
        int j= s.length()-1;
       while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (!Character.isLetterOrDigit(left)) {
                i++;
            } else if (!Character.isLetterOrDigit(right)) {
                j--;
            } else {
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false; // Mismatch found
                }
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Q125 obj = new Q125();
        String s ="A man, a plan, a canal: Panama";
        boolean ans =obj.isPalindrome(s);
        System.out.println(ans);
    }
}
