package Leetcode;
import java.util.*;

class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right= s.length-1;
        while(left<right){
            char rep = s[left];
            s[left]=s[right];
            s[right]=rep;
            left++;right--;           
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char[] arr ={'h','e','l','l','o'};
        Solution obj =new Solution();
        obj.reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
}