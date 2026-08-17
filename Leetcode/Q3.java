package Leetcode;

import java.util.HashSet;

public class Q3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left =0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            while (window.contains(ch)){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(ch);
            maxLength =Math.max(maxLength, right-left+1);
        }
        return maxLength;
        
    }
}
