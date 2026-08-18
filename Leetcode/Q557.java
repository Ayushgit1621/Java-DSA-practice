class Q577 {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        reverse(arr,0,0);
        return new String(arr);
    }
    public void reverse(char[] arr, int left, int right){
        if(left>=arr.length){
            return;
        }
        if(right==arr.length || arr[right]==' '){
            int l=left;
            int r= right-1;
        
        while (l<r){
            char temp =arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++; r--;
        }
        reverse(arr, right+1, right+1);// this moves to the next word
        return;
        }
        reverse (arr,left,right+1);// keep moving right

    }
}class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        reverse(arr,0,0);
        return new String(arr);
    }
    public void reverse(char[] arr, int left, int right){
        if(left>=arr.length){
            return;
        }
        if(right==arr.length || arr[right]==' '){
            int l=left;
            int r= right-1;
        
        while (l<r){
            char temp =arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++; r--;
        }
        reverse(arr, right+1, right+1);// this moves to the next word
        return;
        }
        reverse (arr,left,right+1);// keep moving right

    }
}